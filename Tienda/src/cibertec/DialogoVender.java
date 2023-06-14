package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoVender extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JComboBox<String> cboModelo;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoVender dialog = new DialogoVender();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoVender() {
		setModal(true);
		setTitle("Vender");
		setBounds(100, 100, 590, 350);
		getContentPane().setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(15, 15, 50, 14);
		getContentPane().add(lblModelo);

		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(15, 40, 50, 14);
		getContentPane().add(lblPrecio);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(75, 37, 200, 20);
		getContentPane().add(txtPrecio);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(15, 65, 50, 14);
		getContentPane().add(lblCantidad);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(75, 62, 200, 20);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);

		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Ladrillo King Kong 18 Huecos", "Ladrillo King Kong Macizo",
						"Ladrillo Pandereta Acanalada", "Ladrillo Patelero", "Ladrillo Techo Hueco" }));
		cboModelo.setBounds(75, 11, 200, 22);
		getContentPane().add(cboModelo);

		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(471, 11, 89, 23);
		getContentPane().add(btnVender);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(471, 36, 89, 23);
		getContentPane().add(btnCerrar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 550, 210);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

		txtPrecio.setText(obtenerPrecio(0) + "");
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		this.dispose();
	}

	protected void actionPerformedCboModelo(ActionEvent e) {
		int mod = cboModelo.getSelectedIndex();
		txtPrecio.setText(obtenerPrecio(mod) + "");

	}

	double obtenerPrecio(int mod) {
		switch (mod) {
		case 0:
			return Tienda.precio0;
		case 1:
			return Tienda.precio1;
		case 2:
			return Tienda.precio2;
		case 3:
			return Tienda.precio3;
		default:
			return Tienda.precio4;
		}
	}

	protected void actionPerformedBtnVender(ActionEvent e) {
		if (txtCantidad.getText().length() == 0) {

			JOptionPane.showMessageDialog(this, "Debes escribir una cantidad antes de realizar una venta",
					"Cantidad Vacía", 0);
			txtCantidad.requestFocus();

		} else if (Integer.parseInt(txtCantidad.getText()) <= 0) {

			JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a 0", "Error Cantidad", 1);
			txtCantidad.requestFocus();
			txtCantidad.selectAll();

		} else {

			int mod = cboModelo.getSelectedIndex();
			int can = Integer.parseInt(txtCantidad.getText());
			double icom = calcularImporteCompra(can);
			double ides = calcularImporteDescuento(icom, can);
			double ipag = icom - ides;
			int uni = calcularCantidadObsequio(can);

			mostrarResultados(can, icom, ides, ipag, uni);
			aumentarTotales(mod, can, ipag);
			Tienda.ventasTotales++;
			Tienda.importeTotalAcumulado += ipag;
			JOptionPane.showMessageDialog(this, "Venta Nro. " + Tienda.ventasTotales + "\n"
					+ "Importe Total Recaudado: S/." + Tienda.importeTotalAcumulado, "Avance de Ventas", 1);

		}

	}

	double calcularImporteCompra(int can) {
		return Double.parseDouble(txtPrecio.getText()) * can;
	}

	double calcularImporteDescuento(double icom, int can) {

		if (can <= 5)
			return Tienda.porcentaje1 / 100 * icom;
		else if (can <= 10)
			return Tienda.porcentaje2 / 100 * icom;
		else if (can <= 15)
			return Tienda.porcentaje3 / 100 * icom;
		else if (can <= 20)
			return Tienda.porcentaje4 / 100 * icom;
		else
			return Tienda.porcentaje5 / 100 * icom;

	}

	int calcularCantidadObsequio(int can) {

		if (can <= 5)
			return Tienda.obsequioCantidad1;
		else if (can <= 10)
			return Tienda.obsequioCantidad2;
		else if (can <= 15)
			return Tienda.obsequioCantidad3;
		else if (can <= 20)
			return Tienda.obsequioCantidad4;
		else
			return Tienda.obsequioCantidad5;

	}

	void aumentarTotales(int mod, int can, double ipag) {
		switch (mod) {
		case 0:
			Tienda.totalVentas0++;
			Tienda.totalMillares0 += can;
			Tienda.totalVendidos0 += ipag;
			break;
		case 1:
			Tienda.totalVentas1++;
			Tienda.totalMillares1 += can;
			Tienda.totalVendidos1 += ipag;
			break;
		case 2:
			Tienda.totalVentas2++;
			Tienda.totalMillares2 += can;
			Tienda.totalVendidos2 += ipag;
			break;
		case 3:
			Tienda.totalVentas3++;
			Tienda.totalMillares3 += can;
			Tienda.totalVendidos3 += ipag;
			break;
		default:
			Tienda.totalVentas4++;
			Tienda.totalMillares4 += can;
			Tienda.totalVendidos4 += ipag;
			break;
		}
	}

	void mostrarResultados(int can, double icom, double ides, double ipag, int uni) {
		txtS.setText("");
		txtS.append("BOLETA DE VENTA \n");
		txtS.append("\n");
		txtS.append("Modelo				: " + cboModelo.getSelectedItem() + "\n");
		txtS.append("Precio por millar		: S/. " + txtPrecio.getText() + "\n");
		txtS.append("Cantidad adquirida		: " + can + "\n");
		txtS.append("Importe compra			: S/. " + icom + "\n");
		txtS.append("Importe descuento		: S/. " + ides + "\n");
		txtS.append("Importe pagar			: S/. " + ipag + "\n");
		txtS.append("Tipo de obsequio		: " + Tienda.tipoObsequio + "\n");
		txtS.append("Unidades a obsequiar		: " + uni + "\n");
	}
}

package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoModificar extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblLargo;
	private JLabel lblEspesor;
	private JLabel lblCanOptima;
	private JComboBox<String> cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtCanOptima;
	private JButton btnCerrar;
	private JButton btnGrabar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoModificar dialog = new DialogoModificar();
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
	public DialogoModificar() {
		setModal(true);
		setTitle("Modificar Ladrillo");
		setBounds(100, 100, 450, 210);
		getContentPane().setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(15, 15, 120, 14);
		getContentPane().add(lblModelo);

		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(15, 40, 120, 14);
		getContentPane().add(lblPrecio);

		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(15, 65, 120, 14);
		getContentPane().add(lblAncho);

		lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(15, 90, 120, 14);
		getContentPane().add(lblLargo);

		lblEspesor = new JLabel("Espesor (mm)");
		lblEspesor.setBounds(15, 115, 120, 14);
		getContentPane().add(lblEspesor);

		lblCanOptima = new JLabel("Can. Óptima (millares)");
		lblCanOptima.setBounds(15, 140, 120, 14);
		getContentPane().add(lblCanOptima);

		cboModelo = new JComboBox<String>();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel<String>(
				new String[] { "Ladrillo King Kong 18 Huecos", "Ladrillo King Kong Macizo",
						"Ladrillo Pandereta Acanalada", "Ladrillo Patelero", "Ladrillo Techo Hueco" }));
		cboModelo.setBounds(145, 11, 180, 22);
		getContentPane().add(cboModelo);

		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(145, 37, 180, 20);
		getContentPane().add(txtPrecio);

		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(145, 62, 180, 20);
		getContentPane().add(txtAncho);

		txtLargo = new JTextField();
		txtLargo.setColumns(10);
		txtLargo.setBounds(145, 87, 180, 20);
		getContentPane().add(txtLargo);

		txtEspesor = new JTextField();
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(145, 112, 180, 20);
		getContentPane().add(txtEspesor);

		txtCanOptima = new JTextField();
		txtCanOptima.setColumns(10);
		txtCanOptima.setBounds(145, 137, 180, 20);
		getContentPane().add(txtCanOptima);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 11, 89, 23);
		getContentPane().add(btnCerrar);

		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(335, 36, 89, 23);
		getContentPane().add(btnGrabar);

		mostrarDatos(calcularPrecio(0), calcularAncho(0), calcularLargo(0), calcularEspesor(0),
				calcularCantidadOptima(0));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {

	}

	/**
	 * Interactuar con el ComboBox
	 */

	protected void actionPerformedCboModelo(ActionEvent e) {

		double pre, anc, lar, esp;
		int mar, can;
		mar = cboModelo.getSelectedIndex();
		pre = calcularPrecio(mar);
		anc = calcularAncho(mar);
		lar = calcularLargo(mar);
		esp = calcularEspesor(mar);
		can = calcularCantidadOptima(mar);

		mostrarDatos(pre, anc, lar, esp, can);
	}

	// Funcion para obtener el indice del comboBox
	int calcularModelo() {
		return cboModelo.getSelectedIndex();
	}

	// Funcion para obtener el nombre segun el modelo

	String calcularNombre(int mar) {
		switch (mar) {
		case 0:
			return Tienda.modelo0;
		case 1:
			return Tienda.modelo1;
		case 2:
			return Tienda.modelo2;
		case 3:
			return Tienda.modelo3;
		default:
			return Tienda.modelo4;
		}
	}

	// Funcion para calcular el precio segun el modelo
	double calcularPrecio(int mar) {
		switch (mar) {
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

	// Funcion para calcular el ancho segun el modelo
	double calcularAncho(int mar) {
		switch (mar) {
		case 0:
			return Tienda.ancho0;
		case 1:
			return Tienda.ancho1;
		case 2:
			return Tienda.ancho2;
		case 3:
			return Tienda.ancho3;
		default:
			return Tienda.ancho4;
		}
	}

	// Funcion para calcular el largo segun el modelo
	double calcularLargo(int mar) {
		switch (mar) {
		case 0:
			return Tienda.largo0;
		case 1:
			return Tienda.largo1;
		case 2:
			return Tienda.largo2;
		case 3:
			return Tienda.largo3;
		default:
			return Tienda.largo4;
		}
	}

	// Funcion para calcular el espesor segun el modelo
	double calcularEspesor(int mar) {
		switch (mar) {
		case 0:
			return Tienda.espesor0;
		case 1:
			return Tienda.espesor1;
		case 2:
			return Tienda.espesor2;
		case 3:
			return Tienda.espesor3;
		default:
			return Tienda.espesor4;
		}
	}

	// Funcion para calcular la cantidad segun el modelo
	int calcularCantidadOptima(int mar) {
		switch (mar) {
		case 0:
			return Tienda.cantidadOptima0;
		case 1:
			return Tienda.cantidadOptima1;
		case 2:
			return Tienda.cantidadOptima2;
		case 3:
			return Tienda.cantidadOptima3;
		default:
			return Tienda.cantidadOptima4;
		}
	}

	// Funcion para mostrar los datos

	void mostrarDatos(double pre, double anc, double lar, double esp, int can) {
		txtPrecio.setText(pre + "");
		txtAncho.setText(anc + "");
		txtLargo.setText(lar + "");
		txtEspesor.setText(esp + "");
		txtCanOptima.setText(can + "");
	}

	/**
	 * Interactuar con el boton grabar
	 */

	protected void actionPerformedBtnGrabar(ActionEvent e) {
		double pre, anc, lar, esp;
		int mar, can;
		String cad = "";

		mar = calcularModelo();
		
		// Si el casillero esta vacio, se remplazara con un 0
		
		if (txtPrecio.getText().length() == 0) pre = 0;
		else pre = Double.parseDouble(txtPrecio.getText());
		
		if (txtAncho.getText().length() == 0) anc = 0;
		else anc = Double.parseDouble(txtAncho.getText());
		
		if (txtLargo.getText().length() == 0) lar = 0;
		else lar = Double.parseDouble(txtLargo.getText());
		
		if (txtEspesor.getText().length() == 0) esp = 0;
		else esp = Double.parseDouble(txtEspesor.getText());
		
		if (txtCanOptima.getText().length() == 0) can = 0;
		else can = Integer.parseInt(txtCanOptima.getText());

		if (calcularPrecio(mar) != pre) {

			switch (mar) {
			case 0:
				cad += mensajePrecio(Tienda.precio0, pre);
				Tienda.precio0 = pre;
				break;
			case 1:
				cad += mensajePrecio(Tienda.precio1, pre);
				Tienda.precio1 = pre;
				break;
			case 2:
				cad += mensajePrecio(Tienda.precio2, pre);
				Tienda.precio2 = pre;
				break;
			case 3:
				cad += mensajePrecio(Tienda.precio3, pre);
				Tienda.precio3 = pre;
				break;
			default:
				cad += mensajePrecio(Tienda.precio4, pre);
				Tienda.precio4 = pre;
				break;
			}

		}

		if (calcularAncho(mar) != anc) {

			switch (mar) {
			case 0:
				cad += mensajeAncho(Tienda.ancho0, anc);
				Tienda.ancho0 = anc;
				break;
			case 1:
				cad += mensajeAncho(Tienda.ancho1, anc);
				Tienda.ancho1 = anc;
				break;
			case 2:
				cad += mensajeAncho(Tienda.ancho2, anc);
				Tienda.ancho2 = anc;
				break;
			case 3:
				cad += mensajeAncho(Tienda.ancho3, anc);
				Tienda.ancho3 = anc;
				break;
			default:
				cad += mensajeAncho(Tienda.ancho4, anc);
				Tienda.ancho4 = anc;
				break;
			}
		}

		if (calcularLargo(mar) != lar) {

			switch (mar) {
			case 0:
				cad += mensajeLargo(Tienda.largo0, lar);
				Tienda.largo0 = lar;
				break;
			case 1:
				cad += mensajeLargo(Tienda.largo1, lar);
				Tienda.largo1 = lar;
				break;
			case 2:
				cad += mensajeLargo(Tienda.largo2, lar);
				Tienda.largo2 = lar;
				break;
			case 3:
				cad += mensajeLargo(Tienda.largo3, lar);
				Tienda.largo3 = lar;
				break;
			default:
				cad += mensajeLargo(Tienda.largo4, lar);
				Tienda.largo4 = lar;
				break;
			}
		}

		if (calcularEspesor(mar) != esp) {

			switch (mar) {
			case 0:
				cad += mensajeEspesor(Tienda.espesor0, esp);
				Tienda.espesor0 = esp;
				break;
			case 1:
				cad += mensajeEspesor(Tienda.espesor1, esp);
				Tienda.espesor1 = esp;
				break;
			case 2:
				cad += mensajeEspesor(Tienda.espesor2, esp);
				Tienda.espesor2 = esp;
				break;
			case 3:
				cad += mensajeEspesor(Tienda.espesor3, esp);
				Tienda.espesor3 = esp;
				break;
			default:
				cad += mensajeEspesor(Tienda.espesor4, esp);
				Tienda.espesor4 = esp;
				break;
			}
		}

		if (calcularCantidadOptima(mar) != can) {

			switch (mar) {
			case 0:
				cad += mensajeCantidad(Tienda.cantidadOptima0, can);
				Tienda.cantidadOptima0 = can;
				break;
			case 1:
				cad += mensajeCantidad(Tienda.cantidadOptima1, can);
				Tienda.cantidadOptima1 = can;
				break;
			case 2:
				cad += mensajeCantidad(Tienda.cantidadOptima2, can);
				Tienda.cantidadOptima2 = can;
				break;
			case 3:
				cad += mensajeCantidad(Tienda.cantidadOptima3, can);
				Tienda.cantidadOptima3 = can;
				break;
			default:
				cad += mensajeCantidad(Tienda.cantidadOptima4, can);
				Tienda.cantidadOptima4 = can;
				break;
			}
		}
		if (cad != "")
			mostrarResultados(mensajeModelo(calcularNombre(mar)) + cad);
	}

	String mensajeModelo(String mod) {
		return "Modelo: \n" + mod + "\n" + "\n";
	}

	String mensajePrecio(double pa, double pn) {
		return "Precio: \n" + pa + " a " + pn + "\n" + "\n";
	}

	String mensajeAncho(double aa, double an) {
		return "Ancho: \n" + aa + " a " + an + "\n" + "\n";
	}

	String mensajeLargo(double la, double ln) {
		return "Largo: \n" + la + " a " + ln + "\n" + "\n";
	}

	String mensajeEspesor(double ea, double en) {
		return "Espesor: \n" + ea + " a " + en + "\n" + "\n";
	}

	String mensajeCantidad(double ca, double cn) {
		return "Can.Óptima: \n" + ca + " a " + cn + "\n" + "\n";
	}

	void mostrarResultados(String cad) {
		JOptionPane.showMessageDialog(null, cad);
	}

}

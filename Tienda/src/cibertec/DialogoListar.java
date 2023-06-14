package cibertec;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class DialogoListar extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoListar dialog = new DialogoListar();
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
	public DialogoListar() {
		setModal(true);
		setTitle("Listado de Ladrillos");
		setBounds(100, 100, 650, 490);
		getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 614, 396);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(225, 417, 89, 23);
		getContentPane().add(btnCerrar);

		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(324, 417, 89, 23);
		getContentPane().add(btnListar);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}

		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		this.dispose();
	}

	protected void actionPerformedBtnListar(ActionEvent e) {
		txtS.setText("");
		imprimir("LISTADO DE LADRILLOS");
		mostrarLadrillo(Tienda.modelo0, Tienda.precio0, Tienda.ancho0, Tienda.largo0, Tienda.espesor0, Tienda.cantidadOptima0);
		mostrarLadrillo(Tienda.modelo1, Tienda.precio1, Tienda.ancho1, Tienda.largo1, Tienda.espesor1, Tienda.cantidadOptima1);
		mostrarLadrillo(Tienda.modelo2, Tienda.precio2, Tienda.ancho2, Tienda.largo2, Tienda.espesor2, Tienda.cantidadOptima2);
		mostrarLadrillo(Tienda.modelo3, Tienda.precio3, Tienda.ancho3, Tienda.largo3, Tienda.espesor3, Tienda.cantidadOptima3);
		mostrarLadrillo(Tienda.modelo4, Tienda.precio4, Tienda.ancho4, Tienda.largo4, Tienda.espesor4, Tienda.cantidadOptima4);
	}

	void mostrarLadrillo(String mod, double pre, double anc, double lar, double esp, int can)
	{
		imprimir("");
		imprimir("Modelo                     : " + mod);
		imprimir("Precio                     : S/" + pre);
		imprimir("Ancho (cm)                 : " + anc + " cm");
		imprimir("Largo (cm)                 : " + lar + " cm");
		imprimir("Espesor (mm)               : " + esp + " mm");
		imprimir("Cantidad Óptima (millares) : " + can);
	}
	
	void imprimir(String cad) {
		txtS.append(cad + "\n");
	}
}

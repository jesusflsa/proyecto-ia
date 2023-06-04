package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

public class DialogoDescuentos extends JDialog {
	private JLabel lblCantidad1;
	private JLabel lblCantidad2;
	private JLabel lblCantidad3;
	private JLabel lblCantidad4;
	private JLabel lblCantidad5;
	private JTextField txtCantidad1;
	private JTextField txtCantidad2;
	private JTextField txtCantidad3;
	private JTextField txtCantidad4;
	private JTextField txtCantidad5;
	private JLabel lblPorcentaje1;
	private JLabel lblPorcentaje2;
	private JLabel lblPorcentaje3;
	private JLabel lblPorcentaje4;
	private JLabel lblPorcentaje5;
	private JButton btnAceptar;
	private JButton btnCancelar;

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
					DialogoDescuentos dialog = new DialogoDescuentos();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public DialogoDescuentos() {
		setModal(true);
		setBounds(100, 100, 450, 180);
		getContentPane().setLayout(null);
		
		lblCantidad1 = new JLabel("1 a 5 millares");
		lblCantidad1.setBounds(10, 11, 100, 14);
		getContentPane().add(lblCantidad1);
		
		lblCantidad2 = new JLabel("6 a 10 millares");
		lblCantidad2.setBounds(10, 36, 100, 14);
		getContentPane().add(lblCantidad2);
		
		lblCantidad3 = new JLabel("11 a 15 millares");
		lblCantidad3.setBounds(10, 61, 100, 14);
		getContentPane().add(lblCantidad3);
		
		lblCantidad4 = new JLabel("16 a 20 millares");
		lblCantidad4.setBounds(10, 86, 100, 14);
		getContentPane().add(lblCantidad4);
		
		lblCantidad5 = new JLabel("Más de 20 millares");
		lblCantidad5.setBounds(10, 111, 100, 14);
		getContentPane().add(lblCantidad5);
		
		txtCantidad1 = new JTextField();
		txtCantidad1.setBounds(120, 8, 130, 20);
		getContentPane().add(txtCantidad1);
		txtCantidad1.setColumns(10);
		
		txtCantidad2 = new JTextField();
		txtCantidad2.setBounds(120, 33, 130, 20);
		getContentPane().add(txtCantidad2);
		txtCantidad2.setColumns(10);
		
		txtCantidad3 = new JTextField();
		txtCantidad3.setBounds(120, 58, 130, 20);
		getContentPane().add(txtCantidad3);
		txtCantidad3.setColumns(10);
		
		txtCantidad4 = new JTextField();
		txtCantidad4.setBounds(120, 83, 130, 20);
		getContentPane().add(txtCantidad4);
		txtCantidad4.setColumns(10);
		
		txtCantidad5 = new JTextField();
		txtCantidad5.setBounds(120, 108, 130, 20);
		getContentPane().add(txtCantidad5);
		txtCantidad5.setColumns(10);
		
		lblPorcentaje1 = new JLabel("%");
		lblPorcentaje1.setBounds(260, 11, 46, 14);
		getContentPane().add(lblPorcentaje1);
		
		lblPorcentaje2 = new JLabel("%");
		lblPorcentaje2.setBounds(260, 36, 46, 14);
		getContentPane().add(lblPorcentaje2);
		
		lblPorcentaje3 = new JLabel("%");
		lblPorcentaje3.setBounds(260, 61, 46, 14);
		getContentPane().add(lblPorcentaje3);
		
		lblPorcentaje4 = new JLabel("%");
		lblPorcentaje4.setBounds(260, 86, 46, 14);
		getContentPane().add(lblPorcentaje4);
		
		lblPorcentaje5 = new JLabel("%");
		lblPorcentaje5.setBounds(260, 111, 46, 14);
		getContentPane().add(lblPorcentaje5);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(335, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(335, 32, 89, 23);
		getContentPane().add(btnCancelar);

	}

}

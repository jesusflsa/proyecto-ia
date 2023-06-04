package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class DialogoModificar extends JDialog {
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblLargo;
	private JLabel lblEspesor;
	private JLabel lblCanOptima;
	private JComboBox<String> cboModelo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
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
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] {"Ladrillo King Kong 18 Huecos", "Ladrillo King Kong Macizo", "Ladrillo Pandereta Acanalada", "Ladrillo Patelero", "Ladrillo Techo Hueco"}));
		cboModelo.setBounds(145, 11, 180, 22);
		getContentPane().add(cboModelo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(145, 37, 180, 20);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 62, 180, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(145, 87, 180, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(145, 112, 180, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(145, 137, 180, 20);
		getContentPane().add(textField_4);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(335, 11, 89, 23);
		getContentPane().add(btnCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(335, 36, 89, 23);
		getContentPane().add(btnGrabar);

	}

}

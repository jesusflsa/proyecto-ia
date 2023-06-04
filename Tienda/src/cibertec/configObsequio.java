package cibertec;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class configObsequio extends JDialog implements ActionListener { 
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textObs0;
	private JTextField textObs1;
	private JTextField textObs2;
	private JTextField textObs3;
	private JTextField textObs4;
	private JTextField textObs5;
	private JButton btnAceptar;
	private JButton btnCancelar;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					configObsequio dialog = new configObsequio();
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
	// Cantidades a obsequiar
	public static String tipoObsequio = "Badilejo";
	public static int obsequioCantidad1 = 1;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 5;
	public static int obsequioCantidad4 = 7;
	public static int obsequioCantidad5 = 9;

	public configObsequio() {
		setModal(true);
		setTitle("Configurar obsequio");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Tipo de obsequio ");
		lblNewLabel.setBounds(10, 11, 98, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("1 a 5 millares");
		lblNewLabel_1.setBounds(10, 36, 116, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("6 a 10 millares");
		lblNewLabel_2.setBounds(10, 61, 116, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("11 a 15 millares");
		lblNewLabel_3.setBounds(10, 86, 116, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("16 a 20 millares");
		lblNewLabel_4.setBounds(10, 111, 116, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("mas de 20 millares");
		lblNewLabel_5.setBounds(10, 136, 130, 14);
		getContentPane().add(lblNewLabel_5);
		
		textObs0 = new JTextField();
		textObs0.setText("Badilejo");
		textObs0.setBounds(150, 8, 86, 20);
		getContentPane().add(textObs0);
		textObs0.setColumns(10);

		textObs1 = new JTextField();
		textObs1.setText(obsequioCantidad1 + "" );
		textObs1.setBounds(150, 33, 86, 20);
		getContentPane().add(textObs1);
		textObs1.setColumns(10);
		
		textObs2 = new JTextField();
		textObs2.setText(obsequioCantidad2 + "" );
		textObs2.setBounds(150, 58, 86, 20);
		getContentPane().add(textObs2);
		textObs2.setColumns(10);
		
		textObs3 = new JTextField();
		textObs3.setText(obsequioCantidad3 + "" );
		textObs3.setBounds(150, 83, 86, 20);
		getContentPane().add(textObs3);
		textObs3.setColumns(10);
		
		textObs4 = new JTextField();
		textObs4.setText(obsequioCantidad4 + "" );
		textObs4.setBounds(150, 108, 86, 20);
		getContentPane().add(textObs4);
		textObs4.setColumns(10);
		
		textObs5 = new JTextField();
		textObs5.setText(obsequioCantidad5 + "" );
		textObs5.setBounds(150, 133, 86, 20);
		getContentPane().add(textObs5);
		textObs5.setColumns(10);
		
		btnAceptar = new JButton("aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(323, 7, 89, 23);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton("cancelar");
		btnCancelar.setBounds(323, 32, 89, 23);
		getContentPane().add(btnCancelar);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
	}
}


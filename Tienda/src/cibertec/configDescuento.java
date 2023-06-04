package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class configDescuento extends JDialog implements ActionListener {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textDesc1;
	private JTextField textDesc2;
	private JTextField textDesc3;
	private JTextField textDesc4;
	private JTextField textDesc5;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
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
					configDescuento dialog = new configDescuento();
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
	//variables configuracion descuento
	public static double descuento1 = 5;
	public static double descuento2 = 7.5;
	public static double descuento3 = 10;
	public static double descuento4 = 12.5;
	public static double descuento5 = 15;
	public configDescuento() {
		setModal(true);
		setTitle("Configuracion de porcentajes de descuento");
		setBounds(100, 100, 434, 171);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("1 a 5 millares");
		lblNewLabel.setBounds(10, 11, 98, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("6 a 10 millares");
		lblNewLabel_1.setBounds(10, 36, 116, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("11 a 15 millares");
		lblNewLabel_2.setBounds(10, 61, 116, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("16 a 20 millares");
		lblNewLabel_3.setBounds(10, 86, 116, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("mas de 20 millares");
		lblNewLabel_4.setBounds(10, 111, 130, 14);
		getContentPane().add(lblNewLabel_4);
		
		textDesc1 = new JTextField();
		textDesc1.setText(descuento1 + "" );
		textDesc1.setBounds(150, 8, 86, 20);
		getContentPane().add(textDesc1);
		textDesc1.setColumns(10);
		
		textDesc2 = new JTextField();
		textDesc2.setText(descuento2 + "" );
		textDesc2.setBounds(150, 33, 86, 20);
		getContentPane().add(textDesc2);
		textDesc2.setColumns(10);
		
		textDesc3 = new JTextField();
		textDesc3.setText(descuento3 + "" );
		textDesc3.setBounds(150, 58, 86, 20);
		getContentPane().add(textDesc3);
		textDesc3.setColumns(10);
		
		textDesc4 = new JTextField();
		textDesc4.setText(descuento4 + "" );
		textDesc4.setBounds(150, 83, 86, 20);
		getContentPane().add(textDesc4);
		textDesc4.setColumns(10);
		
		textDesc5 = new JTextField();
		textDesc5.setText(descuento5 + "" );
		textDesc5.setBounds(150, 108, 86, 20);
		getContentPane().add(textDesc5);
		textDesc5.setColumns(10);
		
		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(246, 11, 17, 14);
		getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("%");
		lblNewLabel_6.setBounds(246, 36, 17, 14);
		getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("%");
		lblNewLabel_7.setBounds(246, 61, 17, 14);
		getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("%");
		lblNewLabel_8.setBounds(246, 86, 17, 14);
		getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("%");
		lblNewLabel_9.setBounds(246, 111, 17, 14);
		getContentPane().add(lblNewLabel_9);
		
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


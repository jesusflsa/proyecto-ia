package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class configDescuento extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		textDesc1.setText(Tienda.porcentaje1 + "" );
		textDesc1.setBounds(150, 8, 86, 20);
		getContentPane().add(textDesc1);
		textDesc1.setColumns(10);
		
		textDesc2 = new JTextField();
		textDesc2.setText(Tienda.porcentaje2 + "" );
		textDesc2.setBounds(150, 33, 86, 20);
		getContentPane().add(textDesc2);
		textDesc2.setColumns(10);
		
		textDesc3 = new JTextField();
		textDesc3.setText(Tienda.porcentaje3 + "" );
		textDesc3.setBounds(150, 58, 86, 20);
		getContentPane().add(textDesc3);
		textDesc3.setColumns(10);
		
		textDesc4 = new JTextField();
		textDesc4.setText(Tienda.porcentaje4 + "" );
		textDesc4.setBounds(150, 83, 86, 20);
		getContentPane().add(textDesc4);
		textDesc4.setColumns(10);
		
		textDesc5 = new JTextField();
		textDesc5.setText(Tienda.porcentaje5 + "" );
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
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(323, 32, 89, 23);
		getContentPane().add(btnCancelar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnProcesar(e);
		}
		
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		this.dispose();
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		cambiarValor();	
	}
	protected void cambiarValor() {
		double por1, por2, por3, por4, por5;
		String val1, val2, val3, val4, val5;
		val1 = textDesc1.getText();
		val2 = textDesc2.getText();
		val3 = textDesc3.getText();
		val4 = textDesc4.getText();
		val5 = textDesc5.getText();
		if(val1.length() == 0 || val2.length() == 0 || val3.length() == 0|| val4.length() == 0|| val5.length() == 0){
			JOptionPane.showMessageDialog(this, "Rellene el espacio");
		}else {
			por1 =  Double.parseDouble(val1);
			por2 =	Double.parseDouble(val2);
			por3 = 	Double.parseDouble(val3);
			por4 = 	Double.parseDouble(val4);
			por5 =	Double.parseDouble(val5);
			if(por1 < 0 || por2 < 0 || por3 < 0 || por4 < 0 || por5 < 0)
			{
				JOptionPane.showMessageDialog(this, "Rellene con un numero mayor a 0", "Valor no permitido", 0);
			}
			else if(por1 > 100 || por2 > 100 || por3 > 100 || por4 > 100 || por5 > 100) 
			{
				JOptionPane.showMessageDialog(this, "Ningun valor puede ser mayor a 100%", "Valor no permitido", 0);
			}
			else{
				Tienda.porcentaje1 = por1;
				Tienda.porcentaje2 = por2;
				Tienda.porcentaje3 = por3;
				Tienda.porcentaje4 = por4;
				Tienda.porcentaje5 = por5;
				JOptionPane.showMessageDialog(this, "Cambios hechos correctamente", "Valores modificados", 1);
				this.dispose();	
			}
		}
	}
}

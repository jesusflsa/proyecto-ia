package cibertec;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class configObsequio extends JDialog implements ActionListener { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		textObs0.setText(Tienda.tipoObsequio);
		textObs0.setBounds(150, 8, 86, 20);
		getContentPane().add(textObs0);
		textObs0.setColumns(10);

		textObs1 = new JTextField();
		textObs1.setText(Tienda.obsequioCantidad1 + "" );
		textObs1.setBounds(150, 33, 86, 20);
		getContentPane().add(textObs1);
		textObs1.setColumns(10);
		
		textObs2 = new JTextField();
		textObs2.setText(Tienda.obsequioCantidad2 + "" );
		textObs2.setBounds(150, 58, 86, 20);
		getContentPane().add(textObs2);
		textObs2.setColumns(10);
		
		textObs3 = new JTextField();
		textObs3.setText(Tienda.obsequioCantidad3 + "" );
		textObs3.setBounds(150, 83, 86, 20);
		getContentPane().add(textObs3);
		textObs3.setColumns(10);
		
		textObs4 = new JTextField();
		textObs4.setText(Tienda.obsequioCantidad4 + "" );
		textObs4.setBounds(150, 108, 86, 20);
		getContentPane().add(textObs4);
		textObs4.setColumns(10);
		
		textObs5 = new JTextField();
		textObs5.setText(Tienda.obsequioCantidad5 + "" );
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
		String  por1, por2, por3, por4, por5;
		por1 =  textObs1.getText();
		por2 =	textObs2.getText();
		por3 = 	textObs3.getText();
		por4 = 	textObs4.getText();
		por5 =	textObs5.getText();
		System.out.print(textObs1.getText());
		if(por1.length() == 0 || por2.length() == 0 || por3.length() == 0|| por4.length() == 0|| por5.length() == 0){
			JOptionPane.showMessageDialog(this, "Rellene el espacio");
		}else{
			Tienda.obsequioCantidad1 = Integer.parseInt(por1);
			Tienda.obsequioCantidad2= Integer.parseInt(por2);
			Tienda.obsequioCantidad3 = Integer.parseInt(por3);
			Tienda.obsequioCantidad4 = Integer.parseInt(por4);
			Tienda.obsequioCantidad5 = Integer.parseInt(por5);
			if(Tienda.obsequioCantidad1 < 0 || Tienda.obsequioCantidad2 < 0 ||Tienda.obsequioCantidad3 < 0 ||Tienda.obsequioCantidad4 < 0 ||Tienda.obsequioCantidad5 < 0){
				JOptionPane.showMessageDialog(this, "Rellene con un numero mayor a 0");
			}else{
				this.dispose();	
			}
		}
	}
}

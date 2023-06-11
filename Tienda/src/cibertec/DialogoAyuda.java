package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoAyuda extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTienda;
	private JSeparator separator;
	private JLabel lblAutores;
	private JLabel lblDavid;
	private JLabel lblMauro;
	private JLabel lblJesus;
	private JLabel lblAndre;
	private JLabel lblAngel;
	private JLabel lblStephano;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogoAyuda dialog = new DialogoAyuda();
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
	public DialogoAyuda() {
		setTitle("Acerca de Tienda");
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
		lblTienda.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTienda.setBounds(174, 10, 86, 20);
		getContentPane().add(lblTienda);
		
		separator = new JSeparator();
		separator.setBounds(10, 41, 414, 8);
		getContentPane().add(separator);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutores.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAutores.setBounds(189, 55, 55, 17);
		getContentPane().add(lblAutores);
		
		lblDavid = new JLabel("Juan David Anaya (i202312958)");
		lblDavid.setHorizontalAlignment(SwingConstants.CENTER);
		lblDavid.setBounds(140, 80, 154, 14);
		getContentPane().add(lblDavid);
		
		lblMauro = new JLabel("Mauro Arana (i202313409)");
		lblMauro.setHorizontalAlignment(SwingConstants.CENTER);
		lblMauro.setBounds(152, 100, 129, 14);
		getContentPane().add(lblMauro);
		
		lblJesus = new JLabel("Jesús Flores (i202313579)");
		lblJesus.setHorizontalAlignment(SwingConstants.CENTER);
		lblJesus.setBounds(154, 120, 126, 14);
		getContentPane().add(lblJesus);
		
		lblAndre = new JLabel("Andre Pereyra (i202330308)");
		lblAndre.setHorizontalAlignment(SwingConstants.CENTER);
		lblAndre.setBounds(148, 140, 137, 14);
		getContentPane().add(lblAndre);
		
		lblAngel = new JLabel("Angel Pintado (i202314336)");
		lblAngel.setHorizontalAlignment(SwingConstants.CENTER);
		lblAngel.setBounds(150, 160, 133, 14);
		getContentPane().add(lblAngel);
		
		lblStephano = new JLabel("Stephano Yparraguirre (i202313411)");
		lblStephano.setHorizontalAlignment(SwingConstants.CENTER);
		lblStephano.setBounds(129, 180, 176, 14);
		getContentPane().add(lblStephano);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(172, 227, 89, 23);
		getContentPane().add(btnCerrar);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		this.dispose();
	}
}

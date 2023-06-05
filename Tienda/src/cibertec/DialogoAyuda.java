package cibertec;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class DialogoAyuda extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	}
}

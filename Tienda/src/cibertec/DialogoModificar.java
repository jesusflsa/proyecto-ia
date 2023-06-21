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

		txtPrecio = new JTextField(calcularPrecio(0)+"");
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(145, 37, 180, 20);
		getContentPane().add(txtPrecio);

		txtAncho = new JTextField(calcularAncho(0)+"");
		txtAncho.setColumns(10);
		txtAncho.setBounds(145, 62, 180, 20);
		getContentPane().add(txtAncho);

		txtLargo = new JTextField(calcularLargo(0) + "");
		txtLargo.setColumns(10);
		txtLargo.setBounds(145, 87, 180, 20);
		getContentPane().add(txtLargo);

		txtEspesor = new JTextField(calcularEspesor(0) + "");
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(145, 112, 180, 20);
		getContentPane().add(txtEspesor);

		txtCanOptima = new JTextField(calcularCantidadOptima(0) + "");
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
		this.dispose();
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

		// Si el casillero esta vacio saldra un error
		if (txtPrecio.getText().length() == 0 
		|| txtAncho.getText().length() == 0 
		|| txtLargo.getText().length() == 0
		|| txtEspesor.getText().length() == 0 
		|| txtCanOptima.getText().length() == 0)
			JOptionPane.showMessageDialog(this, "Ningun casillero debe estar vacio", "Casillero vacio", 0);
		else {
			
			double pre, anc, lar, esp;
			int mar, can;
			String cad = "";
			
			mar = calcularModelo();
			pre = Double.parseDouble(txtPrecio.getText());
			anc = Double.parseDouble(txtAncho.getText());
			lar = Double.parseDouble(txtLargo.getText());
			esp = Double.parseDouble(txtEspesor.getText());
			can = Integer.parseInt(txtCanOptima.getText());

			if (pre < 0 || anc < 0 || lar < 0 || esp < 0 || can < 0) {
				JOptionPane.showMessageDialog(this, "Los valores deben ser mayor a 0", "Valores negativos", 1);
			} else {
				if (calcularPrecio(mar) != pre) {

					cad += mensajePrecio(calcularPrecio(mar), pre);
					switch (mar) {
					case 0:
						Tienda.precio0 = pre;
						break;
					case 1:
						Tienda.precio1 = pre;
						break;
					case 2:
						Tienda.precio2 = pre;
						break;
					case 3:
						Tienda.precio3 = pre;
						break;
					default:
						Tienda.precio4 = pre;
						break;
					}

				}

				if (calcularAncho(mar) != anc) {

					cad += mensajeAncho(calcularAncho(mar), anc);
					switch (mar) {
					case 0:
						Tienda.ancho0 = anc;
						break;
					case 1:
						Tienda.ancho1 = anc;
						break;
					case 2:
						Tienda.ancho2 = anc;
						break;
					case 3:
						Tienda.ancho3 = anc;
						break;
					default:
						Tienda.ancho4 = anc;
						break;
					}
				}

				if (calcularLargo(mar) != lar) {

					cad += mensajeLargo(calcularLargo(mar), lar);
					switch (mar) {
					case 0:
						Tienda.largo0 = lar;
						break;
					case 1:
						Tienda.largo1 = lar;
						break;
					case 2:
						Tienda.largo2 = lar;
						break;
					case 3:
						Tienda.largo3 = lar;
						break;
					default:
						Tienda.largo4 = lar;
						break;
					}
				}

				if (calcularEspesor(mar) != esp) {

					cad += mensajeEspesor(calcularEspesor(mar), esp);
					switch (mar) {
					case 0:
						Tienda.espesor0 = esp;
						break;
					case 1:
						Tienda.espesor1 = esp;
						break;
					case 2:
						Tienda.espesor2 = esp;
						break;
					case 3:
						Tienda.espesor3 = esp;
						break;
					default:
						Tienda.espesor4 = esp;
						break;
					}
				}

				if (calcularCantidadOptima(mar) != can) {

					cad += mensajeCantidad(calcularCantidadOptima(mar), can);
					switch (mar) {
					case 0:
						Tienda.cantidadOptima0 = can;
						break;
					case 1:
						Tienda.cantidadOptima1 = can;
						break;
					case 2:
						Tienda.cantidadOptima2 = can;
						break;
					case 3:
						Tienda.cantidadOptima3 = can;
						break;
					default:
						Tienda.cantidadOptima4 = can;
						break;
					}
				}
				if (cad != "")
					mostrarResultados(mensajeModelo(mar) + cad);
			}
		}
	}

	String mensajeModelo(int mar) {
		return "Modelo: \n" + calcularNombre(mar) + "\n" + "\n";
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
		JOptionPane.showMessageDialog(this, cad, "Modificacion exitosa!", 1);
	}

}

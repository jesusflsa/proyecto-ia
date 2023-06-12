package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Tienda extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmModificar;
	private JMenuItem mntmListar;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerar;
	private JMenu mnConfiguracion;
	private JMenuItem mntmDescuentos;
	private JMenuItem mntmObsequios;
	private JMenu mnAyuda;
	private JMenuItem mntmAcerca;

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
					Tienda frame = new Tienda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Declaracion de variables globales
	 */

	// Ladrillo 0
	public static String modelo0 = "Ladrillo King Kong 18 Huecos";
	public static double precio0 = 610.0;
	public static double ancho0 = 12.5;
	public static double largo0 = 23.0;
	public static double espesor0 = 9;
	public static int cantidadOptima0 = 6;
	
	public static int totalVentas0 = 0;
	public static int totalMillares0 = 0;
	public static double totalVendidos0 = 0;
	
	// Ladrillo 1
	public static String modelo1 = "Ladrillo King Kong Macizo";
	public static double precio1 = 920.0;
	public static double ancho1 = 12.0;
	public static double largo1 = 21.0;
	public static double espesor1 = 9.0;
	public static int cantidadOptima1 = 6;

	public static int totalVentas1 = 0;
	public static int totalMillares1 = 0;
	public static double totalVendidos1 = 0;
	
	// Ladrillo 2
	public static String modelo2 = "Ladrillo Pandereta Acanalada";
	public static double precio2 = 510.0;
	public static double ancho2 = 10.5;
	public static double largo2 = 23;
	public static double espesor2 = 9.0;
	public static int cantidadOptima2 = 6;
	
	public static int totalVentas2 = 0;
	public static int totalMillares2 = 0;
	public static double totalVendidos2 = 0;

	// Ladrillo 3
	public static String modelo3 = "Ladrillo Patelero";
	public static double precio3 = 2200.0;
	public static double ancho3 = 24.0;
	public static double largo3 = 24.0;
	public static double espesor3 = 3;
	public static int cantidadOptima3 = 6;

	public static int totalVentas3 = 0;
	public static int totalMillares3 = 0;
	public static double totalVendidos3 = 0;
	
	// Ladrillo 4
	public static String modelo4 = "Ladrillo Techo Hueco";
	public static double precio4 = 2350.0;
	public static double ancho4 = 30.0;
	public static double largo4 = 30.0;
	public static double espesor4 = 15.0;
	public static int cantidadOptima4 = 6;

	public static int totalVentas4 = 0;
	public static int totalMillares4 = 0;
	public static double totalVendidos4 = 0;
	
	// Descuentos
	public static double porcentaje1 = 5.0;
	public static double porcentaje2 = 7.5;
	public static double porcentaje3 = 10.0;
	public static double porcentaje4 = 12.5;
	public static double porcentaje5 = 15.0;

	// Obsequios
	public static String tipoObsequio = "Badilejo";
	public static int obsequioCantidad1 = 1;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 5;
	public static int obsequioCantidad4 = 7;
	public static int obsequioCantidad5 = 9;
	
	//ventas
	public static double importeTotalAcumulado = 0;
	
	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda 1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 465);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mntmSalir.setIcon(null);
		mnArchivo.add(mntmSalir);

		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);

		mntmConsultar = new JMenuItem("Consultar ladrillo");
		mntmConsultar.addActionListener(this);
		mntmConsultar.setIcon(null);
		mnMantenimiento.add(mntmConsultar);

		mntmModificar = new JMenuItem("Modificar ladrillo");
		mntmModificar.addActionListener(this);
		mntmModificar.setIcon(null);
		mnMantenimiento.add(mntmModificar);

		mntmListar = new JMenuItem("Listar ladrillos");
		mntmListar.addActionListener(this);
		mntmListar.setIcon(null);
		mnMantenimiento.add(mntmListar);

		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);

		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mntmVender.setIcon(null);
		mnVentas.add(mntmVender);

		mntmGenerar = new JMenuItem("Generar reportes");
		mntmGenerar.addActionListener(this);
		mntmGenerar.setIcon(null);
		mnVentas.add(mntmGenerar);

		mnConfiguracion = new JMenu("Configuración");
		menuBar.add(mnConfiguracion);

		mntmDescuentos = new JMenuItem("Configurar descuentos");
		mntmDescuentos.addActionListener(this);
		mntmDescuentos.setIcon(null);
		mnConfiguracion.add(mntmDescuentos);

		mntmObsequios = new JMenuItem("Configurar obsequios");
		mntmObsequios.addActionListener(this);
		mntmObsequios.setIcon(null);
		mnConfiguracion.add(mntmObsequios);

		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);

		mntmAcerca = new JMenuItem("Acerca de Tienda");
		mntmAcerca.addActionListener(this);
		mntmAcerca.setIcon(null);
		mnAyuda.add(mntmAcerca);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmAcerca) {
			actionPerformedMntmAcerca(e);
		}
		if (e.getSource() == mntmObsequios) {
			actionPerformedMntmObsequios(e);
		}
		if (e.getSource() == mntmDescuentos) {
			actionPerformedMntmDescuentos(e);
		}
		if (e.getSource() == mntmGenerar) {
			actionPerformedMntmGenerar(e);
		}
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmListar) {
			actionPerformedMntmListar(e);
		}
		if (e.getSource() == mntmModificar) {
			actionPerformedMntmModificar(e);
		}
		if (e.getSource() == mntmConsultar) {
			actionPerformedMntmConsultar(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}

	}

	// Archivo
	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}

	// Mantenimiento
	protected void actionPerformedMntmConsultar(ActionEvent e) {
		// Declarar VARIABLE REFERENCIA que permita controlar la caja de diÃ¡logo
		DialogoConsultar d;

		// Crear la caja de dialogo en la VARIABLE REFERENCIA
		d = new DialogoConsultar();

		// Fijar la localizacion de la caja
		d.setLocationRelativeTo(this);

		// Hacer visible la caja de dialogo
		d.setVisible(true);

	}

	protected void actionPerformedMntmModificar(ActionEvent e) {
		DialogoModificar d = new DialogoModificar();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}

	protected void actionPerformedMntmListar(ActionEvent e) {
		DialogoListar d = new DialogoListar();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}

	// Ventas
	protected void actionPerformedMntmVender(ActionEvent e) {
		DialogoVender d = new DialogoVender();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}

	protected void actionPerformedMntmGenerar(ActionEvent e) {
		DialogoReportes d = new DialogoReportes();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}

	// Configuración
	protected void actionPerformedMntmDescuentos(ActionEvent e) {
		configDescuento d = new configDescuento();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}

	protected void actionPerformedMntmObsequios(ActionEvent e) {
		configObsequio d = new configObsequio();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}

	// Ayuda
	protected void actionPerformedMntmAcerca(ActionEvent e) {
		DialogoAyuda d = new DialogoAyuda();
		d.setLocationRelativeTo(this);
		d.setVisible(true);
	}
}

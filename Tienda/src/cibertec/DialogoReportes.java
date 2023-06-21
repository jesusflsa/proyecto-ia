package cibertec; 

import java.awt.EventQueue; 
import java.awt.event.ActionEvent; 
import javax.swing.JDialog; 
import javax.swing.JLabel; 
import javax.swing.JComboBox; 
import javax.swing.DefaultComboBoxModel; 
import javax.swing.UIManager; 
import javax.swing.JButton; 
import javax.swing.JScrollPane; 
import javax.swing.JTextArea; 
import java.awt.event.ActionListener; 

public class DialogoReportes extends JDialog implements ActionListener { 

/** 
 *  
 */ 

private static final long serialVersionUID = 1L; 
private JLabel lblTipo; 
private JComboBox<String> comboBox; 
private JButton btnCerrar; 
private JScrollPane scrollPane; 
private JTextArea txtS; 

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
			DialogoReportes dialog = new DialogoReportes(); 
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
public DialogoReportes() { 
	setModal(true); 
	setTitle("Generar Reportes"); 
	setBounds(100, 100, 650, 420); 
	getContentPane().setLayout(null); 
	
	lblTipo = new JLabel("Tipo de reporte"); 
	lblTipo.setBounds(15, 15, 80, 14); 
	getContentPane().add(lblTipo); 
	
	comboBox = new JComboBox<String>(); 
	comboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "Ventas por modelo", "Comparación con el precio promedio", "Comparación con la cantidad óptima", "Estadística general" })); 
	comboBox.setBounds(105, 11, 307, 22); 
	comboBox.addActionListener(this);
	getContentPane().add(comboBox); 

	btnCerrar = new JButton("Cerrar"); 
	btnCerrar.addActionListener(this); 
	btnCerrar.setBounds(535, 11, 89, 23); 
	getContentPane().add(btnCerrar); 

	scrollPane = new JScrollPane(); 
	scrollPane.setBounds(15, 40, 609, 330); 
	getContentPane().add(scrollPane); 

	txtS = new JTextArea(); 
	scrollPane.setViewportView(txtS); 
} 

 
public void actionPerformed(ActionEvent e) { 
	if (e.getSource() == btnCerrar) { 
		actionPerformedBtnCerrar(e); 
	} 
	if (e.getSource() == comboBox) { 
		actionPerformedcomboBox(e); 
	} 
} 
// logica boton cerrar
protected void actionPerformedBtnCerrar(ActionEvent e) { 
	this.dispose(); 
} 
//logica cbobox
protected void actionPerformedcomboBox(ActionEvent e) { 
	int index = obtenerIndex(); 
	tipoIndex(index); 

} 
//obtener index
public int obtenerIndex() { 
	return comboBox.getSelectedIndex(); 
} 
//impresion segun el index
public void tipoIndex(int i) { 
	switch(i) { 
		case 0: 
			imprimirVentasModelo(); 
			break; 
		case 1: 
			imprimirComparacionPromedio(); 
			break; 
		case 2: 
			imprimirCantidadOptima();
			break;
		default: 
			estadisticaPrecio();
			break;
	} 
} 

//imprimir ventas modelo
public void imprimirVentasModelo() { 
	double porcent0 = 0;  
	double porcent1 = 0;  
	double porcent2 = 0;  
	double porcent3 = 0;
	double porcent4 = 0;
	
	if(Tienda.importeTotalAcumulado == 0) {
		porcent0 = 0;
		porcent1 = 0;
		porcent2 = 0;
		porcent3 = 0;
		porcent4 = 0;
	}else { 
		porcent0 = (Tienda.totalVendidos0 * 100) / Tienda.importeTotalAcumulado;  
		porcent1 = (Tienda.totalVendidos1 * 100) / Tienda.importeTotalAcumulado;  
		porcent2 = (Tienda.totalVendidos2 * 100) / Tienda.importeTotalAcumulado;  
		porcent3 = (Tienda.totalVendidos3 * 100) / Tienda.importeTotalAcumulado;  
		porcent4 = (Tienda.totalVendidos4 * 100) / Tienda.importeTotalAcumulado;  
	}

	
	txtS.setText(""); 
	txtS.append("Modelo:.............................. " + Tienda.modelo0 + "\n"); 
	txtS.append("Cantidad de ventas:.................. " + Tienda.totalVentas0 + "\n"); 
	txtS.append("Cantidad de millares vendidos:....... " + Tienda.totalMillares0 + "\n"); 
	txtS.append("Importe total acumulado:............. " + Tienda.totalVendidos0 + "(" + String.format("%.2f", porcent0) + "% del total general)" + "\n" + "\n"); 
 
	txtS.append("Modelo:.............................. " + Tienda.modelo1 + "\n"); 
	txtS.append("Cantidad de ventas:.................. " + Tienda.totalVentas1 + "\n"); 
	txtS.append("Cantidad de millares vendidos:....... " + Tienda.totalMillares1 + "\n"); 
	txtS.append("Importe total acumulado:............. " + Tienda.totalVendidos1 + "(" + String.format("%.2f", porcent1) + "% del total general)" + "\n" + "\n"); 

	txtS.append("Modelo:.............................. " + Tienda.modelo2 + "\n"); 
	txtS.append("Cantidad de ventas:.................. " + Tienda.totalVentas2 + "\n"); 
	txtS.append("Cantidad de millares vendidos:....... " + Tienda.totalMillares2 + "\n"); 
	txtS.append("Importe total acumulado:............. " + Tienda.totalVendidos2 + "(" + String.format("%.2f", porcent2) + "% del total general)" + "\n" + "\n"); 

	txtS.append("Modelo:.............................. " + Tienda.modelo3 + "\n"); 
	txtS.append("Cantidad de ventas:.................. " + Tienda.totalVentas3 + "\n"); 
	txtS.append("Cantidad de millares vendidos:....... " + Tienda.totalMillares3 + "\n"); 
	txtS.append("Importe total acumulado:............. " + Tienda.totalVendidos3 + "(" + String.format("%.2f", porcent3) + "% del total general)" + "\n" + "\n"); 

	txtS.append("Modelo:.............................. " + Tienda.modelo4 + "\n"); 
	txtS.append("Cantidad de ventas:.................. " + Tienda.totalVentas4 + "\n"); 
	txtS.append("Cantidad de millares vendidos:....... " + Tienda.totalMillares4 + "\n"); 
	txtS.append("Importe total acumulado:............. " + Tienda.totalVendidos4 + "(" + String.format("%.2f", porcent4) + "% del total general)" + "\n" + "\n"); 
} 

public String promedioCadena(double pre, double pro) {
	double resta;
	if(pre == pro) {
		return " igual que el promedio";
	}else if(pre > pro) {
		resta = pre - pro;
		return resta + " mayor que el promedio";
	} else {
		resta = pro - pre;
		return resta + " menor que el promedio";
	}
}

public void imprimirComparacionPromedio() { 
	double prome = (Tienda.precio0 + Tienda.precio1 + Tienda.precio2 + Tienda.precio3 + Tienda.precio4 ) / 5;
	String cadenaPromedio0 = promedioCadena(Tienda.precio0, prome);
	String cadenaPromedio1 = promedioCadena(Tienda.precio1, prome);
	String cadenaPromedio2 = promedioCadena(Tienda.precio2, prome);
	String cadenaPromedio3 = promedioCadena(Tienda.precio3, prome);
	String cadenaPromedio4 = promedioCadena(Tienda.precio4, prome); 

	txtS.setText(""); 
	txtS.append("Modelo:.................... " + Tienda.modelo0 + "\n"); 
	txtS.append("Precio:.................... " + Tienda.precio0 + "\n"); 
	txtS.append("Precio promedio:........... " + prome + "\n"); 
	txtS.append("Comparacion:............... " + cadenaPromedio0 + "\n" + "\n"); 

	txtS.append("Modelo:.................... " + Tienda.modelo1 + "\n"); 
	txtS.append("Precio:.................... " + Tienda.precio1 + "\n"); 
	txtS.append("Precio promedio:........... " + prome + "\n"); 
	txtS.append("Comparacion:............... " + cadenaPromedio1 + "\n" + "\n");

	txtS.append("Modelo:.................... " + Tienda.modelo2 + "\n"); 
	txtS.append("Precio:.................... " + Tienda.precio2 + "\n"); 
	txtS.append("Precio promedio:........... " + prome + "\n"); 
	txtS.append("Comparacion:............... " + cadenaPromedio2 + "\n" + "\n");

	txtS.append("Modelo:.................... " + Tienda.modelo3 + "\n"); 
	txtS.append("Precio:.................... " + Tienda.precio3 + "\n"); 
	txtS.append("Precio promedio:........... " + prome + "\n"); 
	txtS.append("Comparacion:............... " + cadenaPromedio3 + "\n" + "\n");

	txtS.append("Modelo:.................... " + Tienda.modelo4 + "\n"); 
	txtS.append("Precio:.................... " + Tienda.precio4 + "\n"); 
	txtS.append("Precio promedio:........... " + prome + "\n"); 
	txtS.append("Comparacion:............... " + cadenaPromedio4 + "\n" + "\n");
	} 

public String comparacionCadena(int op, int ven) {
	int resta;
	if(op == ven) {
		return " igual que el promedio";
	}else if(op > ven) {
		resta = op - ven;
		return resta + " menor que el promedio";
	} else {
		resta = ven - op;
		return resta + " mayor que el promedio";
	}
}

public void imprimirCantidadOptima() { 
	
	String optima0 = comparacionCadena(Tienda.cantidadOptima0, Tienda.totalMillares0);
	String optima1 = comparacionCadena(Tienda.cantidadOptima1, Tienda.totalMillares1);
	String optima2 = comparacionCadena(Tienda.cantidadOptima2, Tienda.totalMillares2);
	String optima3 = comparacionCadena(Tienda.cantidadOptima3, Tienda.totalMillares3);
	String optima4 = comparacionCadena(Tienda.cantidadOptima4, Tienda.totalMillares4); 

	txtS.setText(""); 
	txtS.append("Modelo:............................ " + Tienda.modelo0 + "\n"); 
	txtS.append("Cantidad de millares vendidos:..... " + Tienda.totalMillares0 + "\n"); 
	txtS.append("Cantidad optima:................... " + Tienda.cantidadOptima0 + "\n"); 
	txtS.append("Comparacion:....................... " + optima0 + "\n" + "\n"); 

	txtS.append("Modelo:............................ " + Tienda.modelo1 + "\n"); 
	txtS.append("Cantidad de millares vendidos:..... " + Tienda.totalMillares1 + "\n"); 
	txtS.append("Cantidad optima:................... " + Tienda.cantidadOptima1 + "\n"); 
	txtS.append("Comparacion:....................... " + optima1 + "\n" + "\n");

	txtS.append("Modelo:............................ " + Tienda.modelo2 + "\n"); 
	txtS.append("Cantidad de millares vendidos:..... " + Tienda.totalMillares2 + "\n"); 
	txtS.append("Cantidad optima:................... " + Tienda.cantidadOptima2 + "\n"); 
	txtS.append("Comparacion:....................... " + optima2 + "\n" + "\n");

	txtS.append("Modelo:............................ " + Tienda.modelo3 + "\n"); 
	txtS.append("Cantidad de millares vendidos:..... " + Tienda.totalMillares3 + "\n"); 
	txtS.append("Cantidad optima:................... " + Tienda.cantidadOptima3 + "\n"); 
	txtS.append("Comparacion:....................... " + optima3 + "\n" + "\n");

	txtS.append("Modelo:............................ " + Tienda.modelo4 + "\n"); 
	txtS.append("Cantidad de millares vendidos:..... " + Tienda.totalMillares4 + "\n"); 
	txtS.append("Cantidad optima:................... " + Tienda.cantidadOptima4 + "\n"); 
	txtS.append("Comparacion:....................... " + optima4 + "\n" + "\n");
	} 

public String noVendidoCadena(int ven1, int ven2, int ven3, int ven4, int ven5) {
	int noVendido = 0;
	if(ven1 == 0) {
		noVendido++;
	}
	if(ven2 == 0) {
		noVendido++;
	}
	if(ven3 == 0) {
		noVendido++;
	}
	if(ven4 == 0) {
		noVendido++;
	}
	if(ven5 == 0) {
		noVendido++;
	}
	return noVendido + "";
}

public void estadisticaPrecio() { 
	
	double prome = (Tienda.precio0 + Tienda.precio1 + Tienda.precio2 + Tienda.precio3 + Tienda.precio4 ) / 5;
	String cant = noVendidoCadena(Tienda.totalVentas0, Tienda.totalVentas1, Tienda.totalVentas2, Tienda.totalVentas3, Tienda.totalVentas4 );
	
	txtS.setText(""); 
	txtS.append("Precio promedio:...................... " + prome + "\n");
	txtS.append("Precio mayor:......................... " + numeroMayor() + "\n"); 
	txtS.append("Precio menor:......................... " + numeroMenor() + "\n"); 
	txtS.append("Cantidad de modelos no vendidos:...... " + cant + "\n" + "\n"); 
	} 
public double numeroMayor() {
	double numero1 = Tienda.precio0;
	double numero2 = Tienda.precio1;
	double numero3 = Tienda.precio2;
	double numero4 = Tienda.precio3;
	double numero5 = Tienda.precio4;
			if(numero1 > numero2) {
				numero2 = numero1; 
			}
			if(numero2 > numero3) {
				numero3 = numero2; 
			}
			if(numero3 > numero4) {
				numero4 = numero3; 
			}
			if(numero4 > numero5) {
				numero5 = numero4; 
			}
	return numero5;
	}
public double numeroMenor() {
	double numero1 = Tienda.precio0;
	double numero2 = Tienda.precio1;
	double numero3 = Tienda.precio2;
	double numero4 = Tienda.precio3;
	double numero5 = Tienda.precio4;
			if(numero1 < numero2) {
				numero2 = numero1; 
			}
			if(numero2 < numero3) {
				numero3 = numero2; 
			}
			if(numero3 < numero4) {
				numero4 = numero3; 
			}
			if(numero4 < numero5) {
				numero5 = numero4; 
			}
	return numero5;
	}
}  

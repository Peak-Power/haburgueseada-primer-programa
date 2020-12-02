package Restaurant_S;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.lang.Math.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Restaurantes extends JFrame {
	
	double primerNumero;
	double segundoNumero;
	double resultado;
	String operacion;
	String respuesta;

	private JPanel contentPane;
	private JTextField txfHambPollo;
	private JTextField txfHambCarne;
	private JTextField txfHambQueso;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField txfIngresoCambio;
	public JComboBox comboBox_Cambio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurantes frame = new Restaurantes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Restaurantes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1300, 660);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(35, 96, 327, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblHambPollo = new JLabel("Hamb. Pollo -");
		lblHambPollo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHambPollo.setBounds(20, 11, 133, 30);
		panel.add(lblHambPollo);
		
		JLabel lblHambCarne = new JLabel("Hamb. Carne -");
		lblHambCarne.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHambCarne.setBounds(20, 51, 133, 30);
		panel.add(lblHambCarne);
		

		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 240, 245));
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_5.setBounds(723, 96, 498, 430);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 24, 478, 395);
		panel_5.add(tabbedPane);
		
		JPanel panel_Resumen = new JPanel();
		tabbedPane.addTab("Resumen", null, panel_Resumen, null);
		panel_Resumen.setLayout(null);
		
		JTextArea txtAreaResumen = new JTextArea();
		txtAreaResumen.setBounds(10, 11, 453, 345);
		panel_Resumen.add(txtAreaResumen);
		
		
		
		
		JLabel lblHambQueso = new JLabel("Hamb. Queso -");
		lblHambQueso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHambQueso.setBounds(20, 91, 147, 30);
		panel.add(lblHambQueso);
		
		txfHambPollo = new JTextField();
		txfHambPollo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent event) {
				
				char c = event.getKeyChar();
				if (c<'0'|| c>'9') event.consume();
			}
		});
		txfHambPollo.setHorizontalAlignment(SwingConstants.RIGHT);
		txfHambPollo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txfHambPollo.setBounds(163, 16, 133, 27);
		panel.add(txfHambPollo);
		txfHambPollo.setColumns(10);
		
		txfHambCarne = new JTextField();
		txfHambCarne.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent event) {
				
				char c = event.getKeyChar();
				if (c<'0'|| c>'9') event.consume();
				
			}
		});
		txfHambCarne.setHorizontalAlignment(SwingConstants.RIGHT);
		txfHambCarne.setFont(new Font("Tahoma", Font.BOLD, 20));
		txfHambCarne.setColumns(10);
		txfHambCarne.setBounds(163, 60, 133, 27);
		panel.add(txfHambCarne);
		
		txfHambQueso = new JTextField();
		txfHambQueso.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent event) {
				
				char c = event.getKeyChar();
				if (c<'0'|| c>'9') event.consume();
				
			}
		});
		txfHambQueso.setHorizontalAlignment(SwingConstants.RIGHT);
		txfHambQueso.setFont(new Font("Tahoma", Font.BOLD, 20));
		txfHambQueso.setColumns(10);
		txfHambQueso.setBounds(163, 100, 133, 27);
		panel.add(txfHambQueso);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent event) {
				
				char c = event.getKeyChar();
				if (c<'0'|| c>'9') event.consume();
				
			}
		});
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.setBounds(247, 159, 49, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblBebida = new JLabel("Bebida:");
		lblBebida.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBebida.setBounds(20, 132, 97, 30);
		panel.add(lblBebida);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCantidad.setBounds(232, 141, 64, 14);
		panel.add(lblCantidad);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Delivery");
		chckbxNewCheckBox.setBackground(new Color(255, 240, 245));
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(20, 199, 97, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Impuestos");
		chckbxNewCheckBox_1.setBackground(new Color(255, 240, 245));
		chckbxNewCheckBox_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxNewCheckBox_1.setBounds(166, 199, 97, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(30, 132, 267, 14);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(29, 190, 267, 14);
		panel.add(separator_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opci\u00F3n", "JUGO", "TE", "CAFFE", "VINO", "REFRESCO", "SAKE", "AGUA"}));
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox.setBounds(20, 159, 180, 20);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 240, 245));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(379, 96, 327, 239);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_Cambio = new JComboBox();
		comboBox_Cambio.setModel(new DefaultComboBoxModel(new String[] {"Tipo de Cambio", "USD Americano", "USD Canadiense", "$R", "$ Argentino", "Euro", "Libra"}));
		comboBox_Cambio.setFont(new Font("Times New Roman", Font.BOLD, 16));
		comboBox_Cambio.setBounds(32, 52, 144, 31);
		panel_1.add(comboBox_Cambio);
		
		
		txfIngresoCambio = new JTextField();
		txfIngresoCambio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent event) {
				
				char c = event.getKeyChar();
				if (c<'0'|| c>'9') event.consume();
				
			}
		});
		txfIngresoCambio.setHorizontalAlignment(SwingConstants.RIGHT);
		txfIngresoCambio.setFont(new Font("Tahoma", Font.BOLD, 12));
		txfIngresoCambio.setColumns(10);
		txfIngresoCambio.setBounds(32, 123, 130, 23);
		panel_1.add(txfIngresoCambio);
		
		JLabel lblResultadoCambio = new JLabel("");
		lblResultadoCambio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultadoCambio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblResultadoCambio.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblResultadoCambio.setBounds(182, 123, 118, 23);
		panel_1.add(lblResultadoCambio);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 240, 245));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(379, 346, 327, 180);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblResultadoTotal = new JLabel("");
		lblResultadoTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultadoTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultadoTotal.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		lblResultadoTotal.setBounds(138, 112, 124, 30);
		panel_2.add(lblResultadoTotal);
		
		JLabel lblDeberiasCambiar = new JLabel("");
		lblDeberiasCambiar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDeberiasCambiar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDeberiasCambiar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblDeberiasCambiar.setBounds(182, 157, 118, 23);
		panel_1.add(lblDeberiasCambiar);
		

		JLabel resultadoCambiario = new JLabel("");
		resultadoCambiario.setFont(new Font("Tahoma", Font.BOLD, 12));
		resultadoCambiario.setHorizontalAlignment(SwingConstants.RIGHT);
		resultadoCambiario.setBounds(186, 52, 89, 31);
		resultadoCambiario.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1.add(resultadoCambiario);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double[] i = new double [5];
				double us_Dollar = 28;
				double us_Canada = 21;
				double real_Brasil = 9;
				double peso_Argentina = 1.8;
				double euro = 30;

				double dolares_americanos = Double.parseDouble(txfIngresoCambio.getText());
				double dolares_canadienses = Double.parseDouble(txfIngresoCambio.getText());
				double peso_brasilero = Double.parseDouble(txfIngresoCambio.getText());
				double peso_argentino = Double.parseDouble(txfIngresoCambio.getText());
				double peso_europeo = Double.parseDouble(txfIngresoCambio.getText());
				
				double deberiasPagarEnTotal = Double.parseDouble(lblResultadoTotal.getText());
				
				if (comboBox_Cambio.getSelectedItem().equals("USD Americano"))
				{
				String cConvertidor1 = String.format("UYU %.2f", us_Dollar*dolares_americanos);
				lblResultadoCambio.setText(cConvertidor1);
				String precioMoneda1 = String.format("UYU %.2f", us_Dollar);
				resultadoCambiario.setText(precioMoneda1);
				
				String deberiasPagar = String.format("USD %.2f", deberiasPagarEnTotal/us_Dollar);
				lblDeberiasCambiar.setText(deberiasPagar);
				}
				
				
				if (comboBox_Cambio.getSelectedItem().equals("USD Canadiense"))
				{
				String cConvertidor2 = String.format("UYU %.2f", us_Dollar*dolares_canadienses);
				lblResultadoCambio.setText(cConvertidor2);
				String precioMoneda2 = String.format("UYU %.2f", us_Canada);
				resultadoCambiario.setText(precioMoneda2);
				
				String deberiasPagar = String.format("USD %.2f", deberiasPagarEnTotal/us_Canada);
				lblDeberiasCambiar.setText(deberiasPagar);
				}
				if (comboBox_Cambio.getSelectedItem().equals("$R"))
				{
				String cConvertidor2 = String.format("UYU %.2f", real_Brasil*peso_brasilero);
				lblResultadoCambio.setText(cConvertidor2);
				String precioMoneda2 = String.format("UYU %.2f", real_Brasil);
				resultadoCambiario.setText(precioMoneda2);
				
				String deberiasPagar = String.format("USD %.2f", deberiasPagarEnTotal/real_Brasil);
				lblDeberiasCambiar.setText(deberiasPagar);
				}
				if (comboBox_Cambio.getSelectedItem().equals("$ Argentino"))
				{
				String cConvertidor2 = String.format("UYU %.2f", peso_Argentina*peso_argentino);
				lblResultadoCambio.setText(cConvertidor2);
				String precioMoneda2 = String.format("UYU %.2f", peso_Argentina);
				resultadoCambiario.setText(precioMoneda2);
				
				String deberiasPagar = String.format("USD %.2f", deberiasPagarEnTotal/peso_Argentina);
				lblDeberiasCambiar.setText(deberiasPagar);
				}
				if (comboBox_Cambio.getSelectedItem().equals("Euro"))
				{
				String cConvertidor2 = String.format("UYU %.2f", euro*peso_europeo);
				lblResultadoCambio.setText(cConvertidor2);
				String precioMoneda2 = String.format("UYU %.2f", euro);
				resultadoCambiario.setText(precioMoneda2);
				
				String deberiasPagar = String.format("USD %.2f", deberiasPagarEnTotal/euro);
				lblDeberiasCambiar.setText(deberiasPagar);
				
				}
				
				
			}
		});
		btnNewButton.setBounds(62, 192, 89, 23);
		panel_1.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Resetear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBox_Cambio.setSelectedItem("Tipo de Cambio");
				resultadoCambiario.setText(null);
				lblResultadoCambio.setText(null);
				txfIngresoCambio.setText(null);
				lblDeberiasCambiar.setText(null);
			}
		});
		btnNewButton_1.setBounds(161, 192, 89, 23);
		panel_1.add(btnNewButton_1);
		
		
		
		JLabel lblcuntoQuieresCambiar = new JLabel("* \u00BFCu\u00E1nto quieres cambiar?");
		lblcuntoQuieresCambiar.setBounds(32, 98, 196, 14);
		panel_1.add(lblcuntoQuieresCambiar);
		
		JLabel lblcuntoDeberasCambiar = new JLabel("* Cuanto deber\u00EDas cambiar:");
		lblcuntoDeberasCambiar.setBounds(21, 166, 165, 14);
		panel_1.add(lblcuntoDeberasCambiar);
		
		
		
		
		JLabel lblSubTotal = new JLabel("Sub Total:");
		lblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubTotal.setBounds(25, 32, 104, 30);
		panel_2.add(lblSubTotal);
		
		JLabel lblIva = new JLabel("IVA:");
		lblIva.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIva.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIva.setBounds(25, 72, 104, 30);
		panel_2.add(lblIva);
		
		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(25, 112, 104, 30);
		panel_2.add(lblTotal);
		
		
		JLabel lblResultadoIva = new JLabel("");
		lblResultadoIva.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultadoIva.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultadoIva.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblResultadoIva.setBounds(138, 75, 124, 22);
		panel_2.add(lblResultadoIva);
		
		JLabel lblResultadoSubTotal = new JLabel("");
		lblResultadoSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultadoSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultadoSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblResultadoSubTotal.setBounds(138, 40, 124, 22);
		panel_2.add(lblResultadoSubTotal);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 240, 245));
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(35, 346, 327, 180);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCostoBebida = new JLabel("Costo Bebidas:");
		lblCostoBebida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCostoBebida.setBounds(25, 32, 158, 30);
		panel_3.add(lblCostoBebida);
		
		JLabel lblCostoComida = new JLabel("Costo Comida:");
		lblCostoComida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCostoComida.setBounds(25, 72, 158, 30);
		panel_3.add(lblCostoComida);
		
		JLabel lblCostoDelivery = new JLabel("Costo Delivery:");
		lblCostoDelivery.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCostoDelivery.setBounds(25, 112, 158, 30);
		panel_3.add(lblCostoDelivery);
		
		JLabel lblResultadoCostoBebida = new JLabel("");
		lblResultadoCostoBebida.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultadoCostoBebida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultadoCostoBebida.setBounds(180, 37, 124, 22);
		lblResultadoCostoBebida.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_3.add(lblResultadoCostoBebida);
		
		JLabel lblResultadoCostoComida = new JLabel("");
		lblResultadoCostoComida.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultadoCostoComida.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultadoCostoComida.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblResultadoCostoComida.setBounds(180, 73, 124, 22);
		panel_3.add(lblResultadoCostoComida);
		
		JLabel lblResultadoCostoDelivery = new JLabel("");
		lblResultadoCostoDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultadoCostoDelivery.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultadoCostoDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblResultadoCostoDelivery.setBounds(180, 113, 124, 22);
		panel_3.add(lblResultadoCostoDelivery);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 240, 245));
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(35, 537, 1186, 84);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		
		
		JButton btnNewButton_2 = new JButton("Total");
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//-------------Precios Comidas--------------------
				
				double cantidadHambPollo = Double.parseDouble(txfHambPollo.getText());
				double precioUniHambPollo = 100;
				double resultadoHambP;
				resultadoHambP=(cantidadHambPollo*precioUniHambPollo);
				String hPollo = String.format("%.0f",resultadoHambP);
				
				double cantidadHambCarne = Double.parseDouble(txfHambCarne.getText());
				double precioUniHambCarne = 10;
				double resultadoHambC;
				resultadoHambC=(cantidadHambCarne*precioUniHambCarne);
				String hCarne = String.format("%.0f",resultadoHambC);
				
				double cantidadHambQueso = Double.parseDouble(txfHambQueso.getText());
				double precioUniHambQueso = 1;
				double resultadoHambQ;
				resultadoHambQ=(cantidadHambQueso*precioUniHambQueso);
				String hQueso = String.format("%.0f",resultadoHambQ);
				
				String resultadoTotalComidas = String.format("%.0f", resultadoHambP+resultadoHambC+resultadoHambQ);
				lblResultadoCostoComida.setText(resultadoTotalComidas);
				
				
				//------------------- Precio Delivery-------------------

				double precioDelivery = 77;

				if(chckbxNewCheckBox.isSelected())
				{
				String resultadoDelivery = String.format("%.0f", precioDelivery);
				lblResultadoCostoDelivery.setText(resultadoDelivery);
				}
				else
				{
				lblResultadoCostoDelivery.setText("0");
				}
								
				//-------------------------Precio Bebidas-----------------
				
				double bebida =Double.parseDouble(textField_5.getText());
				double JUGO = 50 * bebida;
				double TE = 55 * bebida;
				double CAFFE = 60 * bebida;
				double VINO = 65 * bebida;
				double REFRESCO= 85 *bebida;
				double SAKE= 100*bebida;
				double AGUA=35*bebida;
				double sOpcion=0;
				
				if (comboBox.getSelectedItem().equals("JUGO"))
				{
				String pJUGO = String.format("%.0f", JUGO);
				lblResultadoCostoBebida.setText(pJUGO);
				}
				if (comboBox.getSelectedItem().equals("TE"))
				{
				String pTE = String.format("%.0f", TE);
				lblResultadoCostoBebida.setText(pTE);
				}
				if (comboBox.getSelectedItem().equals("CAFFE"))
				{
				String pCAFFE = String.format("%.0f", CAFFE);
				lblResultadoCostoBebida.setText(pCAFFE);
				}
				if (comboBox.getSelectedItem().equals("VINO"))
				{
				String pVINO = String.format("%.0f", VINO);
				lblResultadoCostoBebida.setText(pVINO);
				}
				if (comboBox.getSelectedItem().equals("REFRESCO"))
				{
				String pREFRESCO = String.format("%.0f", REFRESCO);
				lblResultadoCostoBebida.setText(pREFRESCO);
				}
				if (comboBox.getSelectedItem().equals("SAKE"))
				{
				String pSAKE = String.format("%.0f", SAKE);
				lblResultadoCostoBebida.setText(pSAKE);
				}
				if (comboBox.getSelectedItem().equals("AGUA"))
				{
				String pAGUA = String.format("%.0f", AGUA);
				lblResultadoCostoBebida.setText(pAGUA);
				}
				if (comboBox.getSelectedItem().equals("Seleccione una opción"))
				{
				String pSeleccion = String.format("%.0f", sOpcion);
				lblResultadoCostoBebida.setText(pSeleccion);
				}
				
				//---------------------Impuestos---------------------------------
				
				double costoTotalBebida = Double.parseDouble(lblResultadoCostoBebida.getText());
				double costoTotalComida = Double.parseDouble(lblResultadoCostoComida.getText());
				double costoTotalDelivery = Double.parseDouble(lblResultadoCostoDelivery.getText());
				double sumaTotalIva = ((costoTotalBebida + costoTotalComida + costoTotalDelivery) * 22)/100;
				double sumarTotalIva = sumaTotalIva;

				if (chckbxNewCheckBox_1.isSelected()) {
					String sTotalIva = String.format("%.0f", sumaTotalIva);
					lblResultadoIva.setText(sTotalIva);

				}else{
					lblResultadoIva.setText("0");
				}
				
				//-------------------- Sub Total ----------------------------------------------
				
				double sumaTotal = (costoTotalBebida + costoTotalComida + costoTotalDelivery);
				double sumarTotal=sumaTotal;
				String sTotal = String.format("%.0f", sumaTotal);
				lblResultadoSubTotal.setText(sTotal);
				
				
				//----------------------- Total más IVA------------------------------------------
				
				double sumaTotalConIva = sumarTotal + sumarTotalIva;
				String sTotalConIva = String.format("%.0f", sumaTotalConIva);
				lblResultadoTotal.setText(sTotalConIva);
			
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2.setBounds(24, 25, 161, 38);
		panel_4.add(btnNewButton_2);
		
		JButton btnResumen = new JButton("Resumen");
		btnResumen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				txtAreaResumen.setText("\tRESUMEN DE PEDIDOS:\n\n"+"\n\t*Cantidad de hamburguesas de Pollo: \t"+ txfHambPollo.getText()
				+"\n\t*Cantidad de hamburguesas de Carne: \t"+ txfHambCarne.getText()
				+"\n\t*Cantidad de hamburguesas de Queso: \t"+ txfHambQueso.getText() +
				"\n\n\t*Bebida: "+ comboBox.getSelectedItem() + ", cantidad:\t"+textField_5.getText()+"\n\n"+

				"\n\t***** Sub Total:\t\t$UY "+ lblResultadoSubTotal.getText() +
				"\n\t***** IVA:\t\t$UY " + lblResultadoIva.getText() +
				"\n\t----------------------------------------------------------- "+
				"\n\n\t***** TOTAL:\t\t$UY "+lblResultadoTotal.getText()
				);
				
			}
		});
		btnResumen.setBackground(Color.RED);
		btnResumen.setForeground(Color.WHITE);
		btnResumen.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnResumen.setBounds(250, 25, 161, 38);
		panel_4.add(btnResumen);
		
		JButton btnResetear = new JButton("Resetear");
		btnResetear.setBackground(Color.GRAY);
		btnResetear.setForeground(Color.WHITE);
		btnResetear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txfHambPollo.setText(null);
				txfHambCarne.setText(null);
				txfHambQueso.setText(null);
				comboBox.setSelectedItem("Seleccione una opción");
				textField_5.setText(null);
				lblResultadoCostoBebida.setText(null);
				lblResultadoCostoComida.setText(null);
				lblResultadoCostoDelivery.setText(null);
				comboBox_Cambio.setSelectedItem("Tipo de Cambio");
				txfIngresoCambio.setText(null);
				lblResultadoCambio.setText(null);
				lblResultadoSubTotal.setText(null);
				lblResultadoIva.setText(null);
				lblResultadoTotal.setText(null);
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				txtAreaResumen.setText(null);
				
			}
		});
		btnResetear.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnResetear.setBounds(467, 25, 161, 38);
		panel_4.add(btnResetear);
		
		
		
		
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(Color.GRAY);
		btnSalir.setForeground(Color.WHITE);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSalir.setBounds(682, 25, 161, 38);
		panel_4.add(btnSalir);
		
		JButton btnInformacin = new JButton("Informaci\u00F3n");
		btnInformacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Realizado el día 23/10/2016 por María Eugenia Szwedowski");
				
			}
		});
		btnInformacin.setBounds(988, 50, 161, 23);
		panel_4.add(btnInformacin);
		
		JButton btnHazClick = new JButton("Haz click ac\u00E1");
		btnHazClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SaludosUsuario nuevaVentanaSaludos = new SaludosUsuario();
				nuevaVentanaSaludos.setVisible(true);
				
			}
		});
		btnHazClick.setBounds(988, 16, 161, 23);
		panel_4.add(btnHazClick);
		
		
		
	
		
		
		
		JPanel panel_Calculadora = new JPanel();
		tabbedPane.addTab("Calculadora", null, panel_Calculadora, null);
		panel_Calculadora.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent event) {
				
				char c = event.getKeyChar();
				if (c<'0'|| c>'9'||c=='.' ) event.consume();
				
			}
		});
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(76, 11, 314, 42);
		panel_Calculadora.add(textField_3);
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ingNum = textField_3.getText() + button.getText();
				textField_3.setText(ingNum);
				
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial Black", Font.BOLD, 18));
		button.setBackground(Color.RED);
		button.setBounds(76, 68, 50, 50);
		panel_Calculadora.add(button);
		
		JButton button_1 = new JButton("8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ingNum = textField_3.getText() + button_1.getText();
				textField_3.setText(ingNum);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_1.setBackground(Color.RED);
		button_1.setBounds(136, 68, 50, 50);
		panel_Calculadora.add(button_1);
		
		JButton button_2 = new JButton("9");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ingNum = textField_3.getText() + button_2.getText();
				textField_3.setText(ingNum);
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_2.setBackground(Color.RED);
		button_2.setBounds(196, 68, 50, 50);
		panel_Calculadora.add(button_2);
		
		JButton button_3 = new JButton("C");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setText(null);
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_3.setBackground(Color.RED);
		button_3.setBounds(256, 68, 50, 50);
		panel_Calculadora.add(button_3);
		
		JButton button_4 = new JButton("CE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String espacioMenos=null;

				if(textField_3.getText().length()>0){
				StringBuilder nuevoString = new StringBuilder(textField_3.getText());
				nuevoString.deleteCharAt(textField_3.getText().length()-1);
				espacioMenos=nuevoString.toString();
				textField_3.setText(espacioMenos);
				}
				
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_4.setBackground(Color.RED);
		button_4.setBounds(316, 68, 74, 50);
		panel_Calculadora.add(button_4);
		
		JButton button_5 = new JButton("=");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				segundoNumero = Double.parseDouble(textField_3.getText());

				if (operacion =="+"){
				resultado = primerNumero + segundoNumero;
				respuesta = String.format("%.3f",resultado);
				textField_3.setText(respuesta);

				} else if (operacion =="-"){

				resultado = primerNumero - segundoNumero;
				respuesta = String.format("%.3f",resultado);
				textField_3.setText(respuesta);

				} else if (operacion =="*"){

				resultado = primerNumero * segundoNumero;
				respuesta = String.format("%.3f",resultado);
				textField_3.setText(respuesta);

				} else if (operacion =="/"){

				resultado = primerNumero / segundoNumero;
				respuesta = String.format("%.3f",resultado);
				textField_3.setText(respuesta);

				}else if (operacion =="%"){

					resultado = primerNumero % segundoNumero;
					respuesta = String.format("%.3f",resultado);
					textField_3.setText(respuesta);
					
				}else if (operacion =="^"){

					resultado = (int)Math.pow((int)primerNumero,(int)segundoNumero);
					respuesta = String.format("%.3f",resultado);
					textField_3.setText(respuesta);
				}

				
			}
		});
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_5.setBackground(Color.RED);
		button_5.setBounds(316, 129, 74, 111);
		panel_Calculadora.add(button_5);
		
		JButton button_6 = new JButton("+");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primerNumero = Double.parseDouble(textField_3.getText());
				textField_3.setText("");
				operacion="+";
				
			}
		});
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_6.setBackground(Color.RED);
		button_6.setBounds(256, 129, 50, 50);
		panel_Calculadora.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingNum = textField_3.getText() + button_7.getText();
				textField_3.setText(ingNum);
			}
		});
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_7.setBackground(Color.RED);
		button_7.setBounds(196, 129, 50, 50);
		panel_Calculadora.add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingNum = textField_3.getText() + button_8.getText();
				textField_3.setText(ingNum);
			}
		});
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_8.setBackground(Color.RED);
		button_8.setBounds(136, 129, 50, 50);
		panel_Calculadora.add(button_8);
		
		JButton button_9 = new JButton("4");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingNum = textField_3.getText() + button_9.getText();
				textField_3.setText(ingNum);
			}
		});
		button_9.setForeground(Color.WHITE);
		button_9.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_9.setBackground(Color.RED);
		button_9.setBounds(76, 129, 50, 50);
		panel_Calculadora.add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingNum = textField_3.getText() + button_10.getText();
				textField_3.setText(ingNum);
			}
		});
		button_10.setForeground(Color.WHITE);
		button_10.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_10.setBackground(Color.RED);
		button_10.setBounds(76, 190, 50, 50);
		panel_Calculadora.add(button_10);
		
		JButton button_11 = new JButton("2");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingNum = textField_3.getText() + button_11.getText();
				textField_3.setText(ingNum);
			}
		});
		button_11.setForeground(Color.WHITE);
		button_11.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_11.setBackground(Color.RED);
		button_11.setBounds(136, 190, 50, 50);
		panel_Calculadora.add(button_11);
		
		JButton button_12 = new JButton("3");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingNum = textField_3.getText() + button_12.getText();
				textField_3.setText(ingNum);
			}
		});
		button_12.setForeground(Color.WHITE);
		button_12.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_12.setBackground(Color.RED);
		button_12.setBounds(196, 190, 50, 50);
		panel_Calculadora.add(button_12);
		
		JButton button_13 = new JButton("-");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primerNumero=Double.parseDouble(textField_3.getText());
				textField_3.setText("");
				operacion="-";
				
			}
		});
		button_13.setForeground(Color.WHITE);
		button_13.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_13.setBackground(Color.RED);
		button_13.setBounds(256, 190, 50, 50);
		panel_Calculadora.add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double primerNumero= Double.parseDouble(textField_3.getText());
				textField_3.setText("");
				operacion="/";
			}
		});
		button_14.setForeground(Color.WHITE);
		button_14.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_14.setBackground(Color.RED);
		button_14.setBounds(256, 251, 50, 50);
		panel_Calculadora.add(button_14);
		
		JButton button_15 = new JButton("*");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primerNumero= Double.parseDouble(textField_3.getText());
				textField_3.setText("");
				operacion="*";
				
			}
		});
		button_15.setForeground(Color.WHITE);
		button_15.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_15.setBackground(Color.RED);
		button_15.setBounds(196, 251, 50, 50);
		panel_Calculadora.add(button_15);
		
		JButton button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ingNum = textField_3.getText() + button_16.getText();
				textField_3.setText(ingNum);
			}
		});
		button_16.setForeground(Color.WHITE);
		button_16.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_16.setBackground(Color.RED);
		button_16.setBounds(136, 251, 50, 50);
		panel_Calculadora.add(button_16);
		
		JButton button_17 = new JButton("0");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingNum = textField_3.getText() + button_17.getText();
				textField_3.setText(ingNum);
			}
		});
		button_17.setForeground(Color.WHITE);
		button_17.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_17.setBackground(Color.RED);
		button_17.setBounds(76, 251, 50, 50);
		panel_Calculadora.add(button_17);
		
		JButton button_18 = new JButton("%");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				primerNumero=Double.parseDouble(textField_3.getText());
				textField_3.setText("");
				operacion="%";
				
			}
		});
		button_18.setForeground(Color.WHITE);
		button_18.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_18.setBackground(Color.RED);
		button_18.setBounds(316, 251, 74, 50);
		panel_Calculadora.add(button_18);
		
		JButton button_19 = new JButton("+/-");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double operacion = Double.parseDouble(String.valueOf(textField_3.getText()));
				operacion = operacion * (-1);
				textField_3.setText(String.valueOf(operacion));
				
			}
		});
		button_19.setForeground(Color.WHITE);
		button_19.setFont(new Font("Arial Black", Font.BOLD, 18));
		button_19.setBackground(Color.RED);
		button_19.setBounds(316, 314, 74, 50);
		panel_Calculadora.add(button_19);
		
		JButton btnCalculadoraResetear = new JButton("Resetear");
		btnCalculadoraResetear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_3.setText(null);
//				btnCalculadoraResetear
				
				
			}
		});
		btnCalculadoraResetear.setForeground(Color.WHITE);
		btnCalculadoraResetear.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnCalculadoraResetear.setBackground(Color.RED);
		btnCalculadoraResetear.setBounds(76, 312, 224, 50);
		panel_Calculadora.add(btnCalculadoraResetear);
		
		JLabel lblTitulo = new JLabel("\"LA HAMBURGUESEADA\"");
		lblTitulo.setForeground(new Color(255, 69, 0));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("sabrina star", Font.BOLD, 39));
		lblTitulo.setBounds(53, 11, 1168, 74);
		contentPane.add(lblTitulo);
	}
}

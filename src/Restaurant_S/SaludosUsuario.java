package Restaurant_S;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SaludosUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txfNombre;
	private JLabel lblMensaje;
	private JButton btnResetear;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaludosUsuario frame = new SaludosUsuario();
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
	public SaludosUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 265);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 240, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txfNombre = new JTextField();
		txfNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent event) {
				
				char c = event.getKeyChar();
				if ((c<'a'|| c>'z')&&(c<'A'|| c>'Z')&&(c==' ')&&(c=='í')) event.consume();
				
			}
		});
		txfNombre.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txfNombre.setBounds(34, 78, 343, 43);
		contentPane.add(txfNombre);
		txfNombre.setColumns(10);
		
		JLabel lblIngresaTuNombre = new JLabel("Ingresa tu nombre:");
		lblIngresaTuNombre.setForeground(new Color(255, 0, 0));
		lblIngresaTuNombre.setFont(new Font("Mickey", Font.PLAIN, 30));
		lblIngresaTuNombre.setBounds(34, 36, 343, 31);
		contentPane.add(lblIngresaTuNombre);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setForeground(new Color(0, 0, 0));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre=txfNombre.getText();
				lblMensaje.setText(nombre+", gracias por haber bajado éste programa");
				
			}
		});
		btnAceptar.setBounds(34, 132, 89, 23);
		contentPane.add(btnAceptar);
		
		lblMensaje = new JLabel("");
		lblMensaje.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMensaje.setBounds(34, 164, 390, 51);
		contentPane.add(lblMensaje);
		
		btnResetear = new JButton("Recetear");
		btnResetear.setForeground(new Color(0, 0, 0));
		btnResetear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txfNombre.setText("");
				
			}
		});
		btnResetear.setBounds(161, 132, 89, 23);
		contentPane.add(btnResetear);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setForeground(new Color(0, 0, 0));
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaludosUsuario.this.dispose();
			
			}
		});
		btnCerrar.setBounds(288, 132, 89, 23);
		contentPane.add(btnCerrar);
	}

}

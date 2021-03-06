package pantallas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;
import javax.swing.Box;
import java.awt.Dimension;
import dominio.RepositorioUsuariosFalso;
public class PantallaLogin {

	private JFrame frame;
	private JTextField textFieldLogin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaLogin window = new PantallaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaLogin() {
		initialize();
	}
	
	public JFrame getFrame()
	{
		return frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 667, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_norte = new JPanel();
		panel_norte.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel_norte, BorderLayout.NORTH);
		panel_norte.setLayout(new BoxLayout(panel_norte, BoxLayout.Y_AXIS));
		
		JPanel panel_norte1 = new JPanel();
		panel_norte1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		FlowLayout flowLayout_1 = (FlowLayout) panel_norte1.getLayout();
		flowLayout_1.setVgap(6);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setHgap(0);
		panel_norte.add(panel_norte1);
		
		JLabel lblAppVideo = new JLabel("AppVideo");
		lblAppVideo.setHorizontalAlignment(SwingConstants.LEFT);
		lblAppVideo.setForeground(Color.RED);
		lblAppVideo.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		panel_norte1.add(lblAppVideo);
		//lblAppVideo.setBorder(new EmptyBorder(0, 0, 0, 50));
		
		Component rigidArea_0 = Box.createRigidArea(new Dimension(70, 0));
		panel_norte1.add(rigidArea_0);
		
		JLabel lblNewLabel_1 = new JLabel("Hola usuario");
		panel_norte1.add(lblNewLabel_1);
		
		Component rigidArea = Box.createRigidArea(new Dimension(70, 0));
		panel_norte1.add(rigidArea);
		
		JButton btnRegistro = new JButton("Registro");
		panel_norte1.add(btnRegistro);
		
		JButton btnLogin = new JButton("login");
		panel_norte1.add(btnLogin);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(30, 0));
		panel_norte1.add(rigidArea_1);
		
		JButton btnLogout = new JButton("logout");
		panel_norte1.add(btnLogout);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(40, 0));
		panel_norte1.add(rigidArea_2);
		
		JButton btnPremium = new JButton("Premium");
		btnPremium.setForeground(Color.RED);
		panel_norte1.add(btnPremium);
		
		
		//btnPremium.setBorder(new EmptyBorder(0, 40, 0, 0));
		
		JPanel panel_norte2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_norte2.getLayout();
		flowLayout.setHgap(-2);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_norte.add(panel_norte2);
		
		JButton btnExplorar = new JButton("Explorar");
		btnExplorar.setBackground(Color.LIGHT_GRAY);
		btnExplorar.setForeground(Color.WHITE);
		panel_norte2.add(btnExplorar);
		
		JButton btnMisListas = new JButton("Mis Listas");
		btnMisListas.setForeground(Color.WHITE);
		btnMisListas.setBackground(Color.LIGHT_GRAY);
		panel_norte2.add(btnMisListas);
		
		JButton btnRecientes = new JButton("Recientes");
		btnRecientes.setForeground(Color.WHITE);
		btnRecientes.setBackground(Color.LIGHT_GRAY);
		panel_norte2.add(btnRecientes);
		
		JButton btnNuevaLista = new JButton("Nueva Lista");
		btnNuevaLista.setForeground(Color.WHITE);
		btnNuevaLista.setBackground(Color.LIGHT_GRAY);
		panel_norte2.add(btnNuevaLista);
		
		JPanel panel_centro = new JPanel();
		panel_centro.setForeground(Color.LIGHT_GRAY);
		panel_centro.setBackground(Color.GRAY);
		frame.getContentPane().add(panel_centro, BorderLayout.CENTER);
		panel_centro.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_centro_central = new JPanel();
		panel_centro_central.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_centro_central.setBackground(Color.GRAY);
		panel_centro.add(panel_centro_central, BorderLayout.CENTER);
		panel_centro_central.setLayout(new BorderLayout(0, 50));
		
		JPanel panel_cc_sur = new JPanel();
		panel_cc_sur.setBackground(Color.GRAY);
		panel_centro_central.add(panel_cc_sur, BorderLayout.SOUTH);
		panel_cc_sur.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 5));
		
		JButton btn_aceptar = new JButton("Aceptar");
		panel_cc_sur.add(btn_aceptar);
		
		
		//nota: se obtiene un string del campo contrasena de la siguiente manera:
		//de otra manera, no se obtiene bien
		btn_aceptar.addActionListener(ev -> {
			if(RepositorioUsuariosFalso.isLoginOK(textFieldLogin.getText(), String.valueOf(passwordField.getPassword())))
			{
				JOptionPane.showMessageDialog(panel_centro_central, "Login aceptado");
			}
			else {
				JOptionPane.showMessageDialog(panel_centro_central, "Login rechazado");
			}
			
			});
		
		Component rigidArea_cc_sur = Box.createRigidArea(new Dimension(0, 8));
		panel_cc_sur.add(rigidArea_cc_sur);
		
		JButton btnCancelar = new JButton("Cancelar");
		panel_cc_sur.add(btnCancelar);
		btnCancelar.addActionListener(ev -> {
			frame.setVisible(false);
			});
		
		Component rigidArea_8 = Box.createRigidArea(new Dimension(0, 50));
		panel_cc_sur.add(rigidArea_8);
		
		JPanel panel_cc_centro = new JPanel();
		panel_cc_centro.setBackground(Color.GRAY);
		panel_centro_central.add(panel_cc_centro, BorderLayout.CENTER);
		panel_cc_centro.setLayout(new BoxLayout(panel_cc_centro, BoxLayout.Y_AXIS));
		
		Component rigidArea_7 = Box.createRigidArea(new Dimension(0, 55));
		panel_cc_centro.add(rigidArea_7);
		
		JPanel panel_login = new JPanel();
		panel_login.setBackground(Color.GRAY);
		panel_cc_centro.add(panel_login);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(15, 0));
		panel_login.add(rigidArea_3);
		
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setForeground(Color.WHITE);
		panel_login.add(lblLogin);
		
		textFieldLogin = new JTextField();
		panel_login.add(textFieldLogin);
		textFieldLogin.setColumns(15);
		
		
		JPanel panel_password = new JPanel();
		panel_password.setBackground(Color.GRAY);
		panel_cc_centro.add(panel_password);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		panel_password.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(15);
		panel_password.add(passwordField);
		
		
		Component rigidArea_Norte = Box.createRigidArea(new Dimension(20, 50));
		panel_centro.add(rigidArea_Norte, BorderLayout.NORTH);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 50));
		panel_centro.add(rigidArea_4, BorderLayout.SOUTH);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(150, 20));
		rigidArea_5.setBackground(Color.GRAY);
		panel_centro.add(rigidArea_5, BorderLayout.WEST);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(150, 20));
		panel_centro.add(rigidArea_6, BorderLayout.EAST);
		
		
	}

}


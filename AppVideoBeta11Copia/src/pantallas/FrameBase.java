package pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import dominio.AppVideo;
import dominio.RepositorioUsuariosFalso;
import dominio.Usuario;

public class FrameBase extends JFrame {

	private JPanel contentPane;
	private AppVideo appVideo;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppVideo appVideo = new AppVideo();
					FrameBase frame = new FrameBase(appVideo);
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
	public FrameBase(AppVideo appVideo) {
		this.appVideo=appVideo;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 448);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		//setContentPane(contentPane);
		
		JPanel panel_norte = new JPanel();
		panel_norte.setBackground(Color.LIGHT_GRAY);
		this.getContentPane().add(panel_norte, BorderLayout.NORTH);
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
		
		JLabel lblNewLabel_1 = new JLabel("Hola "+appVideo.getUsuario());
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
		panel_centro.setForeground(Color.GRAY);
		panel_centro.setBackground(Color.GRAY);
		this.getContentPane().add(panel_centro, BorderLayout.CENTER);
		panel_centro.setLayout(new BorderLayout(0, 0));
		
		btnLogin.addActionListener(ev -> {
			PanelLogin panelLogin = new PanelLogin(appVideo);
			/*panelLogin.setVisible(true);
			panel_centro.add(panelLogin, BorderLayout.CENTER);
			panel_centro.repaint();
			panel_centro.revalidate();*/
			CreadorPaneles.creaPanel(panel_centro, panelLogin);
			panel_norte.repaint();
			panel_norte.revalidate();
			});
		
		
	}
}

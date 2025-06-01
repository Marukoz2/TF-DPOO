package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenu mnMenu = new JMenu("");
		mnMenu.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icon/2867922_menu_icon.png")));
		mnMenu.setBounds(15, 16, 57, 52);
		contentPane.add(mnMenu);
		
		JButton btnLogin = new JButton("Login");
		mnMenu.add(btnLogin);
		
		JButton btnOfertas = new JButton("Ofertas");
		mnMenu.add(btnOfertas);
		
		JButton button = new JButton("Salir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnMenu.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/icon/fondo-borroso-de-computadoras-portatiles-y-televisores-expuestos-en-una-tienda-de-electronica.jpg")));
		lblNewLabel.setBounds(0, 0, 808, 514);
		contentPane.add(lblNewLabel);
	}
}

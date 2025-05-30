package interfaz;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public Login() {
		setTitle("CuCorsair Store");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 629, 314);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(199, 46, 256, 144);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inicio de Sesion");
		lblNewLabel.setBounds(47, 16, 162, 27);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(15, 59, 69, 20);
		panel_1.add(lblUsuario);
		
		JLabel lblClave = new JLabel("   Clave:");
		lblClave.setBounds(15, 108, 69, 20);
		panel_1.add(lblClave);
		
		textField = new JTextField();
		textField.setBounds(95, 59, 146, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 105, 146, 26);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
	}
}

package calendar;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Login_GUI {

	private JFrame frame;
	private static ArrayList<User> users = new ArrayList<User>();
	private String smallLogo = "/icons/ProDuc Logo v1 70x70.png";
	private String largeLogo = "/icons/ProDuc Logo v1.png";
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_GUI window = new Login_GUI(users);
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
	public Login_GUI(ArrayList<User> users) {
		initialize(users);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(ArrayList<User> users) {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Login_GUI.class.getResource(largeLogo)));
		frame.setBounds(100, 100, 298, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 289, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(10, 11, 414, 70);
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Login_GUI.class.getResource(smallLogo)));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 70, 70);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(0, 11, 414, 50);
		panel_1.add(panel_2);
		
		JLabel lblLogin = new JLabel("ProDuc - Login");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblLogin.setBounds(24, 0, 276, 50);
		panel_2.add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(10, 92, 81, 24);
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(10, 130, 81, 24);
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(101, 96, 135, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(101, 134, 135, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("New User");
		btnNewButton.setBackground(new Color(255, 215, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 165, 120, 48);
		panel.add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBackground(new Color(255, 215, 0));
		btnLogin.setBounds(148, 165, 120, 48);
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				users.add(new User("Bob", "password"));
				new Calendar_GUI(users.get(0).getCalendar());
				frame.dispose();
			}
			
		});
		panel.add(btnLogin);
	}
}

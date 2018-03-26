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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Login_GUI {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
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

	
	private JFrame frame;
	private static ArrayList<User> users = new ArrayList<User>();
	private String smallLogo = "/calendar/ProDuc Logo v1 70x70.png";
	private String largeLogo = "/calendar/ProDuc Logo v1.png";
	private String userAccountsLoction = "src/userAccounts";
	private JTextField textField;
	private JPasswordField passwordField;

	public Login_GUI(ArrayList<User> users) {
		initialize(users);
	}

	private void initialize(ArrayList<User> users) {
		frame = new JFrame();
		frame.setTitle("ProDuc");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Login_GUI.class.getResource(largeLogo)));
		frame.setBounds(100, 100, 298, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 282, 231);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(10, 11, 262, 70);
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
		lblLogin.setBounds(70, 0, 192, 50);
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
		textField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				login();
			}
		});

		passwordField = new JPasswordField();
		passwordField.setBounds(101, 134, 135, 20);
		passwordField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				login();
			}
		});
		panel.add(passwordField);

		JButton btnNewButton = new JButton("New User");
		btnNewButton.setBackground(new Color(255, 215, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 165, 120, 48);
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				JFrame newUserFrame = new JFrame();
				newUserFrame.getContentPane().add(new NewUserPanel(newUserFrame, largeLogo));
				newUserFrame.pack();
				newUserFrame.setVisible(true);
			}

		});
		panel.add(btnNewButton);

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBackground(new Color(255, 215, 0));
		btnLogin.setBounds(148, 165, 120, 48);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				login();
			}

		});
		panel.add(btnLogin);
	}

	private void login() {

		if (verifyLoginInfo()) {
			ObjectInputStream oIS;
			try {
				oIS = new ObjectInputStream(new FileInputStream(userAccountsLoction + "\\" + textField.getText() + ".bin"));
				User user = (User) oIS.readObject();
				new Calendar_GUI(user.getCalendar());
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			frame.dispose();
		} else {
			JOptionPane.showMessageDialog(frame, "Invalid username and/or password.", "Login Error",
					JOptionPane.WARNING_MESSAGE);
			//new Calendar_GUI(new PersonalCalendar());
			
		}
	}

	private boolean verifyLoginInfo() {
		File folder = null;

		folder = new File(userAccountsLoction);

		if (!folder.exists()) {
                    System.out.println("g");
			return false;
		} else {
			File[] accounts = folder.listFiles();
			for (File account : accounts) {
				if (account.getName().equals(this.textField.getText() + ".ua")) {
					File userAccount = new File(userAccountsLoction + "\\" + this.textField.getText() + ".ua");
					try {
						Scanner scanner = new Scanner(userAccount);
						String nextLine = "";
						while (scanner.hasNext()) {
							nextLine = scanner.nextLine();
							if (nextLine.contains("Password:")) {
								if (nextLine.substring(9, nextLine.length())
										.equals(new String(this.passwordField.getPassword()))) {
									return true;
								} else {
									return false;
								}
							}
						}
						return false;
					} catch (FileNotFoundException ex) {
						return false;
					}
				}
			}
			return false;
		}
	}



}

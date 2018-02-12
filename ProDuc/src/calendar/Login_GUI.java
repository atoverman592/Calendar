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
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Login_GUI {
    private JFrame frame;
    private static ArrayList<User> users = new ArrayList<User>();
    private String smallLogo = "bin/icons/ProDuc Logo v1 70x70.png";
    private String largeLogo = "bin/icons/ProDuc Logo v1.png";
    private String userAccountsLoction = "bin\\userAccounts";
    private JTextField textField;
    private JPasswordField passwordField;

    public Login_GUI(ArrayList<User> users) {
            initialize(users);
    }
        
    private void initialize(ArrayList<User> users) {
        frame = new JFrame();
        frame.setTitle("ProDuc");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(largeLogo));
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
        label.setIcon(new ImageIcon(smallLogo));
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
        btnNewButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFrame newUserFrame = new JFrame();
                newUserFrame.add(new NewUserPanel(newUserFrame, largeLogo));
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
                    if(verifyLoginInfo()){
                        users.add(new User(textField.getText(), new String(passwordField.getPassword())));
                        new Calendar_GUI(users.get(0).getCalendar());
                        frame.dispose();
                    }
                    else{

                    }
                }

        });
        panel.add(btnLogin);
    }
    private boolean verifyLoginInfo(){
        File folder = new File(userAccountsLoction);
        if(!folder.exists()){
            return false;
        }
        else{
            File[] accounts = folder.listFiles();
            for(File account: accounts){
                if(account.getName().equals(this.textField.getText()+".ua")){
                    File userAccount = new File(userAccountsLoction+"\\"+this.textField.getText()+".ua");
                    try {
                        Scanner scanner = new Scanner(userAccount);
                        String nextLine = "";
                        while(scanner.hasNext()){
                            nextLine = scanner.nextLine();
                            if(nextLine.contains("Password:")){
                                if(nextLine.substring(9, nextLine.length())
                                        .equals(new String(this.passwordField.getPassword()))){
                                    return true;
                                }
                                else{
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
}

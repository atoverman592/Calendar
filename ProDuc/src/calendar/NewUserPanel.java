package calendar;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class NewUserPanel extends javax.swing.JPanel {
    JFrame frame;
    
    public NewUserPanel(JFrame frame, String largeLogo) {
        this.frame = frame;
        frame.setTitle("ProDuc");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(NewUserPanel.class.getResource("/calendar/ProDuc Logo v1.png")));
        initComponents();
        //this.showPasswordLabel.setIcon(new ImageIcon("bin/icons/showPassword.png"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        emailPanel = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        usernamePanel = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();
        acceptButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(135, 206, 250));

        emailPanel.setBackground(new java.awt.Color(135, 206, 250));

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emailLabel.setText("Email:");

        emailTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailTextField.setPreferredSize(new java.awt.Dimension(200, 24));

        javax.swing.GroupLayout emailPanelLayout = new javax.swing.GroupLayout(emailPanel);
        emailPanel.setLayout(emailPanelLayout);
        emailPanelLayout.setHorizontalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailLabel)
                .addGap(53, 53, 53)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        emailPanelLayout.setVerticalGroup(
            emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(emailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel)))
        );

        usernamePanel.setBackground(new java.awt.Color(135, 206, 250));

        userNameLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userNameLabel.setText("Username:");

        usernameTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameTextField.setPreferredSize(new java.awt.Dimension(200, 24));

        javax.swing.GroupLayout usernamePanelLayout = new javax.swing.GroupLayout(usernamePanel);
        usernamePanel.setLayout(usernamePanelLayout);
        usernamePanelLayout.setHorizontalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userNameLabel)
                .addGap(18, 18, 18)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        usernamePanelLayout.setVerticalGroup(
            usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernamePanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel)))
        );

        passwordPanel.setBackground(new java.awt.Color(135, 206, 250));

        passwordLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLabel.setText("Password:");

        passwordTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordTextField.setPreferredSize(new java.awt.Dimension(200, 24));

        jButton1.setBackground(new java.awt.Color(250, 215, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Show");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordLabel)
                .addGap(24, 24, 24)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(passwordLabel))
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        buttonPanel.setBackground(new java.awt.Color(135, 206, 250));

        acceptButton.setBackground(new java.awt.Color(255, 215, 0));
        acceptButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        acceptButton.setForeground(new java.awt.Color(0, 0, 0));
        acceptButton.setText("Accept");
        acceptButton.setPreferredSize(new java.awt.Dimension(120, 48));
        acceptButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptButtonMouseClicked(evt);
            }
        });
        buttonPanel.add(acceptButton);

        cancelButton.setBackground(new java.awt.Color(250, 215, 0));
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 0, 0));
        cancelButton.setText("Cancel");
        cancelButton.setPreferredSize(new java.awt.Dimension(120, 48));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        buttonPanel.add(cancelButton);

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create your ProDuc Account");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernamePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(emailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void acceptButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        if(verifyInput()){
            if(!userExists(this.usernameTextField.getText())){
                createAccount();
                frame.dispose();
            }
            else{
                
            }
        }
    }                                         

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {                                          
        frame.dispose();
    }                                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {                                      
        this.passwordTextField.setEchoChar((char)0);
    }                                     

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {                                       
        this.passwordTextField.setEchoChar('\u2022');
    }                                      
    
    private boolean createAccount(){
        File folder = new File("src/userAccounts");
        
        if(!folder.exists()){
            folder.mkdir();
        }

        try {
        	User user = new User(this.usernameTextField.getText(), new String(this.passwordTextField.getPassword()));
			ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream(folder+"\\" + this.usernameTextField.getText()+ ".bin"));
			
			oOS.writeObject(user);
			oOS.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        File file = new File(folder+"\\"+this.usernameTextField.getText()+".ua");
        try {
        	String hash = HashPassword(passwordTextField.getText());
        	
            FileWriter writer = new FileWriter(file);
            writer.write(
                "Email:"+this.emailTextField.getText()+"\n"+
                "Username:"+this.usernameTextField.getText()+"\n"+
                "Password:"+hash
            );
            writer.close();
            return true;
        } catch (IOException ex) {
            return false;
            //showError();
        }
    }
    
    private boolean verifyInput(){
        if(!verifyEmail(this.emailTextField.getText())){
            this.emailPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        }
        else{
            this.emailPanel.setBorder(null);
        }
        if(!userNameIsValid()){
            this.usernamePanel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        }
        else{
            this.usernamePanel.setBorder(null);
        }
        
        frame.pack();
        frame.repaint();
        
        return verifyEmail(this.emailTextField.getText());
    }
    
    private boolean userNameIsValid(){
        return !(this.usernameTextField.getText().length() == 0);
    }
    
    private boolean userExists(String userName){
        File folder = new File("src/userAccounts");
        if(folder.exists()){
            File[] files = folder.listFiles();
            for(File file : files){
                if(file.getName().equals(userName+".ua")){
                    return true;
                }
            }
            return false;
        }
        else{ 
            return false;
        }
    }
    
    private boolean verifyEmail(String email){
        boolean result = true;
        try {
           InternetAddress emailAddress = new InternetAddress(email);
           emailAddress.validate();
        } catch (AddressException ex) {
           result = false;
        }
        return result;
    }

    
    private String HashPassword(String password) {
		String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(password.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return generatedPassword;
	}
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton acceptButton;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel emailPanel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JPanel usernamePanel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration                   
}
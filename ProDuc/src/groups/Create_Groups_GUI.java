package groups;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;

public class Create_Groups_GUI {

	private JFrame createGroups;
	private JTextField descriptionField;

	public Create_Groups_GUI() {
		initialize();
		try {
			this.createGroups.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initialize() {
		createGroups = new JFrame();
		createGroups.getContentPane().setBackground(new Color(135, 206, 250));
		createGroups.setBounds(100, 100, 450, 300);
		createGroups.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createGroups.setResizable(false);
		createGroups.setForeground(new Color(135, 206, 250));
		createGroups.setFont(new Font("Tahoma", Font.PLAIN, 12));
		createGroups.setTitle("ProDuc");
		createGroups.setIconImage(Toolkit.getDefaultToolkit().getImage("/calendar/ProDuc Logo v1.png"));
		createGroups.setBackground(new Color(255, 215, 0));
		createGroups.setBounds(0, 0, 1500, 900);
		createGroups.setLocationRelativeTo(null);
		createGroups.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGroups.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(Create_Groups_GUI.class.getResource("/calendar/ProDuc Logo v1 70x70.png")));
		label.setBounds(28, 42, 68, 70);
		createGroups.getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(66, 47, 817, 60);
		createGroups.getContentPane().add(panel);
		
		JLabel lblCreateAGroup = new JLabel("Create A Group");
		lblCreateAGroup.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateAGroup.setForeground(Color.WHITE);
		lblCreateAGroup.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCreateAGroup.setBounds(30, 0, 194, 60);
		panel.add(lblCreateAGroup);
		
		JLabel label_2 = new JLabel("ProDuc Planner");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_2.setBounds(623, 0, 194, 60);
		panel.add(label_2);
		
		JLabel nameLabel = new JLabel("Group Name:");
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nameLabel.setBounds(204, 231, 135, 34);
		createGroups.getContentPane().add(nameLabel);
		
		descriptionField = new JTextField();
		descriptionField.setBounds(386, 228, 393, 44);
		createGroups.getContentPane().add(descriptionField);
		descriptionField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Group Description:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(162, 324, 149, 34);
		createGroups.getContentPane().add(lblNewLabel_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(386, 311, 393, 302);
		createGroups.getContentPane().add(textPane);
		
		Font font = new Font("Tahoma", Font.PLAIN, 18);
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(954, 109, 495, 710);
		createGroups.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Members");
		lblNewLabel.setBounds(193, 7, 108, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Add Selected");
		btnNewButton_1.setBackground(new Color(255, 215, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(179, 635, 155, 62);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(35, 83, 193, 44);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Member Name");
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxNewCheckBox.setBackground(new Color(70, 130, 180));
		chckbxNewCheckBox.setBounds(8, 9, 177, 25);
		panel_2.add(chckbxNewCheckBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(70, 130, 180));
		panel_3.setBounds(266, 83, 193, 44);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JCheckBox checkBox = new JCheckBox("Member Name");
		checkBox.setBackground(new Color(70, 130, 180));
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox.setForeground(new Color(255, 255, 255));
		checkBox.setBounds(8, 9, 177, 25);
		panel_3.add(checkBox);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameLabel.setText("");
				descriptionField.setText("");
				createGroups.dispose(); 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(255, 215, 0));
		btnNewButton.setBounds(214, 749, 169, 70);
		createGroups.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createGroups.dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancel.setBackground(new Color(255, 215, 0));
		btnCancel.setBounds(610, 749, 169, 70);
		createGroups.getContentPane().add(btnCancel);
	}
}

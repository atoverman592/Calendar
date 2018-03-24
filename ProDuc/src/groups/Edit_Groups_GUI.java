package groups;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class Edit_Groups_GUI {

	private JFrame editGroups;
	private JTextField textField;

	public Edit_Groups_GUI() {
		initialize();
		try {
			this.editGroups.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initialize() {
		editGroups = new JFrame();
		editGroups.getContentPane().setBackground(new Color(135, 206, 250));
		editGroups.setBounds(100, 100, 450, 300);
		editGroups.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		editGroups.setResizable(false);
		editGroups.setForeground(new Color(135, 206, 250));
		editGroups.setFont(new Font("Tahoma", Font.PLAIN, 12));
		editGroups.setTitle("ProDuc");
		editGroups.setIconImage(Toolkit.getDefaultToolkit().getImage("/calendar/ProDuc Logo v1.png"));
		editGroups.setBackground(new Color(255, 215, 0));
		editGroups.setBounds(0, 0, 1500, 900);
		editGroups.setLocationRelativeTo(null);
		editGroups.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		editGroups.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(Edit_Groups_GUI.class.getResource("/calendar/ProDuc Logo v1 70x70.png")));
		label.setBounds(42, 44, 68, 70);
		editGroups.getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(80, 49, 817, 60);
		editGroups.getContentPane().add(panel);
		
		JLabel lblEditThisGroup = new JLabel("Edit This Group");
		lblEditThisGroup.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditThisGroup.setForeground(Color.WHITE);
		lblEditThisGroup.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblEditThisGroup.setBounds(30, 0, 194, 60);
		panel.add(lblEditThisGroup);
		
		JLabel label_2 = new JLabel("ProDuc Planner");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_2.setBounds(623, 0, 194, 60);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(400, 230, 393, 44);
		editGroups.getContentPane().add(textField);
		
		JLabel lblEditGroupName = new JLabel("Edit Group Name:");
		lblEditGroupName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEditGroupName.setBounds(204, 233, 149, 34);
		editGroups.getContentPane().add(lblEditGroupName);
		
		JLabel lblEditGroupDescription = new JLabel("Edit Group Description:");
		lblEditGroupDescription.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEditGroupDescription.setBounds(163, 327, 190, 34);
		editGroups.getContentPane().add(lblEditGroupDescription);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(400, 313, 393, 302);
		editGroups.getContentPane().add(textPane);
		
		JButton btnSaveChanges = new JButton("Save Changes");
		btnSaveChanges.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSaveChanges.setBackground(new Color(255, 215, 0));
		btnSaveChanges.setBounds(228, 751, 169, 70);
		editGroups.getContentPane().add(btnSaveChanges);
		
		JButton button_1 = new JButton("Cancel");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBackground(new Color(255, 215, 0));
		button_1.setBounds(624, 751, 169, 70);
		editGroups.getContentPane().add(button_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(968, 111, 495, 710);
		editGroups.getContentPane().add(panel_1);
		
		JLabel lblAddOrRemove = new JLabel("Add or Remove Members");
		lblAddOrRemove.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAddOrRemove.setBounds(146, 7, 205, 22);
		panel_1.add(lblAddOrRemove);
		
		JButton btnAddremove = new JButton("Add/Remove");
		btnAddremove.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAddremove.setBackground(new Color(255, 215, 0));
		btnAddremove.setBounds(179, 635, 155, 62);
		panel_1.add(btnAddremove);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(35, 83, 193, 44);
		panel_1.add(panel_2);
		
		JCheckBox checkBox = new JCheckBox("Member Name");
		checkBox.setForeground(Color.WHITE);
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox.setBackground(new Color(70, 130, 180));
		checkBox.setBounds(8, 9, 177, 25);
		panel_2.add(checkBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(70, 130, 180));
		panel_3.setBounds(266, 83, 193, 44);
		panel_1.add(panel_3);
		
		JCheckBox checkBox_1 = new JCheckBox("Member Name");
		checkBox_1.setForeground(Color.WHITE);
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		checkBox_1.setBackground(new Color(70, 130, 180));
		checkBox_1.setBounds(8, 9, 177, 25);
		panel_3.add(checkBox_1);
	}
}

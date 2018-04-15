package groups;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Groups_GUI {

	private JFrame addGroups;
	
	public Groups_GUI() {
		initialize();
//		try {
//			this.addGroups.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	public JFrame initialize() {
		addGroups = new JFrame();
		addGroups.getContentPane().setBackground(new Color(135, 206, 250));
		addGroups.setBounds(100, 100, 450, 300);
		addGroups.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		addGroups.setResizable(false);
		addGroups.setForeground(new Color(135, 206, 250));
		addGroups.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addGroups.setTitle("ProDuc");
		addGroups.setIconImage(Toolkit.getDefaultToolkit().getImage("/calendar/ProDuc Logo v1.png"));
		addGroups.setBackground(new Color(255, 215, 0));
		addGroups.setBounds(0, 0, 1500, 900);
		addGroups.setLocationRelativeTo(null);
		addGroups.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Groups_GUI.class.getResource("/calendar/ProDuc Logo v1 70x70.png")));
		lblNewLabel.setBounds(12, 43, 68, 70);
		addGroups.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(50, 48, 817, 60);
		addGroups.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("My Groups");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(30, 0, 155, 60);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		JLabel lblProducPlanner = new JLabel("ProDuc Planner");
		lblProducPlanner.setHorizontalAlignment(SwingConstants.CENTER);
		lblProducPlanner.setForeground(Color.WHITE);
		lblProducPlanner.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblProducPlanner.setBounds(623, 0, 194, 60);
		panel.add(lblProducPlanner);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(70, 130, 180));
		panel_1.setBounds(50, 191, 817, 160);
		addGroups.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("CSC 490");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(12, 13, 136, 35);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblMembers = new JLabel("# Members");
		lblMembers.setForeground(Color.WHITE);
		lblMembers.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMembers.setBounds(12, 110, 136, 35);
		panel_1.add(lblMembers);
		
		JButton btnNewButton = new JButton("Edit Group");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Edit_Groups_GUI(); 
			}
		});
		btnNewButton.setBackground(new Color(255, 215, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(658, 15, 147, 35);
		panel_1.add(btnNewButton);
		
		JButton btnLeaveGroup = new JButton("Leave Group");
		btnLeaveGroup.setBackground(new Color(255, 215, 0));
		btnLeaveGroup.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLeaveGroup.setBounds(658, 64, 147, 35);
		panel_1.add(btnLeaveGroup);
		
		JButton btnDeleteGroup = new JButton("Delete Group");
		btnDeleteGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(addGroups, "Are you sure you want to delete this group?", "Confirm Deleting Group",
						JOptionPane.OK_CANCEL_OPTION);
			}
		});
		btnDeleteGroup.setBackground(new Color(255, 215, 0));
		btnDeleteGroup.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDeleteGroup.setBounds(658, 112, 147, 35);
		panel_1.add(btnDeleteGroup);
		
		btnLeaveGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirm = JOptionPane.showConfirmDialog(addGroups, "Are you sure you want to leave this group?", "Confirm Leaving Group",
						JOptionPane.OK_CANCEL_OPTION);
				if (confirm == JOptionPane.YES_OPTION) {
					addGroups.remove(panel_1);
					addGroups.remove(lblNewLabel_2);
					addGroups.remove(btnNewButton);
					addGroups.remove(btnLeaveGroup);
					addGroups.remove(btnDeleteGroup);
					addGroups.repaint();
				}
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(50, 388, 817, 160);
		addGroups.getContentPane().add(panel_2);
		
		JLabel label = new JLabel("testGroup");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(12, 13, 136, 35);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("# Members");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(12, 110, 136, 35);
		panel_2.add(label_1);
		
		JButton button = new JButton("Edit Group");
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBackground(new Color(255, 215, 0));
		button.setBounds(658, 15, 147, 35);
		panel_2.add(button);
		
		JButton button_1 = new JButton("Leave Group");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_1.setBackground(new Color(255, 215, 0));
		button_1.setBounds(658, 64, 147, 35);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("Delete Group");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_2.setBackground(new Color(255, 215, 0));
		button_2.setBounds(658, 112, 147, 35);
		panel_2.add(button_2);
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int confirm = JOptionPane.showConfirmDialog(addGroups, "Are you sure you want to delete this group?","Confirm Deleting Group",
						JOptionPane.OK_CANCEL_OPTION);
				if (confirm == JOptionPane.YES_OPTION) {
					addGroups.remove(panel_2);
					addGroups.remove(label);
					addGroups.remove(button);
					addGroups.remove(button_1);
					addGroups.remove(button_2);
					addGroups.repaint();
				}
			}
		});
		
		Font font = new Font("Tahoma", Font.PLAIN, 15); 
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Group Actions", TitledBorder.CENTER, TitledBorder.TOP, font, new Color(0, 0, 0)));
		panel_3.setBounds(992, 126, 411, 659);
		panel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		addGroups.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnCreateANewGroup = new JButton("Create a New Group");
		btnCreateANewGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Create_Groups_GUI(); 
			}
		});
		btnCreateANewGroup.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCreateANewGroup.setBackground(new Color(255, 215, 0));
		btnCreateANewGroup.setBounds(68, 86, 286, 98);
		panel_3.add(btnCreateANewGroup);
		
		JButton btnEnableSmartScheduling = new JButton("Smart Scheduling");
		btnEnableSmartScheduling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
                                frame.setTitle("Smart Scheduling");
                                frame.add(new Smart_Scheduling_Panel(frame));
                                frame.pack();
                                frame.setVisible(true);
                                frame.setLocationRelativeTo(null);
			}
		});
		btnEnableSmartScheduling.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEnableSmartScheduling.setBackground(new Color(255, 215, 0));
		btnEnableSmartScheduling.setBounds(68, 287, 286, 98);
		panel_3.add(btnEnableSmartScheduling);
		
		JButton btnReturnToCalendar = new JButton("Return to Calendar");
		btnReturnToCalendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addGroups.dispatchEvent(new WindowEvent(addGroups, WindowEvent.WINDOW_CLOSING));
			}
		});
		btnReturnToCalendar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReturnToCalendar.setBackground(new Color(255, 215, 0));
		btnReturnToCalendar.setBounds(68, 496, 286, 98);
		panel_3.add(btnReturnToCalendar);
		
		return addGroups;
	}
}

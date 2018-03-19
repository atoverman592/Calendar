package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.util.Date;
import javax.swing.JButton;

public class Add_Semester_GUI {
	
	private String smallLogo = "/icons/ProDuc Logo v1 70x70.png";
	private String largeLogo = "/icons/ProDuc Logo v1.png";

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Add_Semester_GUI window = new Add_Semester_GUI();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Add_Semester_GUI() {
		initialize();
		try {
			this.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Add_Semester_GUI.class.getResource("/calendar/ProDuc Logo v1.png")));
		frame.setBounds(100, 100, 300, 365);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.addFocusListener(new FocusListener() {
			private boolean gained = false;
			@Override
			public void focusGained(FocusEvent arg0) {
				gained = true;
			}
			@Override
			public void focusLost(FocusEvent arg0) {
				if (gained) {
					frame.dispose();
				}
			}
		});
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(0, 0, 294, 335);
		panel.setBackground(new Color(135, 206, 250));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(10, 11, 274, 70);
		panel.add(panel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Add_Semester_GUI.class.getResource("/calendar/ProDuc Logo v1 70x70.png")));
		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 70, 70);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(0, 11, 274, 50);
		panel_1.add(panel_2);
		
		JLabel lblAddSemester = new JLabel("Add Semester");
		lblAddSemester.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddSemester.setForeground(Color.WHITE);
		lblAddSemester.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAddSemester.setBounds(24, 0, 250, 50);
		panel_2.add(lblAddSemester);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		panel_3.setBounds(10, 92, 274, 236);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(90, 11, 174, 25);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2018"}));
		comboBox.setMaximumRowCount(100);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_3.add(comboBox);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblYear.setBounds(10, 11, 70, 25);
		panel_3.add(lblYear);
		
		JLabel lblSeason = new JLabel("Season");
		lblSeason.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeason.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSeason.setBounds(10, 47, 70, 25);
		panel_3.add(lblSeason);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Spring", "Summer", "Fall", "Winter"}));
		comboBox_1.setMaximumRowCount(100);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_1.setBounds(90, 47, 174, 25);
		panel_3.add(comboBox_1);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblStartDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStartDate.setBounds(10, 83, 70, 25);
		panel_3.add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEndDate.setBounds(10, 119, 70, 25);
		panel_3.add(lblEndDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDate(new Date());
		dateChooser.setBounds(90, 83, 174, 25);
		panel_3.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setDate(new Date());
		dateChooser_1.setBounds(90, 119, 174, 25);
		panel_3.add(dateChooser_1);
		
		JButton button = new JButton("Cancel");
		button.setBackground(new Color(255, 215, 0));
		button.setBounds(20, 169, 100, 50);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.dispose();
			}
			
		});
		panel_3.add(button);
		
		JButton button_1 = new JButton("Done");
		button_1.setBackground(new Color(255, 215, 0));
		button_1.setBounds(150, 169, 100, 50);
		button_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Hello World!");
				frame.dispose();
			}
			
		});
		panel_3.add(button_1);
	}
}

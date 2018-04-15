package personal;

import java.awt.Color;
import java.awt.Event;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;

import calendar.*;

import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerListModel;

public class Add_Personal_Event_GUI {

	private JFrame personalEvent;
	private JTextField eventTitle;
	PersonalCalendar personalCalendar;

	public Add_Personal_Event_GUI() {
		initialize();
		try {
			this.personalEvent.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initialize() {
		personalEvent = new JFrame();
		personalEvent.getContentPane().setBackground(new Color(135, 206, 250));
		personalEvent.setBounds(100, 100, 300, 524);
		personalEvent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		personalEvent.setResizable(false);
		personalEvent.setForeground(new Color(135, 206, 250));
		personalEvent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		personalEvent.setTitle("ProDuc");
		personalEvent.setIconImage(Toolkit.getDefaultToolkit().getImage("/calendar/ProDuc Logo v1.png"));
		personalEvent.setBackground(new Color(255, 215, 0));
		personalEvent.setLocationRelativeTo(null);
		personalEvent.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Add_Personal_Event_GUI.class.getResource("/calendar/ProDuc Logo v1 70x70.png")));
		lblNewLabel.setBounds(12, 19, 70, 70);
		personalEvent.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(71, 28, 211, 49);
		personalEvent.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAddEvent = new JLabel("Add Event");
		lblAddEvent.setBounds(50, 0, 112, 49);
		lblAddEvent.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAddEvent.setForeground(new Color(255, 255, 255));
		panel.add(lblAddEvent);
		
		JLabel lblEventTitle = new JLabel("Event Title:");
		lblEventTitle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEventTitle.setBounds(22, 112, 89, 16);
		personalEvent.getContentPane().add(lblEventTitle);
		
		eventTitle = new JTextField();
		eventTitle.setBounds(108, 110, 174, 22);
		personalEvent.getContentPane().add(eventTitle);
		eventTitle.setColumns(10);
		
		JLabel label = new JLabel("What Time");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(22, 161, 80, 20);
		personalEvent.getContentPane().add(label);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerListModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner.setBounds(102, 161, 50, 25);
		personalEvent.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner_1.setBounds(152, 161, 50, 25);
		personalEvent.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerListModel(new String[] {"AM", "PM"}));
		spinner_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner_2.setBounds(202, 161, 50, 25);
		personalEvent.getContentPane().add(spinner_2);
		
		JLabel label_1 = new JLabel("until");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(102, 186, 150, 25);
		personalEvent.getContentPane().add(label_1);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setModel(new SpinnerListModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		spinner_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner_3.setBounds(102, 211, 50, 25);
		personalEvent.getContentPane().add(spinner_3);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		spinner_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner_4.setBounds(152, 211, 50, 25);
		personalEvent.getContentPane().add(spinner_4);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setModel(new SpinnerListModel(new String[] {"AM", "PM"}));
		spinner_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spinner_5.setBounds(202, 211, 50, 25);
		personalEvent.getContentPane().add(spinner_5);
		
		JLabel lblEventDescription = new JLabel("<html> Event<br> Description:");
		lblEventDescription.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEventDescription.setBounds(22, 249, 89, 43);
		personalEvent.getContentPane().add(lblEventDescription);
		
		JTextPane description = new JTextPane();
		description.setBounds(108, 264, 174, 132);
		personalEvent.getContentPane().add(description);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				personalEvent.dispose(); 
			}
		});
		button.setBackground(new Color(255, 215, 0));
		button.setBounds(36, 426, 100, 50);
		personalEvent.getContentPane().add(button);
		
		JButton button_1 = new JButton("Done");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        Calendar c = Calendar.getInstance();
//		        c.setTime((Date) spinner.getValue(), spinner_1.getValue());
		        String month = String.valueOf(c.get(Calendar.MONTH)+1);
		        String dayOfMonth = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
		        String year = String.valueOf(c.get(Calendar.YEAR));
		        
		        personalCalendar.getYearList().get(c.get(Calendar.YEAR)-2018)
		                .getMothList().get(c.get(Calendar.MONTH))
		                .getDayList().get(c.get(Calendar.DAY_OF_MONTH)-1)
		                .getEventList().add(new calendar.Event("Personal Event", description.getText()));
		        personalEvent.dispose();
			}
		});
		button_1.setBackground(new Color(255, 215, 0));
		button_1.setBounds(166, 426, 100, 50);
		personalEvent.getContentPane().add(button_1);
	}
}

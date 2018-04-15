package student;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import calendar.*;

import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JTextField;

public class Add_Class_GUI {

	private JFrame frmProducAddClass;
	private JTextField txtTitle;
	private JTextField txtTeacher;
	private User user;
	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// Add_Class_GUI window = new Add_Class_GUI();
	// window.frmProducAddClass.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the application.
	 */
	public Add_Class_GUI(User users) {
		user = users;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public JFrame initialize() {
		frmProducAddClass = new JFrame();
		frmProducAddClass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmProducAddClass.setIconImage(
				Toolkit.getDefaultToolkit().getImage(Add_Class_GUI.class.getResource("/calendar/ProDuc Logo v1.png")));
		frmProducAddClass.setForeground(new Color(135, 206, 250));
		frmProducAddClass.getContentPane().setBackground(new Color(135, 206, 250));
		frmProducAddClass.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(10, 11, 274, 70);
		frmProducAddClass.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Add_Class_GUI.class.getResource("/calendar/ProDuc Logo v1 70x70.png")));
		label.setBounds(0, 0, 70, 70);
		panel.add(label);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(70, 130, 180));
		panel_1.setBounds(0, 11, 274, 50);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblAddClass = new JLabel("Add Course");
		lblAddClass.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddClass.setForeground(new Color(255, 255, 255));
		lblAddClass.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAddClass.setBounds(0, 0, 274, 50);
		panel_1.add(lblAddClass);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(10, 92, 274, 400);
		frmProducAddClass.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSemester.setBounds(10, 10, 70, 20);
		panel_2.add(lblSemester);

		JComboBox semBox = new JComboBox();
		lblSemester.setLabelFor(semBox);
		semBox.setBackground(new Color(255, 255, 255));
		semBox.setForeground(new Color(0, 0, 0));
		semBox.setModel(new DefaultComboBoxModel(new String[] { "Spring 2018", "Fall 2018" }));
		semBox.setSelectedIndex(0);
		semBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		semBox.setBounds(80, 10, 184, 25);
		panel_2.add(semBox);

		JLabel lblLocation = new JLabel("Title");
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLocation.setBounds(10, 50, 70, 20);
		panel_2.add(lblLocation);

		txtTitle = new JTextField();
		lblLocation.setLabelFor(txtTitle);
		txtTitle.setToolTipText("Building and Room Number");
		txtTitle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTitle.setBounds(80, 50, 184, 25);
		panel_2.add(txtTitle);
		txtTitle.setColumns(10);

		JLabel lblTeacher = new JLabel("Teacher");
		lblTeacher.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTeacher.setBounds(10, 90, 70, 20);
		panel_2.add(lblTeacher);

		txtTeacher = new JTextField();
		lblTeacher.setLabelFor(txtTeacher);
		txtTeacher.setToolTipText("Teacher Name");
		txtTeacher.setHorizontalAlignment(SwingConstants.LEFT);
		txtTeacher.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTeacher.setColumns(10);
		txtTeacher.setBounds(80, 90, 184, 25);
		panel_2.add(txtTeacher);

		JLabel lblWhatTime = new JLabel("What Time");
		lblWhatTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWhatTime.setBounds(0, 245, 80, 20);
		panel_2.add(lblWhatTime);

		JSpinner startHour = new JSpinner();
		startHour.setModel(
				new SpinnerListModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		startHour.setFont(new Font("Tahoma", Font.PLAIN, 12));
		startHour.setBounds(80, 245, 50, 25);
		panel_2.add(startHour);

		JSpinner startMin = new JSpinner();
		startMin.setModel(new SpinnerListModel(
				new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
						"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
						"31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46",
						"47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
		startMin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		startMin.setBounds(130, 245, 50, 25);
		panel_2.add(startMin);

		JSpinner startPeriod = new JSpinner();
		startPeriod.setModel(new SpinnerListModel(new String[] { "AM", "PM" }));
		startPeriod.setFont(new Font("Tahoma", Font.PLAIN, 12));
		startPeriod.setBounds(180, 245, 50, 25);
		panel_2.add(startPeriod);

		JLabel lblUntil = new JLabel("until");
		lblUntil.setHorizontalAlignment(SwingConstants.CENTER);
		lblUntil.setBounds(80, 270, 150, 25);
		panel_2.add(lblUntil);

		JSpinner finishHour = new JSpinner();
		finishHour.setModel(new SpinnerListModel(new String[] { "AM", "PM" }));
		finishHour.setFont(new Font("Tahoma", Font.PLAIN, 12));
		finishHour.setBounds(180, 295, 50, 25);
		panel_2.add(finishHour);

		JSpinner finishMinute = new JSpinner();
		finishMinute.setModel(new SpinnerListModel(
				new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
						"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
						"31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46",
						"47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
		finishMinute.setFont(new Font("Tahoma", Font.PLAIN, 12));
		finishMinute.setBounds(130, 295, 50, 25);
		panel_2.add(finishMinute);

		JSpinner finishPeriod = new JSpinner();
		finishPeriod.setModel(
				new SpinnerListModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		finishPeriod.setFont(new Font("Tahoma", Font.PLAIN, 12));
		finishPeriod.setBounds(80, 295, 50, 25);
		panel_2.add(finishPeriod);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(135, 206, 250));
		panel_3.setBounds(0, 118, 274, 121);
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblDaysOf = new JLabel("Day(s) of");
		lblDaysOf.setBounds(0, 0, 70, 20);
		panel_3.add(lblDaysOf);
		lblDaysOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblDaysOf.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblWeek = new JLabel("Week");
		lblWeek.setBounds(0, 20, 70, 20);
		panel_3.add(lblWeek);
		lblWeek.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWeek.setHorizontalAlignment(SwingConstants.CENTER);

		JCheckBox chckbxSunday = new JCheckBox("Sunday");
		chckbxSunday.setBounds(80, 10, 97, 15);
		panel_3.add(chckbxSunday);
		chckbxSunday.setBackground(new Color(135, 206, 250));
		chckbxSunday.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxSunday.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JCheckBox chckbxMonday = new JCheckBox("Monday");
		chckbxMonday.setBounds(80, 25, 97, 15);
		panel_3.add(chckbxMonday);
		chckbxMonday.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxMonday.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxMonday.setBackground(new Color(135, 206, 250));

		JCheckBox chckbxTuesday = new JCheckBox("Tuesday");
		chckbxTuesday.setBounds(80, 40, 97, 15);
		panel_3.add(chckbxTuesday);
		chckbxTuesday.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxTuesday.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxTuesday.setBackground(new Color(135, 206, 250));
		lblDaysOf.setLabelFor(chckbxTuesday);

		JCheckBox chckbxWednesday = new JCheckBox("Wednesday");
		chckbxWednesday.setBounds(80, 55, 97, 15);
		panel_3.add(chckbxWednesday);
		chckbxWednesday.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxWednesday.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxWednesday.setBackground(new Color(135, 206, 250));

		JCheckBox chckbxThursday = new JCheckBox("Thursday");
		chckbxThursday.setBounds(80, 70, 97, 15);
		panel_3.add(chckbxThursday);
		chckbxThursday.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxThursday.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxThursday.setBackground(new Color(135, 206, 250));

		JCheckBox chckbxFriday = new JCheckBox("Friday");
		chckbxFriday.setBounds(80, 85, 97, 15);
		panel_3.add(chckbxFriday);
		chckbxFriday.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxFriday.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxFriday.setBackground(new Color(135, 206, 250));

		JCheckBox chckbxSaturday = new JCheckBox("Saturday");
		chckbxSaturday.setBounds(80, 100, 97, 15);
		panel_3.add(chckbxSaturday);
		chckbxSaturday.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxSaturday.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxSaturday.setBackground(new Color(135, 206, 250));

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(20, 340, 100, 50);
		panel_2.add(btnCancel);
		btnCancel.setBackground(new Color(255, 215, 0));

		JButton btnDone = new JButton("Done");
		btnDone.setBounds(150, 340, 100, 50);
		panel_2.add(btnDone);
		btnDone.setBackground(new Color(255, 215, 0));

		frmProducAddClass.setBackground(new Color(135, 206, 250));
		frmProducAddClass.setTitle("ProDuc - Add Course");
		frmProducAddClass.setResizable(false);
		frmProducAddClass.setBounds(100, 100, 300, 524);
		frmProducAddClass.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmProducAddClass.addFocusListener(new FocusListener() {
			private boolean gained = false;

			@Override
			public void focusGained(FocusEvent arg0) {
				gained = true;
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				if (gained) {
					frmProducAddClass.dispose();
				}
			}
		});

		btnDone.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				Integer startHr = new Integer((String) startHour.getValue());
				if (((String) (startPeriod.getValue())).equals("PM")) {
					startHr = startHr + 12;
				}
				Integer endHr = new Integer((String) finishPeriod.getValue());
				if (((String) (finishHour.getValue())).equals("PM")) {
					endHr = endHr + 12;
				}
				user.getCalendar().getYearList().get(0).getSemesterList().get(0).addCourse(new Course(txtTitle.getText(), txtTeacher.getText(), chckbxMonday.isSelected(),
								chckbxTuesday.isSelected(), chckbxWednesday.isSelected(), chckbxThursday.isSelected(),
								chckbxFriday.isSelected(), chckbxSaturday.isSelected(), chckbxSunday.isSelected(), startHr, new Integer((String) startMin.getValue()), endHr,
								new Integer((String) finishMinute.getValue())), user);
				frmProducAddClass.dispatchEvent(new WindowEvent(frmProducAddClass, WindowEvent.WINDOW_CLOSING));
			}

		});

		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				frmProducAddClass.dispatchEvent(new WindowEvent(frmProducAddClass, WindowEvent.WINDOW_CLOSING));
			}

		});
		return frmProducAddClass;
	}
}

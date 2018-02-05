package calendar;

import java.awt.EventQueue;

import javax.swing.JFrame;

import student.*;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.JPanel;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Calendar_GUI {

	private JFrame frmProduc;

	private String smallLogo = "/icons/ProDuc Logo v1 70x70.png";
	private String largeLogo = "/icons/ProDuc Logo v1.png";

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Calendar_GUI window = new Calendar_GUI(new PersonalCalendar());
//					window.frmProduc.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Calendar_GUI(PersonalCalendar calendar) {
		initialize(calendar);
		try {
			this.frmProduc.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize(PersonalCalendar calendar) {
		frmProduc = new JFrame();
		frmProduc.getContentPane().setBackground(new Color(135, 206, 250));
		frmProduc.getContentPane().setLayout(null);

		UIManager.put("TabbedPane.selected", new Color(191, 161, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(0, 0, 0));
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 12));
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(new Color(255, 215, 0));
		tabbedPane.setBounds(10, 10, 1105, 850);
		frmProduc.getContentPane().add(tabbedPane);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(1125, 25, 358, 70);
		frmProduc.getContentPane().add(panel_1);

		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 0, 70, 70);
		panel_1.add(label_2);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Add_Class_GUI.class.getResource(smallLogo)));
		label_1.setBounds(0, 0, 70, 70);
		panel_1.add(label_1);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(0, 0, 0));
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(70, 130, 180));
		panel_2.setBounds(0, 11, 358, 50);
		panel_1.add(panel_2);

		JLabel lblProduc = new JLabel("ProDuc Planner");
		lblProduc.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduc.setForeground(Color.WHITE);
		lblProduc.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblProduc.setBounds(0, 0, 358, 50);
		panel_2.add(lblProduc);

		JTabbedPane moduleTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		moduleTabbedPane.setBounds(1125, 106, 358, 754);
		frmProduc.getContentPane().add(moduleTabbedPane);

		JPanel personalPanel = new JPanel();
		personalPanel.setBackground(new Color(255, 215, 0));
		moduleTabbedPane.addTab("Personal", null, personalPanel, null);
		personalPanel.setLayout(null);
		moduleTabbedPane.setBackgroundAt(0, new Color(255, 215, 0));

		JPanel professionalPanel = new JPanel();
		professionalPanel.setBackground(new Color(255, 215, 0));
		moduleTabbedPane.addTab("Professional", null, professionalPanel, null);
		professionalPanel.setLayout(null);
		moduleTabbedPane.setBackgroundAt(1, new Color(255, 215, 0));
		{

		}

		JPanel studentPanel = new JPanel();
		studentPanel.setBackground(new Color(255, 215, 0));
		moduleTabbedPane.addTab("Student", null, studentPanel, null);
		studentPanel.setLayout(null);
		ArrayList<JPanel> studentYears = new ArrayList<JPanel>();
		ArrayList<JTabbedPane> semesterTabbedPane = new ArrayList<JTabbedPane>();

		{
			JTabbedPane studentTabbedPane = new JTabbedPane(JTabbedPane.TOP);
			studentTabbedPane.setBounds(10, 44, 333, 671);
			studentPanel.add(studentTabbedPane);

			JButton btnAddSemester = new JButton("Add Semester");

			btnAddSemester.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					new Add_Semester_GUI();
				}

			});

			btnAddSemester.setBackground(new Color(135, 206, 250));
			btnAddSemester.setBounds(223, 11, 120, 22);
			studentPanel.add(btnAddSemester);
			moduleTabbedPane.setBackgroundAt(2, new Color(255, 215, 0));

			for (int i = 0; i < calendar.getNumberOfYears(); i++) {
				studentYears.add(new JPanel());
				studentYears.get(i).setBackground(new Color(135, 206, 250));
				studentYears.get(i).setBorder(null);
				studentYears.get(i).setLayout(null);

				studentTabbedPane.addTab(new Integer(calendar.getYearList().get(i).getYearNum()).toString(), null,
						studentYears.get(i), null);
				studentTabbedPane.setBackgroundAt(i, new Color(135, 206, 250));
				semesterTabbedPane.add(new JTabbedPane(JTabbedPane.TOP));
				semesterTabbedPane.get(i).setBorder(null);
				semesterTabbedPane.get(i).setFont(new Font("Tahoma", Font.BOLD, 12));
				semesterTabbedPane.get(i).setForeground(Color.WHITE);
				semesterTabbedPane.get(i).setBackground(new Color(70, 130, 180));
				semesterTabbedPane.get(i).setBounds(5, 10, 1098, 850);

				studentYears.get(i).add(semesterTabbedPane.get(i));

				ArrayList<JPanel> semesterPanel = new ArrayList<JPanel>();

				for (int j = 0; j < calendar.getYearList().get(i).getSemesterList().size(); j++) {

					semesterPanel.add(new JPanel());
					semesterPanel.get(j).setBackground(new Color(70, 130, 180));
					semesterPanel.get(j).setBorder(null);
					semesterPanel.get(j).setLayout(null);
					semesterTabbedPane.get(i).addTab(calendar.getYearList().get(i).getSemesterList().get(j).getTitle(),
							null, semesterPanel.get(j), null);
				}

			}
		}
		ArrayList<JPanel> years = new ArrayList<JPanel>();
		ArrayList<JTabbedPane> monthsTab = new ArrayList<JTabbedPane>();
		ArrayList<JPanel> months = new ArrayList<JPanel>();
		ArrayList<JLabel> dayLabels = new ArrayList<JLabel>();
		// ArrayList<JButton> dayButtons = new ArrayList<JButton>();

		for (int i = 0; i < calendar.getNumberOfYears(); i++) {
			years.add(new JPanel());
			years.get(i).setBackground(new Color(255, 215, 0));
			years.get(i).setBorder(null);
			years.get(i).setLayout(null);
			tabbedPane.addTab(new Integer(calendar.getYearList().get(i).getYearNum()).toString(), null, years.get(i),
					null);

			monthsTab.add(new JTabbedPane(JTabbedPane.TOP));
			monthsTab.get(i).setBorder(null);
			monthsTab.get(i).setFont(new Font("Tahoma", Font.BOLD, 12));
			monthsTab.get(i).setBackground(new Color(135, 206, 250));
			monthsTab.get(i).setBounds(5, 10, 1098, 850);
			years.get(i).add(monthsTab.get(i));

			for (int j = 0; j < 12; j++) {
				String monthString;
				switch (j + 1) {
				case 1:
					monthString = "January";
					break;
				case 2:
					monthString = "February";
					break;
				case 3:
					monthString = "March";
					break;
				case 4:
					monthString = "April";
					break;
				case 5:
					monthString = "May";
					break;
				case 6:
					monthString = "June";
					break;
				case 7:
					monthString = "July";
					break;
				case 8:
					monthString = "August";
					break;
				case 9:
					monthString = "September";
					break;
				case 10:
					monthString = "October";
					break;
				case 11:
					monthString = "November";
					break;
				case 12:
					monthString = "December";
					break;
				default:
					monthString = "Invalid month";
					break;
				}
				JPanel tempPanel = new JPanel();
				tempPanel.setBackground(new Color(135, 206, 250));
				GridBagLayout gbl = new GridBagLayout();
				tempPanel.setLayout(gbl);
				tempPanel.setBorder(null);
				GridBagConstraints c = new GridBagConstraints();
				c.fill = GridBagConstraints.HORIZONTAL;
				c.insets = new Insets(2, 2, 0, 0); // top padding
				c.weightx = 0.5;
				c.ipady = 30;
				monthsTab.get(i).addTab(monthString, null, tempPanel, null);
				months.add(tempPanel);

				for (int k = 0; k < 7; k++) {
					String dayName;
					switch (k + 1) {
					case 1:
						dayName = "Sunday";
						break;
					case 2:
						dayName = "Monday";
						break;
					case 3:
						dayName = "Tuesday";
						break;
					case 4:
						dayName = "Wednesday";
						break;
					case 5:
						dayName = "Thursday";
						break;
					case 6:
						dayName = "Friday";
						break;
					case 7:
						dayName = "Saturday";
						break;
					default:
						dayName = "Invalid Day Name";
						break;
					}

					JLabel tempLabel = new JLabel(dayName);

					tempLabel.setHorizontalAlignment(SwingConstants.CENTER);
					tempLabel.setBounds(0, 0, 50, 25);
					c.gridx = k;
					c.gridy = 0;
					months.get((i * 12) + j).add(tempLabel, c);
					dayLabels.add(tempLabel);
				}

				boolean leap = false;
				int yearNum = calendar.getYearList().get(i).getYearNum();
				int[] numDays;

				if (yearNum % 4 == 0) {
					leap = true;
				}

				if (leap) {
					numDays = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				} else {
					numDays = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				}

				Calendar cal = Calendar.getInstance();
				cal.set(calendar.getYearList().get(i).getYearNum(), j, 1);
				// System.out.println(cal.get(Calendar.DAY_OF_WEEK));

				for (int m = 0; m < numDays[j]; m++) {

					JButton tempButton;
					Day tempDay = calendar.getYearList().get(i).getMothList().get(j).getDayList().get(m);

					String z;
					// System.out.println(tempDay.getEventList().size());
					switch (tempDay.getEventList().size()) {
					case 0:
						z = "<html>" + Integer.toString(m + 1) + "<br>" + "<br>" + "<br>" + "<br>";
						break;
					case 1:
						z = "<html>" + Integer.toString(m + 1) + "<br>"
								+ tempDay.getEventList().get(0).title.substring(0, 10) + "<br>" + "<br>";
						break;
					case 2:
						z = "<html>" + Integer.toString(m + 1) + "<br>"
								+ tempDay.getEventList().get(0).title.substring(0, 10) + "<br>"
								+ tempDay.getEventList().get(1).title.substring(0, 10) + "<br>";
						break;
					case 3:
						z = "<html>" + Integer.toString(m + 1) + "<br>"
								+ tempDay.getEventList().get(0).title.substring(0, 10) + "<br>"
								+ tempDay.getEventList().get(1).title.substring(0, 10) + "<br>"
								+ tempDay.getEventList().get(2).title.substring(0, 10);
						break;
					default:
						z = "<html>" + Integer.toString(m + 1) + "<br>"
								+ tempDay.getEventList().get(0).title.substring(0, 10) + "<br>"
								+ tempDay.getEventList().get(1).title.substring(0, 10) + "<br>"
								+ tempDay.getEventList().get(2).title.substring(0, 10) + "<br> ...";
						break;
					}

					tempButton = new JButton(z);
					tempButton.setVerticalAlignment(SwingConstants.TOP);
					tempButton.setHorizontalAlignment(SwingConstants.LEFT);
					tempButton.setBackground(new Color(70, 130, 180));

					Calendar cal2 = Calendar.getInstance();
					cal2.set(calendar.getYearList().get(i).getYearNum(), j, m + 1);

					tempButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {

							new DayViewer_GUI(tempDay, cal2);
						}

					});

					// dayButtons.add(tempButton);
					c.ipady = 42;
					c.gridx = (cal.get(Calendar.DAY_OF_WEEK) + m) % 7;
					c.gridy = (cal.get(Calendar.DAY_OF_WEEK) + m) / 7 + 1;
					months.get((i * 12) + j).add(tempButton, c);
				}
				c.gridx = 6;
				c.gridy = 6;
				if (cal.get(Calendar.DAY_OF_WEEK) == 7) {
					c.gridy = 7;
				}
				JButton fill = new JButton("<html> <br><br><br><br><br>");
				c.ipady = 42;
				fill.setEnabled(false);
				fill.setBorder(null);
				fill.setBackground(new Color(135, 206, 250));
				months.get((i * 12) + j).add(fill, c);

			}
		}

		frmProduc.setResizable(false);
		frmProduc.setForeground(new Color(135, 206, 250));
		frmProduc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmProduc.setTitle("ProDuc");
		frmProduc.setIconImage(Toolkit.getDefaultToolkit().getImage(Calendar_GUI.class.getResource(largeLogo)));
		frmProduc.setBackground(new Color(255, 215, 0));
		frmProduc.setBounds(0, 0, 1500, 900);
		frmProduc.setLocationRelativeTo(null);
		frmProduc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

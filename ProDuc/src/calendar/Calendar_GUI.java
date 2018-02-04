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
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Calendar_GUI {

	private JFrame frmProduc;

	private String smallLogo = "/icons/ProDuc Logo v1 70x70.png";
	private String largeLogo = "/icons/ProDuc Logo v1.png";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendar_GUI window = new Calendar_GUI(new PersonalCalendar(5));
					window.frmProduc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calendar_GUI(PersonalCalendar calendar) {
		initialize(calendar);
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
		tabbedPane.setBounds(10, 11, 806, 522);
		frmProduc.getContentPane().add(tabbedPane);

		ArrayList<JPanel> years = new ArrayList<JPanel>();
		ArrayList<JTabbedPane> monthsTab = new ArrayList<JTabbedPane>();
		ArrayList<JPanel> months = new ArrayList<JPanel>();
		ArrayList<JLabel> dayLabels = new ArrayList<JLabel>();
		//ArrayList<JButton> dayButtons = new ArrayList<JButton>();

		for (int i = 0; i < calendar.getNumberOfYears(); i++) {
			years.add(new JPanel());
			years.get(i).setBackground(new Color(255, 215, 0));
			years.get(i).setBorder(null);
			years.get(i).setLayout(null);
			tabbedPane.addTab(new Integer(calendar.getYearList().get(i).getYearNum()).toString(), null, years.get(i),
					null);

			monthsTab.add(new JTabbedPane(JTabbedPane.TOP));
			monthsTab.get(i).setBorder(null);
			monthsTab.get(i).setFont(new Font("Tahoma", Font.PLAIN, 12));
			monthsTab.get(i).setBackground(new Color(135, 206, 250));
			monthsTab.get(i).setBounds(10, 11, 791, 482);
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
				tempPanel.setLayout(new GridLayout(0, 7, 0, 0));
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
					months.get((i * 12) + j).add(tempLabel);
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
				//System.out.println(cal.get(Calendar.DAY_OF_WEEK));
				
				for (int blank = 1; blank < cal.get(Calendar.DAY_OF_WEEK); blank++) {
					JButton tempButton = new JButton("");
					tempButton.setBackground(new Color(135, 206, 250));
					tempButton.setEnabled(false);
					months.get((i * 12) + j).add(tempButton);
				}
				
				for (int m = 0; m < numDays[j]; m++) {
					
					JButton tempButton;
					String z = new Integer(m+1).toString();
					tempButton = new JButton(z);
					tempButton.setVerticalAlignment(SwingConstants.TOP);
					tempButton.setHorizontalAlignment(SwingConstants.LEFT);
					tempButton.setBackground(new Color(70, 130, 180));
					
					Day tempDay = calendar.getYearList().get(i).getMothList().get(j).getDayList().get(m);
					
					tempButton.addActionListener(new ActionListener()
							{

								@Override
								public void actionPerformed(ActionEvent arg0) {
									
									new DayViewer_GUI(tempDay);
								}
						
							});
					
					//dayButtons.add(tempButton);
					months.get((i * 12) + j).add(tempButton);
				}
			}
		}

		frmProduc.setResizable(false);
		frmProduc.setForeground(new Color(135, 206, 250));
		frmProduc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmProduc.setTitle("ProDuc");
		frmProduc.setIconImage(Toolkit.getDefaultToolkit().getImage(Calendar_GUI.class.getResource(largeLogo)));
		frmProduc.setBackground(new Color(255, 215, 0));
		frmProduc.setBounds(100, 100, 832, 573);
		frmProduc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

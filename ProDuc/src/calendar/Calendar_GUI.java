package calendar;

import java.awt.EventQueue;

import javax.swing.JFrame;

import student.*;
import personal.*;
import groups.*;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import professional.Add_Meeting_GUI;

public class Calendar_GUI {

	private JFrame frmProduc;

	private String smallLogo = "/calendar/ProDuc Logo v1 70x70.png";
	private String largeLogo = "/calendar/ProDuc Logo v1.png";

	private JTabbedPane calendarView = null;
	private JPanel personalPanel = null;
	private JPanel profesionalPanel = null;
	private JPanel studentPanel =  null;
	private PersonalCalendar calendar = null;
	private User users = null;
	
	public Calendar_GUI(User user) {
		users = user;
		initialize(user);
		try {
			this.frmProduc.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initialize(User user) {
		calendar = user.getCalendar();
		frmProduc = new JFrame();
		frmProduc.getContentPane().setBackground(new Color(135, 206, 250));
		frmProduc.getContentPane().setLayout(null);

		JButton btnGroups = new JButton("Groups");

		btnGroups.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Groups_GUI group = new Groups_GUI();
				JFrame groupFrame = group.initialize();
				groupFrame.setVisible(true);
				groupFrame.addWindowListener(new WindowAdapter() {
					
					@Override
					public void windowClosing(WindowEvent e) {
						groupFrame.dispose();
						refreshView();
					}
				});
			}

		});

		btnGroups.setBackground(new Color(70, 130, 180));
		btnGroups.setBounds(1380, 91, 100, 30);
		frmProduc.getContentPane().add(btnGroups);

		UIManager.put("TabbedPane.selected", new Color(191, 161, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(1125, 25, 358, 70);
		frmProduc.getContentPane().add(panel_1);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Calendar_GUI.class.getResource("/calendar/ProDuc Logo v1 70x70.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(0, 0, 70, 70);
		panel_1.add(label_2);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(smallLogo));
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

		calendarView = addCalendarView(calendar);
		
		frmProduc.getContentPane().add(calendarView);
		{
			JTabbedPane moduleTabbedPane = new JTabbedPane(JTabbedPane.TOP);
			moduleTabbedPane.setBounds(1125, 106, 358, 754);
			frmProduc.getContentPane().add(moduleTabbedPane);

			personalPanel = addPersonalPanel(calendar);
			moduleTabbedPane.addTab("Personal", null, personalPanel, null);
			moduleTabbedPane.setBackgroundAt(0, new Color(255, 215, 0));
			
			profesionalPanel = addProfessionalPanel(calendar);
			moduleTabbedPane.addTab("Professional", null, profesionalPanel, null);
			moduleTabbedPane.setBackgroundAt(1, new Color(255, 215, 0));

			studentPanel = addStudentPanel(calendar);
			moduleTabbedPane.addTab("Student", null, studentPanel, null);
			moduleTabbedPane.setBackgroundAt(2, new Color(255, 215, 0));
		}

		frmProduc.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent windowEvent) {
				if (JOptionPane.showConfirmDialog(frmProduc, "Are you sure you want to close this window?", "Exit?",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					File folder = new File("src/userAccounts");
			        
			        if(!folder.exists()){
			            folder.mkdir();
			        }

			        try {
						ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream(folder+"\\" + user.getUsername() + ".bin"));
						
						oOS.writeObject(user);
						oOS.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.exit(0);
				}
			}
		});

		frmProduc.setResizable(false);
		frmProduc.setForeground(new Color(135, 206, 250));
		frmProduc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frmProduc.setTitle("ProDuc");
		frmProduc.setIconImage(Toolkit.getDefaultToolkit().getImage(NewUserPanel.class.getResource("/calendar/ProDuc Logo v1.png")));
		frmProduc.setBackground(new Color(255, 215, 0));
		frmProduc.setBounds(0, 0, 1500, 900);
		frmProduc.setLocationRelativeTo(null);
		frmProduc.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}

	public JTabbedPane addCalendarView(PersonalCalendar calendar) {
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(0, 0, 0));
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 12));
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(new Color(255, 215, 0));
		tabbedPane.setBounds(10, 10, 1105, 850);

		ArrayList<JPanel> years = new ArrayList<JPanel>();
		ArrayList<JTabbedPane> monthsTab = new ArrayList<JTabbedPane>();
		ArrayList<JPanel> months = new ArrayList<JPanel>();
		ArrayList<JLabel> dayLabels = new ArrayList<JLabel>();

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
				cal.set(calendar.getYearList().get(i).getYearNum(), j, 0);
				// System.out.println(cal.get(Calendar.DAY_OF_WEEK));

				for (int m = 0; m < numDays[j]; m++) {

					JButton tempButton;
					Day tempDay = calendar.getYearList().get(i).getMothList().get(j).getDayList().get(m);

					String z;
					// System.out.println(tempDay.getEventList().size());
					switch (tempDay.getEventList().size()) {
					case 0:
						z = "<html>" + Integer.toString(m + 1) + "<br>" + "<br>" + "<br>" + "<br>" + "<br>";
						break;
					case 1:
						z = "<html>" + Integer.toString(m + 1) + "<br>"
								+ tempDay.getEventList().get(0).getTitle().substring(0, Math.min(tempDay.getEventList().get(0).getTitle().length(), 15)) + "<br>" + "<br>" + "<br>" + "<br>";
						break;
					case 2:
						z = "<html>" + Integer.toString(m + 1) + "<br>"
								+ tempDay.getEventList().get(0).title.substring(0, Math.min(tempDay.getEventList().get(0).getTitle().length(), 15)) + "<br>"
								+ tempDay.getEventList().get(1).title.substring(0, Math.min(tempDay.getEventList().get(1).getTitle().length(), 15)) + "<br>"+ "<br>" + "<br>";
						break;
					case 3:
						z = "<html>" + Integer.toString(m + 1) + "<br>"
								+ tempDay.getEventList().get(0).title.substring(0, Math.min(tempDay.getEventList().get(0).getTitle().length(), 15)) + "<br>"
								+ tempDay.getEventList().get(1).title.substring(0, Math.min(tempDay.getEventList().get(1).getTitle().length(), 15)) + "<br>"
								+ tempDay.getEventList().get(2).title.substring(0, Math.min(tempDay.getEventList().get(2).getTitle().length(), 15)) + "<br>" + "<br>";
						break;
					default:
						z = "<html>" + Integer.toString(m + 1) + "<br>"
								+ tempDay.getEventList().get(0).title.substring(0, Math.min(tempDay.getEventList().get(0).getTitle().length(), 15)) + "<br>"
								+ tempDay.getEventList().get(1).title.substring(0, Math.min(tempDay.getEventList().get(1).getTitle().length(), 15)) + "<br>"
								+ tempDay.getEventList().get(2).title.substring(0, Math.min(tempDay.getEventList().get(2).getTitle().length(), 15)) + "<br> ...";
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

							DayViewer_GUI dayView = new DayViewer_GUI(tempDay, cal2);
							JFrame dayFrame = dayView.initialize(tempDay, cal2);
							
							
							try {
								dayFrame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
							dayFrame.addWindowListener(new WindowAdapter() {
								
								@Override
								public void windowClosing(WindowEvent e) {
									dayFrame.dispose();
									refreshView();
								}
							});
							
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
		return tabbedPane;
	}

	public JPanel addStudentPanel(PersonalCalendar calendar) {

		JPanel studentPanel = new JPanel();
		studentPanel.setBackground(new Color(255, 215, 0));
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
					JButton button = new JButton("Add Class");
					button.setBackground(new Color(135, 206, 250));
					button.setBounds(25, 25, 120, 22);
					
					button.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							Add_Class_GUI classGUI = new Add_Class_GUI(users);
							JFrame classFrame = classGUI.initialize();
							classFrame.setVisible(true);
							classFrame.addWindowListener(new WindowAdapter() {
								
								@Override
								public void windowClosing(WindowEvent e) {
									classFrame.dispose();
									refreshView();
								}
							});
						}
						
					});
					semesterPanel.get(j).add(button);
					semesterTabbedPane.get(i).addTab(calendar.getYearList().get(i).getSemesterList().get(j).getTitle(),
							null, semesterPanel.get(j), null);
				}

			}
		}
		return studentPanel;
	}

	public JPanel addProfessionalPanel(PersonalCalendar calendar) {
		JPanel professionalPanel = new JPanel();
		professionalPanel.setBackground(new Color(255, 215, 0));
		professionalPanel.setLayout(null);
		ArrayList<JPanel> professionalYears = new ArrayList<JPanel>();

		{
			JTabbedPane professionalTabbedPane = new JTabbedPane(JTabbedPane.TOP);
			professionalTabbedPane.setBounds(10, 44, 333, 671);
			professionalPanel.add(professionalTabbedPane);

			JButton btnAddMeeting = new JButton("Add Meeting");
			btnAddMeeting.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					JFrame addMeetingFrame = new JFrame();
					addMeetingFrame.setTitle("ProDuc");
					addMeetingFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(largeLogo));
					addMeetingFrame.getContentPane().add(new Add_Meeting_GUI(addMeetingFrame, calendar));
					addMeetingFrame.pack();
					addMeetingFrame.setVisible(true);
					
					addMeetingFrame.addWindowListener(new WindowAdapter() {
						
						@Override
						public void windowClosing(WindowEvent e) {
							addMeetingFrame.dispose();
							refreshView();
						}
					});
				}
			});

			btnAddMeeting.setBackground(new Color(135, 206, 250));
			btnAddMeeting.setBounds(223, 11, 120, 22);
			professionalPanel.add(btnAddMeeting);

			for (int i = 0; i < calendar.getNumberOfYears(); i++) {
				professionalYears.add(new JPanel());
				professionalYears.get(i).setBackground(new Color(135, 206, 250));
				professionalYears.get(i).setBorder(null);
				professionalYears.get(i).setLayout(null);

				professionalTabbedPane.addTab(new Integer(calendar.getYearList().get(i).getYearNum()).toString(), null,
						professionalYears.get(i), null);
				professionalTabbedPane.setBackgroundAt(i, new Color(135, 206, 250));
				// professionalTabbedPane.setBackgroundAt(i, new Color(135, 206, 250));

			}
		}
		return professionalPanel;
	}

	public JPanel addPersonalPanel(PersonalCalendar calendar) {
		JPanel personalPanel = new JPanel();
		personalPanel.setBackground(new Color(255, 215, 0));
		personalPanel.setLayout(null);

		{
			JTabbedPane personalTabbedPane = new JTabbedPane(JTabbedPane.TOP);
			personalTabbedPane.setBounds(10, 84, 333, 631);
			personalPanel.add(personalTabbedPane);

			personalTabbedPane.addTab("Notes", null, null, null);
			personalTabbedPane.setBackgroundAt(0, new Color(255, 215, 0));

			personalTabbedPane.addTab("Fitness", null, null, null);
			personalTabbedPane.setBackgroundAt(1, new Color(255, 215, 0));

			personalTabbedPane.addTab("Budget", null, null, null);
			personalTabbedPane.setBackgroundAt(2, new Color(255, 215, 0));
		}

		JButton btnNotes = new JButton("Add Notes");
		btnNotes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame noteFrame = new JFrame();
				noteFrame.add(new Add_Notes_GUI(noteFrame, calendar));
				noteFrame.pack();
				noteFrame.setLocationRelativeTo(null);
				noteFrame.setVisible(true);
			}

		});

		btnNotes.setBackground(new Color(135, 206, 250));
		btnNotes.setBounds(10, 11, 150, 25);
		personalPanel.add(btnNotes);
		
		/*		JButton btnAddNotes = new JButton("Add Notes");
		btnAddNotes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				JFrame addNotes = new JFrame();
				addNotes.setTitle("ProDuc");
				addNotes.setIconImage(Toolkit.getDefaultToolkit().getImage(largeLogo));
				addNotes.getContentPane().add(new Add_Notes_GUI(addNotes));
				addNotes.pack();
				addNotes.setVisible(true);
			}
		});
		
		btnAddNotes.setBackground(new Color(135, 206, 250));
		btnAddNotes.setBounds(10, 11, 150, 25);
		personalPanel.add(btnAddNotes);*/
		
		JButton btnFitness = new JButton("Add Fitness");
		btnFitness.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame fitFrame = new JFrame();
				fitFrame.add(new Add_Fitness_GUI(fitFrame, calendar));
				fitFrame.pack();
				fitFrame.setLocationRelativeTo(null);
				fitFrame.setVisible(true);
				
			}

		});

		btnFitness.setBackground(new Color(135, 206, 250));
		btnFitness.setBounds(10, 51, 150, 25);
		personalPanel.add(btnFitness);

/*		JButton btnAddFitness = new JButton("Edit Fitness");
		btnAddFitness.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				JFrame addFitness = new JFrame();
				addFitness.setTitle("ProDuc");
				addFitness.setIconImage(Toolkit.getDefaultToolkit().getImage(largeLogo));
				addFitness.getContentPane().add(new Add_Fitness_GUI(addFitness, calendar));
				addFitness.pack();
				addFitness.setVisible(true);
			}
		});

		btnAddFitness.setBackground(new Color(135, 206, 250));
		btnAddFitness.setBounds(10, 51, 150, 25);
		personalPanel.add(btnAddFitness);*/
		
		JButton btnBudget = new JButton("Manage Budget");
		btnBudget.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame budgetFrame = new JFrame();
				budgetFrame.add(new Add_Budget_GUI(budgetFrame, calendar));
				budgetFrame.pack();
				budgetFrame.setLocationRelativeTo(null);
				budgetFrame.setVisible(true);
			}

		});

		btnBudget.setBackground(new Color(135, 206, 250));
		btnBudget.setBounds(190, 11, 145, 25);
		personalPanel.add(btnBudget);

/*		JButton btnAddBudget = new JButton("Manage Budget");
		btnAddBudget.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				JFrame addBudget = new JFrame();
				addBudget.setTitle("ProDuc");
				addBudget.setIconImage(Toolkit.getDefaultToolkit().getImage(largeLogo));
				addBudget.getContentPane().add(new Add_Budget_GUI(addBudget, calendar));
				addBudget.pack();
				addBudget.setVisible(true);
			}
		});

		btnAddBudget.setBackground(new Color(135, 206, 250));
		btnAddBudget.setBounds(190, 11, 145, 25);
		personalPanel.add(btnAddBudget);*/
		
/*		JButton btnPersonalEvent = new JButton("Add Event");
		btnPersonalEvent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				JFrame personalEvent = new JFrame();
				personalEvent.setTitle("ProDuc");
				personalEvent.setIconImage(Toolkit.getDefaultToolkit().getImage(largeLogo));
				personalEvent.getContentPane().add(new Add_Budget_GUI(personalEvent, calendar));
				personalEvent.pack();
				personalEvent.setVisible(true);
			}
		});

		btnPersonalEvent.setBackground(new Color(135, 206, 250));
		btnPersonalEvent.setBounds(190, 51, 145, 25);
		personalPanel.add(btnPersonalEvent);*/


		JButton btnPersonalEvent = new JButton("Add Event");
		btnPersonalEvent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Add_Personal_Event_GUI();
			}

		});

		btnPersonalEvent.setBackground(new Color(135, 206, 250));
		btnPersonalEvent.setBounds(190, 51, 145, 25);
		personalPanel.add(btnPersonalEvent);
		
		return personalPanel;
	}
	
	public void refreshView() {
//		frmProduc.getContentPane().remove(calendarView);
//		frmProduc.getContentPane().add(addCalendarView(calendar));
//		frmProduc.setVisible(false);
//		frmProduc.repaint();
//		frmProduc.setVisible(true);
		new Calendar_GUI(users);
		frmProduc.dispose();
	}
}

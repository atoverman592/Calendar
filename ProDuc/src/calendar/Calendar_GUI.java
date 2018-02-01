package calendar;

import java.awt.EventQueue;

import javax.swing.JFrame;

import addclass.Add_Class;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.JPanel;
import java.awt.FlowLayout;
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
					Calendar_GUI window = new Calendar_GUI();
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
	public Calendar_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * 
	 */
	private void initialize() {
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
		
		JPanel tab2018 = new JPanel();
		tab2018.setBorder(null);
		tab2018.setBackground(new Color(255, 215, 0));
		tabbedPane.addTab("2018", null, tab2018, null);
		tab2018.setLayout(null);
		
		JTabbedPane year2018 = new JTabbedPane(JTabbedPane.TOP);
		year2018.setBorder(null);
		year2018.setFont(new Font("Tahoma", Font.PLAIN, 12));
		year2018.setBackground(new Color(135, 206, 250));
		year2018.setBounds(10, 11, 791, 482);
		tab2018.add(year2018);
		
		JPanel jan2018 = new JPanel();
		jan2018.setBackground(new Color(135, 206, 250));
		year2018.addTab("January", null, jan2018, null);
		
	//
		jan2018.setLayout(new GridLayout(0, 7, 0, 0));
		
		JLabel jan2018LblSunday = new JLabel("Sunday");
		jan2018LblSunday.setHorizontalAlignment(SwingConstants.CENTER);
		jan2018.add(jan2018LblSunday);
		
		JLabel jan2018LblMonday = new JLabel("Monday");
		jan2018LblMonday.setHorizontalAlignment(SwingConstants.CENTER);
		jan2018.add(jan2018LblMonday);
		
		JLabel jan2018LblTuesday = new JLabel("Tuesday");
		jan2018LblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		jan2018.add(jan2018LblTuesday);
		
		JLabel jan2018LblWednesday = new JLabel("Wednesday");
		jan2018LblWednesday.setHorizontalAlignment(SwingConstants.CENTER);
		jan2018.add(jan2018LblWednesday);
		
		JLabel jan2018LblThursday = new JLabel("Thursday");
		jan2018LblThursday.setHorizontalAlignment(SwingConstants.CENTER);
		jan2018.add(jan2018LblThursday);
		
		JLabel jan2018LblFriday = new JLabel("Friday");
		jan2018LblFriday.setHorizontalAlignment(SwingConstants.CENTER);
		jan2018.add(jan2018LblFriday);
		
		JLabel jan2018LblSaturday = new JLabel("Saturday");
		jan2018LblSaturday.setHorizontalAlignment(SwingConstants.CENTER);
		jan2018.add(jan2018LblSaturday);
		
		//JButton jan2018Button0 = new JButton("");
		//JButton jan2018Button1 = new JButton("");
		//JButton jan2018Button2 = new JButton("");
		//JButton jan2018Button3 = new JButton("");
		//JButton jan2018Button4 = new JButton("");
		//JButton jan2018Button5 = new JButton("");
		
		//jan2018Button0.setBackground(new Color(135, 206, 250));
		//jan2018Button0.setEnabled(false);
		//jan2018Button1.setBackground(new Color(135, 206, 250));
		//jan2018Button1.setEnabled(false);
		//jan2018Button2.setBackground(new Color(135, 206, 250));
		//jan2018Button2.setEnabled(false);
		//jan2018Button3.setBackground(new Color(135, 206, 250));
		//jan2018Button3.setEnabled(false);
		//jan2018Button4.setBackground(new Color(135, 206, 250));
		//jan2018Button4.setEnabled(false);
		//jan2018Button5.setBackground(new Color(135, 206, 250));
		//jan2018Button5.setEnabled(false);
		
		//jan2018.add(jan2018Button0);
		//jan2018.add(jan2018Button1);
		//jan2018.add(jan2018Button2);
		//jan2018.add(jan2018Button3);
		//jan2018.add(jan2018Button4);
		//jan2018.add(jan2018Button5);
		
		ArrayList<JButton> jan2018BtnList = new ArrayList<JButton>();
		
		for(int i=0; i<31; i++) {
			String z ="<html>" + Integer.toString(i+1) + "<br>" /*+ yearList.get(0).getMonthList().get(0).getDayList().get(i).getEventList().get(0).substring(0,10)*/
					+ "<br>" /*+ yearList.get(0).getMonthList().get(0).getDayList().get(i).getEventList().get(1).substring(0,10)*/
					+ "<br></html>" /*+ yearList.get(0).getMonthList().get(0).getDayList().get(i).getEventList().get(2).substring(0,10)*/;
			jan2018BtnList.add(new JButton(z));
			jan2018BtnList.get(i).setVerticalAlignment(SwingConstants.TOP);
			jan2018BtnList.get(i).setHorizontalAlignment(SwingConstants.LEFT);
			jan2018BtnList.get(i).setBackground(new Color(70, 130, 180));
			
			jan2018.add(jan2018BtnList.get(i));
		}
		
	//

		
		JPanel feb2018 = new JPanel();
		feb2018.setBackground(new Color(135, 206, 250));
		year2018.addTab("February", null, feb2018, null);
		
	//
		feb2018.setLayout(new GridLayout(0, 7, 0, 0));
		
		JLabel feb2018LblSunday = new JLabel("Sunday");
		feb2018LblSunday.setHorizontalAlignment(SwingConstants.CENTER);
		feb2018.add(feb2018LblSunday);
		
		JLabel feb2018LblMonday = new JLabel("Monday");
		feb2018LblMonday.setHorizontalAlignment(SwingConstants.CENTER);
		feb2018.add(feb2018LblMonday);
		
		JLabel feb2018LblTuesday = new JLabel("Tuesday");
		feb2018LblTuesday.setHorizontalAlignment(SwingConstants.CENTER);
		feb2018.add(feb2018LblTuesday);
		
		JLabel feb2018LblWednesday = new JLabel("Wednesday");
		feb2018LblWednesday.setHorizontalAlignment(SwingConstants.CENTER);
		feb2018.add(feb2018LblWednesday);
		
		JLabel feb2018LblThursday = new JLabel("Thursday");
		feb2018LblThursday.setHorizontalAlignment(SwingConstants.CENTER);
		feb2018.add(feb2018LblThursday);
		
		JLabel feb2018LblFriday = new JLabel("Friday");
		feb2018LblFriday.setHorizontalAlignment(SwingConstants.CENTER);
		feb2018.add(feb2018LblFriday);
		
		JLabel feb2018LblSaturday = new JLabel("Saturday");
		feb2018LblSaturday.setHorizontalAlignment(SwingConstants.CENTER);
		feb2018.add(feb2018LblSaturday);
		
		//JButton feb2018Button0 = new JButton("");
		//JButton feb2018Button1 = new JButton("");
		//JButton feb2018Button2 = new JButton("");
		//JButton feb2018Button3 = new JButton("");
		//JButton feb2018Button4 = new JButton("");
		//JButton feb2018Button5 = new JButton("");
		
		//feb2018Button0.setBackground(new Color(135, 206, 250));
		//feb2018Button0.setEnabled(false);
		//feb2018Button1.setBackground(new Color(135, 206, 250));
		//feb2018Button1.setEnabled(false);
		//feb2018Button2.setBackground(new Color(135, 206, 250));
		//feb2018Button2.setEnabled(false);
		//feb2018Button3.setBackground(new Color(135, 206, 250));
		//feb2018Button3.setEnabled(false);
		//feb2018Button4.setBackground(new Color(135, 206, 250));
		//feb2018Button4.setEnabled(false);
		//feb2018Button5.setBackground(new Color(135, 206, 250));
		//feb2018Button5.setEnabled(false);
		
		//feb2018.add(feb2018Button0);
		//feb2018.add(feb2018Button1);
		//feb2018.add(feb2018Button2);
		//feb2018.add(feb2018Button3);
		//feb2018.add(feb2018Button4);
		//feb2018.add(feb2018Button5);
		
		ArrayList<JButton> feb2018BtnList = new ArrayList<JButton>();
		
		for(int i=0; i<31; i++) {
			String z ="<html>" + Integer.toString(i+1) + "<br>" /*+ yearList.get(0).getMonthList().get(0).getDayList().get(i).getEventList().get(0).substring(0,10)*/
					+ "<br>" /*+ yearList.get(0).getMonthList().get(0).getDayList().get(i).getEventList().get(1).substring(0,10)*/
					+ "<br></html>" /*+ yearList.get(0).getMonthList().get(0).getDayList().get(i).getEventList().get(2).substring(0,10)*/;
			feb2018BtnList.add(new JButton(z));
			feb2018BtnList.get(i).setVerticalAlignment(SwingConstants.TOP);
			feb2018BtnList.get(i).setHorizontalAlignment(SwingConstants.LEFT);
			feb2018BtnList.get(i).setBackground(new Color(70, 130, 180));
			
			feb2018.add(feb2018BtnList.get(i));
		}
		
	//

		
		JPanel mar2018 = new JPanel();
		mar2018.setBackground(new Color(135, 206, 250));
		year2018.addTab("March", null, mar2018, null);
		
		JPanel apr2018 = new JPanel();
		apr2018.setBackground(new Color(135, 206, 250));
		year2018.addTab("April", null, apr2018, null);
		
		JPanel may2018 = new JPanel();
		may2018.setBackground(new Color(135, 206, 250));
		year2018.addTab("May", null, may2018, null);
		
		JPanel jun2018 = new JPanel();
		jun2018.setBackground(new Color(135, 206, 250));
		year2018.addTab("June", null, jun2018, null);
		
		JPanel jul2018 = new JPanel();
		jul2018.setBackground(new Color(135, 206, 250));
		year2018.addTab("July", null, jul2018, null);
		
		JPanel aug2018 = new JPanel();
		aug2018.setBackground(new Color(135, 206, 250));
		year2018.addTab("August", null, aug2018, null);
		
		JPanel sep2018 = new JPanel();
		sep2018.setBackground(new Color(135, 206, 250));
		year2018.addTab("September", null, sep2018, null);
		
		JPanel oct2018 = new JPanel();
		oct2018.setBackground(new Color(135, 206, 250));
		year2018.addTab("October", null, oct2018, null);
		
		JPanel nov2018 = new JPanel();
		nov2018.setBackground(new Color(135, 206, 250));
		year2018.addTab("November", null, nov2018, null);
		
		JPanel dec2018 = new JPanel();
		dec2018.setBackground(new Color(135, 206, 250));
		year2018.addTab("December", null, dec2018, null);
		tabbedPane.setBackgroundAt(0, new Color(255, 215, 0));
		
		JPanel tab2019 = new JPanel();
		tab2019.setBorder(null);
		tab2019.setBackground(new Color(255, 215, 0));
		tabbedPane.addTab("2019", null, tab2019, null);
		tab2019.setLayout(null);
		
		JTabbedPane year2019 = new JTabbedPane(JTabbedPane.TOP);
		year2019.setBorder(null);
		year2019.setFont(new Font("Tahoma", Font.PLAIN, 12));
		year2019.setBackground(new Color(135, 206, 250));
		year2019.setBounds(10, 11, 791, 482);
		tab2019.add(year2019);
		
		JPanel jan2019 = new JPanel();
		jan2019.setBackground(new Color(135, 206, 250));
		year2019.addTab("January", null, jan2019, null);
		
		JPanel feb2019 = new JPanel();
		feb2019.setBackground(new Color(135, 206, 250));
		year2019.addTab("February", null, feb2019, null);
		
		JPanel mar2019 = new JPanel();
		mar2019.setBackground(new Color(135, 206, 250));
		year2019.addTab("March", null, mar2019, null);
		
		JPanel apr2019 = new JPanel();
		apr2019.setBackground(new Color(135, 206, 250));
		year2019.addTab("April", null, apr2019, null);
		
		JPanel may2019 = new JPanel();
		may2019.setBackground(new Color(135, 206, 250));
		year2019.addTab("May", null, may2019, null);
		
		JPanel jun2019 = new JPanel();
		jun2019.setBackground(new Color(135, 206, 250));
		year2019.addTab("June", null, jun2019, null);
		
		JPanel jul2019 = new JPanel();
		jul2019.setBackground(new Color(135, 206, 250));
		year2019.addTab("July", null, jul2019, null);
		
		JPanel aug2019 = new JPanel();
		aug2019.setBackground(new Color(135, 206, 250));
		year2019.addTab("August", null, aug2019, null);
		
		JPanel sep2019 = new JPanel();
		sep2019.setBackground(new Color(135, 206, 250));
		year2019.addTab("September", null, sep2019, null);
		
		JPanel oct2019 = new JPanel();
		oct2019.setBackground(new Color(135, 206, 250));
		year2019.addTab("October", null, oct2019, null);
		
		JPanel nov2019 = new JPanel();
		nov2019.setBackground(new Color(135, 206, 250));
		year2019.addTab("November", null, nov2019, null);
		
		JPanel dec2019 = new JPanel();
		dec2019.setBackground(new Color(135, 206, 250));
		year2019.addTab("December", null, dec2019, null);
		
		JPanel tab2020 = new JPanel();
		tab2020.setBorder(null);
		tab2020.setBackground(new Color(255, 215, 0));
		tabbedPane.addTab("2020", null, tab2020, null);
		tab2020.setLayout(null);
		
		JTabbedPane year2020 = new JTabbedPane(JTabbedPane.TOP);
		year2020.setFont(new Font("Tahoma", Font.PLAIN, 12));
		year2020.setBackground(new Color(135, 206, 250));
		year2020.setBorder(null);
		year2020.setBounds(10, 11, 791, 482);
		tab2020.add(year2020);
		
		JPanel jan2020 = new JPanel();
		jan2020.setBackground(new Color(135, 206, 250));
		year2020.addTab("January", null, jan2020, null);
		
		JPanel feb2020 = new JPanel();
		feb2020.setBackground(new Color(135, 206, 250));
		year2020.addTab("February", null, feb2020, null);
		
		JPanel mar2020 = new JPanel();
		mar2020.setBackground(new Color(135, 206, 250));
		year2020.addTab("March", null, mar2020, null);
		
		JPanel apr2020 = new JPanel();
		apr2020.setBackground(new Color(135, 206, 250));
		year2020.addTab("April", null, apr2020, null);
		
		JPanel may2020 = new JPanel();
		may2020.setBackground(new Color(135, 206, 250));
		year2020.addTab("May", null, may2020, null);
		
		JPanel jun2020 = new JPanel();
		jun2020.setBackground(new Color(135, 206, 250));
		year2020.addTab("June", null, jun2020, null);
		
		JPanel jul2020 = new JPanel();
		jul2020.setBackground(new Color(135, 206, 250));
		year2020.addTab("July", null, jul2020, null);
		
		JPanel aug2020 = new JPanel();
		aug2020.setBackground(new Color(135, 206, 250));
		year2020.addTab("August", null, aug2020, null);
		
		JPanel sep2020 = new JPanel();
		sep2020.setBackground(new Color(135, 206, 250));
		year2020.addTab("September", null, sep2020, null);
		
		JPanel oct2020 = new JPanel();
		oct2020.setBackground(new Color(135, 206, 250));
		year2020.addTab("October", null, oct2020, null);
		
		JPanel nov2020 = new JPanel();
		nov2020.setBackground(new Color(135, 206, 250));
		year2020.addTab("November", null, nov2020, null);
		
		JPanel dec2020 = new JPanel();
		dec2020.setBackground(new Color(135, 206, 250));
		year2020.addTab("December", null, dec2020, null);
		
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

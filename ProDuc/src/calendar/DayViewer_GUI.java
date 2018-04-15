package calendar;

import java.awt.EventQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ScrollPaneConstants;

public class DayViewer_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// DayViewer_GUI window = new DayViewer_GUI();
	// window.frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the application.
	 */
	public DayViewer_GUI(Day day, Calendar cal) {
			
	}

	
	public boolean exists() {
		return frame.isVisible();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	public JFrame initialize(Day day, Calendar cal) {
		frame = new JFrame();
		frame.setBounds(100, 100, 475, 475);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
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

		String date = Integer.toString(cal.get(Calendar.MONTH) + 1) + "/"
				+ Integer.toString(cal.get(Calendar.DAY_OF_MONTH)) + "/" + Integer.toString(cal.get(Calendar.YEAR));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 459 };
		gridBagLayout.rowHeights = new int[] { 35, 400 };
		gridBagLayout.columnWeights = new double[] { 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0 };
		frame.getContentPane().setLayout(gridBagLayout);
		JLabel label = new JLabel(date);
		label.setBackground(new Color(135, 206, 250));
		label.setOpaque(true);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		frame.getContentPane().add(label, gbc_label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		frame.getContentPane().add(scrollPane, gbc_scrollPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 434 };
		gbl_panel.rowHeights = new int[] { 25 };
		gbl_panel.columnWeights = new double[] { 0.0 };
		gbl_panel.rowWeights = new double[] { 1.0, 0.0 };
		panel.setLayout(gbl_panel);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		panel.add(panel_1, gbc_panel_1);
		panel_1.setBackground(new Color(135, 206, 250));
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 300, 30, 30 };
		gbl_panel_1.rowHeights = new int[] { 30 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 0.0 };
		gbl_panel_1.rowWeights = new double[] { 0.0 };
		panel_1.setLayout(gbl_panel_1);

		for (int i=0; i < day.getEventList().size(); i ++) {
			JLabel lblTestLabel = new JLabel(day.getEventList().get(i).getTitle());
			lblTestLabel.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_lblTestLabel = new GridBagConstraints();
			gbc_lblTestLabel.insets = new Insets(0, 0, 0, 5);
			gbc_lblTestLabel.gridx = 0;
			gbc_lblTestLabel.gridy = i;
			panel_1.add(lblTestLabel, gbc_lblTestLabel);

			JButton btnEdit = new JButton("View");
			btnEdit.putClientProperty("index", i);
			btnEdit.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					day.getEventList().get((Integer)((JButton)e.getSource()).getClientProperty("index"));
					
				}
				
			});
			GridBagConstraints gbc_btnEdit = new GridBagConstraints();
			gbc_btnEdit.insets = new Insets(0, 0, 0, 5);
			gbc_btnEdit.gridx = 1;
			gbc_btnEdit.gridy = i;
			panel_1.add(btnEdit, gbc_btnEdit);

			JButton btnAdd = new JButton("Delete");
			GridBagConstraints gbc_btnAdd = new GridBagConstraints();
			gbc_btnAdd.insets = new Insets(0, 0, 0, 5);
			gbc_btnAdd.gridx = 2;
			gbc_btnAdd.gridy = i;
			panel_1.add(btnAdd, gbc_btnAdd);
			scrollPane.setViewportView(panel);	
		}

		JButton btnAddEvent = new JButton("Add Event");
		btnAddEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnAddEvent = new GridBagConstraints();
		gbc_btnAddEvent.insets = new Insets(0, 0, 5, 0);
		gbc_btnAddEvent.gridx = 0;
		gbc_btnAddEvent.gridy = 1;
		panel.add(btnAddEvent, gbc_btnAddEvent);
		btnAddEvent.setBackground(new Color(255, 215, 0));
		btnAddEvent.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		return frame;
	}
}

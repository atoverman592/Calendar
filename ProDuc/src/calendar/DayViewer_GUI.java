package calendar;

import java.awt.EventQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class DayViewer_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayViewer_GUI window = new DayViewer_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DayViewer_GUI(Day day, Calendar cal) {
		initialize(day, cal);
		try {
			this.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Day day, Calendar cal) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
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

		JPanel panel = new JPanel();

		String date = Integer.toString(cal.get(Calendar.MONTH)+1) + "/" + Integer.toString(cal.get(Calendar.DAY_OF_MONTH)) + "/" + Integer.toString(cal.get(Calendar.YEAR));
		JLabel label = new JLabel(date);
		panel.add(label);

		frame.getContentPane().add(panel);
	}

}

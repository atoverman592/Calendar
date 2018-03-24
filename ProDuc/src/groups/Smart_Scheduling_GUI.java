package groups;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Smart_Scheduling_GUI {

	private JFrame smartScheduling;

	public Smart_Scheduling_GUI() {
		initialize();
		try {
			this.smartScheduling.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initialize() {
		smartScheduling = new JFrame();
		smartScheduling.getContentPane().setBackground(new Color(135, 206, 250));
		smartScheduling.setBounds(100, 100, 450, 300);
		smartScheduling.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		smartScheduling.setResizable(false);
		smartScheduling.setForeground(new Color(135, 206, 250));
		smartScheduling.setFont(new Font("Tahoma", Font.PLAIN, 12));
		smartScheduling.setTitle("ProDuc");
		smartScheduling.setIconImage(Toolkit.getDefaultToolkit().getImage("/calendar/ProDuc Logo v1.png"));
		smartScheduling.setBackground(new Color(255, 215, 0));
		smartScheduling.setBounds(0, 0, 1500, 900);
		smartScheduling.setLocationRelativeTo(null);
		smartScheduling.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		smartScheduling.getContentPane().setLayout(null);
	}

}

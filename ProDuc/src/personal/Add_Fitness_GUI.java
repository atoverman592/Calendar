package personal;

import com.toedter.calendar.JDateChooser;

import calendar.PersonalCalendar;

import java.awt.Dimension;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add_Fitness_GUI extends javax.swing.JPanel {
    JFrame frame;
    PersonalCalendar personalCalendar;
    JDateChooser dateChooser;

    public Add_Fitness_GUI(JFrame frame, PersonalCalendar pc) {
        this.frame = frame; 
        initComponents();
        dateChooser = new JDateChooser();
        dateChooser.setDate(new Date());
        dateChooser.setPreferredSize(new Dimension(150,25));
        this.datePanel.add(dateChooser);
        personalCalendar = pc;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                Calendar c = Calendar.getInstance();
                c.setTime(dateChooser.getDate());
                String month = String.valueOf(c.get(Calendar.MONTH)+1);
                String dayOfMonth = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
                String year = String.valueOf(c.get(Calendar.YEAR));
                
                personalCalendar.getYearList().get(c.get(Calendar.YEAR)-2018)
                        .getMothList().get(c.get(Calendar.MONTH))
                        .getDayList().get(c.get(Calendar.DAY_OF_MONTH)-1)
                        .addEvent(new Fitness("Fitness", dateChooser.getDate(), goals.getText(), 
                        		workoutPlan.getText()));
                frame.dispose();
        	}
        });
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workoutPlan = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        	}
        });
        jScrollPane2 = new javax.swing.JScrollPane();
        goals = new javax.swing.JTextArea();
        datePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(130, 206, 250));

        jButton1.setBackground(new java.awt.Color(255, 215, 0));
        jButton1.setText("Save");
        jButton1.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setPreferredSize(new java.awt.Dimension(169, 41));

        jLabel1.setBackground(new java.awt.Color(130, 206, 250));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Fitness Goals");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        workoutPlan.setColumns(20);
        workoutPlan.setRows(5);
        jScrollPane1.setViewportView(workoutPlan);

        jLabel2.setText("Goals to Accomplish:");

        jLabel3.setText("Workout for the Week:");

        jButton2.setBackground(new java.awt.Color(255, 215, 0));
        jButton2.setText("Cancel");

        goals.setColumns(20);
        goals.setRows(5);
        jScrollPane2.setViewportView(goals);

        datePanel.setBackground(new java.awt.Color(130, 206, 250));

        jLabel4.setText("Week Of: ");

        javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        datePanelLayout.setVerticalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel3)
        							.addGap(18)
        							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jLabel2)
        							.addGap(18)
        							.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
        							.addGap(56)
        							.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
        							.addGap(17)))
        					.addGap(56))
        				.addComponent(datePanel, GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(datePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        					.addGap(72)
        					.addComponent(jLabel3))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
        			.addGap(26))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel datePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea workoutPlan;
    private javax.swing.JTextArea goals;
    // End of variables declaration//GEN-END:variables
}

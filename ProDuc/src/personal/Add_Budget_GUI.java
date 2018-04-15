package personal;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import calendar.Event;
import calendar.PersonalCalendar;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; 

public class Add_Budget_GUI extends javax.swing.JPanel {
    JFrame frame;
    PersonalCalendar personalCalendar;
    JDateChooser dateChooser; 
    

    public Add_Budget_GUI(JFrame frame, PersonalCalendar pc) {
        this.frame = frame; 
        initComponents();
        dateChooser = new JDateChooser();
        dateChooser.setDate(new Date());
        dateChooser.setPreferredSize(new Dimension(150,25));
        this.datePanel.add(dateChooser);
        personalCalendar = pc;
        
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(12)
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 426, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(12)
        					.addComponent(datePanel, GroupLayout.PREFERRED_SIZE, 438, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(83)
        					.addComponent(jLabel4)
        					.addGap(30)
        					.addComponent(currentBudget, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(61)
        					.addComponent(jLabel5)
        					.addGap(38)
        					.addComponent(currentExpenses, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(61)
        					.addComponent(jLabel6)
        					.addGap(30)
        					.addComponent(amountRemaining, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(112)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
        					.addGap(31)
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
        			.addGap(28))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(13)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(13)
        			.addComponent(datePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(7)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(3)
        					.addComponent(jLabel4))
        				.addComponent(currentBudget, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(23)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(15)
        					.addComponent(jLabel5))
        				.addComponent(currentExpenses, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
        			.addGap(11)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(3)
        					.addComponent(jLabel6))
        				.addComponent(amountRemaining, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))
        );
        setLayout(groupLayout);; 
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        currentExpenses = new JTextPane();
        currentBudget = new javax.swing.JTextField();
        amountRemaining = new javax.swing.JTextField();
        datePanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		frame.dispose();
        	}
        });
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		Calendar c = Calendar.getInstance();
                c.setTime(dateChooser.getDate());
                String month = String.valueOf(c.get(Calendar.MONTH)+1);
                String dayOfMonth = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
                String year = String.valueOf(c.get(Calendar.YEAR));
                
                personalCalendar.getYearList().get(c.get(Calendar.YEAR)-2018)
                        .getMothList().get(c.get(Calendar.MONTH))
                        .getDayList().get(c.get(Calendar.DAY_OF_MONTH)-1)
                        .addEvent(new Budget("Budget", dateChooser.getDate(), currentBudget.getText(), 
                        		currentExpenses.getText(), amountRemaining.getText()));
                frame.dispose();
        	}
        });


        jLabel2.setText("Week of: ");

        setBackground(new java.awt.Color(130, 206, 250));

        jPanel1.setBackground(new java.awt.Color(70, 130, 180));
        jPanel1.setPreferredSize(new java.awt.Dimension(169, 41));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Weekly Budget");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jLabel4.setText("Current Budget:");

        jLabel5.setText("Current Expenses:");

        jButton1.setBackground(new java.awt.Color(255, 215, 0));
        jButton1.setText("Cancel");

        jButton2.setBackground(new java.awt.Color(255, 215, 0));
        jButton2.setText("Save");
        jButton2.setMaximumSize(new java.awt.Dimension(71, 25));
        jButton2.setMinimumSize(new java.awt.Dimension(71, 25));
        jButton2.setPreferredSize(new java.awt.Dimension(71, 25));

        jLabel6.setText("Amount Remaining:");

        datePanel.setBackground(new java.awt.Color(130, 206, 250));

        jLabel7.setText("Week Of: ");

        javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        datePanelLayout.setVerticalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
/*    private void acceptButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptButtonMouseClicked
        Calendar c = Calendar.getInstance();
        c.setTime(dateChooser.getDate());
        String month = String.valueOf(c.get(Calendar.MONTH)+1);
        String dayOfMonth = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
        String year = String.valueOf(c.get(Calendar.YEAR));
        
        personalCalendar.getYearList().get(c.get(Calendar.YEAR)-2018)
                .getMothList().get(c.get(Calendar.MONTH))
                .getDayList().get(c.get(Calendar.DAY_OF_MONTH)-1)
                .addEvent(new Budget("Budget", dateChooser.getDate(), this.currentBudget.getText(), 
                		this.currentExpenses.getText(), this.amountRemaining.getText()));
        frame.dispose();
    }*/
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel datePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField currentBudget;
    private javax.swing.JTextField amountRemaining;
    private JTextPane currentExpenses;
    // End of variables declaration//GEN-END:variables
}

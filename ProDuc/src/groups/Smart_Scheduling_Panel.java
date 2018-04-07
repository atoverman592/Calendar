package groups;

import calendar.PersonalCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Smart_Scheduling_Panel extends javax.swing.JPanel {
    JFrame frame;
    JDateChooser beginDate;
    JDateChooser endDate;
    
    public Smart_Scheduling_Panel(JFrame frame) {
        this.frame = frame;
        initComponents();
        beginDate = new JDateChooser();
        beginDate.setDate(new Date());
        beginDate.setPreferredSize(new Dimension(150,25));
        this.startDatePanel.add(beginDate);
        
        endDate = new JDateChooser();
        endDate.setDate(new Date());
        endDate.setPreferredSize(new Dimension(150,25));
        this.endDatePanel.add(endDate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startDatePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        endDatePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        findDateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        groupComboBox = new javax.swing.JComboBox<>();
        availableDateFields = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setBackground(new java.awt.Color(130, 206, 250));

        startDatePanel.setBackground(new java.awt.Color(130, 206, 250));

        jLabel1.setText("Start Date:");
        startDatePanel.add(jLabel1);

        endDatePanel.setBackground(new java.awt.Color(130, 206, 250));

        jLabel2.setText("End Date:");
        endDatePanel.add(jLabel2);

        jPanel3.setBackground(new java.awt.Color(130, 206, 250));

        findDateButton.setBackground(new java.awt.Color(255, 215, 0));
        findDateButton.setText("Find Available Date");
        findDateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findDateButtonMouseClicked(evt);
            }
        });
        jPanel3.add(findDateButton);

        cancelButton.setBackground(new java.awt.Color(255, 215, 0));
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        jPanel3.add(cancelButton);

        jPanel1.setBackground(new java.awt.Color(130, 206, 250));

        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Groups...", "testGroup" }));
        groupComboBox.setPreferredSize(new java.awt.Dimension(200, 26));
        jPanel1.add(groupComboBox);

        availableDateFields.setBackground(new java.awt.Color(130, 206, 250));

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout availableDateFieldsLayout = new javax.swing.GroupLayout(availableDateFields);
        availableDateFields.setLayout(availableDateFieldsLayout);
        availableDateFieldsLayout.setHorizontalGroup(
            availableDateFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(availableDateFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(availableDateFieldsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        availableDateFieldsLayout.setVerticalGroup(
            availableDateFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
            .addGroup(availableDateFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(availableDateFieldsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(availableDateFields, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endDatePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startDatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startDatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endDatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(availableDateFields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        frame.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void findDateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findDateButtonMouseClicked
        File file = new File("src/existing_groups/"+groupComboBox.getItemAt(groupComboBox.getSelectedIndex())+".grps");
        try {
            Scanner scanner = new Scanner(file);
            String nextLine = scanner.nextLine();
            String[] names = nextLine.split(",");
            
            long diff =  endDate.getDate().getTime() - beginDate.getDate().getTime();
            
            for(int i = 0; i < (diff / (1000*60*60*24))+1; i++){
                if(allUsersAvailable(names, beginDate.getDate(), i)){
                    String[] toAdd = new String[this.jList1.getModel().getSize()+1];
                    for(int j = 0; j < toAdd.length-1; j++){
                        toAdd[j] = this.jList1.getModel().getElementAt(j);
                    }
                    toAdd[toAdd.length-1] = getDate(beginDate.getDate(), i);
                    this.jList1.setListData(toAdd);
                    this.repaint();
                }
            }
 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Smart_Scheduling_Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_findDateButtonMouseClicked
    
    private String getDate(Date startDate, int toAdd){
        Calendar c = Calendar.getInstance();
        c.setTime(startDate);
        c.add(Calendar.DAY_OF_MONTH, toAdd);
        
        return String.valueOf(c.get(Calendar.MONTH)+1)+"/"+String.valueOf(c.get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(c.get(Calendar.YEAR));
    }
    
    private boolean allUsersAvailable(String[] names, Date startDate, int daysAfterStart){
        if(daysAfterStart == 0){
            Calendar c = Calendar.getInstance();
            c.setTime(startDate);
            String month = String.valueOf(c.get(Calendar.MONTH)+1);
            String dayOfMonth = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
            String year = String.valueOf(c.get(Calendar.YEAR)); 
            
            for(int i = 0; i < names.length; i++){
                if(new File("src\\userSchedules\\"+names[i]+"_"+month+"_"+dayOfMonth+"_"+year+".txt").exists()){
                    return false;
                }
            }
            return true;
        }
        else{
            Calendar c = Calendar.getInstance();
            c.setTime(startDate);
            String month = String.valueOf(c.get(Calendar.MONTH)+1);
            String dayOfMonth = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
            String year = String.valueOf(c.get(Calendar.YEAR));
            
            c.add(Calendar.DAY_OF_MONTH, daysAfterStart);
            
            month = String.valueOf(c.get(Calendar.MONTH)+1);
            dayOfMonth = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
            year = String.valueOf(c.get(Calendar.YEAR));
            
            for(int i = 0; i < names.length; i++){
                if(new File("src\\userSchedules\\"+names[i]+"_"+month+"_"+dayOfMonth+"_"+year+".txt").exists()){
                    return false;
                }
            }
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel availableDateFields;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel endDatePanel;
    private javax.swing.JButton findDateButton;
    private javax.swing.JComboBox<String> groupComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel startDatePanel;
    // End of variables declaration//GEN-END:variables
}

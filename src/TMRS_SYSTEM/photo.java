/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TMRS_SYSTEM;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import static javax.swing.DropMode.INSERT;


/**
 *
 * @author Buddika
 */
public class photo extends javax.swing.JFrame {
    
     DBConnector db = new DBConnector();
    Connection conn = db.getConnection();

    /**
     * Creates new form photo
     */
    public photo() {
        
        super("insert image to database in java");
        
      /* jButton1 = new JButton("ADD");
       jButton1.setBounds(200,300,100,40);
       
       jButton2 = new JButton("Browse");
       jButton2.setBounds(200,300,100,40);
       
       jTextField1 = new JTextField("ID");
       jTextField1.setBounds(320, 290, 100, 20);
       
       jTextField2 = new JTextField("Name");
       jTextField2.setBounds(320, 290, 100, 20);
       
       jTextArea1 = new JTextArea("DESCRIPTION",100,100);*/
      // jScrollPane pane = new JScrollPane(jTextArea1);
       
       
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField3.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField3InputMethodTextChanged(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField3PropertyChange(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        jTextField3.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTextField3VetoableChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField3PropertyChange
        // TODO add your handling code here:
         
        
        
        
        
        
    }//GEN-LAST:event_jTextField3PropertyChange

    private void jTextField3VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTextField3VetoableChange
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jTextField3VetoableChange

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
         try {
                
                
                String EmployeeID = jTextField3.getText();  
                
                if(EmployeeID.length()==3){
                
                DateFormat df = new SimpleDateFormat("HH:mm");
                DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
                
                //System.out.println(df.format(calobj.getTime()));
                Calendar calobj1 = Calendar.getInstance();
                Calendar calobj2 = Calendar.getInstance();
                Calendar calobj3 = Calendar.getInstance();
                
                //System.out.println(df2.format(calobj2.getTime()));
                String date = df2.format(calobj2.getTime());
                String time1 = df.format(calobj1.getTime()); 
                String time2 = df.format(calobj3.getTime());
                
                //System.out.println(date);
                //System.out.println(time1);
                //System.out.println(time2);
                
                Statement st=conn.createStatement();
                st.executeUpdate("insert into employee_working (EmployeeID,  ArrivalTime , Date  ) values('"+EmployeeID+"' , '" + time1 + "','" + date + "') ");
           
               
                
                
                
                }
                
                
                
                
                
                
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, " faild to add!", "Message", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField3InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField3InputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField3InputMethodTextChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(photo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(photo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(photo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(photo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new photo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

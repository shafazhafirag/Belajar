/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;



/**
 *
 * @author SHAFA
 */
public class pkr extends javax.swing.JFrame {
    String Mtr;    
    String Mbl; 
    /**
     * Creates new form pkr
     */
    
    public pkr() {
        initComponents();
        dt();
        Jam();
    }
  
        public void dt(){
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("E, kk MMM yyyy");
          String dd = sdf.format(d);
          jWaktu.setText(dd);
        }
        public void Jam(){
         Timer  t = new Timer(0, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Date dt  =new Date();
        SimpleDateFormat st = new SimpleDateFormat("kk:mm:ss");
        
        String tt = st.format(dt);
        time.setText(tt);
        
        }
    });
  
    t.start();
}
  public void tombol(){
       int count = 0;
       
  }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mobil2 = new javax.swing.JButton();
        motor2 = new javax.swing.JButton();
        jWaktu = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        platno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        mobil1 = new javax.swing.JButton();
        motor1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mobil2.setText("Mobil LT2");
        mobil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobil2ActionPerformed(evt);
            }
        });

        motor2.setText("MotorLT2");
        motor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motor2ActionPerformed(evt);
            }
        });

        jWaktu.setText("mm-dd-yyyy");
        jWaktu.setToolTipText("");

        time.setText("00:00:00");

        jLabel1.setText("Masukkan Plat Nomor Kenadaraan");

        mobil1.setText("Mobil LT1");
        mobil1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mobil1MousePressed(evt);
            }
        });
        mobil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobil1ActionPerformed(evt);
            }
        });

        motor1.setText("Motor LT1");
        motor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motor1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(motor1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(mobil1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(motor2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobil2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(platno, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(time))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(time)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(platno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobil2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobil1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motor2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(motor1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     int clicked,clic,clickee,clicc;
     
    private void mobil1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobil1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobil1MousePressed

    private void mobil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobil1ActionPerformed
        Mbl = platno.getText();
      
        clicked++;
        if (clicked <3){
            karcis mb = new karcis(Mbl);
        mb.setVisible(true);
               
        }else JOptionPane.showMessageDialog(null,"Maaf Parkiran MOBIL Sudah Penuh!!!");
    }//GEN-LAST:event_mobil1ActionPerformed

    private void motor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motor1ActionPerformed
        Mtr = platno.getText();             
        clic++;
        if (clic <3){
            karcisMtr mt = new karcisMtr(Mtr);
        mt.setVisible(true);
               
        }else JOptionPane.showMessageDialog(null,"Maaf Parkiran MOTOR Sudah Penuh!!!");
    }//GEN-LAST:event_motor1ActionPerformed

    private void mobil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobil2ActionPerformed
       Mbl = platno.getText();
      
        clickee++;
        if (clickee <3){
            mobil2 mb = new mobil2(Mbl);
        mb.setVisible(true);
               
        }else JOptionPane.showMessageDialog(null,"Maaf Parkiran MOBIL Sudah Penuh!!!");
    }//GEN-LAST:event_mobil2ActionPerformed

    private void motor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motor2ActionPerformed
        Mtr = platno.getText();             
        clicc++;
        if (clicc <3){
            motor2 mt = new motor2(Mtr);
        mt.setVisible(true);
               
        }else JOptionPane.showMessageDialog(null,"Maaf Parkiran MOTOR Sudah Penuh!!!");
    }//GEN-LAST:event_motor2ActionPerformed

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
            java.util.logging.Logger.getLogger(pkr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pkr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pkr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pkr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pkr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jWaktu;
    private javax.swing.JButton mobil1;
    private javax.swing.JButton mobil2;
    private javax.swing.JButton motor1;
    private javax.swing.JButton motor2;
    private javax.swing.JTextField platno;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}

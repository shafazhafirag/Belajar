/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author SHAFA
 */
public class motor2 extends javax.swing.JFrame {
    String Mtr;
    public Statement st;
    PreparedStatement pst;
    public ResultSet rs;
    Connection con = parkir.login.getConnection();
    /**
     * Creates new form motor2
     */
    public motor2(String Mtr) {
        initComponents();
        this.Mtr = Mtr;
        platmtr.setText(this.Mtr);
        Tampil_Jam();
        sd();
    }
    public void Tampil_Jam(){
       Date datee = new Date();
       SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");       
       waktu.setText(time.format(datee));
       SimpleDateFormat mont = new SimpleDateFormat("dd MMMM yyyy");       
       lday.setText(mont.format(datee));
     
    
    }    
   public void Data(){
       Date today = new Date();
      SimpleDateFormat sdf = 
      new SimpleDateFormat ("hhmmss");
      antri.setText(65+sdf.format(today)+23);
       
       
       
   }
   public void sd(){
       Random rd = new Random();
       int juh = rd.nextInt(6666)+1;
       antri.setText("65"+juh+"23");
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mtr = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lday = new javax.swing.JLabel();
        waktu = new javax.swing.JLabel();
        platmtr = new javax.swing.JLabel();
        antri = new javax.swing.JLabel();
        tbayar = new javax.swing.JLabel();
        ttotal = new javax.swing.JLabel();
        tkrt = new javax.swing.JLabel();
        tklr = new javax.swing.JLabel();
        ok = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mtr.setText("MOTOR LT2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Karcis Parkir");

        jLabel7.setText("Wkatu Masuk");

        jLabel8.setText("Plat Nomor");

        jLabel9.setText("Kendaraan");

        jLabel10.setText("Kode Karcis");

        lday.setText("-- --- ---");

        waktu.setText("00:00:00");

        platmtr.setText("-");

        antri.setText("-");

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tkrt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(waktu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ttotal)
                                    .addComponent(tbayar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mtr)
                                .addGap(0, 40, Short.MAX_VALUE))
                            .addComponent(platmtr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(antri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ok)
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lday)
                                .addGap(97, 97, 97)))))
                .addGap(81, 81, 81)
                .addComponent(tklr)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(waktu)
                            .addComponent(tbayar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(platmtr)
                            .addComponent(ttotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(antri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lday)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(tkrt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(mtr))
                .addGap(38, 38, 38)
                .addComponent(ok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tklr)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        try {
          
               String sql = "INSERT INTO dbkendaraan VALUES ('"+antri.getText()+
                   "','"+mtr.getText()+
                   "','"+platmtr.getText()+
                   "','"+lday.getText()+  
                   "','"+waktu.getText()+
                       "','"+tklr.getText()+
                       "','"+ttotal.getText()+
                        "','"+tbayar.getText()+
                        "','"+tkrt.getText()+"')";
            java.sql.Connection con = (Connection)login.getConnection();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
             
            JOptionPane.showMessageDialog(null, "Data DiSimpan");
           return;
          } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
       
          }dispose();   
    }//GEN-LAST:event_okActionPerformed

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
            java.util.logging.Logger.getLogger(motor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(motor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(motor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(motor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new karcisMtr("").setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antri;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lday;
    private javax.swing.JLabel mtr;
    private javax.swing.JToggleButton ok;
    private javax.swing.JLabel platmtr;
    private javax.swing.JLabel tbayar;
    private javax.swing.JLabel tklr;
    private javax.swing.JLabel tkrt;
    private javax.swing.JLabel ttotal;
    private javax.swing.JLabel waktu;
    // End of variables declaration//GEN-END:variables
}
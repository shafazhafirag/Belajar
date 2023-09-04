/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.table.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.Date;


/**
 *
 * @author SHAFA
 */
public class Admken extends javax.swing.JFrame {
    public Statement st;
    PreparedStatement pst;
    public ResultSet rs;
    Connection con = parkir.login.getConnection();
    /**
     * Creates new form Admken
     */
    public Admken() {
        initComponents();
        Tampil();
        Jam();
        hilang();
    }
    public void Jam(){
         Timer  t = new Timer(0, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        Date dt  =new Date();        
        SimpleDateFormat st = new SimpleDateFormat("kk:mm:ss");
        SimpleDateFormat mont = new SimpleDateFormat("E,dd MMMM yyyy");       
        tday.setText(mont.format(dt));
        String tt = st.format(dt);
        time.setText(tt);
        
        }
    });
  
    t.start();
}
    
   
    
    private void bersih(){
        tkrc.setText("");
        cknd.setSelectedItem("");
        tplat.setText("");       
        tmsk.setText("");
        
    }
    private void Tampil(){
        DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No");
            model.addColumn("Karcis");
            model.addColumn("Kendaraan");
            model.addColumn("Plat"); 
            model.addColumn("Tangal"); 
            model.addColumn("Masuk");
            model.addColumn("Keluar");
            model.addColumn("Total");
            model.addColumn("Metode");
            model.addColumn("Kartu");
        try {            
              int no = 1; 
            String sql = "Select * From dbkendaraan ";
            java.sql.Connection con = (Connection)login.getConnection();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[]{no++,rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            System.out.println("ERROR : " +e.getMessage());
        }
    }
    
    private void caridata(){
        try {
            int no = 1; 
        st = con.createStatement();
        String cr = tcari.getText();
        rs = st.executeQuery("Select * From dbkendaraan Where "
                +ccari.getSelectedItem().toString()+ " LIKE '%"
                +tcari.getText()+"%'");
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Karcis");
            model.addColumn("Kendaraan");
            model.addColumn("Plat");
            model.addColumn("Tanggal");
            model.addColumn("Masuk");            
            model.addColumn("Keluar");
            model.addColumn("Total");
            model.addColumn("Metode");
            model.addColumn("Kartu");
         
            while(rs.next()){
                model.addRow(new Object[]{no++,rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            System.out.println("ERROR : " +e.getMessage());
        }
    }
    private void hilang(){        
        tklr.setVisible(false);
        tbayar.setVisible(false);
        tkrt.setVisible(false);
        ttotal.setVisible(false);
        lday.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lkrc = new javax.swing.JLabel();
        lknd = new javax.swing.JLabel();
        lplat = new javax.swing.JLabel();
        lmsk = new javax.swing.JLabel();
        tkrc = new javax.swing.JTextField();
        tplat = new javax.swing.JTextField();
        tmsk = new javax.swing.JTextField();
        cknd = new javax.swing.JComboBox<>();
        ccari = new javax.swing.JComboBox<>();
        tcari = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        tklr = new javax.swing.JLabel();
        ttotal = new javax.swing.JLabel();
        tbayar = new javax.swing.JLabel();
        tkrt = new javax.swing.JLabel();
        bref = new javax.swing.JButton();
        lday = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        tday = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Karcis", "Kendaraan", "Plat", "Tanggal", "Keluar", "Keluar", "Total", "Metode", "Kartu"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Data Kendaraan");

        lkrc.setText("Karcis");

        lknd.setText("Kendaraan");

        lplat.setText("Plat");

        lmsk.setText("Waktu Masuk");

        cknd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "MOTOR LT1", "MOTOR LT2", "MOBIL LT1", "MOBIL LT2" }));

        ccari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plat", "Kendaraan" }));

        tcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tcariKeyPressed(evt);
            }
        });

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        bref.setText("Refresh");
        bref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brefActionPerformed(evt);
            }
        });

        time.setText("--");

        tday.setText("--");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(tklr)
                .addGap(18, 18, 18)
                .addComponent(ttotal)
                .addGap(18, 18, 18)
                .addComponent(tbayar)
                .addGap(18, 18, 18)
                .addComponent(tkrt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lday, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bref)
                                        .addGap(33, 33, 33)
                                        .addComponent(ccari, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lknd)
                                            .addComponent(lkrc)
                                            .addComponent(lplat)
                                            .addComponent(lmsk))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cknd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tkrc, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                            .addComponent(tplat)
                                            .addComponent(tmsk))
                                        .addGap(80, 80, 80)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(simpan, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                            .addComponent(ubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(batal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))))
                            .addComponent(tday))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time)
                    .addComponent(tday))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tkrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lkrc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lknd)
                    .addComponent(cknd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lplat)
                            .addComponent(tplat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lmsk)
                    .addComponent(tmsk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bref))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tklr)
                        .addComponent(ttotal)
                        .addComponent(tbayar))
                    .addComponent(tkrt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lday, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.rowAtPoint(evt.getPoint());
        
        String krc = jTable1.getValueAt(baris, 1).toString();
        tkrc.setText(krc);
        String knd = jTable1.getValueAt(baris, 2).toString();
        cknd.setSelectedItem(knd);
        String plat = jTable1.getValueAt(baris, 3).toString();
        tplat.setText(plat);
        String day = jTable1.getValueAt(baris, 4).toString();
        lday.setText(day);
        String msk = jTable1.getValueAt(baris, 5).toString();
        tmsk.setText(msk);
        String klr = jTable1.getValueAt(baris, 6).toString();
        tklr.setText(klr);
        String total = jTable1.getValueAt(baris, 7).toString();
        ttotal.setText(total);
        String byr = jTable1.getValueAt(baris, 8).toString();
        tbayar.setText(byr);
        String krt = jTable1.getValueAt(baris, 9).toString();
        tkrt.setText(krt);
    }//GEN-LAST:event_jTable1MouseClicked

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
       bersih();
    }//GEN-LAST:event_batalActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        try {
           String sql = "DELETE FROM dbkendaraan Where Karcis ='"+tkrc.getText()+"'"; 
            java.sql.Connection con = (Connection)login.getConnection();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Dihapus");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }bersih();
            Tampil();
                   
    }//GEN-LAST:event_hapusActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
          try{ 
                st = con.createStatement();                    
                String sql = "INSERT INTO dbkendaraan VALUES ('"+tkrc.getText() +
                        "','"+cknd.getSelectedItem()+
                        "','"+tplat.getText()+
                        "','"+lday.getText()+
                        "','"+tmsk.getText()+
                        "','"+tklr.getText()+
                        "','"+ttotal.getText()+
                        "','"+tbayar.getText()+
                        "','"+tkrt.getText()+"')";
                java.sql.Connection con = (Connection)login.getConnection();
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Disimpan");
                bersih();
                Tampil();
            
                
        
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(this, "tidak Disimpan");
        }
        
                                
    }//GEN-LAST:event_simpanActionPerformed

    private void tcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcariKeyPressed
        caridata();
    }//GEN-LAST:event_tcariKeyPressed

    private void brefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brefActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(0);
        Tampil();
    }//GEN-LAST:event_brefActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
         try {
          
               String sql = "INSERT dbkendaraan set Karcis ='"+tkrc.getText()+
                   "', Kendaraan ='"+cknd.getSelectedItem()+
                   "', Plat ='"+tplat.getText()+
                   "', Tanggal ='"+lday.getText()+
                   "', Masuk ='"+tmsk.getText()+
                   "' ,Keluar ='"+ttotal.getText()+ 
                   "' ,Total ='"+ttotal.getText()+                   
                   "' ,Metode ='"+tbayar.getText()+
                   "' ,Kartu ='"+tkrt.getText()+                   
                   "'On Duplicate Key Update Karcis ='"+tkrc.getText()+
                   "', Kendaraan ='"+cknd.getSelectedItem()+
                   "' ,Plat ='"+tplat.getText()+
                   "', Tanggal ='"+lday.getText()+
                   "' ,Masuk ='"+tmsk.getText()+
                   "' ,Keluar ='"+ttotal.getText()+ 
                   "' ,Total ='"+ttotal.getText()+                   
                   "' ,Metode ='"+tbayar.getText()+
                   "' ,Kartu ='"+tkrt.getText()+"'"; 
            java.sql.Connection con = (Connection)login.getConnection();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
             
            JOptionPane.showMessageDialog(null, "Data Diubah");
           return;
          } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }bersih();
            Tampil();
       
    }//GEN-LAST:event_ubahActionPerformed

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
            java.util.logging.Logger.getLogger(Admken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admken.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admken().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton bref;
    private javax.swing.JComboBox<String> ccari;
    private javax.swing.JComboBox<String> cknd;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lday;
    private javax.swing.JLabel lknd;
    private javax.swing.JLabel lkrc;
    private javax.swing.JLabel lmsk;
    private javax.swing.JLabel lplat;
    private javax.swing.JButton simpan;
    private javax.swing.JLabel tbayar;
    private javax.swing.JTextField tcari;
    private javax.swing.JLabel tday;
    private javax.swing.JLabel time;
    private javax.swing.JLabel tklr;
    private javax.swing.JTextField tkrc;
    private javax.swing.JLabel tkrt;
    private javax.swing.JTextField tmsk;
    private javax.swing.JTextField tplat;
    private javax.swing.JLabel ttotal;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir;
import java.sql.*;
import javax.swing.table.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;

/**
 *
 * @author SHAFA
 */
public class Admin extends javax.swing.JFrame {
    
    /**
     * Creates new form Admin
     */
    public Statement st;
    PreparedStatement pst;
    public ResultSet rs;
    Connection con = parkir.login.getConnection();
    
    public Admin() {
        initComponents();
        Tampil();
    }
    private void bersih(){
        tnip.setText("");
        tnama.setText("");
        tuser.setText("");       
        tpass.setText("");
        cjaba.setSelectedItem("");
    }
    private void Tampil(){
        DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No");
            model.addColumn("NIP");
            model.addColumn("Nama");
            model.addColumn("Username");            
            model.addColumn("Password");
            model.addColumn("Jabatan");
        String cr = tcari.getText();
        try {            
              int no = 1; 
            String sql = "Select * From dbkaryawan ";
            java.sql.Connection con = (Connection)login.getConnection();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                model.addRow(new Object[]{no++,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
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
        rs = st.executeQuery("Select * From dbkaryawan Where "
                +ccari.getSelectedItem().toString()+ " LIKE '%"
                +tcari.getText()+"%'");
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No");
            model.addColumn("NIP");
            model.addColumn("Nama");
            model.addColumn("Username");            
            model.addColumn("Password");
            model.addColumn("Jabatan");
         
            while(rs.next()){
                model.addRow(new Object[]{no++,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            System.out.println("ERROR : " +e.getMessage());
        }
    }
    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lnip = new javax.swing.JLabel();
        lnama = new javax.swing.JLabel();
        luser = new javax.swing.JLabel();
        ljaba = new javax.swing.JLabel();
        lpass = new javax.swing.JLabel();
        tnip = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        tuser = new javax.swing.JTextField();
        tpass = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cjaba = new javax.swing.JComboBox<>();
        tcari = new javax.swing.JTextField();
        batal = new javax.swing.JButton();
        ccari = new javax.swing.JComboBox<>();
        bref = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Data Pegawai");

        lnip.setText("NIP");

        lnama.setText("Nama");

        luser.setText("Usename");

        ljaba.setText("Jabatan");

        lpass.setText("Password");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NIP", "Nama", "Username", "Password", "Jabatan"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Simpan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Hapus");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cjaba.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Admin", "Petugas" }));

        tcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tcariKeyPressed(evt);
            }
        });

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        ccari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cari", "NIP", "Nama" }));

        bref.setText("Refresh");
        bref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lnama)
                                            .addComponent(lnip))
                                        .addGap(47, 47, 47))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(luser)
                                        .addGap(30, 30, 30)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tuser, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(tnip)
                                    .addComponent(tnama)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lpass)
                                    .addComponent(ljaba))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cjaba, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addComponent(batal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bref)
                        .addGap(127, 127, 127)
                        .addComponent(ccari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bref))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnip)
                            .addComponent(tnip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnama)
                            .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(luser)
                            .addComponent(tuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(tpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lpass)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cjaba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ljaba))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(batal)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{ 
        st = con.createStatement();
        if (tnip.getText().equals("") || 
                tnama.getText().equals("") ||
                tuser.getText().equals("") ||
                 tpass.getText().equals("") ||
                cjaba.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Harap Isi Semua Data","Validasi Data",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //simpan
        if (jButton3.getText() == "Simpan"){
            String cek = "SELECT * FROM dbkaryawan WHERE NIP = '"+ tnip.getText()+ "'";
            rs = st.executeQuery(cek);
            if (rs.next()){
                JOptionPane.showMessageDialog(null, "NIP Sudah Ada");
                
            }else{
                String sql = "INSERT INTO dbkaryawan VALUES ('"+tnip.getText() +
                        "','"+tnama.getText()+
                        "','"+tuser.getText()+
                        "','"+tpass.getText()+
                        "','"+cjaba.getSelectedItem()+"')";
                java.sql.Connection con = (Connection)login.getConnection();
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Disimpan");
                bersih();
                Tampil();
            } 
                
        }else{
                    
                    }   
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(this, "tidak Disimpan");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
           String sql = "DELETE FROM dbkaryawan Where nip ='"+tnip.getText()+"'"; 
            java.sql.Connection con = (Connection)login.getConnection();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Dihapus");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }bersih();
            Tampil();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.rowAtPoint(evt.getPoint());
        
        String nip = jTable1.getValueAt(baris, 1).toString();
        tnip.setText(nip);
        String nama = jTable1.getValueAt(baris, 2).toString();
        tnama.setText(nama);
        String user = jTable1.getValueAt(baris, 3).toString();
        tuser.setText(user);
        String pass = jTable1.getValueAt(baris, 4).toString();
        tpass.setText(pass);
        String jaba = jTable1.getValueAt(baris, 5).toString();
        cjaba.setSelectedItem(jaba);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try {
           String sql = "INSERT dbkaryawan set NIP ='"+tnip.getText()+
                   "' ,Nama ='"+tnama.getText()+
                   "' ,Username ='"+tuser.getText()+                   
                   "' ,Password ='"+tpass.getText()+
                   "' ,Options ='"+cjaba.getSelectedItem()+
                   "'On Duplicate Key Update NIP ='"+tnip.getText()+
                   "' ,Nama ='"+tnama.getText()+
                   "' ,Username ='"+tuser.getText()+                   
                   "' ,Password ='"+tpass.getText()+
                   "' ,Options ='"+cjaba.getSelectedItem()+"'"; 
            java.sql.Connection con = (Connection)login.getConnection();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Diubah");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }bersih();
            Tampil();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcariKeyPressed
        caridata();
    }//GEN-LAST:event_tcariKeyPressed

    private void brefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brefActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(0);
        Tampil();
    }//GEN-LAST:event_brefActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        bersih();
    }//GEN-LAST:event_batalActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton bref;
    private javax.swing.JComboBox<String> ccari;
    private javax.swing.JComboBox<String> cjaba;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel ljaba;
    private javax.swing.JLabel lnama;
    private javax.swing.JLabel lnip;
    private javax.swing.JLabel lpass;
    private javax.swing.JLabel luser;
    private javax.swing.JTextField tcari;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnip;
    private javax.swing.JTextField tpass;
    private javax.swing.JTextField tuser;
    // End of variables declaration//GEN-END:variables
}
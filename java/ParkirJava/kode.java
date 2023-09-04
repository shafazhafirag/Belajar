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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author SHAFA
 */
public class kode extends javax.swing.JFrame {

    /**
     * Creates new form kode
     */
    public Statement st;
    PreparedStatement pst;
    public ResultSet rs;
    Connection con = parkir.login.getConnection();
    
    public kode(String Uname) {
        initComponents();
        Tampil();
        Jam();
        hilang();
    }
   
    private void bersih(){
        tmsk.setText("");
        tklr.setText("");
        cbayar.setSelectedItem("");
        tkrt.setText("");       
        ttotal.setText("");
        
    }
    private void Tampil(){
        DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No");
            model.addColumn("Karcis");
            model.addColumn("Kendaraan");
            model.addColumn("Plat"); 
            model.addColumn("Tanggal"); 
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
            model.addColumn("Tanggal");
            model.addColumn("Plat");
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
    private int Kendaraan(int pilKend){
        int tarif = 0;
        switch(cknd.getSelectedIndex()){
            case 0:
            tarif = 6000;
            break;
            case 1:
            tarif = 4000;
            break;
            case 2:
            tarif = 3000;
            break;
            case 3:
            tarif = 2000;
            break;
            }
                return tarif;
        
    }
    private int lamaPark() throws ParseException{
        int lama=0;
        SimpleDateFormat pola = new SimpleDateFormat("HH:mm:ss");
        try {
            Date mulai = pola.parse(tmsk.getText());
            Date selesai = pola.parse(tklr.getText());
            long selisih = Math.abs(selesai.getTime() - mulai.getTime());
            
            lama = (int) (selisih / (60*60*1000)%24);
            
        } catch (ParseException ex) {
        }return lama;
    }
    private int tarifkend(int pilKend) throws ParseException{
        int tarif = Kendaraan(pilKend);
        int tariftambah = 0;
        int durasi = 0;
        durasi = lamaPark();
        if(durasi>1){
            
            tariftambah = (int)((durasi-1) * (tarif*0.5));
            tarif = tarif + tariftambah;
        }
        return tarif;
    }
     private void hilang(){        
        lkrc.setVisible(false);
        lplat.setVisible(false);
        lday.setVisible(false);
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
        ttime.setText(tt);
        
        }
    });
  
    t.start();
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
        tmsk = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tklr = new javax.swing.JTextField();
        btotal = new javax.swing.JButton();
        petugas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbayar = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ttotal = new javax.swing.JTextField();
        tkrt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bsimpan = new javax.swing.JButton();
        ccari = new javax.swing.JComboBox<>();
        tcari = new javax.swing.JTextField();
        bref = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        lkrc = new javax.swing.JLabel();
        lplat = new javax.swing.JLabel();
        cknd = new javax.swing.JComboBox<>();
        lday = new javax.swing.JLabel();
        tday = new javax.swing.JLabel();
        ttime = new javax.swing.JLabel();
        sjam = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Jam Masuk");

        jLabel2.setText("Jam Keluar");

        btotal.setText("Total");
        btotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btotalActionPerformed(evt);
            }
        });

        petugas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        petugas.setText("Data Kendaraan Parkir");

        jLabel4.setText("Metode Pembayaran");

        cbayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Tunai", "Kartu" }));

        jLabel5.setText("Nomor Kartu");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                " Karcis", " Kendaraan", "Nomor", "Tanggal", "Masuk", "Keluar", "Total", "Metode", "Kartu"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        ccari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plat", "Karcis" }));

        tcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tcariKeyPressed(evt);
            }
        });

        bref.setText("Refresh");
        bref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brefActionPerformed(evt);
            }
        });

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        cknd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "MOTOR LT1", "MOTOR LT2", "MOBIL LT1", "MOBIL LT2", " " }));

        tday.setText("--");

        ttime.setText("--:--:--");

        sjam.setText("Keluar Parkir");
        sjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sjamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tmsk, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(tklr)
                                    .addComponent(cbayar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tkrt))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(cknd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(batal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(70, 70, 70)
                                        .addComponent(bref)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ccari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btotal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tday)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(312, 312, 312)
                                        .addComponent(lday)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(ttime)
                                        .addGap(142, 142, 142))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(sjam)
                                        .addGap(131, 131, 131))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(lplat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(lkrc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(tday)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tmsk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tklr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ttime)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(lday)
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(sjam)))
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(bsimpan)
                            .addComponent(cknd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tkrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(tcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ccari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bref)
                            .addComponent(batal))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lplat, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lkrc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
      try {
          
               String sql = "INSERT dbkendaraan set Karcis ='"+lkrc.getText()+
                   "',Kendaraan ='"+cknd.getSelectedItem()+
                   "',Plat ='"+lplat.getText()+
                   "',Tanggal ='"+lday.getText()+
                   "',Masuk ='"+tmsk.getText()+
                   "' ,Keluar ='"+tklr.getText()+ 
                   "' ,Total ='"+ttotal.getText()+                   
                   "' ,Metode ='"+cbayar.getSelectedItem()+
                   "' ,Kartu ='"+tkrt.getText()+                   
                   "'On Duplicate Key Update Karcis ='"+lkrc.getText()+
                   "',Kendaraan ='"+cknd.getSelectedItem()+
                   "',Plat ='"+lplat.getText()+
                       "',Tanggal ='"+lday.getText()+
                   "',Masuk ='"+tmsk.getText()+
                   "' ,Keluar ='"+tklr.getText()+ 
                   "' ,Total ='"+ttotal.getText()+                   
                   "' ,Metode ='"+cbayar.getSelectedItem()+
                   "' ,Kartu ='"+tkrt.getText()+     "'"; 
            java.sql.Connection con = (Connection)login.getConnection();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
             
            JOptionPane.showMessageDialog(null, "Data DiSimpan");
           return;
          } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }bersih();
            Tampil();
    }//GEN-LAST:event_bsimpanActionPerformed

    private void btotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btotalActionPerformed
       int pilKend = cknd.getSelectedIndex();
       int tarif = 0;
        try {
            tarif = tarifkend(tarif);
            ttotal.setText(""+tarif);
        } catch (ParseException ex) {
        }
    }//GEN-LAST:event_btotalActionPerformed

    private void tcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcariKeyPressed
    caridata();
    }//GEN-LAST:event_tcariKeyPressed

    private void brefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brefActionPerformed
       DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(0);
        Tampil();
    }//GEN-LAST:event_brefActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.rowAtPoint(evt.getPoint());
        
        String krc = jTable1.getValueAt(baris, 1).toString();
        lkrc.setText(krc);
        String knd = jTable1.getValueAt(baris, 2).toString();
        cknd.setSelectedItem(knd);
        String plat = jTable1.getValueAt(baris, 3).toString();
        lplat.setText(plat);
        String day = jTable1.getValueAt(baris, 4).toString();
        lday.setText(day);
        String msk = jTable1.getValueAt(baris, 5).toString();
        tmsk.setText(msk);
        String klr = jTable1.getValueAt(baris, 6).toString();
        tklr.setText(klr);
        String total = jTable1.getValueAt(baris, 7).toString();
        ttotal.setText(total);
        String byr = jTable1.getValueAt(baris, 8).toString();
        cbayar.setSelectedItem(byr);
        String krt = jTable1.getValueAt(baris, 9).toString();
        tkrt.setText(krt);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        bersih();
    }//GEN-LAST:event_batalActionPerformed

    private void sjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sjamActionPerformed
        Date datee = new Date();
       SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");       
       tklr.setText(time.format(datee));
       
    }//GEN-LAST:event_sjamActionPerformed

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
            java.util.logging.Logger.getLogger(kode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton bref;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton btotal;
    private javax.swing.JComboBox<String> cbayar;
    private javax.swing.JComboBox<String> ccari;
    private javax.swing.JComboBox<String> cknd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lday;
    private javax.swing.JLabel lkrc;
    private javax.swing.JLabel lplat;
    private javax.swing.JLabel petugas;
    private javax.swing.JButton sjam;
    private javax.swing.JTextField tcari;
    private javax.swing.JLabel tday;
    private javax.swing.JTextField tklr;
    private javax.swing.JTextField tkrt;
    private javax.swing.JTextField tmsk;
    private javax.swing.JLabel ttime;
    private javax.swing.JTextField ttotal;
    // End of variables declaration//GEN-END:variables
}

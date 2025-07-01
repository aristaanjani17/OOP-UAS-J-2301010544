package Tiket_Bioskop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Tiket_Bioskop.FormatHarga;
/**
 *
 * @author Asus
 */
public class Tiket_Bioskop extends javax.swing.JFrame {

    /**
     * Creates new form UAS
     */
    public Tiket_Bioskop() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblJenis = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtkode_tiket = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        txttahun = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelProduk = new javax.swing.JTable();
        txtGenre = new javax.swing.JComboBox<>();
        btnTambah = new javax.swing.JButton();
        lblMerek = new javax.swing.JLabel();
        txtSutradara = new javax.swing.JTextField();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("DATA TIKET BIOSKOP");
        jLabel1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Kode Tiket");

        jLabel3.setText("Judul Film");

        lblJenis.setText("Genre");

        jLabel6.setText("Tahun Rilis");

        jLabel7.setText("Harga");

        txtkode_tiket.setEditable(false);
        txtkode_tiket.setBackground(new java.awt.Color(255, 255, 255));
        txtkode_tiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkode_tiketActionPerformed(evt);
            }
        });

        txttahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttahunActionPerformed(evt);
            }
        });

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        tabelProduk.setBackground(new java.awt.Color(0, 102, 153));
        tabelProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelProduk);

        txtGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Romance", "Comedy", "Drama", "Horror", "Action", "Fantasy", "Thriller", "Western" }));
        txtGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenreActionPerformed(evt);
            }
        });

        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 0, 0));
        btnTambah.setText("Tambah");
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
        });
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        lblMerek.setText("Sutradara");

        txtSutradara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSutradaraActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(255, 0, 51));
        btnUbah.setText("Ubah");
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahMouseClicked(evt);
            }
        });
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 0, 0));
        btnHapus.setText("Hapus");
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSutradara, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txttahun, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(109, 109, 109))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUbah)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTambah)
                                        .addGap(106, 106, 106)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtkode_tiket, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnHapus)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtkode_tiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJenis)
                    .addComponent(jLabel7)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMerek)
                    .addComponent(txtSutradara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUbah)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttahunActionPerformed

    private void txtkode_tiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkode_tiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkode_tiketActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void tabelProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelProdukMouseClicked
int baris = tabelProduk.rowAtPoint(evt.getPoint());
txtkode_tiket.setText(tabelProduk.getValueAt(baris, 0).toString());
txtJudul.setText(tabelProduk.getValueAt(baris, 1).toString());
txtGenre.setSelectedItem(tabelProduk.getValueAt(baris, 2).toString());
txtSutradara.setText(tabelProduk.getValueAt(baris, 3).toString());
txttahun.setText(tabelProduk.getValueAt(baris, 4).toString());
txtHarga.setText(tabelProduk.getValueAt(baris, 5).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelProdukMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tampilData();
        txtkode_tiket.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void txtGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenreActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
    Connection con = koneksi.getConnection();
    String sql = "INSERT INTO tb_tiket_bioskop (judul_film, genre, sutradara, tahun_rilis, harga) VALUES (?, ?, ?, ?)";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, txtJudul.getText());
    pst.setString(2, txtGenre.getSelectedItem().toString());
    pst.setString(3, txtSutradara.getText());
    pst.setString(4, txttahun.getText());
    pst.setDouble(5, Double.parseDouble(txtHarga.getText()));
    pst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
    tampilData();
    resetForm();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e.getMessage());
}
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahMouseClicked

    private void txtSutradaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSutradaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSutradaraActionPerformed

    private void btnUbahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try {
    Connection con = koneksi.getConnection();
    String sql = "UPDATE tb_tiket_bioskop SET kode_tiket=?, judul_film=?, genre=?, sutradara=?, tahun_rilis=?, harga=? WHERE kode_tiket=?";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, txtJudul.getText());
    pst.setString(2, txtGenre.getSelectedItem().toString());
    pst.setString(3, txtSutradara.getText());
    pst.setString(4, txttahun.getText());
    pst.setDouble(5, Double.parseDouble(txtHarga.getText()));
    pst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
    tampilData();
    resetForm();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e.getMessage());
}
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
    Connection con = koneksi.getConnection();
    String sql = "DELETE FROM tb_tiket_bioskop WHERE kode_tiket=?";
    PreparedStatement pst = con.prepareStatement(sql);
    pst.setString(1, txtkode_tiket.getText());
    pst.executeUpdate();
    JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
    tampilData();
    resetForm();
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e.getMessage());
}
    }//GEN-LAST:event_btnHapusActionPerformed

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
                java.util.logging.Logger.getLogger(Tiket_Bioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Tiket_Bioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Tiket_Bioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Tiket_Bioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Tiket_Bioskop().setVisible(true);
                }
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JLabel lblMerek;
    private javax.swing.JTable tabelProduk;
    private javax.swing.JComboBox<String> txtGenre;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtSutradara;
    private javax.swing.JTextField txtkode_tiket;
    private javax.swing.JTextField txttahun;
    // End of variables declaration//GEN-END:variables
private void tampilData() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("kode_tiket");
    model.addColumn("judul_film");
    model.addColumn("genre");
    model.addColumn("sutradara");
    model.addColumn("tahun_rilis");
    model.addColumn("harga");

    try {
        Connection con = koneksi.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM tb_tiket_bioskop");
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("kode_tiket"),
                rs.getString("judul_film"),
                rs.getString("genre"),
                rs.getString("sutradara"),
                rs.getDate("tahun_rilis"),
                FormatHarga.formatRupiah(rs.getDouble("harga"))
            });
        }
//        FormatHarga.formatRupiah(rs.getDouble("harga"));
        tabelProduk.setModel(model);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal menampilkan data: " + e.getMessage());
    }
}

private void resetForm() {
    txtkode_tiket.setText("");
    txtJudul.setText("");
    txtGenre.setSelectedIndex(0);
    txtSutradara.setText("");
    txttahun.setText("");
    txtHarga.setText("");
}
}
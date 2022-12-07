package main;

import data.Sepeda;
import data.SepedaGowes;
import data.SepedaListrik;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    private final DefaultTableModel modelSepedaGowes;
    private final DefaultTableModel modelSepedaListrik;
    private final DefaultTableModel modelTransaksi;
    private final TableColumnModel kolomSepedaGowes;
    private final TableColumnModel kolomSepedaListrik;
    private final TableColumnModel kolomTransaksi;
    // variabel untuk melakukan query ke database
    private PreparedStatement pst;
    private ResultSet result;
    private Statement stm;
    private final KoneksiToDatabase koneksi = new KoneksiToDatabase();

    public MainFrame() {
        initComponents();
        // mengubah icon pada frame
        setIconImage(new ImageIcon("src/image/sepeda.png").getImage());
        // Berfungsi agar dapat memanipulasi data pada tabel - tabelnya
        modelSepedaGowes = (DefaultTableModel) tabel_gowes.getModel();
        modelSepedaListrik = (DefaultTableModel) tabel_listrik.getModel();
        modelTransaksi = (DefaultTableModel) tabel_transaksi.getModel();
        // Mengatur ukuran dari tiap kolom
        // Sepeda gowes
        kolomSepedaGowes = tabel_gowes.getColumnModel();
        kolomSepedaGowes.getColumn(0).setPreferredWidth(20); // kolom no
        kolomSepedaGowes.getColumn(1).setPreferredWidth(20); // kolom kode
        kolomSepedaGowes.getColumn(2).setPreferredWidth(150); // kolom kode
        kolomSepedaGowes.getColumn(5).setPreferredWidth(20); // kolom kode
        // Sepeda Listrik
        kolomSepedaListrik = tabel_listrik.getColumnModel();
        kolomSepedaListrik.getColumn(0).setPreferredWidth(20); // kolom no
        kolomSepedaListrik.getColumn(1).setPreferredWidth(20); // kolom kode
        kolomSepedaListrik.getColumn(2).setPreferredWidth(150); // kolom kode
        kolomSepedaListrik.getColumn(5).setPreferredWidth(20); // kolom kode
        // Transaksi
        kolomTransaksi = tabel_transaksi.getColumnModel();
        kolomTransaksi.getColumn(0).setPreferredWidth(20); // kolom no
        kolomTransaksi.getColumn(1).setPreferredWidth(20); // kolom id
        kolomTransaksi.getColumn(2).setPreferredWidth(150); // kolom kode
        // Mengambil data dari dalam database
        getDataSepedaGowes();
        getDataSepedaListrik();
        getDataTransaksi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_listrik = new javax.swing.JTable();
        panel_utama = new javax.swing.JPanel();
        panel_tab = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_gowes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_transaksi = new javax.swing.JTable();
        btn_tambah = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_pembelian = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tabel_listrik.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode", "Tipe", "Merk", "Harga", "Stok", "Kecepatan", "Baterai"
            }
        ));
        jScrollPane2.setViewportView(tabel_listrik);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Toko Sepeda");

        panel_utama.setBackground(new java.awt.Color(112, 111, 211));

        panel_tab.setBackground(new java.awt.Color(209, 204, 192));
        panel_tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_tabMouseClicked(evt);
            }
        });

        tabel_gowes.setBackground(new java.awt.Color(209, 204, 192));
        tabel_gowes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode", "Tipe", "Merk", "Harga", "Stok", "Bahan", "Ban"
            }
        ));
        tabel_gowes.setShowGrid(false);
        jScrollPane1.setViewportView(tabel_gowes);

        panel_tab.addTab("Sepeda Gowes", jScrollPane1);

        tabel_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Id", "Nama", "Jumlah", "Total", "Pembayaran", "Kembalian", "Tanggal", "Kategori", "Kode Sepeda"
            }
        ));
        jScrollPane3.setViewportView(tabel_transaksi);

        panel_tab.addTab("Riwayat Pembelian", jScrollPane3);

        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tambah.setText("Tambah Sepeda");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_ubah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ubah.setText("Ubah Sepeda");
        btn_ubah.setToolTipText("");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_hapus.setText("Hapus Sepeda");
        btn_hapus.setToolTipText("");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_pembelian.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pembelian.setText("Transaksi");
        btn_pembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pembelianActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(0, 0, 0));
        btn_exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(255, 121, 63));
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sepeda.png"))); // NOI18N

        javax.swing.GroupLayout panel_utamaLayout = new javax.swing.GroupLayout(panel_utama);
        panel_utama.setLayout(panel_utamaLayout);
        panel_utamaLayout.setHorizontalGroup(
            panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_utamaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_utamaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_utamaLayout.createSequentialGroup()
                        .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_tambah)
                                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)))
                .addComponent(panel_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panel_utamaLayout.setVerticalGroup(
            panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_utamaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(panel_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_utamaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btn_exit)
                .addGap(23, 23, 23))
        );

        panel_tab.getAccessibleContext().setAccessibleName("panel_tab");
        panel_tab.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panel_tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_tabMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panel_tabMouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        TambahFrame tambah = new TambahFrame();
        tambah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        // untuk mengubah data, kita wajib memilih data yang ingin diubah terlebih dahulu 
        switch (panel_tab.getSelectedIndex()) {
            // jika tab sepeda gowes yang dibuka
            case 0 -> {
                if (tabel_gowes.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(panel_utama, "Silahkan pilih data yang ingin diubah terlebih dahulu");
                } else {
                    String kode = modelSepedaGowes.getValueAt(tabel_gowes.getSelectedRow(),1).toString();
                    UbahFrame ubah = new UbahFrame(kode ,"Gowes");
                    ubah.setVisible(true);
                    this.dispose();
                }
                break;
            }
            // jika tab sepeda listrik yang dibuka
            case 1 -> {
                if (tabel_listrik.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(panel_utama, "Silahkan pilih data yang ingin diubah terlebih dahulu");
                } else {
                    String kode = modelSepedaListrik.getValueAt(tabel_listrik.getSelectedRow(), 1).toString();
                    UbahFrame ubah = new UbahFrame(kode,"Listrik");
                    ubah.setVisible(true);
                    this.dispose();
                }
                break;
            }
            default ->
                JOptionPane.showMessageDialog(panel_utama, "Silahkan buka tab sepeda yang ingin diubah");
        }
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        try {
            // untuk menghapus data, kita wajib memilih data yang ingin dihapus terlebih dahulu
            // Membuat query update
            String sql = "DELETE FROM sepeda_listrik WHERE kode = %s"; 
            
            sql = "DELETE FROM sepeda_gowes WHERE kode = %s";
            Connection cn = koneksi.getKoneksi();
            switch (panel_tab.getSelectedIndex()) {
                // jika tab sepeda gowes yang dibuka
                case 0 -> {
                    if (tabel_gowes.getSelectedRow() == -1) {
                        JOptionPane.showMessageDialog(panel_utama, "Silahkan pilih data yang ingin dihapus terlebih dahulu");
                    } else {
                        // string format : memasukan data ke dalam string
                        // %s : untuk data bertipe string
                        // mengambil kode sepeda dari baris data yang sudah dipilih (kode berada di kolom index 1)
                        sql = String.format(sql, modelSepedaGowes.getValueAt(tabel_gowes.getSelectedRow(), 1).toString());
                        pst = cn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(panel_utama, "Hapus data berhasil");
                        pst.close(); // menutup statement yang sudah dijalankan
                    }
                    break;
                }
                // jika tab sepeda listrik yang dibuka
                case 1 -> {
                    if (tabel_listrik.getSelectedRow() == -1) {
                        JOptionPane.showMessageDialog(panel_utama, "Silahkan pilih data yang ingin dihapus terlebih dahulu");
                    } else {
                        // string format : memasukan data ke dalam string
                        // %s : untuk data bertipe string
                        // mengambil kode sepeda dari baris data yang sudah dipilih (kode berada di kolom index 1)
                        sql = String.format(sql, modelSepedaListrik.getValueAt(tabel_listrik.getSelectedRow(), 1).toString());
                        pst = cn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(panel_utama, "Hapus data berhasil");
                        pst.close(); // menutup statement yang sudah dijalankan
                    }
                    break;
                }
                // jika tab sepeda listrik yang dibuka
                case 2 -> {
                    if (tabel_transaksi.getSelectedRow() == -1) {
                        JOptionPane.showMessageDialog(panel_utama, "Silahkan pilih data yang ingin dihapus terlebih dahulu");
                    } else {
                        // mengubah querynya ke tabel transaksi
                        sql = "DELETE FROM transaksi WHERE id = %s";
                        // string format : memasukan data ke dalam string
                        // %s : untuk data bertipe string
                        // mengambil kode sepeda dari baris data yang sudah dipilih (kode berada di kolom index 1)
                        sql = String.format(sql, modelTransaksi.getValueAt(tabel_transaksi.getSelectedRow(), 1).toString());
                        pst = cn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(panel_utama, "Hapus data berhasil");
                        pst.close(); // menutup statement yang sudah dijalankan
                    }
                    break;
                }
            }
            // Mengambil ulang data dari dalam database
            getDataSepedaGowes();
            getDataSepedaListrik();
            getDataTransaksi();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(panel_utama, "Gagal menghapus data : " + ex);
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_pembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pembelianActionPerformed
        // untuk membeli data, kita wajib memilih data yang ingin dibeli terlebih dahulu 
        switch (panel_tab.getSelectedIndex()) {
            // jika tab sepeda gowes yang dibuka
            case 0 : {
                if (tabel_gowes.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(panel_utama, "Silahkan pilih data yang ingin dibeli terlebih dahulu");
                } else {
                    Pembelian beli = new Pembelian(modelSepedaGowes.getValueAt(tabel_gowes.getSelectedRow(), 1).toString(),"Gowes");
                    beli.setVisible(true);
                    this.dispose();
                }
                break;
            }
            // jika tab sepeda listrik yang dibuka
            case 1 : {
                if (tabel_listrik.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(panel_utama, "Silahkan pilih data yang ingin dibeli terlebih dahulu");
                } else {
                    Pembelian beli = new Pembelian(modelSepedaListrik.getValueAt(tabel_listrik.getSelectedRow(), 1).toString(),"Listrik");
                    beli.setVisible(true);
                    this.dispose();
                }
                break;
            }
            default :
                JOptionPane.showMessageDialog(panel_utama, "Silahkan buka tab sepeda yang ingin dibeli");
        }
    }//GEN-LAST:event_btn_pembelianActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_pembelian;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane panel_tab;
    private javax.swing.JPanel panel_utama;
    private javax.swing.JTable tabel_gowes;
    private javax.swing.JTable tabel_listrik;
    private javax.swing.JTable tabel_transaksi;
    // End of variables declaration//GEN-END:variables

    // Mengambil data sepeda gowes dari database
    private void getDataSepedaGowes() {
        try {
            // membersihkan data yang ada ditabel
            modelSepedaGowes.setRowCount(0);
            Connection cn = koneksi.getKoneksi();
            stm = cn.createStatement();
            result = stm.executeQuery("SELECT * FROM sepeda_gowes");
            int i = 1;
            while (result.next()) {
                // memasukan data ke jtable
                modelSepedaGowes.addRow(new Object[]{i, 
                    result.getString("kode"), 
                    result.getString("tipe"),
                    result.getString("merk"), 
                    result.getDouble("harga"),
                    result.getInt("stok"), 
                    result.getString("jenis"),
                    result.getString("ban")});
                i++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(panel_utama, "Error : " + ex);
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                result.close();
                stm.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(panel_utama, "Error set data : " + ex);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Mengambil data sepeda gowes dari database
    private void getDataSepedaListrik() {
        try {
            // membersihkan data yang ada ditabel
            modelSepedaListrik.setRowCount(0);
            Connection cn = koneksi.getKoneksi();
            stm = cn.createStatement();
            result = stm.executeQuery("SELECT * FROM sepeda_listrik");
            int i = 1;
            while (result.next()) {
                modelSepedaListrik.addRow(new Object[]{i, 
                    result.getString("kode"), 
                    result.getString("tipe"),
                    result.getString("merk"), 
                    result.getDouble("harga"),
                    result.getInt("stok"), 
                    result.getString("kecepatan"),
                    result.getString("baterai")});
                i++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(panel_utama, "Error : " + ex);
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                result.close();
                stm.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(panel_utama, "Error set data : " + ex);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Mengambil data sepeda gowes dari database
    private void getDataTransaksi() {
        try {
            // membersihkan data yang ada ditabel
            modelTransaksi.setRowCount(0);
            Connection cn = koneksi.getKoneksi();
            stm = cn.createStatement();
            result = stm.executeQuery("SELECT * FROM transaksi");
            int i = 1;
            while (result.next()) {
                modelTransaksi.addRow(new Object[]{i, 
                    result.getString("id"),
                    result.getString("nama"),
                    result.getInt("jumlah"),
                    result.getDouble("total"),
                    result.getDouble("pembayaran"),
                    result.getDouble("kembalian"),
                    result.getDate("tanggal"),
                    result.getString("kategori"),
                    result.getString("kode")});
                i++;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(panel_utama, "Error : " + ex);
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                result.close();
                stm.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(panel_utama, "Error set data : " + ex);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

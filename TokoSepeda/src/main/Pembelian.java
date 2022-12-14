package main;

import data.*;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Pembelian extends javax.swing.JFrame {

    // variabel untuk melakukan query ke database
    private PreparedStatement pst;
    private final KoneksiToDatabase koneksi = new KoneksiToDatabase();
    private Transaksi transaksi;
    private Sepeda dataSepeda;
    private String kategori;

    public Pembelian() {
        initComponents();
        // mengubah icon pada frame
        setIconImage(new ImageIcon("src/image/sepeda.png").getImage());
    }

    // Overloading
    public Pembelian(String kode, String kategori) {
        initComponents();
        setIconImage(new ImageIcon("src/image/sepeda.png").getImage());
        // mengubah icon pada frame
        if (kategori.equals("Gowes")) {
            dataSepeda = new SepedaGowes();
            dataSepeda.getData(kode);
        } else {
            dataSepeda = new SepedaListrik();
            dataSepeda.getData(kode);
        }
        this.kategori = kategori; // digunakan untuk query ke database transaksi
        setData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_utama = new javax.swing.JPanel();
        inputNama = new javax.swing.JTextField();
        label_masukanDataSepeda = new javax.swing.JLabel();
        btn_beli = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        inputJumlah = new javax.swing.JSpinner();
        inputUang = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label_tanggal = new javax.swing.JLabel();
        input_tanggal = new javax.swing.JLabel();
        label_kode = new javax.swing.JLabel();
        input_kode = new javax.swing.JLabel();
        label_tipe = new javax.swing.JLabel();
        input_tipe = new javax.swing.JLabel();
        label_harga = new javax.swing.JLabel();
        input_harga = new javax.swing.JLabel();
        label_jumlah = new javax.swing.JLabel();
        input_jumlah = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        input_total = new javax.swing.JLabel();
        label_bayar = new javax.swing.JLabel();
        input_bayar = new javax.swing.JLabel();
        label_kembalian = new javax.swing.JLabel();
        input_kembalian = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(730, 425));

        panel_utama.setBackground(new java.awt.Color(112, 111, 211));
        panel_utama.setPreferredSize(new java.awt.Dimension(730, 425));

        inputNama.setBorder(javax.swing.BorderFactory.createTitledBorder("Nama"));

        label_masukanDataSepeda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_masukanDataSepeda.setText("Masukan data pembelian");

        btn_beli.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_beli.setText("Beli");
        btn_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_beliActionPerformed(evt);
            }
        });

        btn_batal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        inputJumlah.setBorder(javax.swing.BorderFactory.createTitledBorder("Jumlah yang ingin dibeli"));

        inputUang.setBorder(javax.swing.BorderFactory.createTitledBorder("Masukan Uang Anda"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Data Transaksi");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        label_tanggal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_tanggal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tanggal.setText("Tanggal");
        label_tanggal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_kode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_kode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_kode.setText("Kode");
        label_kode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_tipe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_tipe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_tipe.setText("Tipe");
        label_tipe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_harga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_harga.setText("Harga          : Rp.");

        label_jumlah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_jumlah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_jumlah.setText("Jumlah");
        label_jumlah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_total.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_total.setText("Total           : Rp.");

        label_bayar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_bayar.setText("Bayar          : Rp.");

        label_kembalian.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_kembalian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_kembalian.setText("Kembalian : Rp.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_total, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_kembalian))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_bayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(input_kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(input_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label_tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_jumlah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_harga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_tipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_kode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_kode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(input_harga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(input_tipe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(input_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(input_tanggal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_tanggal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_tipe, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_tipe, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_jumlah)
                    .addComponent(input_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_harga)
                    .addComponent(input_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_total)
                    .addComponent(input_total, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_bayar)
                    .addComponent(input_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_kembalian)
                    .addComponent(input_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_utamaLayout = new javax.swing.GroupLayout(panel_utama);
        panel_utama.setLayout(panel_utamaLayout);
        panel_utamaLayout.setHorizontalGroup(
            panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_utamaLayout.createSequentialGroup()
                .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_utamaLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(panel_utamaLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_masukanDataSepeda)
                            .addComponent(inputJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputUang, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_beli, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_utamaLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        panel_utamaLayout.setVerticalGroup(
            panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_utamaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_masukanDataSepeda)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(12, 12, 12)
                .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_utamaLayout.createSequentialGroup()
                        .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(inputUang, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_beli)
                    .addComponent(btn_batal))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_utama, 732, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel_utama.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_beliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_beliActionPerformed
        refresh(); // update data transaksi
        // Pengecekan jika ada input yang kosong atau 0
        if (!inputNama.getText().isEmpty() && !inputJumlah.getValue().equals(0) && !inputUang.getValue().equals(0)) {
            // jika jumlah yang ingin dibeli > jumlah stok
            if (transaksi.getJumlah() > transaksi.getSepeda().getStok()) {
                JOptionPane.showMessageDialog(panel_utama, "Stok tidak cukup");
                return; // fungsinya berhenti, source dibawah tidak akan dijalankan
            }
            // jika total harga > pembayaran
            if (transaksi.getTotal() > transaksi.getPembayaran()) {
                JOptionPane.showMessageDialog(panel_utama, "Uang anda tidak cukup");
                return; // fungsinya berhenti, source dibawah tidak akan dijalankan
            }
            transaksi.setNama(inputNama.getText());
            // Membuat query update
            try {
                // memasukan data transaksi ke database
                String sql = "INSERT INTO transaksi (nama,jumlah,total,pembayaran,kembalian,tanggal,kategori,kode) VALUES ('%s',%d,%f,%f,%f,'%s','%s',%s)";
                // string format : memasukan data ke dalam string
                // %s : untuk data bertipe string
                // %d : untuk data bertipe int
                // %f : untuk data bertipe float / double
                sql = String.format(sql, transaksi.getNama(), transaksi.getJumlah(), transaksi.getTotal(),
                        transaksi.getPembayaran(), transaksi.getKembalian(), transaksi.getTanggal(), this.kategori,transaksi.getSepeda().getKode());
                Connection cn = koneksi.getKoneksi();
                pst = cn.prepareStatement(sql);
                pst.execute();
                // mengubah jumlah stok di database
                transaksi.getSepeda().kurangiStok(transaksi.getJumlah());
                dataSepeda.updateData();
                // jika berhasil kembali ke main frame
                JOptionPane.showMessageDialog(panel_utama, "Pembelian berhasil");
                MainFrame main = new MainFrame();
                main.setVisible(true);
                this.dispose();
                return; // berfungsi agar kodingan dibawah tidak dijalankan lagi
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(panel_utama, "Pembelian gagal : " + ex);
            } finally {
                try {
                    pst.close(); // menutup statement yang sudah dijalankan
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(panel_utama, "Pembelian gagal : " + ex);
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    return;
                }
            }
        }
        // jika ada input yang kosong
        JOptionPane.showMessageDialog(panel_utama, "Input tidak boleh kosong / bernilai 0");
    }//GEN-LAST:event_btn_beliActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        MainFrame main = new MainFrame();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refresh();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_beli;
    private javax.swing.JSpinner inputJumlah;
    private javax.swing.JTextField inputNama;
    private javax.swing.JSpinner inputUang;
    private javax.swing.JLabel input_bayar;
    private javax.swing.JLabel input_harga;
    private javax.swing.JLabel input_jumlah;
    private javax.swing.JLabel input_kembalian;
    private javax.swing.JLabel input_kode;
    private javax.swing.JLabel input_tanggal;
    private javax.swing.JLabel input_tipe;
    private javax.swing.JLabel input_total;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_bayar;
    private javax.swing.JLabel label_harga;
    private javax.swing.JLabel label_jumlah;
    private javax.swing.JLabel label_kembalian;
    private javax.swing.JLabel label_kode;
    private javax.swing.JLabel label_masukanDataSepeda;
    private javax.swing.JLabel label_tanggal;
    private javax.swing.JLabel label_tipe;
    private javax.swing.JLabel label_total;
    private javax.swing.JPanel panel_utama;
    // End of variables declaration//GEN-END:variables
    private void refresh() {
        input_jumlah.setText(String.valueOf(inputJumlah.getValue()));
        input_bayar.setText(String.valueOf(inputUang.getValue()));
        transaksi.setJumlah(Integer.parseInt(String.valueOf(inputJumlah.getValue())));
        transaksi.setPembayaran(Double.parseDouble(String.valueOf(inputUang.getValue())));
        input_total.setText(transaksi.hitungTotal());
        // jika uang tidak cukup
        if (Double.parseDouble(transaksi.hitungTotal()) > Double.parseDouble(String.valueOf(inputUang.getValue()))) {
            input_kembalian.setText("Uang tidak cukup");
        } else { // jika cukup tampilkan kembalian
            input_kembalian.setText(transaksi.getKembalian(Integer.parseInt(String.valueOf(inputUang.getValue()))));
        }
    }

    private void setData() {
        // pemberian nilai awal pada data transaksi
        transaksi = new Transaksi(dataSepeda);
        input_tanggal.setText(transaksi.getTanggal());
        input_kode.setText(transaksi.getSepeda().getKode());
        input_tipe.setText(transaksi.getSepeda().getTipe());
        input_harga.setText(String.valueOf(transaksi.getSepeda().getHarga())); // value of : untuk convert tipe data lain ke string
        input_total.setText(transaksi.hitungTotal());
        input_jumlah.setText("0");
        input_kembalian.setText("0");
        input_bayar.setText("0");
    }
}

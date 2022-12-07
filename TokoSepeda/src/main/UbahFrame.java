package main;

import data.Sepeda;
import data.SepedaGowes;
import data.SepedaListrik;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UbahFrame extends javax.swing.JFrame {

    private Sepeda dataSepeda;

    public UbahFrame() {
        initComponents();
        // mengubah icon pada frame
        setIconImage(new ImageIcon("src/image/sepeda.png").getImage());
    }

    // Overloading
    public UbahFrame(String kode, String kategori) {
        initComponents();
        // mengubah icon pada frame
        setIconImage(new ImageIcon("src/image/sepeda.png").getImage());
        if (kategori.equals("Gowes")) {
            dataSepeda = new SepedaGowes();
            dataSepeda.getData(kode);
        } else {
            dataSepeda = new SepedaListrik();
            dataSepeda.getData(kode);
            inputFitur1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kecepatan [km/h]"));
            inputFitur2.setBorder(javax.swing.BorderFactory.createTitledBorder("Baterai [V]"));
        }
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
        inputTipe = new javax.swing.JTextField();
        inputMerk = new javax.swing.JTextField();
        inputFitur1 = new javax.swing.JTextField();
        inputFitur2 = new javax.swing.JTextField();
        label_masukanDataSepeda = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        inputHarga = new javax.swing.JSpinner();
        inputStok = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(730, 425));

        panel_utama.setBackground(new java.awt.Color(112, 111, 211));
        panel_utama.setPreferredSize(new java.awt.Dimension(730, 425));

        inputTipe.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipe"));

        inputMerk.setBorder(javax.swing.BorderFactory.createTitledBorder("Merk"));

        inputFitur1.setBorder(javax.swing.BorderFactory.createTitledBorder("Jenis"));

        inputFitur2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ban"));

        label_masukanDataSepeda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_masukanDataSepeda.setText("Masukan data sepeda");

        btn_simpan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        inputHarga.setBorder(javax.swing.BorderFactory.createTitledBorder("Harga"));

        inputStok.setBorder(javax.swing.BorderFactory.createTitledBorder("Stok"));

        javax.swing.GroupLayout panel_utamaLayout = new javax.swing.GroupLayout(panel_utama);
        panel_utama.setLayout(panel_utamaLayout);
        panel_utamaLayout.setHorizontalGroup(
            panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_utamaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel_utamaLayout.createSequentialGroup()
                            .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inputTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_masukanDataSepeda))
                            .addGap(41, 41, 41))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_utamaLayout.createSequentialGroup()
                            .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42)))
                    .addGroup(panel_utamaLayout.createSequentialGroup()
                        .addComponent(inputMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputFitur2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputFitur1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(inputStok))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        panel_utamaLayout.setVerticalGroup(
            panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_utamaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(label_masukanDataSepeda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputStok, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputFitur1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputFitur2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panel_utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan)
                    .addComponent(btn_batal))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_utama, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel_utama.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // Pengecekan jika ada input yang kosong atau 0
        if (!inputTipe.getText().isEmpty() && !inputHarga.getValue().equals(0) && !inputMerk.getText().isEmpty()) {
            if (!inputStok.getValue().equals(0) && !inputFitur1.getText().isEmpty() && !inputFitur2.getText().isEmpty()) {
                // mengubah data
                dataSepeda.updateData(inputTipe.getText(), inputMerk.getText(), inputHarga.getValue().toString(),
                        inputStok.getValue().toString(), inputFitur1.getText(), inputFitur2.getText());
                // Setelah ubah data, kembali ke main frame
                JOptionPane.showMessageDialog(panel_utama, "Ubah data berhasil");
                MainFrame main = new MainFrame();
                main.setVisible(true);
                this.dispose();
                return;
            }
        }
        // jika ada input yang kosong
        JOptionPane.showMessageDialog(panel_utama, "Input tidak boleh kosong / bernilai 0");
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        MainFrame main = new MainFrame();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_batalActionPerformed

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
            java.util.logging.Logger.getLogger(UbahFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UbahFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UbahFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UbahFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UbahFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JTextField inputFitur1;
    private javax.swing.JTextField inputFitur2;
    private javax.swing.JSpinner inputHarga;
    private javax.swing.JTextField inputMerk;
    private javax.swing.JSpinner inputStok;
    private javax.swing.JTextField inputTipe;
    private javax.swing.JLabel label_masukanDataSepeda;
    private javax.swing.JPanel panel_utama;
    // End of variables declaration//GEN-END:variables

    private void setData() {
        inputTipe.setText(dataSepeda.getTipe());
        inputMerk.setText(dataSepeda.getMerk());
        inputHarga.setValue(dataSepeda.getHarga());
        inputStok.setValue(dataSepeda.getStok());
        inputFitur1.setText(dataSepeda.getFitur1());
        inputFitur2.setText(dataSepeda.getFitur2());
    }
}

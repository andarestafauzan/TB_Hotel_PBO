/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb_main_hotel.UI;

import javax.swing.JOptionPane;
import tb_main_hotel.ListLokasi;

/**
 *
 * @author BINGLE
 */
public class addLokasi extends javax.swing.JDialog {
     private ListLokasi list;

    public addLokasi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void setListLokasi(ListLokasi list) {
        
        this.list = list;
    }
    
    public void setTitle(String nama) {
        this.titleLokasi.setText("Kamar Hotel " + nama);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleNoKamar1 = new javax.swing.JLabel();
        titleNoKamar2 = new javax.swing.JLabel();
        titleLokasi = new javax.swing.JLabel();
        btDoReview = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        titleNoKamar3 = new javax.swing.JLabel();
        titleNoKamar4 = new javax.swing.JLabel();
        txKota = new javax.swing.JTextField();
        txProvinsi = new javax.swing.JTextField();

        titleNoKamar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleNoKamar1.setText("Fasilitas");

        titleNoKamar2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleNoKamar2.setText("Fasilitas");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLokasi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLokasi.setText("Lokasi");

        btDoReview.setText("Submit");
        btDoReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoReviewActionPerformed(evt);
            }
        });

        jButton1.setText("Batal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        titleNoKamar3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleNoKamar3.setText("Kota");

        titleNoKamar4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleNoKamar4.setText("Provinsi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btDoReview)
                        .addGap(4, 4, 4)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleNoKamar3)
                            .addComponent(titleNoKamar4))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleLokasi)
                            .addComponent(txKota)
                            .addComponent(txProvinsi, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLokasi)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleNoKamar3)
                    .addComponent(txKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleNoKamar4)
                    .addComponent(txProvinsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDoReview)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDoReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoReviewActionPerformed
        // TODO add your handling code here:
        int kota = 0;
        try {
            kota = Integer.parseInt(this.txKota.getText());
        } catch (Exception e) {
            kota = 0;
        }
        int prov = 0;
        try {
            prov = Integer.parseInt(this.txProvinsi.getText());
        } catch (Exception e) {
            prov = 0;
        }
        int hasil = this.list.addLokasi(txKota.getText(), txProvinsi.getText());
        if (hasil == 1) {
            JOptionPane.showMessageDialog(this, "Id lokasi sudah terdaftar.");
        } else if (hasil == 2) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan lokasi.");
        } else {
            this.txKota.setText("");
            this.txProvinsi.setText("");
            this.setVisible(false);
        }
    }//GEN-LAST:event_btDoReviewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //this.comboRating("");
        this.txKota.setText("");
        this.txProvinsi.setText("");
        this.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDoReview;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel titleLokasi;
    private javax.swing.JLabel titleNoKamar1;
    private javax.swing.JLabel titleNoKamar2;
    private javax.swing.JLabel titleNoKamar3;
    private javax.swing.JLabel titleNoKamar4;
    private javax.swing.JTextField txKota;
    private javax.swing.JTextField txProvinsi;
    // End of variables declaration//GEN-END:variables
}

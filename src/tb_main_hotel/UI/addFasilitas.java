/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb_main_hotel.UI;
import javax.swing.JOptionPane;
import tb_main_hotel.ListFasilitas;
/**
 *
 * @author BINGLE
 */
public class addFasilitas extends javax.swing.JDialog {
    
    private ListFasilitas listfasilitas;
    /**
     * Creates new form addFasilitas
     */
    public addFasilitas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void setListFasilitas(ListFasilitas list) {
        
        this.listfasilitas = list;
    }
    
    public void setTitle(String nama) {
    
        this.titleFasilitas.setText("Kamar Hotel " + nama);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleFasilitas = new javax.swing.JLabel();
        titleNoKamar = new javax.swing.JLabel();
        txFasilitas = new javax.swing.JTextField();
        titleNoKamar1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txDeskripsi = new javax.swing.JTextArea();
        btDoReview = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleFasilitas.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleFasilitas.setText("Fasilitas");

        titleNoKamar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleNoKamar.setText("Deskripsi");

        txFasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txFasilitasActionPerformed(evt);
            }
        });

        titleNoKamar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleNoKamar1.setText("Fasilitas");

        txDeskripsi.setColumns(20);
        txDeskripsi.setRows(5);
        jScrollPane1.setViewportView(txDeskripsi);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btDoReview)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(titleNoKamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(titleFasilitas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(titleNoKamar1)
                        .addGap(18, 18, 18)
                        .addComponent(txFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleFasilitas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleNoKamar1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btDoReview)
                            .addComponent(jButton1))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleNoKamar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDoReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoReviewActionPerformed
        // TODO add your handling code here:
        int fas = 0;
        try {
            fas = Integer.parseInt(this.txFasilitas.getText());
        } catch (Exception e) {
            fas = 0;
        }
        int desk = 0;
        try {
            desk = Integer.parseInt(this.txDeskripsi.getText());
        } catch (Exception e) {
            desk = 0;
        }
        int hasil = this.listfasilitas.addFasilitas(txFasilitas.getText(), txDeskripsi.getText());
        if (hasil == 1) {
            JOptionPane.showMessageDialog(this, "Id kamar sudah terdaftar.");
        } else if (hasil == 2) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan kamar.");
        } else {
            this.txFasilitas.setText("");
            this.txDeskripsi.setText("");
            this.setVisible(false);
        }
    }//GEN-LAST:event_btDoReviewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //this.comboRating("");
        this.txFasilitas.setText("");
        this.txDeskripsi.setText("");
        this.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txFasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txFasilitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txFasilitasActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDoReview;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleFasilitas;
    private javax.swing.JLabel titleNoKamar;
    private javax.swing.JLabel titleNoKamar1;
    private javax.swing.JTextArea txDeskripsi;
    private javax.swing.JTextField txFasilitas;
    // End of variables declaration//GEN-END:variables
}

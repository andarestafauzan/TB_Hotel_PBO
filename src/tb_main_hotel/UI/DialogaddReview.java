/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb_main_hotel.UI;

import javax.swing.JOptionPane;
import tb_main_hotel.ListHotel;
import tb_main_hotel.ListReview;

/**
 *
 * @author Andaresta
 */
public class DialogaddReview extends javax.swing.JDialog {

    private ListReview listReview;

    /**
     * Creates new form DialogaddReview
     */
    public DialogaddReview(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
    }
    
    public void setListReview(ListReview listReview) {
        
        this.listReview = listReview;
    }
    
    public void setTitle(String nama) {
    
        this.titleReview.setText("Review Hotel " + nama);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleReview = new javax.swing.JLabel();
        titleRating = new javax.swing.JLabel();
        titleUlasan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txUlasan = new javax.swing.JTextArea();
        btDoReview = new javax.swing.JButton();
        comboRating = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        titleReview.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleReview.setText("Review");

        titleRating.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleRating.setText("Rating");

        titleUlasan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleUlasan.setText("Ulasan");

        txUlasan.setColumns(20);
        txUlasan.setRows(5);
        jScrollPane1.setViewportView(txUlasan);

        btDoReview.setText("Submit");
        btDoReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoReviewActionPerformed(evt);
            }
        });

        comboRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jButton1.setText("Batal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(titleRating)
                                .addGap(40, 40, 40)
                                .addComponent(comboRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(titleUlasan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 244, Short.MAX_VALUE)
                        .addComponent(btDoReview)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleReview)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleReview)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleRating)
                    .addComponent(comboRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleUlasan)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDoReview)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //this.comboRating("");
        this.comboRating.setSelectedIndex(0);
        this.txUlasan.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btDoReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoReviewActionPerformed
        // TODO add your handling code here:
        int rating = 0;
        try {
            rating = Integer.parseInt(this.comboRating.getSelectedItem().toString());
        } catch (Exception e) {
            rating = 0;
        }
        int hasil = this.listReview.doReview(this.txUlasan.getText(), rating);
        if (hasil == 1) {
            JOptionPane.showMessageDialog(this, "Id review sudah terdaftar.");
        } else if (hasil == 2) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan review.");
        } else {
            this.comboRating.setSelectedIndex(0);
            this.txUlasan.setText("");
            this.setVisible(false);
        }
    }//GEN-LAST:event_btDoReviewActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDoReview;
    private javax.swing.JComboBox<String> comboRating;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleRating;
    private javax.swing.JLabel titleReview;
    private javax.swing.JLabel titleUlasan;
    private javax.swing.JTextArea txUlasan;
    // End of variables declaration//GEN-END:variables
}

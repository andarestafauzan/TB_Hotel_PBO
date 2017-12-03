/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb_main_hotel.UI;

import tb_main_hotel.ListKamar;
import javax.swing.JOptionPane;
import tb_main_hotel.Database;
import tb_main_hotel.Hotel;
import tb_main_hotel.ListHotel;
import tb_main_hotel.ListReservasi;
import tb_main_hotel.ListReview;
import tb_main_hotel.User;

/**
 *
 * @author Andaresta
 */
public class GUIListHotel extends javax.swing.JFrame {
    
    private Hotel currentHotel = null;
    private ListHotel listHotel;
    private DialogaddHotel addDialog;
    private ListReview listReview;
    private DialogaddReview addReview;
    private ListKamar listKamar;
    private DialogaddKamar addKamar;
    private ListReservasi listReservasi;
    private DialogaddReservasi addReservasi;
    private User currentUser = null;
    private DialogubahProfile ubahProfile;

    /**
     * Creates new form GUIListHotel
     */
    public GUIListHotel(User user) {
        
        initComponents();
        
        /* init */
        this.listHotel = new ListHotel(new Database());
        this.addDialog = new DialogaddHotel(this, true, this.listHotel);
        this.addReview = new DialogaddReview(this, true);
        this.addKamar = new DialogaddKamar(this, true);
        this.addReservasi = new DialogaddReservasi(this, true);
        this.ubahProfile = new DialogubahProfile(this, true, user);
        this.currentUser = user;
        this.clearCurrentHotel();
        
        labelUser.setText(user.getNama() + " (" + user.getJenis() + ")");
        if (!user.getJenis().equals("ADMIN")) {
            this.btTambahHotel.setVisible(false);
            this.btDelete.setVisible(false);
            //this.tabDetail.remove(0);
            this.btKamar.setVisible(false);
            this.btDeleteKamar.setVisible(false);
            this.btnManageUser.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        titleListHotel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListHotel = new javax.swing.JTable();
        btTambahHotel = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        titleReview = new javax.swing.JLabel();
        tabDetail = new javax.swing.JTabbedPane();
        panKamar = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableListKamar = new javax.swing.JTable();
        btKamar = new javax.swing.JButton();
        btDeleteKamar = new javax.swing.JButton();
        panReservasi = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableListReservasi = new javax.swing.JTable();
        btReservasi = new javax.swing.JButton();
        btCancle = new javax.swing.JButton();
        panReview = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableListReview = new javax.swing.JTable();
        btReview = new javax.swing.JButton();
        btDeleteReview = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        labelUser = new javax.swing.JLabel();
        btnManageUser = new javax.swing.JButton();
        btnProfil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        titleListHotel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleListHotel.setText("List Hotel");

        tableListHotel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableListHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListHotelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableListHotel);

        btTambahHotel.setText("Tambah Hotel");
        btTambahHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahHotelActionPerformed(evt);
            }
        });

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        titleReview.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleReview.setText("-");

        tableListKamar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(tableListKamar);

        btKamar.setText("Tambah Kamar");
        btKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKamarActionPerformed(evt);
            }
        });

        btDeleteKamar.setText("Delete");
        btDeleteKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteKamarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panKamarLayout = new javax.swing.GroupLayout(panKamar);
        panKamar.setLayout(panKamarLayout);
        panKamarLayout.setHorizontalGroup(
            panKamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panKamarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addGroup(panKamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panKamarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btKamar))
                    .addGroup(panKamarLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btDeleteKamar)))
                .addContainerGap())
        );
        panKamarLayout.setVerticalGroup(
            panKamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panKamarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panKamarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panKamarLayout.createSequentialGroup()
                        .addComponent(btKamar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeleteKamar))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        tabDetail.addTab("Kamar", panKamar);

        tableListReservasi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(tableListReservasi);

        btReservasi.setText("Reservasi");
        btReservasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservasiActionPerformed(evt);
            }
        });

        btCancle.setText("Delete");
        btCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panReservasiLayout = new javax.swing.GroupLayout(panReservasi);
        panReservasi.setLayout(panReservasiLayout);
        panReservasiLayout.setHorizontalGroup(
            panReservasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReservasiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panReservasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btReservasi)
                    .addGroup(panReservasiLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btCancle)))
                .addGap(21, 21, 21))
        );
        panReservasiLayout.setVerticalGroup(
            panReservasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReservasiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panReservasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panReservasiLayout.createSequentialGroup()
                        .addComponent(btReservasi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancle))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        tabDetail.addTab("Reservasi", panReservasi);

        jScrollPane2.setViewportView(tableListReview);

        btReview.setText("Tambah Review");
        btReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReviewActionPerformed(evt);
            }
        });

        btDeleteReview.setText("Delete");
        btDeleteReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteReviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panReviewLayout = new javax.swing.GroupLayout(panReview);
        panReview.setLayout(panReviewLayout);
        panReviewLayout.setHorizontalGroup(
            panReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                .addGroup(panReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panReviewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btReview))
                    .addGroup(panReviewLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btDeleteReview)))
                .addContainerGap())
        );
        panReviewLayout.setVerticalGroup(
            panReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panReviewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panReviewLayout.createSequentialGroup()
                        .addComponent(btReview)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDeleteReview))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        tabDetail.addTab("Review", panReview);

        labelUser.setText("jLabel1");

        btnManageUser.setText("Pengaturan User");
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
            }
        });

        btnProfil.setText("Pengaturan Profil");
        btnProfil.setToolTipText("");
        btnProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnManageUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfil)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUser)
                    .addComponent(btnManageUser)
                    .addComponent(btnProfil))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabDetail)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleListHotel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTambahHotel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btDelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleReview)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleListHotel)
                    .addComponent(btTambahHotel)
                    .addComponent(btDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleReview)
                .addGap(18, 18, 18)
                .addComponent(tabDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* cek apa ada hotel dipilih */
    private boolean hasCurrentHotel() {
        
        this.currentHotel = null;
        int row = this.tableListHotel.getSelectedRow();
        if (row > -1) {
            String name = this.tableListHotel.getValueAt(row, 1).toString();
            /* ambil id hotel, nama hotel, update judul review */
            this.currentHotel = new Hotel(
                Integer.parseInt(this.tableListHotel.getValueAt(row, 0).toString()), 
                name,
                this.tableListHotel.getValueAt(row, 2).toString()
            );
            this.titleReview.setText("Detail Hotel: " + name);
            return true;
        } else {
            return false;
        }
    }

    private void clearCurrentHotel() {
    
        this.titleReview.setText("Pilih salah satu hotel");
        this.currentHotel = null;
    }

    private void btTambahHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahHotelActionPerformed
        // TODO add your handling code here:
        
        this.addDialog.setVisible(true);
        this.listHotel.tampil(this.tableListHotel);
    }//GEN-LAST:event_btTambahHotelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        /* load data hotel dari db dan tampilkan di tabel */
        int x = this.listHotel.refesh();
        this.listHotel.tampil(this.tableListHotel);
    }//GEN-LAST:event_formWindowOpened

    private void btReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReviewActionPerformed
        // TODO add your handling code here:
        if (this.hasCurrentHotel()) {
            this.addReview.setListReview(this.currentHotel.getReview());
            this.addReview.setTitle(this.currentHotel.getNama());
            this.addReview.setVisible(true);
            this.currentHotel.getReview().tampil(this.tableListReview);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih salah satu hotel.");
        }
        
    }//GEN-LAST:event_btReviewActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        if (this.hasCurrentHotel()) {
            if (this.listHotel.delete(this.currentHotel.getId())) {
                this.listHotel.tampil(this.tableListHotel);
                this.clearCurrentHotel();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menghapus hotel.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih salah satu hotel.");
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void tableListHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListHotelMouseClicked
        // TODO add your handling code here:
        if (this.hasCurrentHotel()) {
            this.currentHotel.getReview().tampil(this.tableListReview);
            this.currentHotel.getKamar().tampil(this.tableListKamar);
            this.currentHotel.getReservasi().tampil(this.tableListReservasi);
        }
    }//GEN-LAST:event_tableListHotelMouseClicked

    private void btDeleteReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteReviewActionPerformed
        // TODO add your handling code here:
        if (this.hasCurrentHotel()) {
            int row = this.tableListReview.getSelectedRow();
            if (row > -1) {
                
                /* ambil id review */
                int id = Integer.parseInt(this.tableListReview.getValueAt(row, 0).toString());
                
                if (this.currentHotel.getReview().deleteReview(id)) {
                    this.currentHotel.getReview().tampil(this.tableListReview);
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus review.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Pilih salah satu review.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih salah satu hotel.");
        }
    }//GEN-LAST:event_btDeleteReviewActionPerformed

    private void btKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKamarActionPerformed
        // TODO add your handling code here:
        if (this.hasCurrentHotel()) {
            this.addKamar.setListKamar(this.currentHotel.getKamar());
            this.addKamar.setTitle(this.currentHotel.getNama());
            this.addKamar.setVisible(true);
            this.currentHotel.getKamar().tampil(this.tableListKamar);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih salah satu kamar.");
        }
    }//GEN-LAST:event_btKamarActionPerformed

    private void btDeleteKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteKamarActionPerformed
        // TODO add your handling code here:
        if (this.hasCurrentHotel()) {
            int row = this.tableListKamar.getSelectedRow();
            if (row > -1) {
                
                /* ambil id review */
                int id = Integer.parseInt(this.tableListKamar.getValueAt(row, 0).toString());
                
                if (this.currentHotel.getKamar().deleteKamar(id)) {
                    this.currentHotel.getKamar().tampil(this.tableListKamar);
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus kamar.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Pilih salah satu kamar.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih salah satu hotel.");
        }
    }//GEN-LAST:event_btDeleteKamarActionPerformed

    private void btReservasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservasiActionPerformed
        // TODO add your handling code here:
        if (this.hasCurrentHotel()) {
            if (this.currentHotel.getKamar().count() > 0) {
                this.addReservasi.setListReservasi(this.currentHotel.getReservasi());
                this.addReservasi.setListKamar(this.currentHotel.getKamar());
                this.addReservasi.setTitle(this.currentHotel.getNama());
                this.addReservasi.setVisible(true);
                this.currentHotel.getReservasi().tampil(this.tableListReservasi);
            } else {
                JOptionPane.showMessageDialog(this, "Hotel ini belum memiliki kamar.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih salah satu hotel.");
        }
    }//GEN-LAST:event_btReservasiActionPerformed

    private void btCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancleActionPerformed
        // TODO add your handling code here:
         if (this.hasCurrentHotel()) {
            int row = this.tableListReservasi.getSelectedRow();
            if (row > -1) {
                
                /* ambil id review */
                int id = Integer.parseInt(this.tableListReservasi.getValueAt(row, 0).toString());
                
                if (this.currentHotel.getReservasi().cancleReserv(id)) {
                    this.currentHotel.getReservasi().tampil(this.tableListReservasi);
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal men-cancle reservasi.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Pilih salah satu reservasi.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih salah satu hotel.");
        }
    }//GEN-LAST:event_btCancleActionPerformed

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed
        // TODO add your handling code here:
        GUIListUser guiUser = new GUIListUser(this, this.currentUser);
        guiUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageUserActionPerformed

    private void btnProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilActionPerformed
        // TODO add your handling code here:
        this.ubahProfile.setVisible(true);
        labelUser.setText(this.currentUser.getNama() + " (" + currentUser.getJenis() + ")");
    }//GEN-LAST:event_btnProfilActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancle;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btDeleteKamar;
    private javax.swing.JButton btDeleteReview;
    private javax.swing.JButton btKamar;
    private javax.swing.JButton btReservasi;
    private javax.swing.JButton btReview;
    private javax.swing.JButton btTambahHotel;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JButton btnProfil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel panKamar;
    private javax.swing.JPanel panReservasi;
    private javax.swing.JPanel panReview;
    private javax.swing.JTabbedPane tabDetail;
    private javax.swing.JTable tableListHotel;
    private javax.swing.JTable tableListKamar;
    private javax.swing.JTable tableListReservasi;
    private javax.swing.JTable tableListReview;
    private javax.swing.JLabel titleListHotel;
    private javax.swing.JLabel titleReview;
    // End of variables declaration//GEN-END:variables

}

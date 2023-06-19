/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projekinventarisobat;

// Library to build this app
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.Graphics;

/**
 *
 * @author USER
 */
public class formInvObat extends javax.swing.JFrame {

    /**
     * Creates new form formInvObat
     */
    public formInvObat() {
        initComponents();
        disableControl();
        
        //Calling method function to add column headers
        addTableHeaders();
    }
    

    DefaultTableModel model;
    String kode = "";
    String namaObat = "";
    Integer stokObat;
    String jenisObat = "";
    
    //Adding table headers
    private void addTableHeaders(){
        model = (DefaultTableModel) kolomInv.getModel();
       
        Object[] newIdentifiers = new Object[]{"Kode", "Nama Obat", "Stok Obat", "Jenis Obat"};
        model.setColumnIdentifiers(newIdentifiers);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // To enable all of button
     private void enableControl(){
        batalB.setEnabled(true);
        simpanB.setEnabled(true);
        baruB.setEnabled(true);
        ubahB.setEnabled(true);
        hapusB.setEnabled(true);
        
        noIDTF.setEnabled(true);
        namaObatTF.setEnabled(true);
        
        stokObatS.setEnabled(true);
        jenisObatCB.setEnabled(true);
    }
     
     // To disable all of button
     private void disableControl(){
        batalB.setEnabled(false);
        simpanB.setEnabled(false);
        baruB.setEnabled(true);
        ubahB.setEnabled(false);
        hapusB.setEnabled(false);
        
        noIDTF.setEnabled(false);
        namaObatTF.setEnabled(false);
        
        stokObatS.setEnabled(false);
        jenisObatCB.setEnabled(false);
    }
     
    // To clear all of data after input data or when button "Baru" clicked after saved data  
    private void bersihData(){
        noIDTF.setText("");
        namaObatTF.setText("");
        
        //We don't know how to write code, but it's the same code like above
//        stokObatS.setValue("");
//        jenisObatCB.setSelectedItem("");
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        simpanB = new javax.swing.JButton();
        baruB = new javax.swing.JButton();
        ubahB = new javax.swing.JButton();
        hapusB = new javax.swing.JButton();
        nomorid = new javax.swing.JLabel();
        namaobat = new javax.swing.JLabel();
        stokobat = new javax.swing.JLabel();
        noIDTF = new javax.swing.JTextField();
        namaObatTF = new javax.swing.JTextField();
        stokObatS = new javax.swing.JSpinner();
        jenisobat = new javax.swing.JLabel();
        jenisObatCB = new javax.swing.JComboBox<>();
        batalB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kolomInv = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        simpanB.setText("Simpan");
        simpanB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpanB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBActionPerformed(evt);
            }
        });

        baruB.setText("Baru");
        baruB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        baruB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baruBActionPerformed(evt);
            }
        });

        ubahB.setText("Ubah");
        ubahB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ubahB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahBActionPerformed(evt);
            }
        });

        hapusB.setText("Hapus");
        hapusB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hapusB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBActionPerformed(evt);
            }
        });

        nomorid.setText("Kode");

        namaobat.setText("Nama Obat");

        stokobat.setText("Stok Obat");

        noIDTF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        noIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noIDTFActionPerformed(evt);
            }
        });

        namaObatTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaObatTFActionPerformed(evt);
            }
        });

        jenisobat.setText("Jenis Obat");

        jenisObatCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pil", "Tablet", "Sirup" }));

        batalB.setText("Batal");
        batalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalBActionPerformed(evt);
            }
        });

        kolomInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        kolomInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kolomInvMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kolomInv);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Inventaris Obat RS. Cahaya Kasih Yogyakarta");

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomorid)
                            .addComponent(namaobat)
                            .addComponent(stokobat)
                            .addComponent(jenisobat))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(stokObatS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                .addComponent(namaObatTF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(noIDTF, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jenisObatCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(baruB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ubahB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hapusB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(simpanB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(batalB)))
                .addGap(18, 26, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomorid)
                    .addComponent(noIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaObatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaobat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stokobat)
                    .addComponent(stokObatS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenisobat)
                    .addComponent(jenisObatCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baruB)
                    .addComponent(ubahB)
                    .addComponent(hapusB)
                    .addComponent(simpanB)
                    .addComponent(batalB))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBActionPerformed
        // TODO add your handling code here:
        kode = noIDTF.getText();
        namaObat = namaObatTF.getText();
        stokObat = (Integer) stokObatS.getValue();
        jenisObat = (String) jenisObatCB.getSelectedItem();
        
        // To add rows when button "SIMPAN" clicked
        model.addRow(new Object []{kode, namaObat, stokObat, jenisObat});
        disableControl();
    }//GEN-LAST:event_simpanBActionPerformed
   
    
    private void baruBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baruBActionPerformed
        // TODO add your handling code here: 
        enableControl();
        bersihData();
    }//GEN-LAST:event_baruBActionPerformed

    private void ubahBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahBActionPerformed
        // TODO add your handling code here:
        enableControl();
        
        //For UPDATE list data without add the rows (not clearly code, because any an error when program running)
//        int i = kolomInv.getSelectedRow();
//        DefaultTableModel tblModel = (DefaultTableModel)kolomInv.getModel();
//        
//        if(i >= 0){ 
//            tblModel.setValueAt(noIDTF.getText(), i, 0);
//            tblModel.setValueAt(namaObatTF.getText(), i, 1);
//            tblModel.setValueAt(stokObatS.getValue(), i, 2);
//            tblModel.setValueAt(jenisObatCB.getSelectedItem(), i, 3);
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "Error");
//        }
    }//GEN-LAST:event_ubahBActionPerformed

    private void hapusBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBActionPerformed
        // TODO add your handling code here:
        
        //To get the data from table (table clicked)
        int getSelectedRowForDeletion = kolomInv.getSelectedRow();
        
        // To confirm the user before delete data
        int hapus = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin akan menghapusnya?", "Konfirmasi Item Obat", JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE);
        switch (hapus) {
            case JOptionPane.YES_OPTION:
                model.removeRow(getSelectedRowForDeletion);
                break;
            case JOptionPane.NO_OPTION:
                break;
            default:
                break;
        }
    }//GEN-LAST:event_hapusBActionPerformed

    private void namaObatTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaObatTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaObatTFActionPerformed

    private void batalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalBActionPerformed
        // TODO add your handling code here:
        disableControl();
        //To get the data from table (table clicked)
        int getSelectedRowForDeletion = kolomInv.getSelectedRow();
        
        // To confirm the user before delete data
                model.removeRow(getSelectedRowForDeletion);
    }//GEN-LAST:event_batalBActionPerformed

    private void noIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noIDTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noIDTFActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void kolomInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kolomInvMouseClicked
        // TODO add your handling code here:
        
        // To enable some of button when table input clicked
        ubahB.setEnabled(true);
        hapusB.setEnabled(true);
        batalB.setEnabled(true);
        
//        For UPDATE list without add the rows (not clearly code, because any an error when program running)
//        int selectedRow = kolomInv.getSelectedRow();
//        DefaultTableModel tblModel = (DefaultTableModel)kolomInv.getModel();
//        
//        noIDTF.setText(tblModel.getValueAt(selectedRow, 0).toString());
//        namaObatTF.setText(tblModel.getValueAt(selectedRow, 1).toString());
//        stokObatS.setValue(tblModel.getValueAt(selectedRow, 2).toString());
//        jenisObatCB.setSelectedItem(tblModel.getValueAt(selectedRow, 3).toString());
        
    }//GEN-LAST:event_kolomInvMouseClicked

    
    private void kolomInvActionPerformed(java.awt.event.ActionEvent evt){

    }
    
    
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
            java.util.logging.Logger.getLogger(formInvObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formInvObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formInvObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formInvObat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formInvObat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton baruB;
    private javax.swing.JButton batalB;
    private javax.swing.JButton hapusB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenisObatCB;
    private javax.swing.JLabel jenisobat;
    private javax.swing.JTable kolomInv;
    private javax.swing.JTextField namaObatTF;
    private javax.swing.JLabel namaobat;
    private javax.swing.JTextField noIDTF;
    private javax.swing.JLabel nomorid;
    private javax.swing.JButton simpanB;
    private javax.swing.JSpinner stokObatS;
    private javax.swing.JLabel stokobat;
    private javax.swing.JButton ubahB;
    // End of variables declaration//GEN-END:variables
}
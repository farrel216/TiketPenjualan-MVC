package TiketPesawat;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import TiketPesawat.Controller;

/**
 *
 * @author FARREL ANDHIKA RIZKY PUTRA - 24060120130071
 */

public class UIPenjualan extends javax.swing.JFrame{
    private Controller control = new Controller();
    /**
     * Creates new form UIPenjualan
     */
    public UIPenjualan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jamBerangkat = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mskp = new javax.swing.JComboBox<>();
        tujuan = new javax.swing.JComboBox<>();
        jam6 = new javax.swing.JRadioButton();
        jam12 = new javax.swing.JRadioButton();
        jam18 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        no_kursi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        namapenumpang = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        cetakTiket = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        promo = new javax.swing.JTextField();
        applypromo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tiketArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        jLabel1.setText("Penjualan Tiket Pesawat");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Pesawat"));

        jLabel2.setText("Maskapai");

        jLabel3.setText("Tujuan\n");

        jLabel4.setText("Jam Keberangkatan");

        mskp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Pilih Maskapai>", "Lion Air", "Garuda", "Air Asia" }));
        mskp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mskpActionPerformed(evt);
            }
        });

        tujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Pilih Tujuan>", "Jakarta", "Bali", "Surabaya" }));
        tujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuanActionPerformed(evt);
            }
        });

        jamBerangkat.add(jam6);
        jam6.setText("06.00");
        jam6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam6ActionPerformed(evt);
            }
        });

        jamBerangkat.add(jam12);
        jam12.setText("12.00");
        jam12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam12ActionPerformed(evt);
            }
        });

        jamBerangkat.add(jam18);
        jam18.setText("18.00");
        jam18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jam18ActionPerformed(evt);
            }
        });

        jLabel5.setText("No Kursi");



        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(87, 87, 87)
                                .addComponent(tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(72, 72, 72)
                                .addComponent(mskp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(no_kursi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jam12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jam6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jam18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mskp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jam6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jam12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jam18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(no_kursi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel6.setText("Nama Penumpang");


        jLabel8.setText("Harga");

        harga.setEditable(false);

        cetakTiket.setText("Cetak Tiket");
        cetakTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakTiketActionPerformed(evt);
            }
        });

        jButton2.setText("Input Lagi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Kode Promo");

        applypromo.setText("Apply");
        applypromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applypromoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cetakTiket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(harga, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(promo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(applypromo)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(promo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applypromo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cetakTiket)
                    .addComponent(jButton2))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tiketArea.setEditable(false);
        tiketArea.setColumns(20);
        tiketArea.setRows(5);
        jScrollPane1.setViewportView(tiketArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(namapenumpang)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(namapenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void mskpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mskpActionPerformed
        if(mskp.getSelectedItem().equals("<Pilih Maskapai>")){
            control.setMaskapai("Pilih Maskapai");
            control.HitungHarga();
            tampilkanHarga();
        }
        else if(mskp.getSelectedItem().equals("Lion Air")){
            control.setMaskapai("Lion Air");
            control.HitungHarga();
            tampilkanHarga();
        }
        else if(mskp.getSelectedItem().equals("Garuda")){
            control.setMaskapai("Garuda");
            control.HitungHarga();
            tampilkanHarga();
        }
        else if(mskp.getSelectedItem().equals("Air Asia")){
            control.setMaskapai("Air Asia");
            control.HitungHarga();
            tampilkanHarga();
        }
    }//GEN-LAST:event_mskpActionPerformed


    private void tujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuanActionPerformed
        if(tujuan.getSelectedItem().equals("<Pilih Tujuan>")){
            control.setTujuan("Pilih Tujuan");
            control.HitungHarga();
            tampilkanHarga();
        }
        else if(tujuan.getSelectedItem().equals("Jakarta")){
            control.setTujuan("Jakarta");
            control.HitungHarga();
            tampilkanHarga();
        }
        else if(tujuan.getSelectedItem().equals("Bali")){
            control.setTujuan("Bali");
            control.HitungHarga();
            tampilkanHarga();
        }
        else if(tujuan.getSelectedItem().equals("Surabaya")){
            control.setTujuan("Surabaya");
            control.HitungHarga();
            tampilkanHarga();
        }
    }//GEN-LAST:event_tujuanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        namapenumpang.setText("");
        mskp.setSelectedItem("<Pilih Maskapai>");
        control.setMaskapai("<Pilih Maskapai>");
        tujuan.setSelectedItem("<Pilih Tujuan>");
        control.setTujuan("<Pilih Tujuan>");
        harga.setText("");
        jamBerangkat.clearSelection();
        control.setJam("not selected");
        no_kursi.setText("");
        tiketArea.setText("");
        promo.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jam6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam6ActionPerformed
        if (jam6.isSelected()){
            control.setJam("06:00");
            control.HitungHarga();
            tampilkanHarga();
        }
        else{
            control.setJam("not selected");
            control.HitungHarga();
            tampilkanHarga();
        }
    }//GEN-LAST:event_jam6ActionPerformed

    private void jam12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam12ActionPerformed
        if (jam12.isSelected()){
            control.setJam("12:00");
            control.HitungHarga();
            tampilkanHarga();
        }
        else{
            control.setJam("not selected");
            control.HitungHarga();
            tampilkanHarga();
        }
    }//GEN-LAST:event_jam12ActionPerformed

    private void jam18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jam18ActionPerformed
        if (jam18.isSelected()){
            control.setJam("18:00");
            control.HitungHarga();
            tampilkanHarga();
        }
        else{
            control.setJam("not selected");
            control.HitungHarga();
            tampilkanHarga();
        }
    }//GEN-LAST:event_jam18ActionPerformed

    private void cetakTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakTiketActionPerformed
        if((namapenumpang.getText().equals(""))||(no_kursi.getText().equals(""))||(control.getMaskapai()== "Pilih Maskapai")||(control.getTujuan() == "Pilih Tujuan")||(control.getJam() == "not selected")){
            tiketArea.setText("Isi Data Dengan Lengkap Terlebih Dahulu");
        }
        else{
           tiketArea.setText(
                "Nama Penumpang\t= " + namapenumpang.getText() +
                "\nMaskapai\t\t= " + control.getMaskapai() +
                "\nTujuan\t\t= " + control.getTujuan() +
                "\nJam Keberangkatan\t= " + control.getJam() +
                "\nNomor Kursi\t\t= " + no_kursi.getText() +
                "\nHarga Tiket\t\t= Rp" + control.getHarga() +
                "\nPotongan Promo\t= Rp" + control.getPotongan() +
                "\nTotal Harga\t\t= Rp" + control.getBiaya()
                        ); 
        }
    }//GEN-LAST:event_cetakTiketActionPerformed

    private void applypromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applypromoActionPerformed
        if(control.getHarga()==0){
            tiketArea.setText("Isi Data Terlebih Dahulu");
        }
        if(control.getKodePromo() == 0){
            String kode = promo.getText();
            control.validasiPromo(kode);
        }
        
    }//GEN-LAST:event_applypromoActionPerformed
    private void tampilkanHarga(){
        harga.setText(control.tampilkanHarga());
    }
    /**
     * @param args the command line arguments
     */

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applypromo;
    private javax.swing.JButton cetakTiket;
    private javax.swing.JTextField harga;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jam12;
    private javax.swing.JRadioButton jam18;
    private javax.swing.JRadioButton jam6;
    private javax.swing.ButtonGroup jamBerangkat;
    private javax.swing.JComboBox<String> mskp;
    private javax.swing.JTextField namapenumpang;
    private javax.swing.JTextField no_kursi;
    private javax.swing.JTextField promo;
    private javax.swing.JTextArea tiketArea;
    private javax.swing.JComboBox<String> tujuan;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AbasZ
 */
public class MenuKuisUser extends javax.swing.JPanel {
    private int kesempatan = 2;
    
    /**
     * Creates new form MenuKuisAdmin
     */
    public MenuKuisUser() {
        initComponents();
        load_data_kuis();
        
    }
    
    ImageIcon iconInvalid = new javax.swing.ImageIcon(getClass().getResource("/Img/invalid.png"));
    ImageIcon iconSucces = new javax.swing.ImageIcon(getClass().getResource("/Img/berhasil.png"));
    ImageIcon iconWarning = new javax.swing.ImageIcon(getClass().getResource("/Img/alarm.png"));
    ImageIcon iconInfo = new javax.swing.ImageIcon(getClass().getResource("/Img/info.png"));
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSoal1 = new javax.swing.ButtonGroup();
        bgSoal2 = new javax.swing.ButtonGroup();
        bgSoal3 = new javax.swing.ButtonGroup();
        bgSoal4 = new javax.swing.ButtonGroup();
        bgSoal5 = new javax.swing.ButtonGroup();
        pAlas = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tab1 = new test.PanelRound();
        pFooter = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Pertanyaan1 = new javax.swing.JLabel();
        rb1A = new javax.swing.JRadioButton();
        rb1B = new javax.swing.JRadioButton();
        rb1C = new javax.swing.JRadioButton();
        rb1D = new javax.swing.JRadioButton();
        Pertanyaan2 = new javax.swing.JLabel();
        rb2A = new javax.swing.JRadioButton();
        rb2B = new javax.swing.JRadioButton();
        rb2C = new javax.swing.JRadioButton();
        rb2D = new javax.swing.JRadioButton();
        Pertanyaan3 = new javax.swing.JLabel();
        rb3A = new javax.swing.JRadioButton();
        rb3B = new javax.swing.JRadioButton();
        rb3C = new javax.swing.JRadioButton();
        rb3D = new javax.swing.JRadioButton();
        Pertanyaan4 = new javax.swing.JLabel();
        rb4A = new javax.swing.JRadioButton();
        rb4B = new javax.swing.JRadioButton();
        rb4C = new javax.swing.JRadioButton();
        rb4D = new javax.swing.JRadioButton();
        Pertanyaan5 = new javax.swing.JLabel();
        rb5A = new javax.swing.JRadioButton();
        rb5B = new javax.swing.JRadioButton();
        rb5C = new javax.swing.JRadioButton();
        rb5D = new javax.swing.JRadioButton();
        BtnKirimJawaban = new button.MyButton();
        BtnresetPermainan = new button.MyButton();
        lbKet = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tab2 = new test.PanelRound();
        pFooter1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbjudul = new javax.swing.JLabel();
        lbgambar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblDataKuis = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        pAlas.setBackground(new java.awt.Color(255, 255, 204));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 153));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        tab1.setBackground(new java.awt.Color(255, 255, 204));
        tab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pFooter.setBackground(new java.awt.Color(0, 0, 153));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Copyright © by, Aperta2k24");

        javax.swing.GroupLayout pFooterLayout = new javax.swing.GroupLayout(pFooter);
        pFooter.setLayout(pFooterLayout);
        pFooterLayout.setHorizontalGroup(
            pFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFooterLayout.createSequentialGroup()
                .addContainerGap(268, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(263, 263, 263))
        );
        pFooterLayout.setVerticalGroup(
            pFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFooterLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        tab1.add(pFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 345, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Selamat Mengerjakan :)");
        tab1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 6, -1, -1));

        Pertanyaan1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Pertanyaan1.setText("<html>\n 1. Dari mana asal permainan tradisional \"Congklak\"?<br>\n </html>");
        tab1.add(Pertanyaan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 31, -1, -1));

        bgSoal1.add(rb1A);
        rb1A.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb1A.setText("Sumatra Utara");
        tab1.add(rb1A, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 53, -1, -1));

        bgSoal1.add(rb1B);
        rb1B.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb1B.setText("Jawa barat");
        tab1.add(rb1B, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 53, -1, -1));

        bgSoal1.add(rb1C);
        rb1C.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb1C.setText("Kalimantan");
        tab1.add(rb1C, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 53, -1, -1));

        bgSoal1.add(rb1D);
        rb1D.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb1D.setText("Sulawesi utara");
        tab1.add(rb1D, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 53, -1, -1));

        Pertanyaan2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Pertanyaan2.setText("<html>  2. Apa nama alat yang digunakan dalam permainan tradisional \"Gasing\"?  </html>");
        tab1.add(Pertanyaan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 80, -1, -1));

        bgSoal2.add(rb2A);
        rb2A.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb2A.setText("Bola rotan");
        tab1.add(rb2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 102, -1, -1));

        bgSoal2.add(rb2B);
        rb2B.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb2B.setText(" Kayu berputar");
        rb2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2BActionPerformed(evt);
            }
        });
        tab1.add(rb2B, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 102, -1, -1));

        bgSoal2.add(rb2C);
        rb2C.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb2C.setText("Kelereng");
        tab1.add(rb2C, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 102, -1, -1));

        bgSoal2.add(rb2D);
        rb2D.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb2D.setText("Lidi panjang");
        tab1.add(rb2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 102, -1, -1));

        Pertanyaan3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Pertanyaan3.setText("<html>  3. Dalam permainan \"Egrang\", apa yang digunakan untuk bermain?  </html>");
        tab1.add(Pertanyaan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 129, -1, -1));

        bgSoal3.add(rb3A);
        rb3A.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb3A.setText("Batang bambu panjang");
        rb3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3AActionPerformed(evt);
            }
        });
        tab1.add(rb3A, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 151, -1, -1));

        bgSoal3.add(rb3B);
        rb3B.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb3B.setText(" Kayu bulat kecil");
        rb3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3BActionPerformed(evt);
            }
        });
        tab1.add(rb3B, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 151, -1, -1));

        bgSoal3.add(rb3C);
        rb3C.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb3C.setText(" Ban bekas");
        tab1.add(rb3C, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 178, -1, -1));

        bgSoal3.add(rb3D);
        rb3D.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb3D.setText("Bola rotan");
        tab1.add(rb3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 178, -1, -1));

        Pertanyaan4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Pertanyaan4.setText("<html>  4. Apa tujuan utama dari permainan \"Benteng\"?  </html>");
        tab1.add(Pertanyaan4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 205, -1, -1));

        bgSoal4.add(rb4A);
        rb4A.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb4A.setText("Mencuri bendera lawan");
        tab1.add(rb4A, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 227, -1, -1));

        bgSoal4.add(rb4B);
        rb4B.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb4B.setText("Menangkap lawan di wilayah mereka");
        rb4B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4BActionPerformed(evt);
            }
        });
        tab1.add(rb4B, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 227, -1, -1));

        bgSoal4.add(rb4C);
        rb4C.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb4C.setText("Menjaga benteng tim sendiri");
        tab1.add(rb4C, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 254, -1, -1));

        bgSoal4.add(rb4D);
        rb4D.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb4D.setText("Menjatuhkan pemain lawan");
        tab1.add(rb4D, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 254, -1, -1));

        Pertanyaan5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Pertanyaan5.setText("<html>  5 .\"Bakiak\" adalah permainan tradisional yang dimainkan secara...?  </html>");
        tab1.add(Pertanyaan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 281, -1, -1));

        bgSoal5.add(rb5A);
        rb5A.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb5A.setText(" Individu");
        tab1.add(rb5A, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 303, -1, -1));

        bgSoal5.add(rb5B);
        rb5B.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb5B.setText("Tim");
        rb5B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5BActionPerformed(evt);
            }
        });
        tab1.add(rb5B, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 303, -1, -1));

        bgSoal5.add(rb5C);
        rb5C.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb5C.setText("Berpasangan");
        tab1.add(rb5C, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 303, -1, -1));

        bgSoal5.add(rb5D);
        rb5D.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rb5D.setText("Acak");
        tab1.add(rb5D, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 303, -1, -1));

        BtnKirimJawaban.setForeground(new java.awt.Color(102, 102, 102));
        BtnKirimJawaban.setText("Kirim");
        BtnKirimJawaban.setBorderColor(new java.awt.Color(51, 51, 51));
        BtnKirimJawaban.setRadius(20);
        BtnKirimJawaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKirimJawabanActionPerformed(evt);
            }
        });
        tab1.add(BtnKirimJawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, 30));

        BtnresetPermainan.setForeground(new java.awt.Color(102, 102, 102));
        BtnresetPermainan.setText("Reset");
        BtnresetPermainan.setBorderColor(new java.awt.Color(51, 51, 51));
        BtnresetPermainan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        BtnresetPermainan.setRadius(20);
        BtnresetPermainan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnresetPermainanActionPerformed(evt);
            }
        });
        tab1.add(BtnresetPermainan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, 30));

        lbKet.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbKet.setForeground(new java.awt.Color(102, 102, 102));
        lbKet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbKet.setText("<html>\n<center>\nAnda memiliki<br>\n2x Kesempatan<br>\n</center>\n</html>");
        tab1.add(lbKet, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/concentrate.png"))); // NOI18N
        tab1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        jTabbedPane1.addTab("Kuis", tab1);

        tab2.setBackground(new java.awt.Color(255, 255, 204));
        tab2.setForeground(new java.awt.Color(255, 255, 204));

        pFooter1.setBackground(new java.awt.Color(0, 0, 153));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Copyright © by, Aperta2k24");

        javax.swing.GroupLayout pFooter1Layout = new javax.swing.GroupLayout(pFooter1);
        pFooter1.setLayout(pFooter1Layout);
        pFooter1Layout.setHorizontalGroup(
            pFooter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFooter1Layout.createSequentialGroup()
                .addContainerGap(268, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(263, 263, 263))
        );
        pFooter1Layout.setVerticalGroup(
            pFooter1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFooter1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        lbjudul.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbjudul.setForeground(new java.awt.Color(102, 102, 102));
        lbjudul.setText("Daftar Orang-Orang Cerdas");

        lbgambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/profit.png"))); // NOI18N

        TblDataKuis.setBackground(new java.awt.Color(255, 255, 204));
        TblDataKuis.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        TblDataKuis.setForeground(new java.awt.Color(102, 102, 102));
        TblDataKuis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Nama", "Skor"
            }
        ));
        TblDataKuis.setShowGrid(true);
        jScrollPane1.setViewportView(TblDataKuis);

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFooter1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lbgambar))
                    .addGroup(tab2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lbjudul)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lbjudul)
                .addGap(18, 18, 18)
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbgambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(pFooter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Tabel Kuis", tab2);

        javax.swing.GroupLayout pAlasLayout = new javax.swing.GroupLayout(pAlas);
        pAlas.setLayout(pAlasLayout);
        pAlasLayout.setHorizontalGroup(
            pAlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        pAlasLayout.setVerticalGroup(
            pAlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        add(pAlas, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void rb2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2BActionPerformed

    private void rb3AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb3AActionPerformed

    private void rb3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb3BActionPerformed

    private void rb4BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb4BActionPerformed

    private void rb5BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb5BActionPerformed

    private void BtnKirimJawabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKirimJawabanActionPerformed
        if (kesempatan <= 0) {
        JOptionPane.showMessageDialog(this, 
                "Kesempatan Anda untuk mengisi kuis telah habis!", 
                "Tidak Bisa Mengisi", 
                JOptionPane.WARNING_MESSAGE, iconWarning);  
        return;
    }
        
        try {
            int skor = 0;

            // Pertanyaan 1: Sumatra Utara
            if (rb1A.isSelected()) {
                skor += 20;
            }

            // Pertanyaan 2: Kayu berputar
            if (rb2B.isSelected()) {
                skor += 20;
            }

            // Pertanyaan 3: Batang bambu panjang
            if (rb3A.isSelected()) {
                skor += 20;
            }

            // Pertanyaan 4: Menjaga benteng tim sendiri
            if (rb4C.isSelected()) {
                skor += 20;
            }

            // Pertanyaan 5: Tim
            if (rb5B.isSelected()) {
                skor += 20;
            }

            // Menampilkan skor dengan JOptionPane
            String message = "Skor Anda: " + skor;
            JOptionPane.showMessageDialog(this, message);

            // Meminta nama pengguna
            String nama = "";
            while (true) {
                nama = JOptionPane.showInputDialog(this, "Masukkan Nama Anda:");
                if (nama == null) {
                    JOptionPane.showMessageDialog(this,"Proses dibatalkan", "Gagal", JOptionPane.INFORMATION_MESSAGE,iconInvalid);
                    return;
                } else if (nama.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this,"Nama tidak boleh kosong", "Invalid", JOptionPane.INFORMATION_MESSAGE,iconInvalid);
                } else {
                    break;
                }
            }
            
             try {
                String sql = "INSERT INTO tb_data_quiz (nama, skor) VALUES (?, ?)";
                java.sql.Connection conn = (Connection) Koneksi.getKoneksi();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, nama);
                pst.setInt(2, skor);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Data berhasil disimpan", "Success", JOptionPane.INFORMATION_MESSAGE, iconSucces);
                load_data_kuis();
            } catch (HeadlessException | SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this,"Terjadi kesalahan saat menyimpan ke database", "Error", JOptionPane.ERROR_MESSAGE, iconWarning);
            }
             
             // mengurangi kesempatan dengan notifikasi pop-up
            kesempatan--;
            if (kesempatan > 0) {
                JOptionPane.showMessageDialog(this, 
                        "Anda masih memiliki " + kesempatan + " kesempatan lagi.", 
                        "Kesempatan Tersisa", 
                        JOptionPane.INFORMATION_MESSAGE,iconInfo);
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Kesempatan Anda habis! Terima kasih telah mengikuti kuis.", 
                        "Kesempatan Habis", 
                        JOptionPane.INFORMATION_MESSAGE,iconInfo);
            }

            // Reset kuis
            resetQuiz();

        }catch(NumberFormatException ex){

        }
    }//GEN-LAST:event_BtnKirimJawabanActionPerformed

    private void BtnresetPermainanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnresetPermainanActionPerformed
        resetQuiz();
    }//GEN-LAST:event_BtnresetPermainanActionPerformed

    private void resetQuiz() {
       bgSoal1.clearSelection();
       bgSoal2.clearSelection();
       bgSoal3.clearSelection();
       bgSoal4.clearSelection();
       bgSoal5.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton BtnKirimJawaban;
    private button.MyButton BtnresetPermainan;
    private javax.swing.JLabel Pertanyaan1;
    private javax.swing.JLabel Pertanyaan2;
    private javax.swing.JLabel Pertanyaan3;
    private javax.swing.JLabel Pertanyaan4;
    private javax.swing.JLabel Pertanyaan5;
    private javax.swing.JTable TblDataKuis;
    private javax.swing.ButtonGroup bgSoal1;
    private javax.swing.ButtonGroup bgSoal2;
    private javax.swing.ButtonGroup bgSoal3;
    private javax.swing.ButtonGroup bgSoal4;
    private javax.swing.ButtonGroup bgSoal5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbKet;
    private javax.swing.JLabel lbgambar;
    private javax.swing.JLabel lbjudul;
    private javax.swing.JPanel pAlas;
    private javax.swing.JPanel pFooter;
    private javax.swing.JPanel pFooter1;
    private javax.swing.JRadioButton rb1A;
    private javax.swing.JRadioButton rb1B;
    private javax.swing.JRadioButton rb1C;
    private javax.swing.JRadioButton rb1D;
    private javax.swing.JRadioButton rb2A;
    private javax.swing.JRadioButton rb2B;
    private javax.swing.JRadioButton rb2C;
    private javax.swing.JRadioButton rb2D;
    private javax.swing.JRadioButton rb3A;
    private javax.swing.JRadioButton rb3B;
    private javax.swing.JRadioButton rb3C;
    private javax.swing.JRadioButton rb3D;
    private javax.swing.JRadioButton rb4A;
    private javax.swing.JRadioButton rb4B;
    private javax.swing.JRadioButton rb4C;
    private javax.swing.JRadioButton rb4D;
    private javax.swing.JRadioButton rb5A;
    private javax.swing.JRadioButton rb5B;
    private javax.swing.JRadioButton rb5C;
    private javax.swing.JRadioButton rb5D;
    private test.PanelRound tab1;
    private test.PanelRound tab2;
    // End of variables declaration//GEN-END:variables

    private void load_data_kuis() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nama");
        model.addColumn("Skor");
        try {
            int no = 1;
            String sql = "SELECT nama, skor FROM tb_data_quiz";
            java.sql.Connection conn = (Connection) Koneksi.getKoneksi();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()){
                model.addRow(
                        new Object[]{
                            no++,
                            res.getString("nama"),
                            res.getString("skor"),
                        }
                );
            }
            TblDataKuis.setModel(model);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
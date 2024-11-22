/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

/**
 *
 * @author AbasZ
 */
public class MenuBerandaAdmin extends javax.swing.JPanel {

    /**
     * Creates new form MenuDaftarPermainan
     */
    public MenuBerandaAdmin() {
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

        pAlas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pGambar = new javax.swing.JPanel();
        gambarEnglek = new javax.swing.JLabel();
        gambarGobakSodor = new javax.swing.JLabel();
        gambarLoncatTali = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pFooter = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Lket1 = new javax.swing.JLabel();
        Lket2 = new javax.swing.JLabel();
        Lket3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(719, 423));
        setLayout(new java.awt.BorderLayout());

        pAlas.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Welcome to Beranda,");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Admin");

        pGambar.setBackground(new java.awt.Color(255, 255, 204));
        pGambar.setLayout(new java.awt.GridLayout(1, 3, 30, 0));

        gambarEnglek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/engklek.png"))); // NOI18N
        pGambar.add(gambarEnglek);

        gambarGobakSodor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/gobaksodor.jpeg"))); // NOI18N
        pGambar.add(gambarGobakSodor);

        gambarLoncatTali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/loncattali.jpg"))); // NOI18N
        gambarLoncatTali.setText("\n");
        pGambar.add(gambarLoncatTali);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Permainan Tradisional Nusantara");

        pFooter.setBackground(new java.awt.Color(0, 0, 153));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Copyright © by, Aperta2k24");

        javax.swing.GroupLayout pFooterLayout = new javax.swing.GroupLayout(pFooter);
        pFooter.setLayout(pFooterLayout);
        pFooterLayout.setHorizontalGroup(
            pFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        Lket1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Lket1.setText("<html> <center> Permainan Tradisional<br> Engklek </center> </html>");

        Lket2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Lket2.setText("<html> <center> Permainan Tradisional<br> Gobak Sodor </center> </html>");

        Lket3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Lket3.setText("<html> <center> Permainan Tradisional<br> Lompat Tali </center> </html>");

        javax.swing.GroupLayout pAlasLayout = new javax.swing.GroupLayout(pAlas);
        pAlas.setLayout(pAlasLayout);
        pAlasLayout.setHorizontalGroup(
            pAlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pAlasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pAlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pAlasLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 562, Short.MAX_VALUE))
                    .addComponent(pGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pAlasLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel6)))
                .addContainerGap())
            .addGroup(pAlasLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(Lket1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(Lket2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lket3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        pAlasLayout.setVerticalGroup(
            pAlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAlasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(pGambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pAlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lket1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lket2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lket3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(pAlas, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lket1;
    private javax.swing.JLabel Lket2;
    private javax.swing.JLabel Lket3;
    private javax.swing.JLabel gambarEnglek;
    private javax.swing.JLabel gambarGobakSodor;
    private javax.swing.JLabel gambarLoncatTali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pAlas;
    private javax.swing.JPanel pFooter;
    private javax.swing.JPanel pGambar;
    // End of variables declaration//GEN-END:variables
}

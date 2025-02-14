/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.sql.Connection;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/**
 *
 * @author AbasZ
 */
public class FormRegister extends javax.swing.JFrame {

    int xx, xy;
    
    public FormRegister() {
        initComponents();
    }
    
    ImageIcon iconInvalid = new javax.swing.ImageIcon(getClass().getResource("/Img/invalid.png"));
    ImageIcon iconSucces = new javax.swing.ImageIcon(getClass().getResource("/Img/berhasil.png"));
    ImageIcon iconWarning = new javax.swing.ImageIcon(getClass().getResource("/Img/alarm.png"));

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new test.PanelRound();
        panelRound2 = new test.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BtnClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnRegister = new button.MyButton();
        txtUsernameR = new javax.swing.JTextField();
        txtPassR = new javax.swing.JPasswordField();
        BtnPrevious = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(252, 252, 252));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(204, 255, 255));
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopRight(50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Permainan2.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("WELCOME TO APERTA");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Mari Belajar Tentang Permainan Tradisional");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Indonesia");

        BtnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close.png"))); // NOI18N
        BtnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel7)
                .addGap(0, 127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5)))
                        .addGap(36, 36, 36))
                    .addComponent(BtnClose, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addComponent(BtnClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Username");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Password");
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("REGISTER");
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        BtnRegister.setForeground(new java.awt.Color(102, 102, 102));
        BtnRegister.setText("Register");
        BtnRegister.setBorderColor(new java.awt.Color(51, 51, 51));
        BtnRegister.setColor(new java.awt.Color(0, 153, 255));
        BtnRegister.setColorClick(new java.awt.Color(255, 255, 255));
        BtnRegister.setColorOver(new java.awt.Color(204, 255, 255));
        BtnRegister.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        BtnRegister.setRadius(30);
        BtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegisterActionPerformed(evt);
            }
        });
        panelRound1.add(BtnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 107, 33));

        txtUsernameR.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtUsernameR.setForeground(new java.awt.Color(102, 102, 102));
        panelRound1.add(txtUsernameR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, 40));

        txtPassR.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtPassR.setText("jPasswordField1");
        txtPassR.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassRFocusGained(evt);
            }
        });
        panelRound1.add(txtPassR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 190, 40));

        BtnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/previous.png"))); // NOI18N
        BtnPrevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPreviousMouseClicked(evt);
            }
        });
        panelRound1.add(BtnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx , y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void BtnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BtnCloseMouseClicked

    private void txtPassRFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassRFocusGained
        txtPassR.setText("");
    }//GEN-LAST:event_txtPassRFocusGained

    private void BtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisterActionPerformed
        String username = txtUsernameR.getText();
        String password = new String(txtPassR.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Username dan Password tidak boleh kosong", 
                "Invalid", 
                JOptionPane.WARNING_MESSAGE, iconInvalid);  
            return;
        }

        try {
            String sql;
            sql = "INSERT INTO tb_user (username, password) VALUES (?, ?)";
            java.sql.Connection conn = (Connection) Koneksi.getKoneksi();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, 
                "Registrasi akun berhasil", 
                "Succes", 
                JOptionPane.WARNING_MESSAGE, iconSucces);  
            FormLogin FL = new FormLogin();
            FL.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) { // Error duplicate entry
                JOptionPane.showMessageDialog(this, 
                "Username sudah digunakan", 
                "Invalid", 
                JOptionPane.WARNING_MESSAGE, iconInvalid);  
            } else {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, 
                "Terjadi kealahan koneksi database", 
                "Error", 
                JOptionPane.WARNING_MESSAGE, iconWarning);  
            }
        }
    }//GEN-LAST:event_BtnRegisterActionPerformed

    private void BtnPreviousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPreviousMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new FormLogin().setVisible(true); 
    }//GEN-LAST:event_BtnPreviousMouseClicked

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
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnClose;
    private javax.swing.JLabel BtnPrevious;
    private button.MyButton BtnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private test.PanelRound panelRound1;
    private test.PanelRound panelRound2;
    private javax.swing.JPasswordField txtPassR;
    private javax.swing.JTextField txtUsernameR;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author joaom
 */

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.geom.RoundRectangle2D;
public class TelaCadastro extends javax.swing.JFrame {
    private int mouseX, mouseY;

    /**
     * Creates new form TelaLogin2
     */
    public TelaCadastro() {
        setUndecorated(true);
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(),getHeight(), 15, 15 ));
        ImageIcon icon = new ImageIcon("src/imagens/close-icon-png-19.jpg");
        icon.setImage(icon.getImage().getScaledInstance(btnFechar.getWidth(), btnFechar.getHeight(), 1));
        btnFechar.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoLogin = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        campoEmail = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JPanel();
        lbCadastrar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        fundoLogin.setBackground(new java.awt.Color(32, 33, 35));
        fundoLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fundoLoginMouseDragged(evt);
            }
        });
        fundoLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fundoLoginMousePressed(evt);
            }
        });

        campoNome.setBackground(new java.awt.Color(32, 33, 35));
        campoNome.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        campoNome.setForeground(new java.awt.Color(204, 204, 204));
        campoNome.setBorder(null);
        campoNome.setCaretColor(new java.awt.Color(204, 204, 204));
        campoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNomeFocusLost(evt);
            }
        });

        lbNome.setBackground(new java.awt.Color(0, 0, 0));
        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setText("Nome");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        campoEmail.setBackground(new java.awt.Color(32, 33, 35));
        campoEmail.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        campoEmail.setForeground(new java.awt.Color(204, 204, 204));
        campoEmail.setBorder(null);
        campoEmail.setCaretColor(new java.awt.Color(204, 204, 204));
        campoEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoEmailFocusLost(evt);
            }
        });

        lbEmail.setBackground(new java.awt.Color(0, 0, 0));
        lbEmail.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setText("Email");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        lbSenha.setBackground(new java.awt.Color(0, 0, 0));
        lbSenha.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(255, 255, 255));
        lbSenha.setText("Senha");

        campoSenha.setBackground(new java.awt.Color(32, 33, 35));
        campoSenha.setForeground(new java.awt.Color(204, 204, 204));
        campoSenha.setBorder(null);
        campoSenha.setCaretColor(new java.awt.Color(204, 204, 204));
        campoSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoSenhaFocusLost(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarjLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseExited(evt);
            }
        });

        lbCadastrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbCadastrar.setText("Cadastre-se");
        lbCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCadastrarjPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCadastrarjPanel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCadastrarLayout = new javax.swing.GroupLayout(btnCadastrar);
        btnCadastrar.setLayout(btnCadastrarLayout);
        btnCadastrarLayout.setHorizontalGroup(
            btnCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCadastrarLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lbCadastrar)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        btnCadastrarLayout.setVerticalGroup(
            btnCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(57, 113, 177));
        jLabel9.setText("Esqueceu a senha?");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Ja possui uma conta?");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(57, 113, 177));
        jLabel8.setText("Entrar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Cadastre-se");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(57, 113, 177));
        jLabel10.setText("Deseja relatar um problema?");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        btnFechar.setBackground(new java.awt.Color(32, 33, 35));
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/close-icon-png-19.jpg"))); // NOI18N
        btnFechar.setText("jLabel1");
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFecharMouseExited(evt);
            }
        });

        javax.swing.GroupLayout fundoLoginLayout = new javax.swing.GroupLayout(fundoLogin);
        fundoLogin.setLayout(fundoLoginLayout);
        fundoLoginLayout.setHorizontalGroup(
            fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLoginLayout.createSequentialGroup()
                .addGroup(fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoLoginLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundoLoginLayout.createSequentialGroup()
                        .addGroup(fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fundoLoginLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(campoSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fundoLoginLayout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addGroup(fundoLoginLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8))))))
                            .addGroup(fundoLoginLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fundoLoginLayout.setVerticalGroup(
            fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLoginLayout.createSequentialGroup()
                .addGroup(fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoLoginLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11))
                    .addGroup(fundoLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(lbNome)
                .addGap(6, 6, 6)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbEmail)
                .addGap(6, 6, 6)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusGained
        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 1, 13));
        lbNome.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoNomeFocusGained

    private void campoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusLost
        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbNome.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_campoNomeFocusLost

    private void campoEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEmailFocusGained
        lbEmail.setFont(new java.awt.Font("Segoe UI Variable", 1, 13));
        lbEmail.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoEmailFocusGained

    private void campoEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEmailFocusLost
        lbEmail.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbEmail.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_campoEmailFocusLost

    private void lbCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastrarMouseClicked
        this.dispose();
        TelaLogin2 tp = new TelaLogin2();
        tp.setVisible(true);
        UsuarioCadastrado uc = new UsuarioCadastrado();
        uc.setVisible(true);
    }//GEN-LAST:event_lbCadastrarMouseClicked

    private void lbCadastrarjPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastrarjPanel4MouseEntered
        btnCadastrar.setBackground(new java.awt.Color(57,113,177));
        lbCadastrar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_lbCadastrarjPanel4MouseEntered

    private void lbCadastrarjPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastrarjPanel4MouseExited
        btnCadastrar.setBackground(new java.awt.Color(255,255,255));
        lbCadastrar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_lbCadastrarjPanel4MouseExited

    private void btnCadastrarjLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarjLabel6MouseClicked
        this.dispose();
        TelaLogin2 tp = new TelaLogin2();
        tp.setVisible(true);
        UsuarioCadastrado uc = new UsuarioCadastrado();
        uc.setVisible(true);
        
    }//GEN-LAST:event_btnCadastrarjLabel6MouseClicked

    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        btnCadastrar.setBackground(new java.awt.Color(57,113,177));
        lbCadastrar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
        btnCadastrar.setBackground(new java.awt.Color(255,255,255));
        lbCadastrar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnCadastrarMouseExited

    private void campoSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusGained
        lbSenha.setFont(new java.awt.Font("Segoe UI Variable", 1, 13));
        lbSenha.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoSenhaFocusGained

    private void campoSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusLost
        lbSenha.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbSenha.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_campoSenhaFocusLost

    private void fundoLoginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundoLoginMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_fundoLoginMouseDragged

    private void fundoLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundoLoginMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_fundoLoginMousePressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.dispose();
        TelaLogin2 tl = new TelaLogin2();
        tl.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        this.dispose();
        TelaLogin2 tl = new TelaLogin2();
        tl.setVisible(true);
    }//GEN-LAST:event_btnFecharMouseClicked

    private void btnFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseEntered
        ImageIcon icon = new ImageIcon("src/imagens/close-icon-png-19 cópia.png");
        icon.setImage(icon.getImage().getScaledInstance(btnFechar.getWidth(), btnFechar.getHeight(), 1));
        btnFechar.setIcon(icon);
    }//GEN-LAST:event_btnFecharMouseEntered

    private void btnFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseExited
        ImageIcon icon = new ImageIcon("src/imagens/close-icon-png-19.jpg");
        icon.setImage(icon.getImage().getScaledInstance(btnFechar.getWidth(), btnFechar.getHeight(), 1));
        btnFechar.setIcon(icon);
    }//GEN-LAST:event_btnFecharMouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        RelatarProblema rp = new RelatarProblema();
        rp.setVisible(true);
        this.dispose();
               
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCadastrar;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JPanel fundoLogin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbCadastrar;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    // End of variables declaration//GEN-END:variables
}

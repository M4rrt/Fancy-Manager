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
public class RelatarProblema extends javax.swing.JFrame {
    private int mouseX, mouseY;

    /**
     * Creates new form TelaLogin2
     */
    public RelatarProblema() {
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
        campoSenha = new javax.swing.JPasswordField();
        btnEnviar = new javax.swing.JPanel();
        lbEnviar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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
        lbNome.setText("Descrição");

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
        lbEmail.setText("Urgência");

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

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

        btnEnviar.setBackground(new java.awt.Color(255, 255, 255));
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarjLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
        });

        lbEnviar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbEnviar.setText("Enviar");
        lbEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEnviarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbEnviarjPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbEnviarjPanel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEnviarLayout = new javax.swing.GroupLayout(btnEnviar);
        btnEnviar.setLayout(btnEnviarLayout);
        btnEnviarLayout.setHorizontalGroup(
            btnEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEnviarLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(lbEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        btnEnviarLayout.setVerticalGroup(
            btnEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEnviarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Relatar problema");

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
                .addGap(60, 60, 60)
                .addGroup(fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fundoLoginLayout.createSequentialGroup()
                        .addGroup(fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(fundoLoginLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel11))
        );
        fundoLoginLayout.setVerticalGroup(
            fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLoginLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(72, 72, 72)
                .addGroup(fundoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fundoLoginLayout.createSequentialGroup()
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
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fundoLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundoLoginMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_fundoLoginMousePressed

    private void fundoLoginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundoLoginMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_fundoLoginMouseDragged

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setBackground(new java.awt.Color(255,255,255));
        lbEnviar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnEnviarMouseExited

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        btnEnviar.setBackground(new java.awt.Color(57,113,177));
        lbEnviar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnEnviarjLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarjLabel6MouseClicked
        this.dispose();
        TelaLogin2 tp = new TelaLogin2();
        tp.setVisible(true);
        ProblemaRelatado pr = new ProblemaRelatado();
        pr.setVisible(true);
    }//GEN-LAST:event_btnEnviarjLabel6MouseClicked

    private void lbEnviarjPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEnviarjPanel4MouseExited
        btnEnviar.setBackground(new java.awt.Color(255,255,255));
        lbEnviar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_lbEnviarjPanel4MouseExited

    private void lbEnviarjPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEnviarjPanel4MouseEntered
        btnEnviar.setBackground(new java.awt.Color(57,113,177));
        lbEnviar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_lbEnviarjPanel4MouseEntered

    private void lbEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEnviarMouseClicked
        this.dispose();
        TelaLogin2 tp = new TelaLogin2();
        tp.setVisible(true);
        ProblemaRelatado pr = new ProblemaRelatado();
        pr.setVisible(true);
    }//GEN-LAST:event_lbEnviarMouseClicked

    private void campoSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusLost

    }//GEN-LAST:event_campoSenhaFocusLost

    private void campoSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusGained
 
    }//GEN-LAST:event_campoSenhaFocusGained

    private void campoEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEmailFocusLost
        lbEmail.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbEmail.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_campoEmailFocusLost

    private void campoEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEmailFocusGained
        lbEmail.setFont(new java.awt.Font("Segoe UI Variable", 1, 13));
        lbEmail.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoEmailFocusGained

    private void campoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusLost
        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbNome.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_campoNomeFocusLost

    private void campoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusGained
        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 1, 13));
        lbNome.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoNomeFocusGained

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
            java.util.logging.Logger.getLogger(RelatarProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatarProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatarProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatarProblema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatarProblema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnEnviar;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JPanel fundoLogin;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEnviar;
    private javax.swing.JLabel lbNome;
    // End of variables declaration//GEN-END:variables
}
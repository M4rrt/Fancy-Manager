/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;

/**
 *
 * @author joaom
 */
public class RemoverProduto extends javax.swing.JFrame {

    private int mouseX, mouseY;
    public RemoverProduto() {
        setUndecorated(true);
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(),getHeight(), 20, 20 ));
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

        jButton3 = new javax.swing.JButton();
        campoCodigo1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        campoNome = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnRemover = new javax.swing.JPanel();
        lbRemover = new javax.swing.JLabel();
        btnFechar = new javax.swing.JLabel();

        jButton3.setBackground(new java.awt.Color(144, 37, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Limpar");
        jButton3.setPreferredSize(new java.awt.Dimension(160, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        campoCodigo1.setBackground(new java.awt.Color(186, 176, 163));
        campoCodigo1.setMinimumSize(new java.awt.Dimension(160, 30));
        campoCodigo1.setPreferredSize(new java.awt.Dimension(160, 30));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remover Produto");

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Remover Produto");

        lbNome.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lbNome.setForeground(new java.awt.Color(204, 204, 204));
        lbNome.setText("Nome");

        campoNome.setBackground(new java.awt.Color(32, 33, 35));
        campoNome.setForeground(new java.awt.Color(204, 204, 204));
        campoNome.setToolTipText("");
        campoNome.setActionCommand("<Not Set>");
        campoNome.setBorder(null);
        campoNome.setCaretColor(new java.awt.Color(204, 204, 204));
        campoNome.setMinimumSize(new java.awt.Dimension(160, 30));
        campoNome.setPreferredSize(new java.awt.Dimension(160, 30));
        campoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNomeFocusLost(evt);
            }
        });

        lbCodigo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(204, 204, 204));
        lbCodigo.setText("Código");

        campoCodigo.setBackground(new java.awt.Color(32, 33, 35));
        campoCodigo.setForeground(new java.awt.Color(204, 204, 204));
        campoCodigo.setBorder(null);
        campoCodigo.setCaretColor(new java.awt.Color(204, 204, 204));
        campoCodigo.setMinimumSize(new java.awt.Dimension(160, 30));
        campoCodigo.setPreferredSize(new java.awt.Dimension(160, 30));
        campoCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCodigoFocusLost(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(255, 255, 255));
        btnRemover.setPreferredSize(new java.awt.Dimension(200, 40));
        btnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoverMouseExited(evt);
            }
        });

        lbRemover.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbRemover.setText("Remover");
        lbRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoverMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRemoverLayout = new javax.swing.GroupLayout(btnRemover);
        btnRemover.setLayout(btnRemoverLayout);
        btnRemoverLayout.setHorizontalGroup(
            btnRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRemoverLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(lbRemover)
                .addGap(72, 72, 72))
        );
        btnRemoverLayout.setVerticalGroup(
            btnRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRemoverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1)
                            .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(lbCodigo)
                            .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 109, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void campoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusGained
        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 1, 13));
        lbNome.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoNomeFocusGained

    private void campoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusLost
        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbNome.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_campoNomeFocusLost

    private void campoCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodigoFocusGained
        lbCodigo.setFont(new java.awt.Font("Segoe UI Variable", 1, 13));
        lbCodigo.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoCodigoFocusGained

    private void campoCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodigoFocusLost
        lbCodigo.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbCodigo.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_campoCodigoFocusLost

    private void btnRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseClicked
        ProdutoRemovido pr = new ProdutoRemovido();
        pr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRemoverMouseClicked

    private void btnRemoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseEntered
        btnRemover.setBackground(new java.awt.Color(57,113,177));
        lbRemover.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnRemoverMouseEntered

    private void btnRemoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseExited
        btnRemover.setBackground(new java.awt.Color(255,255,255));
        lbRemover.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnRemoverMouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        this.dispose();
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
            java.util.logging.Logger.getLogger(RemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoverProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnFechar;
    private javax.swing.JPanel btnRemover;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoCodigo1;
    private javax.swing.JTextField campoNome;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbRemover;
    // End of variables declaration//GEN-END:variables
}

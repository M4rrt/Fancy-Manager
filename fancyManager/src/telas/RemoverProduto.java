/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import Dao.ProdutoDao;
import classes.Produto;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author joaom
 */
public class RemoverProduto extends javax.swing.JFrame {

    /**
     * Creates new form RemoverProduto
     */
    public RemoverProduto() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        campoCod = new javax.swing.JTextField();
        lbCod = new javax.swing.JLabel();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remover Produto");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        jLabel1.setText("Remover Produto");

        campoCod.setBackground(new java.awt.Color(60, 63, 65));
        campoCod.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        campoCod.setBorder(null);
        campoCod.setPreferredSize(new java.awt.Dimension(258, 30));
        campoCod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoCodFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCodFocusLost(evt);
            }
        });
        campoCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoCodKeyReleased(evt);
            }
        });

        lbCod.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbCod.setText("C??digo");

        btnRemover.setText("Remover");
        btnRemover.setBorder(null);
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemover.setFocusable(false);
        btnRemover.setPreferredSize(new java.awt.Dimension(200, 40));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator6)
                            .addComponent(lbCod)
                            .addComponent(jLabel1)
                            .addComponent(campoCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbCod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoCodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodFocusGained
        lbCod.setFont(new java.awt.Font("Segoe UI Variable", 1, 12));
        lbCod.setForeground(new java.awt.Color(57,113,177));
        jSeparator6.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoCodFocusGained

    private void campoCodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodFocusLost
        lbCod.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbCod.setForeground(new java.awt.Color(187,187,187));
        jSeparator6.setForeground(new java.awt.Color(75,77,79));
    }//GEN-LAST:event_campoCodFocusLost

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        Produto p = new Produto();
        ProdutoDao pd = new ProdutoDao();

        if(campoCod.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo 'C??digo'" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoCod.requestFocus();
        }
        else if(campoCod.getText().length()>0){
            p.setCodigoProduto(Integer.parseInt(campoCod.getText()));
            pd.VerificarRegistro(p);
            
            if(pd.VerificarRegistro(p) == true){
                p.setCodigoProduto(Integer.parseInt(campoCod.getText()));
                pd.Remover(p);
            }
            else{
                JOptionPane.showMessageDialog(null, "O c??digo " + "'"+p.getCodigoProduto()+"'"+ " n??o existe\n", "", JOptionPane.ERROR_MESSAGE);
            }
        }
           
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void campoCodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCodKeyReleased
        campoCod.setText(campoCod.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_campoCodKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new FlatDarkLaf());
        }catch(Exception e){
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoverProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemover;
    private javax.swing.JTextField campoCod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbCod;
    // End of variables declaration//GEN-END:variables
}

package telas;

import Dao.ProdutoDao;
import SQL.ConexaoSQL;
import classes.Produto;
import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
public class CadastrarProdutos extends javax.swing.JFrame {
    private TelaPrincipal tp;
    public void MostrarTela(TelaPrincipal tp){
        this.tp =  tp;
        setVisible(true);
    }
    public CadastrarProdutos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        campoNome = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        campoQtd = new javax.swing.JTextField();
        lbQtd = new javax.swing.JLabel();
        lbEstoque = new javax.swing.JLabel();
        campoEstoque = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        campoDesc = new javax.swing.JTextField();
        lbDesc = new javax.swing.JLabel();
        btnLimpar1 = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produtos");
        setResizable(false);

        jLabel11.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        jLabel11.setText("Cadastrar Produto");

        jSeparator1.setPreferredSize(new java.awt.Dimension(258, 3));

        campoNome.setBackground(new java.awt.Color(60, 63, 65));
        campoNome.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        campoNome.setBorder(null);
        campoNome.setPreferredSize(new java.awt.Dimension(258, 30));
        campoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNomeFocusLost(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbNome.setText("Nome");

        lbValor.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbValor.setText("Valor");

        campoValor.setBackground(new java.awt.Color(60, 63, 65));
        campoValor.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        campoValor.setBorder(null);
        campoValor.setPreferredSize(new java.awt.Dimension(258, 30));
        campoValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoValorFocusLost(evt);
            }
        });
        campoValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoValorKeyReleased(evt);
            }
        });

        jSeparator3.setPreferredSize(new java.awt.Dimension(258, 3));

        campoQtd.setBackground(new java.awt.Color(60, 63, 65));
        campoQtd.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        campoQtd.setBorder(null);
        campoQtd.setPreferredSize(new java.awt.Dimension(258, 30));
        campoQtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoQtdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoQtdFocusLost(evt);
            }
        });
        campoQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoEstoqueKeyReleased(evt);
            }
        });

        lbQtd.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbQtd.setText("Quantidade");

        lbEstoque.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbEstoque.setText("Estoque Segurança");

        campoEstoque.setBackground(new java.awt.Color(60, 63, 65));
        campoEstoque.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        campoEstoque.setBorder(null);
        campoEstoque.setPreferredSize(new java.awt.Dimension(258, 30));
        campoEstoque.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoEstoqueFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoEstoqueFocusLost(evt);
            }
        });
        campoEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoEstoqueKeyReleased(evt);
            }
        });

        jSeparator5.setPreferredSize(new java.awt.Dimension(258, 3));

        campoDesc.setBackground(new java.awt.Color(60, 63, 65));
        campoDesc.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        campoDesc.setBorder(null);
        campoDesc.setPreferredSize(new java.awt.Dimension(258, 30));
        campoDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoDescFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoDescFocusLost(evt);
            }
        });

        lbDesc.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbDesc.setText("Descrição");

        btnLimpar1.setText("Limpar");
        btnLimpar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar1.setFocusPainted(false);
        btnLimpar1.setPreferredSize(new java.awt.Dimension(200, 40));
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setPreferredSize(new java.awt.Dimension(200, 40));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNome)
                            .addComponent(jLabel11)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoQtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbQtd)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbDesc))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2)
                                    .addComponent(campoValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbEstoque)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(29, 29, 29)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbQtd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lbDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusGained
        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 1, 12));
        lbNome.setForeground(new java.awt.Color(57,113,177));
        jSeparator1.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoNomeFocusGained

    private void campoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusLost
        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbNome.setForeground(new java.awt.Color(187,187,187));
        jSeparator1.setForeground(new java.awt.Color(75,77,79));
    }//GEN-LAST:event_campoNomeFocusLost

    private void campoValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoValorFocusGained
        lbValor.setFont(new java.awt.Font("Segoe UI Variable", 1, 12));
        lbValor.setForeground(new java.awt.Color(57,113,177));
        jSeparator2.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoValorFocusGained

    private void campoValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoValorFocusLost
        lbValor.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbValor.setForeground(new java.awt.Color(187,187,187));
        jSeparator2.setForeground(new java.awt.Color(75,77,79));
    }//GEN-LAST:event_campoValorFocusLost

    private void campoQtdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoQtdFocusGained
        lbQtd.setFont(new java.awt.Font("Segoe UI Variable", 1, 12));
        lbQtd.setForeground(new java.awt.Color(57,113,177));
        jSeparator3.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoQtdFocusGained

    private void campoQtdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoQtdFocusLost
        lbQtd.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbQtd.setForeground(new java.awt.Color(187,187,187));
        jSeparator3.setForeground(new java.awt.Color(75,77,79));
    }//GEN-LAST:event_campoQtdFocusLost

    private void campoEstoqueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEstoqueFocusGained
        lbEstoque.setFont(new java.awt.Font("Segoe UI Variable", 1, 12));
        lbEstoque.setForeground(new java.awt.Color(57,113,177));
        jSeparator4.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoEstoqueFocusGained

    private void campoEstoqueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEstoqueFocusLost
        lbEstoque.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbEstoque.setForeground(new java.awt.Color(187,187,187));
        jSeparator4.setForeground(new java.awt.Color(75,77,79));
    }//GEN-LAST:event_campoEstoqueFocusLost

    private void campoDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDescFocusGained
        lbDesc.setFont(new java.awt.Font("Segoe UI Variable", 1, 12));
        lbDesc.setForeground(new java.awt.Color(57,113,177));
        jSeparator5.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoDescFocusGained

    private void campoDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDescFocusLost
        lbDesc.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbDesc.setForeground(new java.awt.Color(187,187,187));
        jSeparator5.setForeground(new java.awt.Color(75,77,79));
    }//GEN-LAST:event_campoDescFocusLost

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Produto p = new Produto();
        ProdutoDao pd = new ProdutoDao();
        float valorMax = 10000000.00f;
        int qtd = 0,maxInt = 2147483647;
        char temp;
        
        for (int i = 0; i < campoValor.getText().length(); i++) {
            temp = campoValor.getText().charAt(i);
            if (temp == '.')
                qtd ++;
        }
        if(campoValor.getText().equals(".")){
            JOptionPane.showMessageDialog(null, "'Valor' Incorreto ponto" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoValor.requestFocus(); 
        }
        else if(qtd>=2){
            JOptionPane.showMessageDialog(null, "O campo 'valor' aceita apenas números" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoValor.requestFocus();
        } 
        else if(campoNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo 'Nome'" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoNome.requestFocus();
        }
        else if(campoNome.getText().length()>50){
            JOptionPane.showMessageDialog(null, "O campo 'Nome' comporta apenas 50 caracteres" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoNome.requestFocus();
        }
        else if(campoValor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo 'valor'" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoValor.requestFocus();
        }
        else if(Float.parseFloat(campoValor.getText()) >= valorMax & campoValor.getText().length()>10){
            JOptionPane.showMessageDialog(null, "'Valor' Maxímo: 9999999.99" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoValor.requestFocus();
        }
        else if(Float.parseFloat(campoValor.getText()) <= 0){
            JOptionPane.showMessageDialog(null, "'Valor' Incorreto" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoValor.requestFocus();
        }
        else if(campoQtd.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo 'Quantidade'" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoQtd.requestFocus();
        }
        else if(campoQtd.getText().length()>9){
            JOptionPane.showMessageDialog(null, "'Quantidade' Maxíma: 9999999999" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoQtd.requestFocus();
        }
        else if(Integer.parseInt(campoQtd.getText()) >= maxInt){
            JOptionPane.showMessageDialog(null, "'Quantidade' Maxíma: 2147483646" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoQtd.requestFocus();
        }
        else if(campoEstoque.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo 'Estoque Segurança'" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoEstoque.requestFocus();
        }
        else if(campoEstoque.getText().length()>9){
            JOptionPane.showMessageDialog(null, "'Quantidade' Maxíma: 9999999999" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoEstoque.requestFocus();
        }
        else if(Integer.parseInt(campoEstoque.getText()) >= maxInt){
            JOptionPane.showMessageDialog(null, "Quantidade Maxíma: 2147483646" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoEstoque.requestFocus();
        }
        else if(campoDesc.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo Descrição" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoDesc.requestFocus();
        }
        else if(campoDesc.getText().length()>50){
            JOptionPane.showMessageDialog(null, "O campo Descrição comporta apenas 80 caracteres" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoNome.requestFocus();
        }
        else{
            try {
                p.setNome(campoNome.getText());
                p.setDescricao(campoDesc.getText());
                p.setQuantidade(Integer.parseInt(campoQtd.getText()));
                p.setPrecoProduto(Float.parseFloat(campoValor.getText()));
                p.setEstoqueSeguranca(Integer.parseInt(campoEstoque.getText()));
                if(Integer.parseInt(campoQtd.getText()) < Integer.parseInt(campoEstoque.getText())){
                    p.setAlerta("Quantidade abaixo do estoque minímo");
                }
                else if(Integer.parseInt(campoQtd.getText()) == Integer.parseInt(campoEstoque.getText())){
                    p.setAlerta("Quantidade equivalente ao estoque minímo");
                } 
                else{
                    p.setAlerta("Quantidade OK");
                }
                pd.Adicionar(p);
                tp.CarregarTabela();
                this.dispose();
                
            } 
            catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "ERRO:  "+ex, "", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        campoNome.setText("");
        campoDesc.setText("");
        campoEstoque.setText("");
        campoDesc.setText("");
        campoValor.setText("");
        campoQtd.setText("");
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void campoValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoValorKeyReleased
        campoValor.setText(campoValor.getText().replaceAll("[^0-9.]", ""));
    }//GEN-LAST:event_campoValorKeyReleased

    private void campoEstoqueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEstoqueKeyReleased
        campoEstoque.setText(campoEstoque.getText().replaceAll("[^0-9]", ""));
        campoQtd.setText(campoQtd.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_campoEstoqueKeyReleased

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
                new CadastrarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JTextField campoDesc;
    private javax.swing.JTextField campoEstoque;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoQtd;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbEstoque;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbQtd;
    private javax.swing.JLabel lbValor;
    // End of variables declaration//GEN-END:variables
}

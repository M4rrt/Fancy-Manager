package telas;

import Dao.ProdutoDao;
import classes.Produto;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class AlterarProduto extends javax.swing.JFrame {
    private TelaPrincipal tp;
    public void MostrarTela(TelaPrincipal tp){
        this.tp =  tp;
        setVisible(true);
    }
    public AlterarProduto() {
        initComponents();
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
    }
    public void setNomeRegistro(String valorNome) {
        jLabel1.setText(valorNome);
    }
    public void setNomeBusca(String valorBusca) {
        jLabel2.setText(valorBusca);
    }
    public void setResulBusca(String valorBusca) {
        jLabel3.setText(valorBusca);
    }
    public void setCampoCod(int valorCod) {
        campoCod.setText(Integer.toString(valorCod));
    }
    public void setCampoNome(String valorNome) {
        campoNome.setText(valorNome);
    }
    public void setCampoValor(float valorPreco) {
        campoValor.setText(Float.toString(valorPreco));
    }
    public void setCampoQtd(int valorQtd) {
        campoQtd.setText(Integer.toString(valorQtd));
    }
    public void setCampoEstoque(int valorEstoque) {
        campoEstoque.setText(Integer.toString(valorEstoque));
    }
    public void setCampoDesc(String valorDesc) {
        campoDesc.setText(valorDesc);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        lbValor = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lbQtd = new javax.swing.JLabel();
        campoQtd = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lbEstoque = new javax.swing.JLabel();
        campoEstoque = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lbDesc = new javax.swing.JLabel();
        campoDesc = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lbCod = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        btnLimpar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        campoCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Produto");
        setBackground(new java.awt.Color(32, 33, 35));
        setResizable(false);

        titulo.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        titulo.setText("Alterar Produto");

        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setFocusPainted(false);
        btnAlterar.setPreferredSize(new java.awt.Dimension(200, 40));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

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

        lbQtd.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbQtd.setText("Quantidade");

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
                campoQtdKeyReleased(evt);
            }
        });

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

        lbDesc.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbDesc.setText("Descrição");

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

        lbCod.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbCod.setText("Código");

        btnLimpar.setText("Limpar");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.setOpaque(true);
        btnLimpar.setPreferredSize(new java.awt.Dimension(200, 40));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        lbNome.setText("Nome");

        campoCod.setBackground(new java.awt.Color(60, 63, 65));
        campoCod.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        campoCod.setBorder(null);
        campoCod.setEnabled(false);
        campoCod.setPreferredSize(new java.awt.Dimension(258, 30));
        campoCod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoCodFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCodFocusLost(evt);
            }
        });

        jLabel1.setEnabled(false);

        jLabel2.setEnabled(false);

        jLabel3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator3)
                                .addComponent(campoQtd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator5)
                                .addComponent(campoDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1)
                                .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbQtd)
                                        .addComponent(lbDesc)
                                        .addComponent(lbNome))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEstoque)
                            .addComponent(lbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCod)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(campoCod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(39, 39, 39))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 19, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(titulo))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbQtd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Produto p = new Produto();
        ProdutoDao pd = new ProdutoDao();
        float valorMax = 10000000.00f;
        int qtd = 0,maxInt = 2147483647, erro=0;
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
        else if(Float.parseFloat(campoValor.getText()) >= valorMax){
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
        else if(campoEstoque.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo 'Estoque Segurança'" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoEstoque.requestFocus();
        }
        else if(campoEstoque.getText().length()>9){
            JOptionPane.showMessageDialog(null, "'Estoque Mínimo' Maxímo: 9999999999" , "Erro", JOptionPane.ERROR_MESSAGE);
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
        else if(campoDesc.getText().length()>80){
            JOptionPane.showMessageDialog(null, "O campo Descrição comporta apenas 80 caracteres" , "Erro", JOptionPane.ERROR_MESSAGE);
            campoNome.requestFocus();
        }
            else{
                int input = JOptionPane.showConfirmDialog(null, "Deseja mesmo alterar o produto: "+jLabel1.getText(), "Alterar Produto", JOptionPane.OK_CANCEL_OPTION);
                if(input == JOptionPane.OK_OPTION){
                    p.setCodigoProduto(Integer.parseInt(campoCod.getText()));
                    p.setNome(campoNome.getText());
                    p.setDescricao(campoDesc.getText());
                    p.setQuantidade(Integer.parseInt(campoQtd.getText()));
                    p.setPrecoProduto(Float.parseFloat(campoValor.getText()));
                    p.setEstoqueSeguranca(Integer.parseInt(campoEstoque.getText()));
                    if(Integer.parseInt(campoQtd.getText()) < Integer.parseInt(campoEstoque.getText())){
                        p.setAlerta("Quantidade Abaixo do estoque minímo");
                    }
                    else if(Integer.parseInt(campoQtd.getText()) == Integer.parseInt(campoEstoque.getText())){
                        p.setAlerta("Quantidade equivalente estoque minímo");
                    } 
                    else{
                        p.setAlerta("Quantidade OK");
                    }
                    if(jLabel3.getText().isEmpty()){
                        pd.Alterar(p);
                        this.tp.CarregarTabela();
                        this.dispose();
                    }
                    else if(jLabel2.getText().equals("Código")){
                        pd.Alterar(p);
                        this.tp.CarregarCodigo();
                        this.dispose();
                    }
                    else if(jLabel2.getText().equals("Nome")){
                        pd.Alterar(p);
                        this.tp.CarregarBuscaNome();
                        this.dispose();
                    }
                    else if(jLabel2.getText().equals("Descrição")){
                        pd.Alterar(p);
                        this.tp.CarregarBuscaDesc();
                        this.dispose();
                    }
                    
                }
            }     
    }//GEN-LAST:event_btnAlterarActionPerformed

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

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        campoNome.setText("");
        campoDesc.setText("");
        campoEstoque.setText("");
        campoCod.setText("");
        campoValor.setText("");
        campoQtd.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void campoQtdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoQtdKeyReleased
        campoQtd.setText(campoQtd.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_campoQtdKeyReleased

    private void campoEstoqueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEstoqueKeyReleased
        campoEstoque.setText(campoEstoque.getText().replaceAll("[^0-9]", ""));
    }//GEN-LAST:event_campoEstoqueKeyReleased

    private void campoValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoValorKeyReleased
        campoValor.setText(campoValor.getText().replaceAll("[^0-9.]", ""));
    }//GEN-LAST:event_campoValorKeyReleased

    private void campoCodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodFocusGained

    private void campoCodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodFocusLost

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new FlatDarkLaf());
        }catch(Exception e){
            e.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarProduto().setVisible(true);
            }
        });
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JTextField campoCod;
    private javax.swing.JTextField campoDesc;
    private javax.swing.JTextField campoEstoque;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoQtd;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbCod;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbEstoque;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbQtd;
    private javax.swing.JLabel lbValor;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

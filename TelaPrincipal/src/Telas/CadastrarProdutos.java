package Telas;

import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;


public class CadastrarProdutos extends javax.swing.JFrame {

    private int mouseX, mouseY;
    public CadastrarProdutos() {
        setUndecorated(true);
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(),getHeight(), 20, 20 ));
        ImageIcon icon = new ImageIcon("src/imagens/close-icon-png-19.jpg");
        icon.setImage(icon.getImage().getScaledInstance(btnFechar.getWidth(), btnFechar.getHeight(), 1));
        btnFechar.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoNome = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        lbQtd = new javax.swing.JLabel();
        campoDesc = new javax.swing.JTextField();
        lbSeguranca = new javax.swing.JLabel();
        campoEstoqueSeg = new javax.swing.JTextField();
        lbDesc = new javax.swing.JLabel();
        campoQtd = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JPanel();
        lbLimpar = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JPanel();
        lbCadastrar = new javax.swing.JLabel();
        btnFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Produto");

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

        lbNome.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lbNome.setForeground(new java.awt.Color(204, 204, 204));
        lbNome.setText("Nome");

        lbValor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lbValor.setForeground(new java.awt.Color(204, 204, 204));
        lbValor.setText("Valor");

        campoValor.setBackground(new java.awt.Color(32, 33, 35));
        campoValor.setForeground(new java.awt.Color(204, 204, 204));
        campoValor.setBorder(null);
        campoValor.setCaretColor(new java.awt.Color(204, 204, 204));
        campoValor.setMinimumSize(new java.awt.Dimension(160, 30));
        campoValor.setPreferredSize(new java.awt.Dimension(160, 30));
        campoValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoValorFocusLost(evt);
            }
        });

        lbQtd.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lbQtd.setForeground(new java.awt.Color(204, 204, 204));
        lbQtd.setText("Quantidade");

        campoDesc.setBackground(new java.awt.Color(32, 33, 35));
        campoDesc.setForeground(new java.awt.Color(204, 204, 204));
        campoDesc.setBorder(null);
        campoDesc.setCaretColor(new java.awt.Color(204, 204, 204));
        campoDesc.setMinimumSize(new java.awt.Dimension(160, 25));
        campoDesc.setPreferredSize(new java.awt.Dimension(160, 25));
        campoDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoDescFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoDescFocusLost(evt);
            }
        });

        lbSeguranca.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lbSeguranca.setForeground(new java.awt.Color(204, 204, 204));
        lbSeguranca.setText("Segurança");

        campoEstoqueSeg.setBackground(new java.awt.Color(32, 33, 35));
        campoEstoqueSeg.setForeground(new java.awt.Color(204, 204, 204));
        campoEstoqueSeg.setBorder(null);
        campoEstoqueSeg.setCaretColor(new java.awt.Color(204, 204, 204));
        campoEstoqueSeg.setMinimumSize(new java.awt.Dimension(160, 30));
        campoEstoqueSeg.setPreferredSize(new java.awt.Dimension(160, 25));
        campoEstoqueSeg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoEstoqueSegFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoEstoqueSegFocusLost(evt);
            }
        });

        lbDesc.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        lbDesc.setForeground(new java.awt.Color(204, 204, 204));
        lbDesc.setText("Descrição");

        campoQtd.setBackground(new java.awt.Color(32, 33, 35));
        campoQtd.setForeground(new java.awt.Color(204, 204, 204));
        campoQtd.setBorder(null);
        campoQtd.setCaretColor(new java.awt.Color(204, 204, 204));
        campoQtd.setMinimumSize(new java.awt.Dimension(160, 30));
        campoQtd.setPreferredSize(new java.awt.Dimension(160, 25));
        campoQtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoQtdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoQtdFocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Cadastrar Produto");

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setPreferredSize(new java.awt.Dimension(200, 40));
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparjLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimparMouseExited(evt);
            }
        });

        lbLimpar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lbLimpar.setText("Limpar");
        lbLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLimparMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbLimparjPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbLimparjPanel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLimparLayout = new javax.swing.GroupLayout(btnLimpar);
        btnLimpar.setLayout(btnLimparLayout);
        btnLimparLayout.setHorizontalGroup(
            btnLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimparLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(lbLimpar)
                .addGap(80, 80, 80))
        );
        btnLimparLayout.setVerticalGroup(
            btnLimparLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimparLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(200, 40));
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
        lbCadastrar.setText("Cadastrar");
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
                .addGap(71, 71, 71)
                .addComponent(lbCadastrar)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        btnCadastrarLayout.setVerticalGroup(
            btnCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
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
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbDesc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoDesc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbQtd)
                                        .addComponent(jSeparator1)
                                        .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator3)
                                        .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbValor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2)
                                    .addComponent(campoValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbSeguranca)
                                    .addComponent(jSeparator7)
                                    .addComponent(campoEstoqueSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel11)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(lbValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbSeguranca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEstoqueSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbQtd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(lbDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
        btnCadastrar.setBackground(new java.awt.Color(255,255,255));
        lbCadastrar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnCadastrarMouseExited

    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        btnCadastrar.setBackground(new java.awt.Color(57,113,177));
        lbCadastrar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void btnCadastrarjLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarjLabel6MouseClicked
        ProdutoCadastrado pc = new ProdutoCadastrado();
        pc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastrarjLabel6MouseClicked

    private void lbCadastrarjPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastrarjPanel4MouseExited
        btnCadastrar.setBackground(new java.awt.Color(255,255,255));
        lbCadastrar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_lbCadastrarjPanel4MouseExited

    private void lbCadastrarjPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastrarjPanel4MouseEntered
        btnCadastrar.setBackground(new java.awt.Color(57,113,177));
        lbCadastrar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_lbCadastrarjPanel4MouseEntered

    private void lbCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCadastrarMouseClicked
        ProdutoCadastrado pc = new ProdutoCadastrado();
        pc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbCadastrarMouseClicked

    private void btnLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseExited
        btnLimpar.setBackground(new java.awt.Color(255,255,255));
        lbLimpar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_btnLimparMouseExited

    private void btnLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseEntered
        btnLimpar.setBackground(new java.awt.Color(57,113,177));
        lbLimpar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnLimparMouseEntered

    private void btnLimparjLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparjLabel6MouseClicked
        campoNome.setText("");
        campoDesc.setText("");
        campoEstoqueSeg.setText("");
        campoDesc.setText("");
        campoValor.setText("");
        campoQtd.setText("");
    }//GEN-LAST:event_btnLimparjLabel6MouseClicked

    private void lbLimparjPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLimparjPanel4MouseExited
        btnLimpar.setBackground(new java.awt.Color(255,255,255));
        lbLimpar.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_lbLimparjPanel4MouseExited

    private void lbLimparjPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLimparjPanel4MouseEntered
        btnLimpar.setBackground(new java.awt.Color(57,113,177));
        lbLimpar.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_lbLimparjPanel4MouseEntered

    private void lbLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLimparMouseClicked
        campoNome.setText("");
        campoDesc.setText("");
        campoEstoqueSeg.setText("");
        campoDesc.setText("");
        campoValor.setText("");
        campoQtd.setText("");
    }//GEN-LAST:event_lbLimparMouseClicked

    private void campoNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusGained
        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 1, 13));
        lbNome.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoNomeFocusGained

    private void campoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNomeFocusLost
        lbNome.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbNome.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_campoNomeFocusLost

    private void campoValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoValorFocusGained
        lbValor.setFont(new java.awt.Font("Segoe UI Variable", 1, 13));
        lbValor.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoValorFocusGained

    private void campoValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoValorFocusLost
        lbValor.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbValor.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_campoValorFocusLost

    private void campoQtdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoQtdFocusGained
        lbQtd.setFont(new java.awt.Font("Segoe UI Variable", 1, 13));
        lbQtd.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoQtdFocusGained

    private void campoQtdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoQtdFocusLost
        lbQtd.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbQtd.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_campoQtdFocusLost

    private void campoEstoqueSegFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEstoqueSegFocusGained
        lbSeguranca.setFont(new java.awt.Font("Segoe UI Variable", 1, 13));
        lbSeguranca.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoEstoqueSegFocusGained

    private void campoEstoqueSegFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoEstoqueSegFocusLost
        lbSeguranca.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbSeguranca.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_campoEstoqueSegFocusLost

    private void campoDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDescFocusGained
        lbDesc.setFont(new java.awt.Font("Segoe UI Variable", 1, 13));
        lbDesc.setForeground(new java.awt.Color(57,113,177));
    }//GEN-LAST:event_campoDescFocusGained

    private void campoDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoDescFocusLost
        lbDesc.setFont(new java.awt.Font("Segoe UI Variable", 0, 12));
        lbDesc.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_campoDescFocusLost

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mouseX, y-mouseY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

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
            java.util.logging.Logger.getLogger(CadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCadastrar;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JPanel btnLimpar;
    private javax.swing.JTextField campoDesc;
    private javax.swing.JTextField campoEstoqueSeg;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoQtd;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lbCadastrar;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbLimpar;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbQtd;
    private javax.swing.JLabel lbSeguranca;
    private javax.swing.JLabel lbValor;
    // End of variables declaration//GEN-END:variables
}

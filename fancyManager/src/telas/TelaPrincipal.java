package telas;

import Dao.ProdutoDao;
import SQL.ConexaoSQL;
import classes.Produto;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {
    Produto prud = new Produto();
    public TelaPrincipal() {
        initComponents();
        jLabel1.setVisible(false);
        CarregarTabela();
        ImageIcon icon = new ImageIcon("src/imagens/refresh.png");
        icon.setImage(icon.getImage().getScaledInstance(btnBuscar.getWidth()-15, btnBuscar.getHeight()-15,100));
        btnBuscar.setIcon(icon);
        tbProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        comboBusca = new javax.swing.JComboBox<>();
        campoBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAvisos = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jp Modas");

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Preço", "Quantidade", "Nome", "Descrição", "Estoque Minimo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        tbProduto.setFocusable(false);
        tbProduto.setSelectionBackground(new java.awt.Color(60, 63, 65));
        tbProduto.setSelectionForeground(new java.awt.Color(57, 113, 177));
        tbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduto);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Corbel Light", 0, 24)); // NOI18N
        jLabel12.setText("Buscar por");

        comboBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Código", "Descrição" }));
        comboBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBuscaActionPerformed(evt);
            }
        });

        campoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscaActionPerformed(evt);
            }
        });
        campoBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoBuscaKeyReleased(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/refresh.png"))); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusable(false);
        btnBuscar.setPreferredSize(new java.awt.Dimension(32, 32));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemover.setFocusable(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnAvisos.setText("Avisos");
        btnAvisos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAvisos.setFocusable(false);
        btnAvisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvisosActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setFocusable(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIncluir.setFocusable(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        jLabel1.setEnabled(false);
        jLabel1.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

       ProdutoDao pd = new ProdutoDao();
       String valorBusca = comboBusca.getSelectedItem().toString();
       if(campoBusca.getText().isEmpty()){
           CarregarTabela();
       }
       else if(campoBusca.getText().length()>0 & valorBusca.equals("Código")){
            prud.setCodigoProduto(Integer.parseInt(campoBusca.getText()));
            pd.VerificarRegistro(prud);
            
            if(pd.VerificarRegistro(prud) == true){
                prud.setCodigoProduto(Integer.parseInt(campoBusca.getText()));
                pd.BuscaCodigo(prud);
                CarregarCodigo();
                jLabel1.setText(campoBusca.getText());
            }
            else{
                JOptionPane.showMessageDialog(null, "O código " + "'"+prud.getCodigoProduto()+"'"+ " não existe\n", "", JOptionPane.ERROR_MESSAGE);
            }
        }
       else if(valorBusca.equals("Nome")){
           prud.setNome("'%"+campoBusca.getText()+"%';");
           pd.ListarBuscarNome(prud.getNome());
           CarregarBuscaNome();
           jLabel1.setText(campoBusca.getText());
       }
       else if(valorBusca.equals("Descrição")){
           prud.setDescricao("'%"+campoBusca.getText()+"%';");
           pd.ListarBuscarDesc(prud.getDescricao());
           CarregarBuscaDesc();
           jLabel1.setText(campoBusca.getText());
       }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void comboBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBuscaActionPerformed

    }//GEN-LAST:event_comboBuscaActionPerformed

    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
         
    }//GEN-LAST:event_tbProdutoMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        Produto p = new Produto();
        ProdutoDao pd = new ProdutoDao();
        int index = tbProduto.getSelectedRow();
        String valorBusca = comboBusca.getSelectedItem().toString();
        try{
            if(jLabel1.getText().isEmpty()){
                p = pd.ListarBuscarNome("'%%'").get(index);
                int input = JOptionPane.showConfirmDialog(null, "Deseja mesmo remover o produto: "+p.getNome(), "Remover Produto", JOptionPane.OK_CANCEL_OPTION);
                if(input == JOptionPane.OK_OPTION){
                    pd.Remover(p);
                    CarregarTabela();
                }
            }
            else if(campoBusca.getText().length()>=0 & valorBusca.equals("Código")){
                p = pd.BuscaCodigo(prud).get(index);
                int input = JOptionPane.showConfirmDialog(null, "Deseja mesmo remover o produto: "+p.getNome(), "Remover Produto", JOptionPane.OK_CANCEL_OPTION);
                if(input == JOptionPane.OK_OPTION){
                    pd.Remover(p);
                    CarregarCodigo();
                }
            }
            else if(campoBusca.getText().length()>=0 & valorBusca.equals("Nome")){
                p = pd.ListarBuscarNome(prud.getNome()).get(index);
                int input = JOptionPane.showConfirmDialog(null, "Deseja mesmo remover o produto: "+p.getNome(), "Remover Produto", JOptionPane.OK_CANCEL_OPTION);
                if(input == JOptionPane.OK_OPTION){
                    pd.Remover(p);
                    CarregarBuscaNome();
                }
            }
            else if(campoBusca.getText().length()>=0 & valorBusca.equals("Descrição")){
                p = pd.ListarBuscarDesc(prud.getDescricao()).get(index);
                int input = JOptionPane.showConfirmDialog(null, "Deseja mesmo remover o produto: "+p.getNome(), "Remover Produto", JOptionPane.OK_CANCEL_OPTION);
                if(input == JOptionPane.OK_OPTION){
                    pd.Remover(p);
                    CarregarBuscaDesc();
                }
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela principal para remover", "", JOptionPane.ERROR_MESSAGE);
        }
          
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnAvisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvisosActionPerformed
        Avisos a = new Avisos();
        a.setVisible(true);
    }//GEN-LAST:event_btnAvisosActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        Produto p = new Produto();
        ProdutoDao pd = new ProdutoDao();
        String valorBusca = comboBusca.getSelectedItem().toString();
        int index = tbProduto.getSelectedRow();
        try{
            if(campoBusca.getText().length()>0 & valorBusca.equals("Código")){
                p = pd.BuscaCodigo(prud).get(index);
            }
            else if(campoBusca.getText().length()>0 & valorBusca.equals("Nome")){
                p = pd.ListarBuscarNome(prud.getNome()).get(index);
            }
            else if(campoBusca.getText().length()>0 & valorBusca.equals("Descrição")){
                p = pd.ListarBuscarDesc(prud.getDescricao()).get(index);  
            }
            else{
               p = pd.Listar().get(index);
            }
            AlterarProduto ap = new AlterarProduto();
            ap.setCampoValor((float) p.getPrecoProduto());
            ap.setCampoQtd(p.getQuantidade());
            ap.setCampoEstoque(p.getEstoqueSeguranca());
            ap.setCampoDesc(p.getDescricao());
            ap.setCampoCod(p.getCodigoProduto());
            ap.setCampoNome(p.getNome());
            ap.setNomeRegistro(p.getNome());
            ap.setResulBusca(jLabel1.getText());
            ap.setNomeBusca(comboBusca.getSelectedItem().toString());
            ap.MostrarTela(this);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela principal para alterar", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        CadastrarProdutos cp = new CadastrarProdutos();
        cp.MostrarTela(this);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void campoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscaActionPerformed

    private void campoBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscaKeyReleased
        String valorBusca = comboBusca.getSelectedItem().toString();
        if(valorBusca.equals("Código")){
            campoBusca.setText(campoBusca.getText().replaceAll("[^0-9]", ""));
        }
    }//GEN-LAST:event_campoBuscaKeyReleased

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new FlatDarkLaf());
        }catch(Exception e){
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    public void CarregarBuscaNome(){
        ProdutoDao pd = new ProdutoDao();
        DefaultTableModel modelo = (DefaultTableModel) tbProduto.getModel();
        modelo.setNumRows(0);
        tbProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbProduto.getColumnModel().getColumn(1).setPreferredWidth(10);
        tbProduto.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbProduto.getColumnModel().getColumn(4).setPreferredWidth(270);
        tbProduto.getColumnModel().getColumn(5).setPreferredWidth(10);
        try{
            for(Produto p:pd.ListarBuscarNome(prud.getNome())){
                modelo.addRow(new Object[]{
                    p.getCodigoProduto(),
                    p.getPrecoProduto(),
                    p.getQuantidade(),
                    p.getNome(),
                    p.getDescricao(),
                    p.getEstoqueSeguranca()
                });
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO!\n" + e);
        }
            
    }
    public void CarregarTabela(){
        ProdutoDao pd = new ProdutoDao();
        DefaultTableModel modelo = (DefaultTableModel) tbProduto.getModel();
        modelo.setNumRows(0);
        tbProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbProduto.getColumnModel().getColumn(1).setPreferredWidth(10);
        tbProduto.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbProduto.getColumnModel().getColumn(4).setPreferredWidth(270);
        tbProduto.getColumnModel().getColumn(5).setPreferredWidth(10);
        try{
            for(Produto p:pd.ListarBuscarNome("'%%'")){
                modelo.addRow(new Object[]{
                    p.getCodigoProduto(),
                    p.getPrecoProduto(),
                    p.getQuantidade(),
                    p.getNome(),
                    p.getDescricao(),
                    p.getEstoqueSeguranca()
                });
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO!\n" + e);
        }
            
    }
    public void CarregarCodigo(){
        ProdutoDao pd = new ProdutoDao();
        DefaultTableModel modelo = (DefaultTableModel) tbProduto.getModel();
        modelo.setNumRows(0);
        tbProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbProduto.getColumnModel().getColumn(1).setPreferredWidth(10);
        tbProduto.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbProduto.getColumnModel().getColumn(4).setPreferredWidth(270);
        tbProduto.getColumnModel().getColumn(5).setPreferredWidth(10);
        try{
            for(Produto p:pd.BuscaCodigo(prud)){
                modelo.addRow(new Object[]{
                    p.getCodigoProduto(),
                    p.getPrecoProduto(),
                    p.getQuantidade(),
                    p.getNome(),
                    p.getDescricao(),
                    p.getEstoqueSeguranca()
                });
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO!\n" + e);
        }
            
    }
    public void CarregarBuscaDesc(){
        ProdutoDao pd = new ProdutoDao();
        DefaultTableModel modelo = (DefaultTableModel) tbProduto.getModel();
        modelo.setNumRows(0);
        tbProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
        tbProduto.getColumnModel().getColumn(1).setPreferredWidth(10);
        tbProduto.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbProduto.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbProduto.getColumnModel().getColumn(4).setPreferredWidth(270);
        tbProduto.getColumnModel().getColumn(5).setPreferredWidth(10);
        try{
            for(Produto p:pd.ListarBuscarDesc(prud.getDescricao())){
                modelo.addRow(new Object[]{
                    p.getCodigoProduto(),
                    p.getPrecoProduto(),
                    p.getQuantidade(),
                    p.getNome(),
                    p.getDescricao(),
                    p.getEstoqueSeguranca()
                });
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO!\n" + e);
        }
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAvisos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnRemover;
    private javax.swing.JTextField campoBusca;
    private javax.swing.JComboBox<String> comboBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProduto;
    // End of variables declaration//GEN-END:variables
}

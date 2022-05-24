package telas;

import Dao.ProdutoDao;
import classes.Produto;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
public class Avisos extends javax.swing.JFrame {

    public Avisos() {
        initComponents();
        CarregarTabelaAvisos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbAvisos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Avisos");

        tbAvisos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Quantidade", "Estoque Segurança", "Alerta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAvisos.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        tbAvisos.setFocusable(false);
        tbAvisos.setSelectionBackground(new java.awt.Color(60, 63, 65));
        tbAvisos.setSelectionForeground(new java.awt.Color(57, 113, 177));
        jScrollPane1.setViewportView(tbAvisos);
        if (tbAvisos.getColumnModel().getColumnCount() > 0) {
            tbAvisos.getColumnModel().getColumn(0).setPreferredWidth(0);
            tbAvisos.getColumnModel().getColumn(1).setPreferredWidth(30);
            tbAvisos.getColumnModel().getColumn(2).setPreferredWidth(40);
            tbAvisos.getColumnModel().getColumn(3).setPreferredWidth(35);
            tbAvisos.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new FlatDarkLaf());
        }catch(Exception e){
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Avisos().setVisible(true);
            }
        });
        
    }
    public void CarregarTabelaAvisos(){
        ProdutoDao pd = new ProdutoDao();
        DefaultTableModel modelo = (DefaultTableModel) tbAvisos.getModel();
        modelo.setNumRows(0);
        try{
            for(Produto p:pd.ListarEstoqueBaixo()){
                modelo.addRow(new Object[]{
                    p.getCodigoProduto(),
                    p.getNome(),
                    p.getQuantidade(),
                    p.getEstoqueSeguranca(),
                    p.getAlerta()
                });
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO!\n" + e);
        }
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAvisos;
    // End of variables declaration//GEN-END:variables
}

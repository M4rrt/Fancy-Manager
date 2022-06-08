package Dao;

import SQL.ConexaoSQL;
import classes.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDao {
    public void Adicionar(Produto produto) throws SQLException{
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement pstm = null;
        try{
           String sql = "Insert into produto(preco_produto,quantidade,nome_produto,descricao_produto,estoqueSeguranca,alerta) values(?,?,?,?,?,?);";
           pstm = con.prepareStatement(sql);
           pstm.setDouble(1, produto.getPrecoProduto());
           pstm.setInt(2, produto.getQuantidade());
           pstm.setString(3, produto.getNome());
           pstm.setString(4, produto.getDescricao());
           pstm.setInt(5, produto.getEstoqueSeguranca());
           pstm.setString(6, produto.getAlerta());
           pstm.executeUpdate();
           JOptionPane.showMessageDialog(null, "Produto " + "'" + produto.getNome() + "'" + " cadastrado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException ErroSql){
           JOptionPane.showMessageDialog(null, "Erro"+ErroSql, "produto", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void Alterar(Produto produto){
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement pstm = null;
        try {
            String sql = "update produto set preco_produto = ?, quantidade = ?, nome_produto = ?, descricao_produto = ?, estoqueseguranca = ?, alerta = ? where codigo_produto = ?;";
            pstm = con.prepareStatement(sql);
            pstm.setDouble(1, produto.getPrecoProduto());
            pstm.setInt(2, produto.getQuantidade());
            pstm.setString(3, produto.getNome());
            pstm.setString(4, produto.getDescricao());
            pstm.setInt(5, produto.getEstoqueSeguranca());
            pstm.setString(6, produto.getAlerta());
            pstm.setInt(7, produto.getCodigoProduto());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro"+ErroSql, "produto", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void Remover(Produto produto){
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement pstm = null;
        
        try {
            String sql = "DELETE FROM produto WHERE codigo_produto = ?;";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, produto.getCodigoProduto());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto removido com sucesso", "Produto", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro"+ErroSql, "Banco de Dados", JOptionPane.ERROR_MESSAGE);
        }
    }
    public boolean VerificarRegistro(Produto produto) {
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement pstm = null;
        String sql = "SELECT * FROM produto WHERE codigo_produto = ?";

        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, produto.getCodigoProduto());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO!\n" + e);
        }
        return false;
    }
    public List<Produto> Listar(){
        List<Produto> produtos = new ArrayList();
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM produto;";
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                Produto p = new Produto();
                p.setCodigoProduto(rs.getInt(1));
                p.setPrecoProduto(rs.getFloat(2));
                p.setQuantidade(rs.getInt(3));
                p.setNome(rs.getString(4));
                p.setDescricao(rs.getString(5));
                p.setEstoqueSeguranca(rs.getInt(6));
                p.setAlerta(rs.getString(7));
                produtos.add(p);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!\n" + ex);
        }
        return produtos;  
    }
    public List<Produto> ListarEstoqueBaixo(){
        List<Produto> produtos = new ArrayList();
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String sql = "select codigo_produto,nome_produto,quantidade,estoqueseguranca,alerta from produto where quantidade<=estoqueseguranca";
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                Produto p = new Produto();
                p.setCodigoProduto(rs.getInt(1));
                p.setNome(rs.getString(2));
                p.setQuantidade(rs.getInt(3));
                p.setEstoqueSeguranca(rs.getInt(4));
                p.setAlerta(rs.getString(5));
                produtos.add(p);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!\n" + ex);
        }
        return produtos;  
    }
    public List<Produto> ListarBuscarNome(String valor){
        List<Produto> produtos = new ArrayList();
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM produto WHERE nome_produto ILIKE "+valor;
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                Produto p = new Produto();
                p.setCodigoProduto(rs.getInt(1));
                p.setPrecoProduto(rs.getFloat(2));
                p.setQuantidade(rs.getInt(3));
                p.setNome(rs.getString(4));
                p.setDescricao(rs.getString(5));
                p.setEstoqueSeguranca(rs.getInt(6));
                p.setAlerta(rs.getString(7));
                produtos.add(p);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!\n" + ex);
        }
        return produtos;  
    }
    public List<Produto> ListarBuscarDesc(String valor){
        List<Produto> produtos = new ArrayList();
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM produto WHERE descricao_produto ILIKE "+valor;
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                Produto p = new Produto();
                p.setCodigoProduto(rs.getInt(1));
                p.setPrecoProduto(rs.getFloat(2));
                p.setQuantidade(rs.getInt(3));
                p.setNome(rs.getString(4));
                p.setDescricao(rs.getString(5));
                p.setEstoqueSeguranca(rs.getInt(6));
                p.setAlerta(rs.getString(7));
                produtos.add(p);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!\n" + ex);
        }
        return produtos;  
    }
    public List<Produto> BuscaCodigo(Produto p){
        List<Produto> produtos = new ArrayList();
        Connection con = ConexaoSQL.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM produto WHERE codigo_produto = ?;";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, p.getCodigoProduto());
            rs = pstm.executeQuery();
            while(rs.next()){
                p.setCodigoProduto(rs.getInt(1));
                p.setPrecoProduto(rs.getFloat(2));
                p.setQuantidade(rs.getInt(3));
                p.setNome(rs.getString(4));
                p.setDescricao(rs.getString(5));
                p.setEstoqueSeguranca(rs.getInt(6));
                produtos.add(p);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO!\n" + ex);
        }
        return produtos;
    }
}
    
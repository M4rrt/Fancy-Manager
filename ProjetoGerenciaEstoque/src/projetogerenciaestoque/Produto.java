/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetogerenciaestoque;

/**
 *
 * @author bisso
 */
public class Produto {
    private int CodigoProd;
      private String NomeProduto;
      private String Descricao;
      private int QTDEstoque;
      private  float valorProduto;
      private int EstoqueSeguraca;

    public int getCodigoProd() {
        return CodigoProd;
    }

    public void setCodigoProd(int CodigoProd) {
        this.CodigoProd = CodigoProd;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getQTDEstoque() {
        return QTDEstoque;
    }

    public void setQTDEstoque(int QTDEstoque) {
        this.QTDEstoque = QTDEstoque;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getEstoqueSeguraca() {
        return EstoqueSeguraca;
    }

    public void setEstoqueSeguraca(int EstoqueSeguraca) {
        this.EstoqueSeguraca = EstoqueSeguraca;
    }

    public Produto(int CodigoProd, String NomeProduto, String Descricao, int QTDEstoque, float valorProduto, int EstoqueSeguraca) {
        this.CodigoProd = CodigoProd;
        this.NomeProduto = NomeProduto;
        this.Descricao = Descricao;
        this.QTDEstoque = QTDEstoque;
        this.valorProduto = valorProduto;
        this.EstoqueSeguraca = EstoqueSeguraca;
    }
      
      
}

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
public class Estoque {
     private Produto Listaproduto;
     private int QuantidadeEstoque;

    public Produto getListaproduto() {
        return Listaproduto;
    }

    public void setListaproduto(Produto Listaproduto) {
        this.Listaproduto = Listaproduto;
    }

    public int getQuantidadeEstoque() {
        return QuantidadeEstoque;
    }

    public void setQuantidadeEstoque(int QuantidadeEstoque) {
        this.QuantidadeEstoque = QuantidadeEstoque;
    }

    public Estoque(Produto Listaproduto, int QuantidadeEstoque) {
        this.Listaproduto = Listaproduto;
        this.QuantidadeEstoque = QuantidadeEstoque;
    }
     
    
}

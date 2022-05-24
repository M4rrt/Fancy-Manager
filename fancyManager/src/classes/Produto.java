package classes;

public class Produto {
    private int codigoProduto;
    private double precoProduto;
    private int quantidade;
    private int estoqueSeguranca;
    private String nome;
    private String descricao;
    private String alerta;

    public String getAlerta() {
        return alerta;
    }

    public void setAlerta(String alerta) {
        this.alerta = alerta;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoqueSeguranca() {
        return estoqueSeguranca;
    }

    public void setEstoqueSeguranca(int estoqueSeguranca) {
        this.estoqueSeguranca = estoqueSeguranca;
    }
}

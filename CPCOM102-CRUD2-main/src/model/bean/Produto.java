package model.bean;

public class Produto {
    private int id_produto, qtd;
    private double preco;
    private String descricao;
    private Categoria categoria;

    public Produto() {
    }

    public int getId() {
        return id_produto;
    }

    public void setId(int id) {
        this.id_produto = id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}

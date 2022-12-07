package model.bean;

public class Animal {

    private int idanimal;
    private String nome;
    private String raca;
    private int idade;
    private String observacoes;
    private String carteira_vac;
    private Cliente cliente;

    public Animal() {
    }

    public int getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(int idanimal) {
        this.idanimal = idanimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getCarteira_vac() {
        return carteira_vac;
    }

    public void setCarteira_vac(String carteira_vac) {
        this.carteira_vac = carteira_vac;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}

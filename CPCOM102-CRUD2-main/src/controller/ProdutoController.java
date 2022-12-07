package controller;

import java.util.ArrayList;
import model.bean.Produto;
import model.dao.ProdutoDAO;
import model.bean.Categoria;

public class ProdutoController {

    public boolean create(String descricao, int qtd, double preco, Categoria categoria) {
        Produto produto = new Produto();
        produto.setDescricao(descricao);
        produto.setQtd(qtd);
        produto.setPreco(preco);
        produto.setCategoria(categoria);

        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.create(produto);
    }

    public ArrayList<Produto> read() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.read();
    }

    public void update(String descricao, int qtd, double preco, int id, Categoria categoria) {
        Produto produto = new Produto();
        produto.setDescricao(descricao);
        produto.setQtd(qtd);
        produto.setPreco(preco);
        produto.setId(id);
        produto.setCategoria(categoria);

        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.update(produto);
    }

    public void delete(int id) {
        Produto produto = new Produto();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produto.setId(id);
        produtoDAO.delete(produto);
    }
    
    public ArrayList<Produto> buscar(String descricao){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.buscar(descricao);
    }
    
    public ArrayList<Produto> getListaProdutoporDescricao(String descricao){
        ProdutoDAO produtoDAO = new ProdutoDAO();
        return produtoDAO.getListaProdutoporDescricao(descricao);
    }
}
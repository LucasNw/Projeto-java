package controller;

import java.util.ArrayList;
import model.bean.Categoria;
import model.dao.CategoriaDAO;

public class CategoriaController {

    public void create(String descricao) {
        Categoria categoria = new Categoria();
        categoria.setDescricao(descricao);

        CategoriaDAO categoriaDAO = new CategoriaDAO();
        categoriaDAO.create(categoria);
    }
    
    public ArrayList<Categoria> read() {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        return categoriaDAO.read();
    }
    
    public void update(String descricao, int id) {
        Categoria categoria = new Categoria();
        categoria.setDescricao(descricao);
        categoria.setId(id);

        CategoriaDAO categoriaDAO = new CategoriaDAO();
        categoriaDAO.update(categoria);
    }
    
    public void delete(int id) {
        Categoria categoria = new Categoria();
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        categoria.setId(id);
        categoriaDAO.delete(categoria);
    }
}

package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Categoria;

public class CategoriaDAO {

    public void create(Categoria categoria) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO categoria (descricao) VALUES (?)");
            stmt.setString(1, categoria.getDescricao());

            con.setAutoCommit(false);

            stmt.executeUpdate();
            con.commit();

            System.out.println("Categoria: " + categoria.getDescricao() + " salvo!");
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar - CATEGORIADAO");
            try {
                con.rollback();
            } catch (SQLException e) {
                System.out.println("Erro rollback - CATEGORIADAO");
            }
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
//            try {
//                con.setAutoCommit(true);
//            } catch (SQLException ex) {
//            }
        }
    }
    
    public ArrayList<Categoria> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Categoria> listaCategoria = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM categoria ORDER BY idcategoria;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("idcategoria"));
                categoria.setDescricao(rs.getString("descricao"));
                listaCategoria.add(categoria);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler categoria - CATEGORIADAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaCategoria;
    }
    
    public void update(Categoria categoria) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE categoria SET descricao = ? WHERE idcategoria = ?");
            stmt.setString(1, categoria.getDescricao());
            stmt.setInt(2, categoria.getId());

            stmt.executeUpdate();
            System.out.println("Categoria: " + categoria.getDescricao() + " foi atualizado!");
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar - CATEGORIADAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Categoria categoria) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM categoria WHERE idcategoria = ?");
            stmt.setInt(1, categoria.getId());
            stmt.executeUpdate();
            System.out.println("Delete");
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar categoria - CATEGORIADAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}

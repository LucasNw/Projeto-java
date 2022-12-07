package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import model.bean.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import model.bean.Categoria;

public class ProdutoDAO {

    public boolean create(Produto produto) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produto (descricao, qtd, valor, idcategoria) VALUES (?, ?, ?, ?)");
            stmt.setString(1, produto.getDescricao());
            stmt.setInt(2, produto.getQtd());
            stmt.setDouble(3, produto.getPreco());
            stmt.setInt(4, produto.getCategoria().getId());

            con.setAutoCommit(false);

            stmt.executeUpdate();
            con.commit();

            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar - PRODUTODAO");
            try {
                con.rollback();
            } catch (SQLException e) {
                System.out.println("Erro rollback - PRODUTODAO");
            }
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
            try {
                con.setAutoCommit(true);
            } catch (SQLException ex) {
            }
        }

    }

    public ArrayList<Produto> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * from view_produtocategoria ORDER BY idproduto");
            
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("idproduto"));
                produto.setDescricao(rs.getString("pdesc"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("valor"));

                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("idcategoria"));
                categoria.setDescricao(rs.getString("cdesc"));
                produto.setCategoria(categoria);

                listaProdutos.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler produto - PRODUTODAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaProdutos;
    }

    public boolean update(Produto produto) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produto SET descricao = ?, qtd = ?, valor = ?, idcategoria = ? WHERE idproduto = ?");
            stmt.setString(1, produto.getDescricao());
            stmt.setInt(2, produto.getQtd());
            stmt.setDouble(3, produto.getPreco());
            stmt.setInt(4, produto.getCategoria().getId());
            stmt.setInt(5, produto.getId());

            stmt.executeUpdate();
            System.out.println("Produto " + produto.getDescricao() + " foi atualizado!");
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar - PRODUTODAO");
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    //DELETE FROM produto WHERE prod_id;
    public void delete(Produto produto) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE id_produto = ?");
            stmt.setInt(1, produto.getId());
            stmt.executeUpdate();
            System.out.println("Delete");
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar produto - PRODUTODAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public ArrayList<Produto> buscar(String descricao) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE descricao LIKE ? ORDER BY prod_id;");
            stmt.setString(1, "%" + descricao + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("prod_id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("valor"));
                listaProdutos.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar produto - PRODUTODAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaProdutos;
    }
    
    public ArrayList<Produto> getListaProdutoporDescricao(String descricao) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * from view_produtocategoria WHERE pdesc LIKE ? ORDER BY idproduto");
            stmt.setString(1, "%" + descricao + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("idproduto"));
                produto.setDescricao(rs.getString("pdesc"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("valor"));

                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("idcategoria"));
                categoria.setDescricao(rs.getString("cdesc"));
                produto.setCategoria(categoria);

                listaProdutos.add(produto);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler produto - PRODUTODAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaProdutos;
    }

}

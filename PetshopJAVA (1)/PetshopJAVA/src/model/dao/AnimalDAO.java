package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import model.bean.Animal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import model.bean.Cliente;

public class AnimalDAO {

    public boolean create(Animal animal) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO animal (nome, raca, idade, observacoes, carteira_vac, idcliente) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getRaca());
            stmt.setInt(3, animal.getIdade());
            stmt.setString(4, animal.getObservacoes());
            stmt.setString(5, animal.getCarteira_vac());
            stmt.setInt(6, animal.getCliente().getIdcliente());

            con.setAutoCommit(false);

            stmt.executeUpdate();
            con.commit();

            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar - animalDAO");
            try {
                con.rollback();
            } catch (SQLException e) {
                System.out.println("Erro rollback - animalDAO");
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

    public ArrayList<Animal> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Animal> listaAnimais = new ArrayList<>();

        String sql = "SELECT a.idanimal, "
                + "a.nome AS nomeanimal, "
                + "a.raca, "
                + "a.idade, "
                + "a.observacoes,"
                + "a.carteira_vac, "
                + "a.idcliente, "
                + "c.nome AS nomecliente "
                + "FROM animal a JOIN cliente c ON c.idcliente = a.idcliente ";
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Animal anl = new Animal();
                anl.setIdanimal(rs.getInt("idanimal"));
                anl.setNome(rs.getString("nomeanimal"));
                anl.setRaca(rs.getString("raca"));
                anl.setIdade(rs.getInt("idade"));
                anl.setObservacoes(rs.getString("observacoes"));
                anl.setCarteira_vac(rs.getString("carteira_vac"));

                Cliente clt = new Cliente();
                clt.setIdcliente(rs.getInt("idcliente"));
                clt.setNome(rs.getString("nomecliente"));
                anl.setCliente(clt);

                listaAnimais.add(anl);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler animal - animalDAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaAnimais;
    }

    public boolean update(Animal animal) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE animal SET nome = ?, raca = ?, idade = ?, observacoes = ?, carteira_vac = ?, idcliente = ? WHERE idanimal = ?");
            stmt.setString(1, animal.getNome());
            stmt.setString(2, animal.getRaca());
            stmt.setInt(3, animal.getIdade());
            stmt.setString(4, animal.getObservacoes());
            stmt.setString(5, animal.getCarteira_vac());
            stmt.setInt(6, animal.getCliente().getIdcliente());
            stmt.setInt(7, animal.getIdanimal());

            stmt.executeUpdate();
            System.out.println("Animal " + animal.getNome() + " foi atualizado!");
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar - animalDAO");
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    
    public void delete(Animal animal) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM animal WHERE idanimal = ?");
            stmt.setInt(1, animal.getIdanimal());
            stmt.executeUpdate();
            System.out.println("Delete");
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar produto - animalDAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}

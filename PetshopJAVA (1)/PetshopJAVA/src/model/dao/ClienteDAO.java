package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Cliente;


public class ClienteDAO {

    public void create(Cliente cliente) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cliente (nome, telefone, email, endereco, cpf) VALUES (?,?,?,?,?)");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getEndereco());
            stmt.setString(5, cliente.getCpf());

            con.setAutoCommit(false);

            stmt.executeUpdate();
            con.commit();

            System.out.println("salvo!");
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar - clienteDAO");
            try {
                con.rollback();
            } catch (SQLException e) {
                System.out.println("Erro rollback - clienteDAO");
            }
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
//            try {
//                con.setAutoCommit(true);
//            } catch (SQLException ex) {
//            }
        }
    }
    
    public ArrayList<Cliente> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Cliente> listaCliente = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente ORDER BY idcliente;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdcliente(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setCpf(rs.getString("cpf"));
                listaCliente.add(cliente);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler o cliente - ClienteDAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaCliente;
    }
    
    public void update(Cliente cliente) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET nome = ?, telefone = ?, email = ?, endereco = ?, cpf = ? WHERE idcliente = ?");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getTelefone());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getEndereco());
            stmt.setString(5, cliente.getCpf());                     
            stmt.setInt(6, cliente.getIdcliente());

            stmt.executeUpdate();
            System.out.println("Cliente atualizado!");
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar - ClienteDAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Cliente cliente) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE idcliente = ?");
            stmt.setInt(1, cliente.getIdcliente());
            stmt.executeUpdate();
            System.out.println("Delete");
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar o cliente - CLIENTEDAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}

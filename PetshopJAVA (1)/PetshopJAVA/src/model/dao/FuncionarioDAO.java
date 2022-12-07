package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Funcionario;


public class FuncionarioDAO {

    public void create(Funcionario funcionario) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO funcionario (nome, telefone, endereco, cpf, cargo) VALUES (?,?,?,?,?)");
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getTelefone());
            stmt.setString(3, funcionario.getEndereco());          
            stmt.setString(4, funcionario.getCpf());
            stmt.setString(5, funcionario.getCargo());
            

            con.setAutoCommit(false);

            stmt.executeUpdate();
            con.commit();

            System.out.println("salvo!");
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar - funcionarioDAO");
            try {
                con.rollback();
            } catch (SQLException e) {
                System.out.println("Erro rollback - funcionarioDAO");
            }
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
//            try {
//                con.setAutoCommit(true);
//            } catch (SQLException ex) {
//            }
        }
    }
    
    public ArrayList<Funcionario> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM funcionario ORDER BY idfuncionario;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario fun = new Funcionario();
                fun.setIdfuncionario(rs.getInt("idfuncionario"));
                fun.setNome(rs.getString("nome"));
                fun.setTelefone(rs.getString("telefone"));
                fun.setEndereco(rs.getString("endereco"));
                fun.setCpf(rs.getString("cpf"));
                fun.setCargo(rs.getString("cargo"));
                listaFuncionarios.add(fun);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao ler o funcionario - FuncionarioDAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return listaFuncionarios;
    }
    
    public void update(Funcionario funcionario) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE funcionario SET nome = ?, telefone = ?, endereco = ?, cpf = ?, cargo = ? WHERE idfuncionario = ?");
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getTelefone());            
            stmt.setString(3, funcionario.getEndereco());
            stmt.setString(4, funcionario.getCpf());
            stmt.setString(5, funcionario.getCargo());            
            stmt.setInt(6, funcionario.getIdfuncionario());

            stmt.executeUpdate();
            System.out.println("Funcionario atualizado!");
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar - FuncionarioDAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Funcionario funcionario) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM funcionario WHERE idfuncionario = ?");
            stmt.setInt(1, funcionario.getIdfuncionario());
            stmt.executeUpdate();
            System.out.println("Delete");
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar o funcionario - FuncionarioDAO");
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}

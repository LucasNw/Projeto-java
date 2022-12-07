package model.dao;

import connection.ConnectionFactory;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import model.bean.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Categoria;

public class UsuarioDAO {

    public boolean create(Usuario usuario) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario (usuario, senha) VALUES (?, ?)");
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getSenha());

            con.setAutoCommit(false);

            stmt.executeUpdate();
            con.commit();

            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar");
            try {
                con.rollback();
            } catch (SQLException e) {
                System.out.println("Erro rollback");
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

    public boolean verificaLogon(Usuario usr) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(usr.getSenha().getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder();
            for(byte b : messageDigest) {
                sb.append(String.format("%02x", 0xFF & b));
            }
            
            String senhahex = sb.toString();
            
            
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE usuario = ? and senha = ?");
            stmt.setString(1, usr.getUsuario());
            stmt.setString(2, senhahex);
            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (Exception ex) {

            System.out.println("Erro na execução dO sql");

        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }

    public void createCRIP(Usuario usuario) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {

            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(usuario.getSenha().getBytes("UTF-8"));

            StringBuilder sb = new StringBuilder();
            for (byte b : messageDigest) {
                sb.append(String.format("%02X", 0xFF & b));
            }

            String senhaHex = sb.toString();

            stmt = con.prepareStatement("INSERT INTO usuario (usuario, senha) VALUES (?,?)");
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, senhaHex);

            con.setAutoCommit(false);

            stmt.executeUpdate();
            con.commit();

            JOptionPane.showMessageDialog(null, "senha salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
            try {
                con.rollback();
            } catch (SQLException e) {
                System.out.println("Erro");
            }

        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
            try {
                con.setAutoCommit(true);
            } catch (SQLException ex) {
            }
        }
    }
}

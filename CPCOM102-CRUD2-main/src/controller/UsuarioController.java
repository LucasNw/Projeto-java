package controller;

import model.bean.Usuario;
import model.dao.UsuarioDAO;

public class UsuarioController {

    public boolean create(String usuario, String senha) {
        Usuario usr = new Usuario();

        usr.setUsuario(usuario);
        usr.setSenha(senha);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        return usuarioDAO.create(usr);
    }

    public boolean verificaLogon(String usr, String senha) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuario = new Usuario();
        usuario.setUsuario(usr);
        usuario.setSenha(senha);

        return usuarioDAO.verificaLogon(usuario);
    }
    
     public void createCRIP(String usuario, String senha) {
        Usuario usr = new Usuario();

        usr.setUsuario(usuario);
        usr.setSenha(senha);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.createCRIP(usr);
    
    }
}

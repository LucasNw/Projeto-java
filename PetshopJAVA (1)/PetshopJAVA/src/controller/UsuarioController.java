package controller;

import model.bean.Usuario;
import model.dao.UsuarioDAO;

public class UsuarioController {

    public void create(String usr, String senha) {
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       
        Usuario usuario = new Usuario();
        usuario.setUsuario(usr);
        usuario.setSenha(senha);

        usuarioDAO.create(usuario);
        
    }

    public boolean verificaLogon(String usr, String senha) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuario = new Usuario();
        usuario.setUsuario(usr);
        usuario.setSenha(senha);

        return usuarioDAO.verificaLogon(usuario);
    }
    
     public void createSENHACRIP(String usuario, String senha) {
        Usuario usr = new Usuario();

        usr.setUsuario(usuario);
        usr.setSenha(senha);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.createSENHACRIP(usr);
    
    }

}


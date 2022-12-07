package controller;

import java.util.ArrayList;
import model.bean.Cliente;
import model.dao.ClienteDAO;

public class ClienteController {

    public void create(String nome, String telefone, String email, String endereco, String cpf) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
        cliente.setCpf(cpf);

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.create(cliente);
    }

    public ArrayList<Cliente> read() {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.read();
    }

    public void update(int id, String nome, String telefone, String email, String endereco, String cpf) {
        Cliente cliente = new Cliente();
        cliente.setIdcliente(id);
        cliente.setNome(nome);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);
        cliente.setCpf(cpf);
        

        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.update(cliente);
    }

    public void delete(int id) {
        Cliente cliente = new Cliente();
        ClienteDAO clienteDAO = new ClienteDAO();
        cliente.setIdcliente(id);
        clienteDAO.delete(cliente);
    }

    public void create(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

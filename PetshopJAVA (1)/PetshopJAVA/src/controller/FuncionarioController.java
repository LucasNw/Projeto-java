package controller;

import java.util.ArrayList;
import model.bean.Funcionario;
import model.dao.FuncionarioDAO;

public class FuncionarioController {

    public void create(String nome, String telefone, String endereco, String cpf, String cargo) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setTelefone(telefone);        
        funcionario.setEndereco(endereco);
        funcionario.setCpf(cpf);
        funcionario.setCargo(cargo);

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.create(funcionario);
    }

    public ArrayList<Funcionario> read() {
        FuncionarioDAO clienteDAO = new FuncionarioDAO();
        return clienteDAO.read();
    }

    public void update(int id, String nome, String telefone, String endereco, String cpf, String cargo) {
        Funcionario funcionario = new Funcionario();
        funcionario.setIdfuncionario(id);
        funcionario.setNome(nome);
        funcionario.setTelefone(telefone);        
        funcionario.setEndereco(endereco);
        funcionario.setCpf(cpf);
        funcionario.setCargo(cargo);
        

        FuncionarioDAO clienteDAO = new FuncionarioDAO();
        clienteDAO.update(funcionario);
    }

    public void delete(int id) {
        Funcionario funcionario = new Funcionario();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionario.setIdfuncionario(id);
        funcionarioDAO.delete(funcionario);
    }

    public void create(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

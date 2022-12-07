package controller;

import java.util.ArrayList;
import model.bean.Animal;
import model.dao.AnimalDAO;
import model.bean.Cliente;

public class AnimalController {

    public boolean create(String nome, String raca, int idade, String observacoes, String carteira_vac, Cliente cliente) {
        Animal animal = new Animal();
        animal.setNome(nome);
        animal.setRaca(raca);
        animal.setIdade(idade);
        animal.setObservacoes(observacoes);
        animal.setCarteira_vac(carteira_vac);
        animal.setCliente(cliente);

        AnimalDAO animalDAO = new AnimalDAO();
        return animalDAO.create(animal);
    }

    public ArrayList<Animal> read() {
        AnimalDAO animalDAO = new AnimalDAO();
        return animalDAO.read();
    }

    public boolean update(int idanimal, String nome, String raca, int idade, String observacoes, String carteira_vac, Cliente cliente) {
        Animal animal = new Animal();
        animal.setIdanimal(idanimal);
        animal.setNome(nome);
        animal.setRaca(raca);
        animal.setIdade(idade);
        animal.setObservacoes(observacoes);
        animal.setCarteira_vac(carteira_vac);
        animal.setCliente(cliente);

        AnimalDAO animalDAO = new AnimalDAO();
        return animalDAO.update(animal);
    }

    public void delete(int id) {
        Animal animal = new Animal();
        AnimalDAO animalDAO = new AnimalDAO();
        animal.setIdanimal(id);
        animalDAO.delete(animal);

    }
}

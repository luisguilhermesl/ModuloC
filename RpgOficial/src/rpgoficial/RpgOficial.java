package rpgoficial;

import DAO.personagemDAO;
import Classes.Personagem;
import java.util.ArrayList;
import java.util.List;

public class RpgOficial {

    public static void main(String[] args) {

        List<Personagem> listaPersonagem = new ArrayList<Personagem>();

        Personagem user = new Personagem();
        user.setNome("Daniel");
        user.setClasse("Barbaro");
        user.setRaca("Goblin");
        user.setNivel(8);
        user.setPo(5);
        user.setPv(30);
        user.setFraqueza("Altura");
        user.setPersonalidade("Estressado");

        personagemDAO userDAO = new personagemDAO();

        //userDAO.alterPerson(user, 4);
        System.out.println("Buscando todos os personagens...");
        listaPersonagem = userDAO.findAllPersonagem();

        for (Personagem person : listaPersonagem) {
            System.out.println("------------------------------------");
            System.out.println(person.getId());
            System.out.println(person.getNome());
            System.out.println(person.getNivel());
            System.out.println(person.getPv());
            System.out.println(person.getPo());
            System.out.println(person.getPersonalidade());
            System.out.println(person.getFraqueza());
            System.out.println(person.getRaca());
            System.out.println("------------------------------------");
        }

        System.out.println("Deletando personagem com ID 5...");
        userDAO.deletePerson(5);

        //userDAO.cadastrarPersonagem(user);
        System.out.println("Buscando todos os personagens após deletar...");
        listaPersonagem = userDAO.findAllPersonagem();

        for (Personagem person : listaPersonagem) {
            System.out.println("------------------------------------");
            System.out.println(person.getId());
            System.out.println(person.getNome());
            System.out.println(person.getNivel());
            System.out.println(person.getPv());
            System.out.println(person.getPo());
            System.out.println(person.getPersonalidade());
            System.out.println(person.getFraqueza());
            System.out.println(person.getRaca());
            System.out.println("------------------------------------");
        }
    }
}

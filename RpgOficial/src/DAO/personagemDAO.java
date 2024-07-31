package DAO;

import Classes.Connection;
import Classes.Personagem;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class personagemDAO {
    
    public void cadastrarPersonagem(Personagem person) {
        String sql = "INSERT INTO personagem (nome, classe, raca, nivel, pv, po, personalidade, fraqueza) VALUES (? ,? ,? ,? ,? ,? ,? ,?)";
        PreparedStatement ps = null;

        try {
            ps = Connection.getConnection().prepareStatement(sql);
            ps.setString(1, person.getNome());
            ps.setString(2, person.getClasse());
            ps.setString(3, person.getRaca());
            ps.setInt(4, person.getNivel());
            ps.setInt(5, person.getPv());
            ps.setInt(6, person.getPo());
            ps.setString(7, person.getPersonalidade());
            ps.setString(8, person.getFraqueza());
            
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar personagem: " + e.getMessage());
        }
    }

    public List<Personagem> findAllPersonagem() {
        String sql = "SELECT * FROM personagem";
        List<Personagem> personList = new ArrayList<Personagem>();
        ResultSet result = null;
        PreparedStatement ps = null;

        try {
            ps = Connection.getConnection().prepareStatement(sql);
            result = ps.executeQuery();

            while (result.next()) {
                Personagem person = new Personagem();
                person.setId(result.getInt("idpersonagem"));
                person.setNome(result.getString("nome"));
                person.setClasse(result.getString("classe"));
                person.setNivel(result.getInt("nivel"));
                person.setPo(result.getInt("po"));
                person.setPv(result.getInt("pv"));
                person.setFraqueza(result.getString("fraqueza"));
                person.setPersonalidade(result.getString("personalidade"));
                person.setRaca(result.getString("raca"));
                personList.add(person);
            }
            return personList;
        } catch (SQLException e) {
            System.out.println("Erro ao buscar todos os personagens: " + e.getMessage());
            return null;
        }
    }

    public void alterPerson(Personagem p, int id) {
        String sql = "UPDATE personagem SET nome = ?, classe = ?, raca = ?, nivel = ?, pv = ?, po = ?, personalidade = ?, fraqueza = ? WHERE idpersonagem = ?";
        PreparedStatement ps = null;

        try {
            ps = Connection.getConnection().prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setString(2, p.getClasse());
            ps.setString(3, p.getRaca());
            ps.setInt(4, p.getNivel());
            ps.setInt(5, p.getPv());
            ps.setInt(6, p.getPo());
            ps.setString(7, p.getPersonalidade());
            ps.setString(8, p.getFraqueza());
            ps.setInt(9, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro ao alterar personagem: " + e.getMessage());
        }
    }

    public void deletePerson(int id) {
        String sql = "DELETE FROM personagem WHERE idpersonagem = ?";
        PreparedStatement ps = null;

        try {
            ps = Connection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar personagem: " + e.getMessage());
        }
    }
}

package DAO;
import DAOConnection.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Luis
 */
public class findAllMovies {

    
    public static void findAllMovies(){
    String sql = "SELECT FROM movies";
        List<Movies> MoviesList = new ArrayList<Movies>();

        ResultSet rs = null;
        PreparedStatement ps = null
            
        try {
            ps = Connection().getConnection.prepareStatement(sql);
            result = ps.executeQuery();

            while (result.next()) {
                Movies m = new Movies();
                m.setId(result.getInt("idfilme"));
                m.setAno(result.getInt("ano"));
                m.setGenero(result.getString("genero"));
                m.setClassificacao(result.getString("classificacao"));
                m.add();
            }
            return MoviesList;
        } catch (SQLException erro) {
            System.out.println("Foi encontrado um erro, resolva e tente novamente" + erro.getMessage());
        }
    }
}

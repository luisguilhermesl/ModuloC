package DAO;

        
import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Luis
 */

public class registerMovies {
   public static void registerMovies (Movie m){
    String sql = "INSERT INTO games (nome, ano, genero, classificacao) VALUES (?,?,?,?)";
    PreparedStatement ps = null;
    
    try{
        ps = Connection.getConnection().prepareStatement(sql);
        ps.setString(1,m.getNome());
        ps.setInt(2,m.getAno());
        ps.setString(3,m.getGenero());
        ps.setString(4,m.getClassificacao());
        ps.execute();
        ps.close();

    }catch(SQLException erro){
        System.out.println("Foi encontrado um erro, resolva e tente novamente", + erro.getMessage());

    }
            
            
}
    
    
    
    
}
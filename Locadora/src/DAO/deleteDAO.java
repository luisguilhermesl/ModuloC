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
public class deleteDAO {
        public static void deleteMovie(int id){
        String sql = "DELETE FROM movies WHERE idmovie = ?";
        PreparedStatement ps = null;

        try {
            ps = Connection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();

        } catch (SQLException error) {
            System.out.println("Foi encontrado um erro, resolva e tente novamente" + error.getMessage());
        }

    }

}

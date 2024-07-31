package sara;
import java.sql.Connection; //serve pra fazer a conexão
import java.sql.DriverManager; //onde está a biblioteca
import java.sql.SQLException; //para informar erros
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Luis
 */
public class Conexao {
     private static final String url = "jdbc:mysql://localhost:3306/inventario_rpg";

    private static final String user = "root";
    private static final String password = "";

    private static Connection conex;

    public static Connection getConexao() throws SQLException {
        try {
            if (conex == null) {
                conex = DriverManager.getConnection(url, user, password);
                return conex;
            } else {
                return conex;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    /*
    Statement stmt;

    public Conexao() throws SQLException {
        this.stmt = conex.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM item_magia");
        
        while (rs.next()) {
    int id = rs.getInt("id");
    String nome = rs.getString("nome");
    
    
    System.out.println("ID: " + id + ", Item Mágico: " + nome);
}
    }
*/
}

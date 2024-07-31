
package Classes;


import java.sql.DriverManager;
import java.sql.SQLException;


public class Connection {
    
    // Url de conexão do banco de dados
    private static final String url = "jdbc:mysql://localhost:3306/rpgoficial";
    
    // Username do banco de dados
    private static final String user = "root";
    
    private static final String password = "root";
    
    private static java.sql.Connection conn;
    
    
    // Metodo responsavel por abrir uma conexão entre o java e o banco de dados mysql
    public static java.sql.Connection getConnection(){
        try {
            // Verifica se existe uma conexão ativa
            if(conn == null){
                //Caso não exista ele cria a conexão e retorna a mesma
                
                conn = DriverManager.getConnection(url, user, password);
                
                return conn;
            }else{
                // caso ja exista apenas retorna a conexão que ja esta criada.
                return conn;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
    
    
}

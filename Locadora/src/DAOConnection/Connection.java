package DAOConnection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Luis
 */
public class Connection {

    public static final String url = "jdbc:mysql://localhost:3306/blockbuster";
    public static final String user = "root";
    public static final String password = "root";
    
    private static java.sql.Connection conn;
    public static java.sql.Connection getConnection() {

        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else {
                return conn;
            }

        } catch (SQLException erro) {
            System.out.println("Foi encontrado um erro, resolva e tente novamente" + erro.getMessage());
            return null;
        }
    }
}
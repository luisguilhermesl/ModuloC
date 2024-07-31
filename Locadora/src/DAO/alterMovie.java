package DAO;

/**
 *
 * @author Luis
 */
public class alterMovie {

    public static void alterMovie(Movie m, int id) {
        String sql = "UPDATE movie SET nome = ?, ano = ?, genero = ?, classificacao = ? WHERE id=?";
        PreparedStatement ps = null;

        try {

            ps = Connection.getConnection().prepareStatement(sql);
            ps.setString(1, m.getNome());
            ps.setInt(2, m.getAno());
            ps.setString(3, m.getGenero());
            ps.setString(4, m.getClassificacao());
            ps.execute();
            ps.close();

        } catch (SQLException erro) {
            System.out.println("Foi encontrado um erro, resolva e tente novamente", +erro.getMessage());
        }
    }
}

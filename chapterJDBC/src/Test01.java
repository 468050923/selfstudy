
import java.sql.*;
import java.util.ResourceBundle;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {

        ResourceBundle jdbc = ResourceBundle.getBundle("jdbc");
        String driver = jdbc.getString("driver");
        String url = jdbc.getString("url");

        String uer = jdbc.getString("username");
        String pwd = jdbc.getString("pwd");
        Connection con = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        PreparedStatement ps = null;
        String sql;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, uer, pwd);
//            一般用于DML语句
            con.setAutoCommit(false);
//            stmt = con.createStatement();
            ps = con.prepareStatement("select * from t_emp where id = ?");
            ps.setString(1,"01");
            resultSet = ps.executeQuery();
            System.out.println(resultSet.getFetchSize());
//            sql = "select * from t_emp";
//            resultSet = stmt.executeQuery(sql);

            while (resultSet.next()) {
                System.out.print(resultSet.getString(1));
                System.out.print(resultSet.getString(2));
                System.out.println();
            }

            con.commit();

        } catch (Exception e) {
            if (con!=null){
                try {
                    con.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (ps!= null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }


                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
        String sql;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,uer,pwd);
            stmt = con.createStatement();
            sql = "select * from t_emp";
            ResultSet resultSet = stmt.executeQuery(sql);

            System.out.println(resultSet.getString("id"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
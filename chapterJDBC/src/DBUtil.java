
import java.sql.*;
import java.util.ResourceBundle;

public class DBUtil {
    private static String url;
    private DBUtil() {
    }

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {//异常抛出，因为外部程序要捕获，进行回滚操作
        url = "jdbc:mysql://localhost:3306/employee?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8";
        return DriverManager.getConnection(url, "root", "1234");
    }

    public static void close(Connection conn,Statement stmt,ResultSet rs){
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}

package my.emailreader.EmailReaderJava.dal;

import my.emailreader.EmailReaderJava.util.Message;
import java.sql.*;

public class DatabaseAccess {
    static final String DB_URL = "jdbc:mysql://localhost:3306/emailreader?useUnicode=true&characterEncoding=utf8";
	
    static final String USER = "root";
    static final String PASS = "";

    private static String sql = "";
    private static Connection conn = null;
    private static Statement stmt = null;
    
    public static void openDb() throws SQLException, Exception{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        stmt = conn.createStatement();
    }
	
    public static void setSql(String sql){
        DatabaseAccess.sql = sql;
    }

    public static ResultSet executeSql() throws SQLException{
        return stmt.executeQuery(DatabaseAccess.sql);
    }

    public static void closeDb(){
        try{
            if(stmt!=null)
                stmt.close();
            if(conn!=null)
                conn.close();
        }catch(SQLException se){
            Message.showError(se.getMessage());
        }
    }

    public static int executeUp() {
        int result = 0;
        try {
            result = stmt.executeUpdate(DatabaseAccess.sql);
        } catch (SQLException e) {
            Message.showError(e.getMessage());
        }
        return result;
    }
}

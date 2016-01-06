package my.emailreader.EmailReaderJava.bll;

import my.emailreader.EmailReaderJava.dal.DatabaseAccess;
import my.emailreader.EmailReaderJava.model.*;
import my.emailreader.EmailReaderJava.util.Message;
import java.sql.*;
import static org.mentaregex.Regex.*;


public class LoginProcess {
    public User verifyLogin(String email, String pass){
        try {
            User u = null;
            DatabaseAccess.openDb();
            DatabaseAccess.setSql(queryCreator(email, pass));
            ResultSet rs = DatabaseAccess.executeSql();
            if(rs.next()){
                    u = new User();
                    u.setId(rs.getInt("id"));
                    u.setEmail(rs.getString("email"));
                    u.setLname(rs.getString("lname"));
                    u.setFname(rs.getString("fname"));
            }
            DatabaseAccess.closeDb();
            return u;
        } catch (SQLException e) {
            Message.showError(e.getMessage());
        } catch (Exception e) {
            Message.showError(e.getMessage());
        }
        return null;
    }

    public String queryCreator(String email, String pass){
        return "select * from users where email='"+email+"' and password='"+pass+"';";
    }
}

package my.emailreader.EmailReaderJava.bll;

import java.sql.ResultSet;
import java.sql.SQLException;

import my.emailreader.EmailReaderJava.dal.DatabaseAccess;
import my.emailreader.EmailReaderJava.util.Message;

public class UserProcess {
    public static String getEmailById(int userId)
    {
        String email="";
        try {
            DatabaseAccess.openDb();
            DatabaseAccess.setSql(queryCreator(userId));
            ResultSet rs = DatabaseAccess.executeSql();
            if(rs.next())
            {
                    email=rs.getString("email");
            }
        } catch (SQLException e) {
            Message.showError(e.getMessage());
        } catch (Exception e) {
            Message.showError(e.getMessage());
        }finally{
            DatabaseAccess.closeDb();
        }
        return email;
    }
    public static boolean checkExists(String email) {
        boolean result = false;
        try {
            DatabaseAccess.openDb();
            DatabaseAccess.setSql("select * from users where email='"+email+"';");
            ResultSet rs = DatabaseAccess.executeSql();
            if(rs.next())
            {
                    result = true;
            }
        } catch (SQLException e) {
            Message.showError(e.getMessage());
        } catch (Exception e) {
            Message.showError(e.getMessage());
        }finally{
            DatabaseAccess.closeDb();
        }
        return result;
    }
    public static int getIdByEmail(String email) {
        int userId = 0;
        try {
            DatabaseAccess.openDb();
            DatabaseAccess.setSql("select * from users where email='"+email+"';");
            ResultSet rs = DatabaseAccess.executeSql();
            if(rs.next())
            {
                userId = rs.getInt("id");
            }
        } catch (SQLException e) {
            Message.showError(e.getMessage());
        } catch (Exception e) {
            Message.showError(e.getMessage());
        }finally{
            DatabaseAccess.closeDb();
        }
        return userId;
    }
    public static String queryCreator(int userId){
        return "select * from users where id='"+userId+"';";
    }
}

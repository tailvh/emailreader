package my.emailreader.EmailReaderJava.bll;

import static org.mentaregex.Regex.matches;

import java.sql.SQLException;

import my.emailreader.EmailReaderJava.dal.DatabaseAccess;
import my.emailreader.EmailReaderJava.util.Message;

public class RegisterProcess {
	public static boolean registerUser(String email, String password, String fname, String lname ){
		if(!RegisterProcess.checkEmail(email))
			return false;
		int result = 0;
        try {
            DatabaseAccess.openDb();
            DatabaseAccess.setSql("insert into users(email, password, fname, lname) values('"+email+"','"+password+"','"+fname+"','"+lname+"');");
            result = DatabaseAccess.executeUp();
        } catch (SQLException e) {
            Message.showError(e.getMessage());
        } catch (Exception e) {
            Message.showError(e.getMessage());
        }finally{
            DatabaseAccess.closeDb();
        }
        if(result>0)
            return true;
        else
            return false;
	}
	public static boolean checkEmail(String email){
    	String chuoiDieuKien = "[a-zA-Z0-9\\-\\_]+\\@er.com";
    	return matches(email, chuoiDieuKien);
	}
	public static boolean checkNotEmpty(String email, String password, String fname, String lname ){
		if(email.equals("") || password.equals("") || lname.equals("") || fname.equals("") )
			return false;
		else
			return true;
	}
	public static boolean checkSamePassword(String pass1, String pass2){
		if(pass1.equals(pass2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean checkLengthBetweenEightAndSixteen(String password){
		int length = password.length();
		if(8<=length&&length<=16)
			return true;
		else
			return false;
	}
}

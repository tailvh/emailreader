package my.emailreader.EmailReaderJava.bll;

import java.sql.ResultSet;
import java.sql.SQLException;

import my.emailreader.EmailReaderJava.util.*;
import my.emailreader.EmailReaderJava.dal.DatabaseAccess;
import my.emailreader.EmailReaderJava.exception.TypeWrongException;
import my.emailreader.EmailReaderJava.model.Email;
public class EmailProcess {
    public Email[] getEmails(int userId, String type){
        Email[] emails = null;
        try {
            Email email = null;
            DatabaseAccess.openDb();
            DatabaseAccess.setSql(queryCreator(userId, type));
            ResultSet rs = DatabaseAccess.executeSql();

            int rowcount = 0;
            if (rs.last()) {
                rowcount = rs.getRow();
                rs.beforeFirst(); 
            }
            emails = new Email[rowcount];
            for(int i = 0; i < rowcount;i++){
                rs.next();
                email = new Email();
                email.setId(rs.getInt("id"));
                email.setTitle(rs.getString("title"));
                email.setSender(rs.getInt("sender"));
                email.setReceiver(rs.getInt("receiver"));
                email.setMessage(rs.getString("message"));
                emails[i] = email;
            }

        } catch (SQLException e) {
            Message.showError(e.getMessage());
        } catch (Exception e) {
            Message.showError(e.getMessage());
        }finally{
            DatabaseAccess.closeDb();
        }

        return emails;
    }
    public Email getEmailById(int id){
        Email email = null;
        try {
            DatabaseAccess.openDb();
            DatabaseAccess.setSql("select * from emails where id='"+id+"';");
            ResultSet rs = DatabaseAccess.executeSql();
            if(rs.next()){
                email = new Email();
                email.setId(rs.getInt("id"));
                email.setTitle(rs.getString("title"));
                email.setSender(rs.getInt("sender"));
                email.setReceiver(rs.getInt("receiver"));
                email.setMessage(rs.getString("message"));
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

    public String queryCreator(int userId, String type) throws TypeWrongException{
    	if(type!="sender"&&type!="receiver")
    		throw new TypeWrongException();
        return "select * from emails where "+type+"='"+userId+"';";
    }

    public Email[] getListEmailsReceiveToScreen(int userId){
        Email[] emails = getEmails(userId, "receiver");
        return emails;
    }
    public Email[] getListEmailsSendToScreen(int userId){
        Email[] emails = getEmails(userId, "sender");
        return emails;
    }

    public boolean createEmail(int fromEmail, int toEmail, String title, String message) {
        int result = 0;
        try {
            DatabaseAccess.openDb();
            DatabaseAccess.setSql("insert into emails(sender, receiver, title, message) values('"+fromEmail+"','"+toEmail+"','"+title+"','"+message+"');");
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
}
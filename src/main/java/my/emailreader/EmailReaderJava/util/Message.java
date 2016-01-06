package my.emailreader.EmailReaderJava.util;

import javax.swing.JOptionPane;

public class Message {
    public static void showError(String message){
        JOptionPane.showMessageDialog(null, message,
                      "Error", JOptionPane.WARNING_MESSAGE);
    }
    public static void showMessage(String message){
        JOptionPane.showMessageDialog(null, message,
                      "Error", JOptionPane.INFORMATION_MESSAGE);
    }
}

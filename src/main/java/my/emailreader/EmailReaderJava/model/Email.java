package my.emailreader.EmailReaderJava.model;

public class Email {
    private int id;
    String title;
    private int sender;
    private int receiver;
    private String message;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSender() {
        return sender;
    }
    public void setSender(int sender) {
        this.sender = sender;
    }
    public int getReceiver() {
        return receiver;
    }
    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
	
}

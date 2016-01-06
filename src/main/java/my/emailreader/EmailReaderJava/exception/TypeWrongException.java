package my.emailreader.EmailReaderJava.exception;

public class TypeWrongException extends Exception{
	public TypeWrongException() {
        super("Type wrong. Type can be sender or receiver");
    }
}

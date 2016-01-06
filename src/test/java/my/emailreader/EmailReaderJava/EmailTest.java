package my.emailreader.EmailReaderJava;

import static org.junit.Assert.*;
import my.emailreader.EmailReaderJava.model.Email;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailTest {
	Email email = null;
	@Before
	public void beforeTest(){
		email = new Email();
	}
	@After
	public void afterTest(){
		email = null;
	}
	@Test
	public void testGetId() {
		int expected = 1;
		email.setId(1);
		int actual = email.getId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTitle() {
		String expected = "Title of email";
		email.setTitle("Title of email");
		String actual = email.getTitle();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetSender() {
		int expected = 1;
		email.setSender(1);
		int actual = email.getSender();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReceiver() {
		int expected = 1;
		email.setReceiver(1);
		int actual = email.getReceiver();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMessage() {
		String expected = "This is a message";
		email.setMessage("This is a message");
		String actual = email.getMessage();
		assertEquals(expected, actual);
	}

}

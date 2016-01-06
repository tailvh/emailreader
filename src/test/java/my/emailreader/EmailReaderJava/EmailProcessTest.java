package my.emailreader.EmailReaderJava;

import static org.junit.Assert.*;
import my.emailreader.EmailReaderJava.bll.EmailProcess;
import my.emailreader.EmailReaderJava.exception.TypeWrongException;
import my.emailreader.EmailReaderJava.model.Email;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmailProcessTest {
	EmailProcess emailProcess = null;
	@Before
	public void beforeTest(){
		emailProcess = new EmailProcess();
	}
	@After
	public void afterTest(){
		emailProcess = null;
	}
	@Test
	public void testLengthGetEmails() {
		int expected = 1;
		int actual = emailProcess.getEmails(1, "receiver").length;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTitleEmailById(){
		String expected = "Test email from user1";
		String actual = emailProcess.getEmailById(1).getTitle();
		assertEquals(expected, actual);
	}
	@Test
	public void testQueryCreatorTrue() throws Exception{
		String expected = "select * from emails where receiver='1';";
		String actual = emailProcess.queryCreator(1, "receiver");
		assertEquals(expected, actual);
	}
	@Test(expected=TypeWrongException.class)
	public void testQueryCreatorWrong() throws Exception{
		emailProcess.queryCreator(1, "sen");
	}

}

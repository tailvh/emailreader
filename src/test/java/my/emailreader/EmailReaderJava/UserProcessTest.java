package my.emailreader.EmailReaderJava;

import static org.junit.Assert.*;
import my.emailreader.EmailReaderJava.bll.UserProcess;

import org.junit.Test;

public class UserProcessTest {

	@Test
	public void testGetEmailById(){
		String expected = "admin@er.com";
		String actual = UserProcess.getEmailById(1);
		assertEquals(expected, actual);
	}
	@Test
	public void testCheckExists(){
		assertTrue(UserProcess.checkExists("admin@er.com"));
		assertTrue(UserProcess.checkExists("user1@er.com"));
		assertFalse(UserProcess.checkExists("ad@er.com"));
	}
	@Test
	public void testGetIdByEmail(){
		int expected = 1;
		int actual = UserProcess.getIdByEmail("admin@er.com");
		assertEquals(expected, actual);
	}
	@Test
	public void testQueryCreator(){
		String expected = "select * from users where id='1';";
		String actual = UserProcess.queryCreator(1);
		assertEquals(expected, actual);
	}
}

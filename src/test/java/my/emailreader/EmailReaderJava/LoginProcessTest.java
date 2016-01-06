package my.emailreader.EmailReaderJava;

import static org.junit.Assert.*;
import my.emailreader.EmailReaderJava.bll.LoginProcess;
import my.emailreader.EmailReaderJava.exception.TypeWrongException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginProcessTest {
	LoginProcess loginProcess = null;
	@Before
	public void beforeTest(){
		loginProcess = new LoginProcess();
	}
	@After
	public void afterTest(){
		loginProcess = null;
	}
	@Test 
	public void testQueryCreatorTrue(){
		String expected = "select * from users where email='admin@er.com' and password='123456';";
		String actual = loginProcess.queryCreator("admin@er.com", "123456");
		assertEquals(expected, actual);
	}


}

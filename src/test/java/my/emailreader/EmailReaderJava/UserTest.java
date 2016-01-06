package my.emailreader.EmailReaderJava;

import static org.junit.Assert.*;
import my.emailreader.EmailReaderJava.model.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserTest {
	User user = null;
	@Before
	public void beforeTest(){
		user = new User();
	}
	@After
	public void afterTest(){
		user = null;
	}
	@Test
	public void testGetId() {
		int expected = 5;
		user.setId(5);
		int actual = user.getId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEmail(){
		String expected = "admin@er.com";
		user.setEmail("admin@er.com");
		String actual = user.getEmail();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPassword(){
		String expected = "123456";
		user.setPassword("123456");
		String actual = user.getPassword();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFname(){
		String expected = "Quang";
		user.setFname("Quang");
		String actual = user.getFname();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLname(){
		String expected = "Vinh";
		user.setLname("Vinh");
		String actual = user.getLname();
		assertEquals(expected, actual);
	}

}

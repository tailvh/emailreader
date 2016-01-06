package my.emailreader.EmailReaderJava;

import static org.junit.Assert.*;
import my.emailreader.EmailReaderJava.bll.RegisterProcess;

import org.junit.Test;

public class RegisterProcessTest {

	@Test
	public void testCheckEmail(){
		assertTrue(RegisterProcess.checkEmail("admin@er.com"));
		assertFalse(RegisterProcess.checkEmail("@er.com"));
		assertFalse(RegisterProcess.checkEmail("1er.com"));
		assertFalse(RegisterProcess.checkEmail("123456"));
		assertFalse(RegisterProcess.checkEmail(".com"));
		assertFalse(RegisterProcess.checkEmail("admin@er"));
		assertFalse(RegisterProcess.checkEmail(""));
	}
	@Test
	public void testRegisterUser(){
		assertTrue(RegisterProcess.registerUser("abc@er.com", "123456", "Name", "Last"));
		assertFalse(RegisterProcess.registerUser("abc", "123456", "fname", "lname"));
	}
	@Test
	public void testCheckNotEmpty(){
		assertFalse(RegisterProcess.checkNotEmpty("", "", "", ""));
		assertFalse(RegisterProcess.checkNotEmpty("", "123456", "", ""));
		assertTrue(RegisterProcess.checkNotEmpty("admin@er.com", "123456", "Quang", "Vinh"));
	}
	@Test
	public void testCheckSamePassword(){
		assertTrue(RegisterProcess.checkSamePassword("123456","123456"));
		assertFalse(RegisterProcess.checkSamePassword("123456","12345"));
	}
	@Test
	public void testCheckLengthBetweenEightAndSixteen(){
		assertTrue(RegisterProcess.checkLengthBetweenEightAndSixteen("12345678"));
		assertFalse(RegisterProcess.checkLengthBetweenEightAndSixteen("123456"));
	}

}

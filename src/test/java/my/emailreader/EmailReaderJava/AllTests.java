package my.emailreader.EmailReaderJava;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	EmailTest.class,
    LoginProcessTest.class,
    RegisterProcessTest.class,
    UserTest.class,
    EmailProcessTest.class,
    UserProcessTest.class
})
public class AllTests 
{

}

package applicationTest;

import static org.junit.Assert.*;

import org.junit.Test;

import application.Account;
import application.Service;

public class ServiceTest {
	private Service testService = new Service();
	
	
	
	@Test
	public void testAddAccount() {
		Account testAcc = new Account("Sam", "Hart", 150);
		testService.addAccount(testAcc);
		assertNotNull("Null", testService.getAccount(150));
	}
	
	
	@Test
	public void testGetPerson() {
		Account testp = new Account("Sam","Hart",150);
		testService.addAccount(testp);
		assertEquals("Not match", testService.getAccount(150).getName(), "Sam Hart");
	}
	
	@Test
	public void testRemove() {
		Account acc = new Account("Kevin", "Baker", 1);
		testService.addAccount(acc);
		testService.removeAccount(1);
		assertNull("match", testService.getAccount(1));
	}
}

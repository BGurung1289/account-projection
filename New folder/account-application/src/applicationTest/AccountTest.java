package applicationTest;

import static org.junit.Assert.*;

import org.junit.Test;

import application.Account;

public class AccountTest {
	Account testAcc = new Account("Sam","Hart",150);
	
	
	@Test
	public void testCreate() {
		assertNotNull("creation not successful", testAcc);
	}
	
	@Test
	public void testGetName() {
		assertEquals("not matching", testAcc.getName(), "Sam Hart");
	}
	
	@Test
	public void testGetID() {
		assertEquals("not matchin", testAcc.getId(), 150);
	}
	
	@Test
	public void testGetFirst() {
		assertEquals("not same", testAcc.getFirst(), "Sam");
	}
	
	@Test
	public void testGetLast() {
		assertEquals("not same", testAcc.getLast(), "Hart");
	}
	
}

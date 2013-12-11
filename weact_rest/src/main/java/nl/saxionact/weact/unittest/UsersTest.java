package nl.saxionact.weact.unittest;

import static org.junit.Assert.*;

import nl.saxionact.weact.resources.Users;

import org.junit.Before;
import org.junit.Test;

public class UsersTest {
	Users u;
	@Before
	public void before() {
		u = new Users();
	}
	
	@Test(expected = AssertionError.class)	
	public void testRegisterUserWithEmptyParams() {
		u.register("", "", "");
		/* NOT REACHED */
	}

	@Test(expected = AssertionError.class)	
	public void testRegisterUserWithNullParams() {
		u.register(null, null, null);
		/* NOT REACHED */
	}
	@Test
	public void testRegisterUserWithGoodParams() {
		String name = "Henk";
		String email = "henk@mail.nl";
		String password = "p@ssw0rd";
		String ret = u.register(name, email, password);
		assertEquals(name + " - " + email + " - " + password, ret);
	}
	
	@Test (expected = AssertionError.class)
	public void testReportUserWithEmptyParam() {
		u.reportUser("");
		/* NOT REACHED */
	}
	
	@Test (expected = AssertionError.class)
	public void testReportUserWithNullParam() {
		u.reportUser(null);
		/* NOT REACHED */
	}
	
	@Test
	public void testReportUserWithFilledParam() {
		String name = "henk";
		String ret = u.reportUser(name);
		assertEquals("player banned: " + name , ret);
		/* NOT REACHED */
	}
}

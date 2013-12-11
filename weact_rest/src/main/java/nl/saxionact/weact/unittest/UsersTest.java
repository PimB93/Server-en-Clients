package nl.saxionact.weact.unittest;

import static org.junit.Assert.*;

import javax.ws.rs.WebApplicationException;

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
		String ret = u.register("", "", "");
		/* NOT REACHED */
	}

	@Test
	public void testRegisterUserWithGoodParams() {
		String name = "Henk";
		String email = "henk@mail.nl";
		String password = "p@ssw0rd";
		String ret = u.register(name, email, password);
		assertEquals(ret, name + " - " + email + " - " + password);
	}
	
}

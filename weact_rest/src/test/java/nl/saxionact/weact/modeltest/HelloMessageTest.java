package nl.saxionact.weact.modeltest;

import static org.junit.Assert.*;

import nl.saxionact.weact.model.HelloMessage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloMessageTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHelloMessage() {
		HelloMessage msg = new HelloMessage();
		msg.setUsername("Ruud Greven");
		assertEquals("Hello Ruud Greven", msg.getMessage());
	}
	
	/**
	@Test
	public void testTestHoiShouldReturnTrue() {
		HelloMessage msg = new HelloMessage();
		
		String berichtje = new String("hoi");
		assertTrue( msg.test(berichtje) );
	}
	**/

	@Test
	public void testTestNoHoiShouldReturnFalse() {
		HelloMessage msg = new HelloMessage();
		
		String berichtje = new String("pindarotsje");
		assertFalse( msg.test(berichtje) );
	}

	@Test
	public void testAssert() {
		assertTrue(true);
	}
}

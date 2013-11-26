package nl.saxionact.weact.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * This class represents a hello world message
 * @author ruud
 *
 */
@XmlRootElement
public class HelloMessage {
	private String username;
	
	public String getMessage() {
		return "Hello " + username;
	}
	
	public String getUsername() {
		return username;
	}
	
	/**
	 * Geef de lengte van de naam enzo.
	 */
	public Integer getNameLength() {
		if( username == "" )
			return 0;
		return username.length();
	}
	
	/**
	 * Sets the password.
	 *
	 * @param username   TODO
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public boolean test(String a) {
		if (a == "hoi") {
			return true;
		} else {
			return false;
		}
	}

	public boolean test2() {
		//TODO: Remove also
		if (true) {
			return true;
		} else {
			return false;
		}
	}

	public void test3() {
		String a = null;
		if (a.equals("leeg")) {
			System.out.println("Leeg");
		}
	}
}

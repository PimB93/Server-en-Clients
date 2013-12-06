package nl.saxionact.weact.model;

public class Domain {
	AuthManager authMan;
	
	public Domain() {
		System.out.println("Domain created");
		
		authMan = new AuthManager();
	}
}

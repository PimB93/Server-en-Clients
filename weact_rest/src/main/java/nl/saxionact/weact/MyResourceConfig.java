package nl.saxionact.weact;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * The ResourceConfig class
 * This class sets the applicationPath
 * 
 * @author Lars
 *
 */
@ApplicationPath("api")
public class MyResourceConfig extends ResourceConfig {
	/**
	 * This MyResourceConfig constructor
	 * This sets the packages
	 */
    public MyResourceConfig() {
        packages("nl.saxionact.weact.resources");
    }
}
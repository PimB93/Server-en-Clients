package nl.saxionact.weact;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import nl.saxionact.weact.model.Domain;
/**
 * ContextListener for the REST service
 * 
 * @author Lars
 *	
 */
public class ContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * The contextInitialized will be called at the start of the server
	 */
	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("Context initialized");
//		Domain d = new Domain();
		event.getServletContext().setAttribute("domain", null);
		
	}

}

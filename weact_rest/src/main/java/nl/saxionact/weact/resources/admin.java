package nl.saxionact.weact.resources;

import javax.servlet.ServletContext;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("/admin")
public class admin
{
	@Context
	private ServletContext context;
	@POST
	@Path("/hideshowuser")
	public void hideShowUser()
	{

	}

	@DELETE
	@Path("/deleteuser")
	public void deleteUser()
	{

	}

	@POST
	@Path("/setadmin")
	public void setAdmin()
	{

	}
}

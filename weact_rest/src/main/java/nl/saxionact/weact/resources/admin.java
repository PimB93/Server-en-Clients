package nl.saxionact.weact.resources;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/admin")
public class admin
{
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

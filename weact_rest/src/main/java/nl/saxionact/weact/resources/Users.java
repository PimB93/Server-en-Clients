package nl.saxionact.weact.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/users")
public class Users
{
	@GET
	public void allUsers()
	{

	}

	@GET
	@Path("/{username}")
	public void singleUser()
	{

	}

	@POST
	@Path("/register")
	public void register()
	{

	}

	@GET
	@Path("/search")
	public void searchUsers()
	{

	}

	@GET
	@Path("/search/pdf")
	public void searchUsersPDF()
	{

	}

	@POST
	@Path("/{username}/report")
	public void reportUser()
	{

	}

}

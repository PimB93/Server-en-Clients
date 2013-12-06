package nl.saxionact.weact.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;

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
	@Produces("{application/json}") // sends back to client
	public WebApplicationException register(@QueryParam("naam") String naam, @QueryParam("email") String email)
	{
		if (naam == "" || email == "") {
			return new WebApplicationException(400); 
		}
		
		// TODO
		// create user object in database
		
		return new WebApplicationException(201);
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

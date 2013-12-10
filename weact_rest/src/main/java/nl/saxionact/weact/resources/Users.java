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
	public String allUsers()
	{
		return "HOI";
	}

	@GET
	@Path("/{username}")
	public void singleUser()
	{

	}
	
	/**
	 * 
	 * @param name 		This is the name of the user 
	 * @param email		This is the email of the user
	 * @param password	this is the password of the user, this will be send encrypted over the internet
	 * @return			The user object in JSON format 
	 */
	@POST
	@Path("/register")
	public String register(@QueryParam("name") String name, @QueryParam("email") String email, @QueryParam("password") String password) {
		assert (name != null) : "queryparam naam is leeg";
		assert (email != null) : "queryparam email is leeg";
		assert (password != null) : "queryparam password is leeg";
		
		// if name, email of password null is then throw exception
		if (name == null || email == null || password == null) {
			throw new WebApplicationException(400);
		}
		
		// return user object in JSON format TODO
		return name + " - " + email + " - " + password;
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

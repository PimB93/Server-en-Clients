package nl.saxionact.weact.resources;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	 * This function will register a new user with name, email and his password
	 * 
	 * @param name 		This is the name of the user 
	 * @param email		This is the email of the user
	 * @param password	this is the password of the user, this will be send encrypted over the internet
	 * @return			The user object in JSON format 
	 */
	@POST
	@Path("/register")
	public String register(@QueryParam("name") String name, @QueryParam("email") String email, @QueryParam("password") String password) {
		assert (name != null) : "queryparam naam is null";
		assert (email != null) : "queryparam email is null";
		assert (password != null) : "queryparam password is null";
		assert (!name.isEmpty()) : "queryparam naam is leeg";
		assert (!email.isEmpty()) : "queryparam email is leeg";
		assert (!password.isEmpty()) : "queryparam password is leeg";
		
		// if name, email of password null is then throw exception
		if (name == null || name.isEmpty() || email == null || email.isEmpty() || password == null || password.isEmpty()) {
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

	/**
	 * This function will report a user
	 * 
	 * @param username	This is the username of the user that will be reported
	 * @return			Returns the userobject that is reported
	 */
	@POST
	@Path("/report")
	public String reportUser(@QueryParam("username") String username) 
	{
		assert(username != null) : "queryparam username is null";
		assert(username != "") : "queryparam username is leeg";
		
		if (username == null || username.isEmpty()) {
			throw new WebApplicationException(400); 
		}
		
		// report user methode call TODO
		return "player banned: " + username;
		
	}

}

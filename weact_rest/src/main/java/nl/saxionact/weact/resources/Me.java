package nl.saxionact.weact.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/me")
public class Me
{

	@POST
	@Path("/login")
	public void login(@QueryParam(value = "username") String username, @QueryParam(value = "password") String password)
	{
		// TODO a lot
	}

	@POST
	@Path("/validate")
	@Produces({"text/html"})
	@Consumes({"text/html"})
	public String validateMe()
	{
		return "blaat";
		// TODO a lot
	}

	@GET
	public void getMe()
	{
		// TODO a lot
	}

	@PUT
	public void editMe()
	{
		// TODO a lot
	}

	@POST
	@Path("/avatar")
	public void editAvatar()
	{

	}

	@DELETE
	public void removeMe()
	{

	}

	@POST
	@Path("/hideshowmail")
	public void hideShowMyEmail()
	{

	}

	@POST
	@Path("/tags")
	public void addTag()
	{

	}

	@DELETE
	@Path("/tags")
	public void removeTag()
	{

	}

	@GET
	@Path("/inbox")
	public void myInbox()
	{

	}

	@POST
	@Path("/sendmessage/{username}")
	public void sendMessage()
	{

	}

}

package nl.saxionact.weact.resources;

import java.io.InputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

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
	public void validateMe()
	{
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
	public void editAvatar() {
		
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

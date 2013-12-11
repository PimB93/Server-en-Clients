package nl.saxionact.weact.resources;

import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/me")
public class Me {

	@POST
	@Path("/login")
	public void login(@QueryParam(value = "username") String username,
			@QueryParam(value = "password") String password) {
		// TODO a lot
	}

	@POST
	@Path("/validate")
	public void validateMe() {
		// TODO a lot
	}

	@GET
	@Produces({ "text/html" })
	@Consumes({ "text/html" })
	public String getMe() {
		return "<html><h1>Hoi</h1></html>";
		// TODO a lot
	}

	@PUT
	public void editMe() {
		// TODO a lot
	}

	@POST
	@Path("/avatar")
	public void editAvatar() {

	}

	@DELETE
	public void removeMe() {

	}

	@POST
	@Path("/hideshowmail")
	public void hideShowMyEmail() {

	}

	@POST
	@Path("/tags/{tag}")
	public Response addTag(@PathParam("tag") String tag, @QueryParam("acces_token") String token) {
		if(token != null){//TODO:is acces token goed?
			if(tag != null){//TODO: bestaat tag al?
				//Voeg tag toe
				URI createdUri = URI.create(".");
				return Response.created(createdUri).entity("No real URI sent!!").build();
			}else{
				return Response.status(Status.BAD_REQUEST).entity("The tag does already exist").build();
			}
		}else {
			return Response.status(Status.UNAUTHORIZED).entity("Please use a correct Acces_token").build();
		}
	}

	@DELETE
	@Path("/tags")
	public void removeTag() {

	}

	@GET
	@Path("/inbox")
	public void myInbox() {

	}

	@POST
	@Path("/sendmessage/{username}")
	public void sendMessage() {

	}

}

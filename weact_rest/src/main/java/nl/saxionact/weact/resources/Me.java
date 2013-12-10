package nl.saxionact.weact.resources;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

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
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public Response editAvatar(
			@FormDataParam("file") InputStream uploadedInputStream,
			@FormDataParam("file") FormDataContentDisposition fileDetail) {

		if (fileDetail.getSize() < 1000000) {
			byte[] b = new byte[(int) fileDetail.getSize()];

			try {
				uploadedInputStream.read(b);
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			try {
				return Response.created(new URI("/me/avatar")).build();
			} catch (URISyntaxException e) {
				e.printStackTrace();
				return Response.status(500).build();
			}
		}
		else{
			return Response.status(Status.BAD_REQUEST).build();
		}

	}

	@GET
	@Path("/avatar")
	@Produces(MediaType.MULTIPART_FORM_DATA)
	public Response getAvatar() {
		return null;
	}

	@DELETE
	public void removeMe() {

	}

	@POST
	@Path("/hideshowmail")
	public void hideShowMyEmail() {

	}

	@POST
	@Path("/tags")
	public void addTag() {

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

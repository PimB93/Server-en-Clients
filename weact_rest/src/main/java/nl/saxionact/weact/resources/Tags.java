package nl.saxionact.weact.resources;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.core.Context;

public class Tags
{
	@Context
	private ServletContext context;
	@GET
	public void searchTags()
	{

	}
}

package it.angizialuco.web.controller;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.server.mvc.Viewable;

@Path("/")
@Singleton
public class HomeController {

	@GET
	public Viewable getHome() {
		return new Viewable(templateName);
		
	}
}

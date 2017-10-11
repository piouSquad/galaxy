package fr.jabbytechs.hackathon.galaxygop.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/galaxy")
public class GalaxyResource {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String updateGalaxy(String param) {
		System.out.println(param);
		return "{\"toto\":1}";
	}
	
}

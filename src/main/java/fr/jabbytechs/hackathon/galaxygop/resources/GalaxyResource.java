package fr.jabbytechs.hackathon.galaxygop.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import fr.jabbytechs.hackathon.galaxygop.model.FleetRetour;
import fr.jabbytechs.hackathon.galaxygop.model.Galaxy;
import fr.jabbytechs.hackathon.galaxygop.model.Planet;
import fr.jabbytechs.hackathon.galaxygop.model.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Path("/galaxy")
public class GalaxyResource {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String updateGalaxy(String param) {
		
		// just to know what you received in console
		System.out.println(param);
		
		// create a Galaxy
		Gson gson = new Gson();
		Galaxy galaxy = gson.fromJson(param, Galaxy.class);

		//create Response
		List<FleetRetour> fleets = new ArrayList<>();
		fleets.add(new FleetRetour(5,
				galaxy.getPlanets().stream()
						.filter(planet -> planet.getOwner() == 1)
						.collect(Collectors.toList()).get(0).getId(),
				galaxy.getPlanets().stream()
						.filter(planet -> planet.getOwner() == 0)
						.collect(Collectors.toList()).get(0).getId()));
		Response response = new Response(fleets,null);

		// Create an answer here...
		System.out.println(gson.toJson(response));
		return gson.toJson(response);
	}	
}

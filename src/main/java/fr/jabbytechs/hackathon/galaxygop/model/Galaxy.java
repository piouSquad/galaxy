package fr.jabbytechs.hackathon.galaxygop.model;

import java.util.ArrayList;
import java.util.List;

public class Galaxy {

	private List<Planet> planets = new ArrayList<>();
	private List<Fleet> fleets = new ArrayList<>();
	private Config config;

	public List<Planet> getPlanets() {
		return planets;
	}

	public void setPlanets(List<Planet> planets) {
		this.planets = planets;
	}

	public List<Fleet> getFleets() {
		return fleets;
	}

	public void setFleets(List<Fleet> fleets) {
		this.fleets = fleets;
	}

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}
}

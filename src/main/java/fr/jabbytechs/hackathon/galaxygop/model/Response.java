package fr.jabbytechs.hackathon.galaxygop.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a.potentier on 12/10/2017.
 */
public class Response {
    private List<FleetRetour> fleets = new ArrayList<>();
    private List<TerraformingRetour> terraformings = new ArrayList<>();

    public Response(List<FleetRetour> fleetRetour, List<TerraformingRetour> terraformingRetour) {
        this.fleets = fleetRetour;
        this.terraformings = terraformingRetour;
    }

    public List<FleetRetour> getFleetRetour() {
        return fleets;
    }

    public void setFleetRetour(List<FleetRetour> fleetRetour) {
        this.fleets = fleetRetour;
    }

    public List<TerraformingRetour> getTerraformingRetour() {
        return terraformings;
    }

    public void setTerraformingRetour(List<TerraformingRetour> terraformingRetour) {
        this.terraformings = terraformingRetour;
    }
}

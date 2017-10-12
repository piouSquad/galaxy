package fr.jabbytechs.hackathon.galaxygop.model;

/**
 * Created by a.potentier on 12/10/2017.
 */
public class FleetRetour {
    private int units;
    private int source;

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    private int target;

    public FleetRetour(int units, int source, int target) {
        this.units = units;
        this.source = source;
        this.target = target;
    }
}

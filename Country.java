package komorowski.piotr.panstwa;

import komorowski.piotr.Miejscowosc;

import java.util.ArrayList;

public class Country {
    private String name;
    private ArrayList<Miejscowosc> locations = new ArrayList<>();

    public Country(String name) {
        this.name = name;
    }

    public void addLocation(Miejscowosc location) {
        locations.add(location);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Miejscowosc> getLocations() {
        return locations;
    }

    public int getTotalPopulation() {
        int total = 0;
        for (Miejscowosc m : locations) {
            total += m.getPopulation();
        }
        return total;
    }
}

package komorowski.piotr;

// Klasa abstrakcyjna służy do dziedziczenia i nie powtarzania kodu
public abstract class Miejscowosc {
    protected String name;
    protected String country;
    protected int population;

    public Miejscowosc(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    public Miejscowosc() {
    }

    // Metoda abstrakcyjna obiekt dziedziciącze muszą implemętować metodę
    public abstract void getTransportType();


    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }
}



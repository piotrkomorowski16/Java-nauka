package komorowski.piotr.miasto;

import komorowski.piotr.Miejscowosc;
import komorowski.piotr.creatures.Human;

import java.util.ArrayList;

public class Village extends Miejscowosc {

    private int fieldSquareMeters;
    private ArrayList<Human> listaMieszkancow;

    public Village(String name, int population, int fieldSquareMeters, String country) {
        super(name, country, population);
        this.name = name;
        this.population = population;
        this.fieldSquareMeters = fieldSquareMeters;
        this.country = country;
        this.listaMieszkancow = new ArrayList<>();
    }


    public void setName(String name) {
        this.name = name;
    }


    public void removePeople(Human human) {
        listaMieszkancow.remove(human);
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getFieldSquareMeters() {
        return fieldSquareMeters;
    }

    public void setFieldSquareMeters(int fieldSquareMeters) {
        this.fieldSquareMeters = fieldSquareMeters;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Human> getListaMieszkancow() {
        return listaMieszkancow;
    }

    public void setListaMieszkancow(ArrayList<Human> listaMieszkancow) {
        this.listaMieszkancow = listaMieszkancow;
    }

    @Override
    public String toString() {
        return "Village{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", fieldSquareMeters=" + fieldSquareMeters +
                ", country='" + country + '\'' +
                ", listaMieszkancow=" + listaMieszkancow +
                '}';
    }

    @Override
    public void getTransportType() {
        System.out.println("Środki transportu to trakror, rower, PKS");
    }
}

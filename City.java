package komorowski.piotr.miasto;

import komorowski.piotr.Miejscowosc;
import komorowski.piotr.creatures.Human;

import java.util.ArrayList;

public class City extends Miejscowosc {
    private int animalsNumber;
    private ArrayList<Human> listaMieszkancow;

    public City(String name, String country, int population, int animalsNumber) {
        super(name, country, population);
        this.animalsNumber = animalsNumber;
        this.listaMieszkancow = new ArrayList<>();
    }

    public City(String name, String country) {
        super(name, country, 0);
        // Można zastosować dodanie new ArrayList w taki sposób
        this.listaMieszkancow = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Miasto: " + name;
    }


    public void addPeople(Human human) {
        listaMieszkancow.add(human);
    }

    public void showPopulation() {
        System.out.println(listaMieszkancow);
    }


    public void removePeople(Human human) {
        listaMieszkancow.remove(human);
    }

    public int getAnimalsNumber() {
        return animalsNumber;
    }

    public void setAnimalsNumber(int animalsNumber) {
        this.animalsNumber = animalsNumber;
    }

    public ArrayList<Human> getListaMieszkancow() {
        return listaMieszkancow;
    }

    public void setListaMieszkancow(ArrayList<Human> listaMieszkancow) {
        this.listaMieszkancow = listaMieszkancow;
    }

    public int getCitizenCount() {
        return listaMieszkancow.size();
    }

    @Override
    public void getTransportType() {
        System.out.println("Środki transportu to metro, tramwaj, trolejbus");
    }
}

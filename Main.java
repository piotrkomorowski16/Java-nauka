package komorowski.piotr;


import komorowski.piotr.creatures.Cat;
import komorowski.piotr.creatures.Color;
import komorowski.piotr.creatures.Dog;
import komorowski.piotr.creatures.Human;
import komorowski.piotr.miasto.City;
import komorowski.piotr.miasto.Village;
import komorowski.piotr.panstwa.Country;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Miasta
        City wroclaw = new City("Wrocław ", "Polska ", 180506, 658);
        City barcelona = new City("Barcelona", "Hiszpania", 356958, 2506008);
        City reda = new City("Reda", "Polska", 35627, 6253);
        Village malaWioska = new Village("Mała Wioska", 120, 4560, "Polska");
        Village bibury = new Village("Bibury", 525, 3952, "Anglia");
        bibury.getTransportType();
        wroclaw.getTransportType();
        wroclaw.showPopulation();
        barcelona.showPopulation();
        // Ludność
        Human mieszkaniec1 = new Human("Zdzisław", 22);
        Human mieszkaniec2 = new Human("Juan", 35);
        Human mieszkaniec3 = new Human("Maria", 65);
        Human mieszkaniec4 = new Human("Norbert", 32);
        Country polska = new Country("Polska");
        // Zwierzęta
        Dog pies1 = new Dog("Burek", "Carny", 6);
        System.out.println(pies1);
        pies1.getVoice();
        pies1.type3();
        pies1.type4();
        pies1.drinkWater();
        pies1.eatMeat();
        Cat kot1 = new Cat("Ruby", Color.BROWN, 3);
        Cat kot2 = new Cat("Klakier", Color.BLACK, 6);
        switch (kot1.getColor()) {
            case WHITE:
                System.out.println(kot1+". Ten kot jest biały");
                break;
            case BLACK:
                System.out.println(kot1+". Ten kot jest czarny");
                break;
            case BROWN:
                System.out.println(kot1+". Ten kot jest brązowy");
                break;

        }
        System.out.println(kot2);
        System.out.println(kot1);
        kot1.getVoice();
        kot1.type1();
        kot1.type2();
        kot1.drinkMilk();
        kot1.eatMouse();
        polska.addLocation(wroclaw);
        polska.addLocation(malaWioska);
        polska.addLocation(reda);
        System.out.println("Populacja Polski: " + polska.getTotalPopulation());
        Country anglia = new Country("Anglia");
        anglia.addLocation(bibury);
        System.out.println("Populacja Angli: " + anglia.getTotalPopulation());
        Country hiszpania = new Country("Hiszpania");
        hiszpania.addLocation(barcelona);
        System.out.println("Populacja Hiszpani: " + hiszpania.getTotalPopulation());
        barcelona.addPeople(mieszkaniec2);
        barcelona.addPeople(mieszkaniec3);
        wroclaw.addPeople(mieszkaniec1);
        reda.addPeople(mieszkaniec4);
        System.out.println("Lista mieszkańców Wrocławia");
        wroclaw.showPopulation();
        System.out.println("Lista mieszkańców Barcelony");
        barcelona.showPopulation();
        System.out.println("Lista mieszkańców Redy");
        reda.showPopulation();
        mieszkaniec1.setAge(25);
        System.out.println();
        mieszkaniec2.setName("Edward");
        System.out.println("Lista mieszkańców Wrocławia");
        System.out.println("Już 3 lata mieszkam w tym mieście, lata lecą mam: ");
        wroclaw.showPopulation();
        System.out.println("Lista mieszkańców Barcelony");
        System.out.println("Juan zmienił imię na: ");
        barcelona.showPopulation();
        System.out.println("Liczba mieszkańców Barcelony:");
        System.out.println(barcelona.getCitizenCount());
        System.out.println("Liczba mieszkańców Wrocławia:");
        System.out.println(wroclaw.getCitizenCount());
        try {
            mieszkaniec3.setAge(-22);
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

}

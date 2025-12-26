package komorowski.piotr.creatures;

public class Cat extends Animal implements Eat {
    private String name;
    private Color color;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Kot: " + name + ",kolor: " + color + ", wiek: " + age;
    }

    @Override
    public void getVoice() {
        System.out.println("Meow");

    }

    public Cat(String name, Color color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    @Override
    public void drinkMilk() {
        System.out.println(name+" pije "+Eat.type1+" -mleczko");


    }

    @Override
    public void eatMouse() {
        System.out.println(name+" je "+Eat.type2+" -myszkę");


    }

    @Override
    public void drinkWater() {

    }

    @Override
    public void eatMeat() {

    }

    public void type1() {
        System.out.println(Eat.type1 + " Milk");
    }

    public void type2() {
        System.out.println("Tasty " + Eat.type2);

    }
}

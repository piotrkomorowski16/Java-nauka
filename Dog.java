package komorowski.piotr.creatures;

public class Dog extends Animal implements Eat{
    private String name;
    private String color;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pies: " + name + ", kolor: " + color + ", wiek: " + age;
    }

    @Override
    public void getVoice() {
        System.out.println("Woof Woof");

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    @Override
    public void drinkMilk() {
        
    }

    @Override
    public void eatMouse() {

    }

    @Override
    public void drinkWater() {
        System.out.println(name+ " pije "+Eat.type3+" -swieżą wodę");

    }

    @Override
    public void eatMeat() {
        System.out.println(name+" je "+Eat.type4+" -mięsko");

    }

    public void type3() {
        System.out.println(Eat.type3+" Water");
    }

    public void type4() {
        System.out.println("Tasty "+Eat.type4);
    }
}

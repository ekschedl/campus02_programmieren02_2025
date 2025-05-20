package V_Animal;

public class Animal {
    protected String color;
    protected int countEyes;


    public Animal(String color, int countEyes) {
        this.color = color;
        this.countEyes = countEyes;
    }

    public void walk() {
        System.out.println("Animal walks -------------- von Klasse Animal");
    }

    public void makeNoise() {
        System.out.println("Animal makes noise");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}
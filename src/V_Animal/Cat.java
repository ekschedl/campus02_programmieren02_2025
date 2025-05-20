package V_Animal;

public class Cat extends Animal {
    protected String name;

    public Cat(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Cat loves to run and slide on my knees --------------von Klasse Cat");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Cat can meow 'mjjauu' --------------von Klasse Cat");

    }

    public Cat(String color, int countEyes) {
        super(color, countEyes);
    }
}

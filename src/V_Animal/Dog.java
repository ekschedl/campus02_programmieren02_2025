package V_Animal;

public class Dog extends Animal {

    protected String name;

    public Dog(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("Dog jumps -------------- von Klasse Dog");
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Dog can bark 'gaaaav' ------------ von Klasse Dog");
    }

    @Override
    public String toString() {
        return name + " (" + color + ", " + countEyes + " eyes)";
    }




}

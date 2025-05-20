package V_Animal;

public class Frog extends Animal {

    public Frog(String color, int countEyes) {
        super(color, countEyes);
    }


    @Override
    public void walk() {
        System.out.println("Frog jumps -------------- von Klasse Frog");
    }

    @Override
    public void makeNoise() {
        System.out.println("Frog quaks 'quak' -------------- von Klasse Frog");
    }
}


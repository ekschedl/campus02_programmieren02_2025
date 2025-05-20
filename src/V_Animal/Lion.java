package V_Animal;

public class Lion extends Animal {

    public Lion(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("Lion runs");
    }

    public void roar() {
        System.out.println("Lian roars");
    }
}

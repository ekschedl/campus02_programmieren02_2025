package V_Zoo_selbstlernen;

public class ZooCat  extends ZooAnimal{

    public ZooCat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Mjaau!");
    }

    @Override
    public void moved() {
        System.out.println(name + ": geht elegant und streichelt gern");
    }
}

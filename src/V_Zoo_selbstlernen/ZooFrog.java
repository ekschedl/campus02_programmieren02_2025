package V_Zoo_selbstlernen;

public class ZooFrog extends ZooAnimal {

    public ZooFrog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Quack!");
    }

    @Override
    public void moved() {
        System.out.println(name + ": springt hoch");
    }
}

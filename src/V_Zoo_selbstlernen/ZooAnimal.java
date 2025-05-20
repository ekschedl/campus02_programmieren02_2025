package V_Zoo_selbstlernen;

public abstract class ZooAnimal {
    protected String name;

    public ZooAnimal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println( "macht ");
    }

    public void moved() {
        System.out.println(name + "bewegt sich ");
    }

    @Override
    public String toString() {
        return "ZooAnimal{" +
                "name='" + name + '\'' +
                '}';
    }
}

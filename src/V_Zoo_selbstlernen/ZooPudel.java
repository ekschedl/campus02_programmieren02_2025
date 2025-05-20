package V_Zoo_selbstlernen;

public class ZooPudel extends ZooDog {
    public ZooPudel(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Pudel Wuff!");
    }

    @Override
    public void moved() {
        System.out.println(name + ": Pudel läuft auf seinen vier Pfoten");
    }
}

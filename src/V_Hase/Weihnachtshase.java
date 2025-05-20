package V_Hase;

public class Weihnachtshase extends Hase{


    public Weihnachtshase(String name) {
        super(name);
    }

    @Override
    public void hoppeln() {
        super.hoppeln();
        System.out.println("Weihnachtshase hoppelt");
    }
}

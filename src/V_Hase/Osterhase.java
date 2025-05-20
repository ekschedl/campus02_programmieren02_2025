package V_Hase;

public class Osterhase extends Hase {
    public Osterhase(String name) {
        super(name);
    }

    public void vesteckeOstereier() {
        System.out.println("Osterhase hat Eier versteckt");
    }
    @Override
    public void hoppeln() {
        super.hoppeln();
        System.out.println("Osterhase hoppelt");
    }

}

package V_Orchester;

public class Gitarre extends Instrument {
    public int play() {
        System.out.println("Gitarre wird gezupft");
        return super.getLautstaeke();
    }

    public Gitarre(int lautstaeke) {
        super(lautstaeke);
    }
}

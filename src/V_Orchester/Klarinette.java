package V_Orchester;

public class Klarinette extends Instrument {
    public int play() {
        System.out.println("Klarinette wird geblasen");
        return super.getLautstaeke();
    }

    public Klarinette(int lautstaeke) {
        super(lautstaeke);
    }
}

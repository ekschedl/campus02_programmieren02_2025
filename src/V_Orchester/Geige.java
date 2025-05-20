package V_Orchester;
public class Geige extends Instrument {
    @Override
    public int play() {
        System.out.println("Geige wird gestrichen");
        return super.getLautstaeke();
    }

    public Geige(int lautstaeke) {
        super(lautstaeke);
    }
}

package V_Orchester;
public class Trompete extends Instrument {
    public int play() {
        System.out.println("Trompete wird geblasen");
        return super.getLautstaeke();
    }

    public Trompete(int lautstaeke) {
        super(lautstaeke);
    }
}

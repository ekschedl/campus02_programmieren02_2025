package V_Orchester;

public class Instrument {
    private int lautstaeke ;
    public int play(){
        System.out.println("Basisklasse play(): Lautstärke ist " + lautstaeke);
        return lautstaeke;
    }

    public Instrument(int lautstaeke) {
        this.lautstaeke = lautstaeke;
    }

    public int getLautstaeke() {
        return lautstaeke;
    }
}

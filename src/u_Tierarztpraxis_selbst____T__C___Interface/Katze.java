package u_Tierarztpraxis_selbst____T__C___Interface;
public class Katze extends Tier {
    private boolean istLanghaar;

    public Katze(String name, int lautstaerke, boolean istLanghaar) {
        super(name, lautstaerke);
        this.istLanghaar = istLanghaar;
    }

    @Override
    public String getTierart() {
        return "Katze";
    }

    @Override
    public double behandlungskosten() {
        return istLanghaar ? 60.0 : 40.0;
    }

    @Override
    public String toString() {
        return getTierart() + " namens " + name + " (Langhaar: " + istLanghaar + ", Lautstärke: " + lautstaerke + ")";
    }
}
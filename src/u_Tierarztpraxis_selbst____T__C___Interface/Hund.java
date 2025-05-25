package u_Tierarztpraxis_selbst____T__C___Interface;

public class Hund extends Tier {
    private String rasse;

    public Hund(String name, int lautstaerke, String rasse) {
        super(name, lautstaerke);
        this.rasse = rasse;
    }

    @Override
    public String getTierart() {
        return "Hund";
    }

    @Override
    public double behandlungskosten() {
        return 50 + Math.max(0, (lautstaerke - 5)) * 20;
    }
    @Override
    public String toString() {
        return getTierart() + " namens " + name + " (Rasse: " + rasse + ", Lautstärke: " + lautstaerke + ")";
    }
}
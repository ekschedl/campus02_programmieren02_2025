package u_Tierarztpraxis_selbst____T__C___Interface;

public class Esel extends Tier {
    private int trageLast;

    public Esel(String name, int lautstaerke, int trageLast) {
        super(name, lautstaerke);
        this.trageLast = trageLast;
    }

    @Override
    public String getTierart() {
        return "Esel";
    }

    @Override
    public double behandlungskosten() {
        return 30.0 + (trageLast * 0.5);
    }

    @Override
    public String toString() {
        return getTierart() + " namens " + name + " (Last: " + trageLast + "kg, Lautstärke: " + lautstaerke + ")";
    }
}

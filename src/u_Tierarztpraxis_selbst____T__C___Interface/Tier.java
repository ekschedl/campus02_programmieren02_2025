package u_Tierarztpraxis_selbst____T__C___Interface;



public abstract class Tier {
    protected String name;
    protected int lautstaerke;

    public Tier(String name, int lautstaerke) {
        this.name = name;
        this.lautstaerke = lautstaerke;
    }

    public String getName() {
        return name;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public abstract String getTierart();

    public abstract double behandlungskosten();
}

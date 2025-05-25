package Fahrzeug______V_C_T;

public class Auto extends Fahrzeug {
    private int ps;

    public Auto(int baujahr, String marke, int ps) throws UngueltigePsException {
        super(baujahr, marke);
        if (ps < 0) {
            throw new UngueltigePsException("PS dürfen nicht negativ sein.");
        }
        this.ps = ps;
    }

    @Override
    void zeigeInfo() {
        System.out.println("Auto: " + getMarke() + ", Baujahr: " + getBaujahr() + ", PS: " + ps);

    }

    @Override
    public double berechneVersicherungswert() {
        return ps * 10;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}

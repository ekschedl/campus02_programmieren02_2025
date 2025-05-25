package Fahrzeug______V_C_T;

public class Fahrrad extends Fahrzeug {
    private boolean hatGangschaltung;

    public Fahrrad(int baujahr, String marke, boolean hatGangschaltung) {
        super(baujahr, marke);
        this.hatGangschaltung = hatGangschaltung;
    }

    @Override
    public double berechneVersicherungswert() {
        return hatGangschaltung ? 200 : 100;
    }

    @Override
    void zeigeInfo() {
        System.out.println("Fahrrad: " + getMarke() + ", Baujahr: " + getBaujahr() + ", Gangschaltung: " + hatGangschaltung);
    }
}

package Fahrzeug______V_C_T;

public abstract class Fahrzeug implements Versicherbar {
    private int baujahr;
    private String marke;


    public Fahrzeug(int baujahr, String marke) {
        setBaujahr(baujahr);
        this.marke = marke;
    }
/**
 public Fahrzeug(int baujahr, String marke) throws UngueltigesBaujahrException {
 if (baujahr < 1900) throw new UngueltigesBaujahrException("Baujahr ungültig!");
 this.baujahr = baujahr;
 this.marke = marke;
 }  dann aber setBaujahr abändern
 */


    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        if (baujahr < 1900) try {
            throw new UngueltigesBaujahrException("Baujahr ungültig!");
        } catch (UngueltigesBaujahrException e) {
            throw new RuntimeException(e);
        }
        this.baujahr = baujahr;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    abstract void zeigeInfo();



    /* WICHTIG FÜR VERGLICHEN, es gibt 2 Methode
    * 1.
    * public class Fahrzeug implements Comparable<Fahrzeug> {
    @Override
    public int compareTo(Fahrzeug anderesFahrzeug) {
        return this.getBaujahr() - anderesFahrzeug.getBaujahr();
    }
    * Dann kannst du einfach so sortieren, ohne Comparator:
    * Collections.sort(meineFahrzeuge); // verwendet compareTo()
}*/
}

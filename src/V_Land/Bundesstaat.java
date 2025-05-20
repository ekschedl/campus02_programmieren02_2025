package V_Land;


import java.util.ArrayList;

// Bundesstaat -Unterklasse  von Land
public class Bundesstaat extends Land {

    private ArrayList<Land> laender; // Liste von Ländern

    // Konstruktor – ruft den leeren Konstruktor von Land auf und initialisiert die Liste
    public Bundesstaat() {
        super(); // notwendig, da Land einen leeren Konstruktor hat
        this.laender = new ArrayList<Land>();
    }


    // Methode zum Hinzufügen eines Landes zur Liste
    public void addLand(Land l) {
        laender.add(l);
    }

    //die Summe der Bruttosozialprodukte sämtlicher aufgenommener Länder, welche sich in der
    //zuvor erwähnten ArrayList<Land> befinden, retourniert
    @Override
    public double getBruttoSozialProdukt() {
        double bruttoSozialProduktFromAll = 0;
        for (int i = 0; i < laender.size(); i++) {
            bruttoSozialProduktFromAll += laender.get(i).getBruttoSozialProdukt();
        }
        return bruttoSozialProduktFromAll;

//        mit for each:
//        double summe = 0;
//        for (Land l : laender) {
//            summe += l.getBruttoSozialProdukt();
//        }
//        return summe;
    }

}

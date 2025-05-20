package u_Devices;

// Unterklasse von Device – speziell für Smartwatches
public class Smartwatch extends Device {
    protected int nrWristSize; //Handgelenkgröße

    // Konstruktor: übergibt Standardattribute an die Oberklasse + setzt Handgelenkgröße
    public Smartwatch(String name, Processor processor, int releaseYear, int nrProduced, int nrWristsize) {
        super(name, processor, releaseYear, nrProduced);
        this.nrWristSize = nrWristsize;
    }


    //Getter und Setter für Handgelenkgröße
    public int getNrWristSize() {
        return nrWristSize;
    }

    public void setNrWristSize(int nrWristSize) {
        this.nrWristSize = nrWristSize;
    }

    //für eine einfache  Beschreibung von Smartwatch
    @Override
    public String toString() {
        return "Smartwatch{" + ", name: " + name + '\'' + ", nrProduced: " + nrProduced + '}';
    }


    // Berechnung der Produktionskosten:
    // Basiswert 100 euro, dann Zusatzkosten je nach Handgelenkgröße (größer = teurer)
    @Override
    public double calculateProductionCost() {
        double productionsCosts = 100;
        // Je größer die Uhr, desto teurer ist die Herstellung
        return nrProduced * (productionsCosts + ((nrWristSize * 10) - 10));
        //beispiel:  nrWristSize = 180:
        //180 * 10 = 1800   →    1800 - 10 = 1790 Das ist der Zuschlag wegen der Größe
        //productionsCosts + Zuschlag  → 100 + 1790 = 1890.
        //nrProduced * 1890   → 1000 * 1890 = 1.890.000 €
        //Das ist die Gesamtsumme für alle 1000 Geräte
        //Vorschlag (wenn realistischer sein soll):  statt * 10 einfach * 0.5 machen:
        //return nrProduced * (productionsCosts + ((nrWristSize * 0.5) - 10));
        //180 * 0.5 = 90 → 90 - 10 = 80
        //100 + 80 = 180 € pro Stück
        //1000 * 180 = 180.000 €
    }

    // jährlichen Supportkosten für alle produzierten Smartwatches
    //Mehr Kerne = aufwendigere Technik = teurerer Support.
    //Support kostet 10 pro Kern und diese Kosten mit der Anzahl
    // produzierter Geräte multipliziert
    @Override
    public double calculateSupportCostForAYear(int Year) {
        return (10 * processor.getNrCores()) * nrProduced;
    }


}



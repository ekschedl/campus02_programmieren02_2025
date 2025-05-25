package u_Devices____________PR;

// Abstrakte Oberklasse für alle Geräte (Smartphones, Laptops, etc.)
public abstract class Device {
    protected String name;     // Name des Geräts
    Processor processor; // Jeder Device hat einen Prozessor – wird als eigene Klasse 'Prozessor' behandel
    protected int releaseYear; // Jahr, in dem das Gerät erschienen
    protected int nrProduced;    // Anzahl, wie oft dieses Modell produziert wurde


    // Konstruktor – wird beim Erstellen des Objekts automatisch aufgerufen
    public Device(String name, Processor processor, int releaseYear, int nrProduced) {
        this.name = name;
        this.processor = processor;
        this.releaseYear = releaseYear;
        this.nrProduced = nrProduced;
    }

    // 2 Abstrakte Methoden:abstrakt, weil jedes Gerät diese Kosten anders berechnet_ wird in den Unterklassen konkret berechnet :
    public abstract double calculateProductionCost();
    public abstract double calculateSupportCostForAYear(int Year);



    //Getters und Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getNrProduced() {
        return nrProduced;
    }

    public void setNrProduced(int nrProduced) {
        this.nrProduced = nrProduced;
    }


}

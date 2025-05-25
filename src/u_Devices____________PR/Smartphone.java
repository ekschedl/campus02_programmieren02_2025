package u_Devices____________PR;

// Unterklasse von Device – speziell für Smartphones
public class Smartphone  extends Device{
    protected int nrCameras;    // Anzahl der Kameras bei Smartphone

    // Konstruktor ruft den Konstruktor der Oberklasse Device auf und setzt zusätzlich nrCameras
    public Smartphone(String name, Processor processor, int releaseYear, int nrProduced, int nrCameras) {
        super(name, processor, releaseYear, nrProduced);
        this.nrCameras = nrCameras;
    }


    // Berechnung der Produktionskosten (überschreibt Methode aus Device,in Device ist es abstrakte Methode, daher implementiere es hier in der Unterklasse )
    @Override
    public double calculateProductionCost() {
        // Grundpreis: Generation des Prozessors * 100 + 20
        double sum = (processor.getGeneration() * 100 + 20);

        // Wenn große Stückzahl kommt Rabatt
        if (nrProduced > 100_000 && nrProduced < 1_000_0000) {
            return nrProduced * (sum * 0.1); //90%Rabatt
        }
        // ab 1_000_0000  noch mehr Rabatt
        if (nrProduced > 1_000_0000) {
            return nrProduced * (sum * 0.2);// 80%Rabatt
        }
        // Normalfall: keine Rabatte
        return nrProduced * sum;
    }

    // Berechnung der Supportkosten pro Jahr (überschreibt Methode aus Device, in Device ist es abstrakte Methode, daher implementiere es hier in der Unterklasse )
    @Override
    public double calculateSupportCostForAYear(int Year) {
        // Im ersten und zweiten Jahr  Support kostenlos
        if (Year == releaseYear || Year == releaseYear + 1) {
            return 0;
        } else {
            // danach Support kostet je nach Generation des Prozessors
            return nrProduced * (processor.getGeneration() * 40);
        }
    }

    //Getters und Setters
    public int getNrCameras() {
        return nrCameras;
    }

    public void setNrCameras(int nrCameras) {
        this.nrCameras = nrCameras;
    }

    // zurückgibt eine einfache Beschreibung von Objekt
    @Override
    public String toString() {
        return "Smartphone{" + ", name: '" + name + '\'' + ", nrProduced=" + nrProduced + '}';
    }
}

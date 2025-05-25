package u_Devices____________PR;

public class Tablet extends Device {
    protected int arCameras;// ??? Anzahl der AR-Kameras im Tablet

    public Tablet(String name, Processor processor, int releaseYear, int nrProduced, int arCameras) {
        super(name, processor, releaseYear, nrProduced);
        this.arCameras = arCameras;
    }

    //Getter und Setter
    public int getArCameras() {
        return arCameras;
    }

    public void setArCameras(int arCameras) {
        this.arCameras = arCameras;
    }

    // Methode berechnet, wie viel die Herstellung eines Tablets kostet,
    // abhängig von: Anzahl der AR-Kameras und Generation und Kerne des Prozessors
    @Override
    public double calculateProductionCost() {
        double productionCosts = 0;

        int generation = getProcessor().getGeneration();
        int cores = getProcessor().getNrCores();

        if (generation == 1) {
            if (cores == 1) {
                productionCosts = 150;
            } else {
                productionCosts = 200;
            }
        } else if (generation == 2) {
            if (cores <= 3) {
                productionCosts = 350;
            } else if (cores > 3 && cores < 8) {
                productionCosts = 400;
            } else {
                productionCosts = 450;
            }
        } else if (generation >= 3) {
            productionCosts = 700;
        }

        // Zusatzkosten für AR-Kameras
        productionCosts = productionCosts + (arCameras * 50);

        return productionCosts * nrProduced;

    }


    //Wir überschreiben die Methode, weil sie in der Oberklasse Device abstrakt ist,
    // für Tablet wir brauchen eine eigene Berechnungslogik .
    @Override
    public double calculateSupportCostForAYear(int year) {
        int jahreSeitRelease = year - releaseYear;

        if (jahreSeitRelease < 0) {// Kein Support, weil das Gerät da noch nicht existiert hat
            return 0;
        } else if (jahreSeitRelease == 0) {//das Erscheinungsjahr selbst- voller Supportpreis
            return 50 * nrProduced; //50 pro Gerät, mal Anzahl Geräte
        } else if (jahreSeitRelease < 10) { //innerhalb  10 Jahre nach Release
            double supportPreisProGerät = 50 - (jahreSeitRelease * 0.10); //Pro Jahr nach dem Release wird der Supportpreis um 0,10(also 10 Cent) gesenkt.
            return supportPreisProGerät * nrProduced;
        } else {
            return 0; // älter als 10 Jahre → kein Support mehr
        }
    }

    @Override
    public String toString() {
        return "Tablet{" + ", name=: " + name + '\'' + ", nrProduced=" + nrProduced + '}';
    }
}

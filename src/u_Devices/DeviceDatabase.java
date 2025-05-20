package u_Devices;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DeviceDatabase {// Verwaltung für viele Geräte (Devices)
    private List<Device> deviceList;

    public DeviceDatabase() {
        this.deviceList = new ArrayList<>();
    }

    public void addDevice(Device device) {
        deviceList.add(device);
    }

    public double calculateSumOfProductionCosts() {
        double sum = 0;
        for (Device d : deviceList) {
            sum += d.calculateProductionCost();
        }
        return sum;
    }


    // Device zurückgibt und finden das Gerät mit  niedrigsten Produktionskosten
    public Device findeDeviceWithCheapestProductionCost() {
        Device cheapestDevice = null; //Variable angelegt, um sich das aktuell günstigste Gerät zu merken.

        //Startwert: sehr hoch, damit der erste Vergleich funktioniert
        //starten sehr hoch, damit der erste echte Wert sicher kleiner ist,
        //Ich setze den Startwert extra hoch, damit jeder echte Wert in der Liste automatisch kleiner ist.
        double cheapestCost = Double.MAX_VALUE;

        for (Device d : deviceList) { //for-each-Schleife, die durch alle Geräte in der Liste deviceList geh
            //Wir fragen das aktuelle Gerät:
            //Wie viel kostet deine Herstellung?
            //Diese Zahl speichern wir in currentCost.
            double currentCost = d.calculateProductionCost();

            //Ist das aktuelle Gerät billiger als das bisher billigste?
            //Wenn ja, dann speichern wir es ab:
            if (currentCost < cheapestCost) {
                cheapestCost = currentCost; //cheapestCost bekommt den neuen (kleineren) Wert
                cheapestDevice = d; //cheapestDevice merkt sich dieses aktuelle Gerät
            }
        }
//Ganz am Ende, nachdem alle Geräte durchgegangen wurden,
//geben wir das günstigste Gerät zurück
        return cheapestDevice;
    }


    //Berechne die Gesamten Supportkosten
    // für ein Gerät von Releasejahr bis zu einem bestimmten Jahr.
    public double calculateSupportCostUntilYear(Device device, int year) {
        double sum = 0;
        //prüfe zuerst, ob das angegebene Jahr  nach dem Erscheinungsjahr
        if (device.getReleaseYear() > year) {
            return 0;
        }
        //Wenn ja, gehe ich alle Jahre von Release bis zum Zieljahr
        // durch und summiere die Supportkosten mit
        // calculateSupportCostForAYear(y)
        for (int y = device.getReleaseYear(); y <= year; y++) {
            sum += device.calculateSupportCostForAYear(y);
        }

        return sum;
    }

    public Device findDeviceWithHighestSupportCost(int year) {
        Device mostExpensiveDevice = null;
        //Bei Supportkosten suchen  das größte daher starten  mit dem kleinsten sinnvollen Wert = 0
        //Wir starten bei 0, weil negative Supportkosten keinen Sinn machen
        //Da Supportkosten nie negativ sind, ist 0 ein logischer und verständlicher Anfangswert für den Maximalvergleich
        double mostExpensive = 0;

        for (Device d : deviceList) {
            double currentSupportCost = d.calculateSupportCostForAYear(year);
            if (currentSupportCost > mostExpensive) {
                mostExpensive = currentSupportCost;
                mostExpensiveDevice = d;
            }
        }

        return mostExpensiveDevice;
    }

    //Suche alle Geräte, deren Prozessor-Generation bestimmte Mindestanzahl an Kernen erfüllt
    public ArrayList<Device> findDevicesThatFullfillMinimumPerformance(HashMap<Integer, Integer> minimum) {

        // eine leere Liste, in die alle passenden Geräte eingefügt werden
        ArrayList<Device> Ergebnisliste = new ArrayList<>();

        // Durchlaufe jedes Gerät in der Geräteliste
        for (Device d : deviceList) {
            // Hole aus der HashMap den Mindestwert an Kernen für die Generation dieses Geräts
            Integer cores = minimum.get(d.getProcessor().getGeneration());
            // Prüfe, ob es überhaupt eine Vorgabe für diese Generation gibt (cores ≠ null)
            // UND ob das Gerät mindestens so viele Kerne hat wie gefordert
            if (cores != null && d.getProcessor().getNrCores() >= cores) {
                // Wenn die Bedingungen erfüllt sind, füge das Gerät zur Ergebnisliste hinzu
                Ergebnisliste.add(d);
            }
        }
        // Gib die Liste aller Geräte zurück, die die Mindestleistung erfüllen
        return Ergebnisliste;
    }


    // Methode zählt Geräte nach Produktionskosten-Kategorie (low, medium, high)
    //Die Methode soll alle Geräte (Device) nach ihren Produktionskosten in drei Gruppen einteilen:
    //
    //	•	"low": wenn Kosten unter lowBorder
    //	•	"medium": wenn Kosten zwischen lowBorder und mediumBorder
    //	•	"high": wenn Kosten größer als mediumBorder
    //Und das Ergebnis soll als HashMap zurückgegeben werden zb {low=3, medium=4, high=2}
    public HashMap<String, Integer> numberDevicesGroupedByConstructionCost(double lowBorder, double mediumBorder) {
        //Erstelle eine neue Map, in der später "low", "medium" und "high" als Schlüssel stehen.
        HashMap<String, Integer> groupedByConstructionCosteCatagories = new HashMap<>();
        int sum1 = 0; // zählt low
        int sum2 = 0; // zählt medium
        int sum3 = 0; // zählt high
        for (Device f : deviceList) { // Schleife durch alle Geräte
            //Wenn das Gerät sehr billig ist low-Zähler +1
            if (f.calculateProductionCost() < lowBorder) {
                sum1++;
                groupedByConstructionCosteCatagories.put("low", sum1);
            } else if (f.calculateProductionCost() < mediumBorder) {
                sum2++;
                groupedByConstructionCosteCatagories.put("medium", sum2);
            } else {
                sum3++;
                groupedByConstructionCosteCatagories.put("high", sum3);
            }
        }
        return groupedByConstructionCosteCatagories;
    }

    public void sortedPrint() {
        // Neue Liste, um die originale deviceList nicht zu verändern
        List<Device> sortedList = new ArrayList<>(deviceList);

        // Verwende den eigenen Comparator für die Sortierung
        sortedList.sort(new DeviceComparator());

        // Ausgabe aller sortierten Geräte
        for (Device d : sortedList) {
            System.out.println(d.getName() + " | Produktionskosten: " + d.calculateProductionCost());
        }

        /* oder anderer Comparator :
        List<Device> sorted = new ArrayList<>(deviceList);
        sorted.sort(new DeviceSupportCostComparator(2024)); // zbSupport im Jahr 2024 vergleichen

        for (Device d : sorted) {
         System.out.println(d.getName() + " | Supportkosten 2024: " + d.calculateSupportCostForAYear(2024));
        }*/

    }

    public List<Device> getDevices() {
        return deviceList;
    }

}
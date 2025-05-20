package u_Devices;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeviceDatabase database = new DeviceDatabase();

        // Prozessoren erstellen
        Processor processor1 = new Processor("erster Prozessor", 1, 2);
        Processor processor2 = new Processor("zweiter Prozessor", 2, 4);
        Processor processor3 = new Processor("dritter Prozessor", 3, 8);

        // Geräte erstellen
        Device smartwatch = new Smartwatch("Galaxy Watch", processor1, 2020, 500_000, 180);
        Device smartphone = new Smartphone("iPhone 15", processor2, 2022, 1_000_000, 128);
        Device tablet = new Tablet("iPad Pro", processor3, 2021, 750_000, 2);

        // Geräte zur Datenbank hinzufügen
        database.addDevice(smartwatch);
        database.addDevice(smartphone);
        database.addDevice(tablet);

        // Formatierer für schöne Zahlen
        DecimalFormat df = new DecimalFormat("#,###.00");

        // Günstigstes Gerät
        Device cheapest = database.findeDeviceWithCheapestProductionCost();
        System.out.println("Günstigstes Gerät: " + cheapest.getName() +
                " | Kosten: " + df.format(cheapest.calculateProductionCost()));

        // Gesamtkosten
        double gesamtKostenAllerGerate = database.calculateSumOfProductionCosts();
        System.out.println("Summe aller Produktionskosten: " + df.format(gesamtKostenAllerGerate));

        // Höchste Supportkosten in Jahr 2024
        Device teuerstesSupport = database.findDeviceWithHighestSupportCost(2024);
        System.out.println("Gerät mit höchsten Supportkosten 2024: " + teuerstesSupport.getName() +
                " | Kosten: " + df.format(teuerstesSupport.calculateSupportCostForAYear(2024)));

        // Ausgabe sortiert nach Produktionskosten
        System.out.println("\n--- Geräte sortiert nach Produktionskosten ---");
        database.sortedPrint();

        // Gerätezählung nach Produktionskosten-Kategorie
        HashMap<String, Integer> kategorien = database.numberDevicesGroupedByConstructionCost(300, 700);
        System.out.println("\nGerätezählung nach Kostenkategorie:");
        for (String kategorie : kategorien.keySet()) {
            System.out.println("  - " + kategorie + ": " + kategorien.get(kategorie) + " Gerät(e)");
        }

        // Mindestleistung nach Generation + Kerne
        HashMap<Integer, Integer> minimums = new HashMap<>();
        minimums.put(1, 2);
        minimums.put(2, 4);
        minimums.put(3, 6);

        ArrayList<Device> leistungsStark = database.findDevicesThatFullfillMinimumPerformance(minimums);
        System.out.println("\nGeräte mit erfüllter Mindestleistung:");
        for (Device d : leistungsStark) {
            System.out.println("  - " + d.getName() + " | Generation: " + d.getProcessor().getGeneration() +
                    " | Kerne: " + d.getProcessor().getNrCores());
        }

        // Supportkosten eines Geräts über 5 Jahre
        System.out.println("\nSupportkosten Galaxy Watch von 2020 bis 2025:");
        double summeSupport = database.calculateSupportCostUntilYear(smartwatch, 2025);
        System.out.println("  - Gesamtkosten: " + df.format(summeSupport));

        System.out.println("\nErweiterte Tests ------------------------------------");

// Neues Gerät mit extrem niedrigem Preis (Test für „cheapest“)
        Device oldSmartphone = new Smartphone("Nokia 3310", new Processor("Basic", 1, 1), 2001, 50_000, 16);
        database.addDevice(oldSmartphone);

// Neues Gerät mit 0 Supportkosten (älter als 10 Jahre)
        Device museumTablet = new Tablet("DinoPad", new Processor("OldChip", 1, 1), 2010, 100_000, 1);
        database.addDevice(museumTablet);

// Kategorie-Test: Gerät mit mittlerem Preis
        Device midDevice = new Smartphone("Mittelgerät", new Processor("Mittel", 2, 4), 2020, 300_000, 64);
        database.addDevice(midDevice);

// Nachprüfung: neues günstigstes Gerät
        Device newCheapest = database.findeDeviceWithCheapestProductionCost();
        System.out.println("Neues günstigstes Gerät: " + newCheapest.getName() + " | Kosten: " + newCheapest.calculateProductionCost());

// Supportkosten bis 2024 für das alte Tablet (sollte 0 sein)
        double supportRetro = database.calculateSupportCostUntilYear(museumTablet, 2024);
        System.out.println("Supportkosten DinoPad bis 2024: " + df.format(supportRetro));

// Kategorieverteilung erneut prüfen
        HashMap<String, Integer> neueKategorien = database.numberDevicesGroupedByConstructionCost(200, 600);
        System.out.println("Aktuelle Gerätekategorien (low/med/high): " + neueKategorien);

// Mindestleistung verschärfen (nur starke Geräte)
        HashMap<Integer, Integer> hart = new HashMap<>();
        hart.put(1, 2);
        hart.put(2, 5); // absichtlich zu hoch
        hart.put(3, 8);
        List<Device> starke = database.findDevicesThatFullfillMinimumPerformance(hart);
        System.out.println("Geräte mit verschärfter Mindestleistung:");
        for (Device d : starke) {
            System.out.println("  - " + d.getName());
        }
    }
}
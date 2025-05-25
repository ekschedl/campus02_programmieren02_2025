package Fahrzeug______V_C_T;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws UngueltigePsException {
        try {
            Fahrzeug auto = new Auto(2015, "VW", 150);
            Fahrzeug rad = new Fahrrad(2020, "Cube", true);

            auto.zeigeInfo();
            System.out.println("Versicherung: " + auto.berechneVersicherungswert());

            rad.zeigeInfo();
            System.out.println("Versicherung: " + rad.berechneVersicherungswert());

            // Test: Auto mit ungültigen PS → -150
            Fahrzeug falsch = new Auto(2010, "BMW", -150);

        } catch (UngueltigePsException e) {
            System.out.println("FEHLER: PS ungültig – " + e.getMessage());
        }
        // Test Exception // ohne try-catch → Programm stürzt bei Fehler ab
        //Fahrzeug defekt = new Auto(1800, "Oldtimer", 80);
//  ruft setBaujahr(1800) → wirft UngueltigesBaujahrException → wird als RuntimeException weitergeworfen.    }


        // mit try-catch → Fehler wird schön abgefangen
        try {
            Fahrzeug defekt = new Auto(1800, "Oldtimer", 80);
        } catch (RuntimeException e) {
            System.out.println("Fehler beim Erstellen des Fahrzeugs: " + e.getMessage());
        }


        List<Fahrzeug> meineFahrzeuge = new ArrayList<>();
        meineFahrzeuge.add(new Auto(2015, "VW", 150));
        meineFahrzeuge.add(new Fahrrad(2020, "Cube", true));
        meineFahrzeuge.add(new Auto(2010, "BMW", 180));

        //Nach Baujahr sortieren
        System.out.println("🔹 Sortiert nach Baujahr:");
        meineFahrzeuge.sort(new FahrzeugBaujahrComparator());
        for (Fahrzeug f : meineFahrzeuge) f.zeigeInfo();

        //Nach Baujahr sortieren RESERVED
        System.out.println("🔹 Sortiert nach Baujahr reversed:");
        meineFahrzeuge.sort(new FahrzeugBaujahrComparator().reversed());
        for (Fahrzeug f : meineFahrzeuge) f.zeigeInfo();

        /*Funktioniert mit jedem Comparator – auch z.B.:
	•	new FahrzeugMarkeComparator().reversed()
	•	new FahrzeugVersicherungswertComparator().reversed()*/

        // Nach Marke sortieren
        System.out.println("🔹 Sortiert nach Marke:");
        meineFahrzeuge.sort(new FahrzeugMarkeComparator());
        for (Fahrzeug f : meineFahrzeuge) f.zeigeInfo();

        // Nach Versicherungswert sortieren
        System.out.println("🔹 Sortiert nach Versicherungswert:");
        meineFahrzeuge.sort(new FahrzeugVersicherungswertComparator());
        for (Fahrzeug f : meineFahrzeuge) {
            f.zeigeInfo();
            System.out.println("Versicherungswert: " + f.berechneVersicherungswert());
        }
    }
}

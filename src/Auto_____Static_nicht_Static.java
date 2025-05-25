// Beispiel zu statischen und nicht-statischen Attributen in Java

public class Auto_____Static_nicht_Static {
    // Nicht-statisches Attribut: Jede Instanz hat eine eigene Farbe
    String farbe;

    // Statisches Attribut: Wird von allen Instanzen gemeinsam genutzt
    static int anzahlAutos = 0;

    // Konstruktor: Wird beim Erstellen eines neuen Autos aufgerufen
    public Auto_____Static_nicht_Static(String farbe) {
        this.farbe = farbe;         // Farbe wird für dieses Auto gesetzt
        anzahlAutos++;             // Zähler wird für alle Autos erhöht
    }

    // Nicht-statische Methode: Gibt die Farbe dieses Autos aus
    public void info() {
        System.out.println("Farbe: " + farbe);
    }

    // Statische Methode: Gibt die Gesamtanzahl aller erzeugten Autos aus
    public static void zeigeAnzahl() {
        System.out.println("Anzahl aller Autos: " + anzahlAutos);
    }
}

// Testklasse mit main-Methode
//public class Main {
//    public static void main(String[] args) {
//        Auto a1 = new Auto("Rot");
//        Auto a2 = new Auto("Blau");
//
//        a1.info();  // Ausgabe: Farbe: Rot
//        a2.info();  // Ausgabe: Farbe: Blau
//
//        // Aufruf der statischen Methode über den Klassennamen
//        Auto.zeigeAnzahl();  // Ausgabe: Anzahl aller Autos: 2
//    }
//}


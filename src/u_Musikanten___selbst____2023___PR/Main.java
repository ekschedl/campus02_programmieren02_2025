package u_Musikanten___selbst____2023___PR;

public class Main {
    public static void main(String[] args) {
        // Erstelle Instrumente
        Instrument trommel = new Instrument("Trommel", 10);
        Instrument geige = new Instrument("Geige", 8);
        Instrument triangel = new Instrument("Triangel", 4);
        Instrument posaune = new Instrument("Posaune", 12);

        // Erstelle Musikanten (nur anzahlBeine, Instrument, + je eigene Eigenschaft)
        Musikant hund = new Hund(4, trommel, 6);          // bellLautstaerke = 6
        Musikant katze = new Katze(12, geige, 7);          // kratzKraft = 7
        Musikant hahn = new Hahn(2, triangel, 3);         // flugWeite = 3
        Musikant esel = new Esel(4, posaune, 20);         // trittkraft = 20

        // Quartett erstellen und Musikanten hinzufügen
        Quartett band = new Quartett();
        band.addMusikant(hund);
        band.addMusikant(katze);
        band.addMusikant(hahn);
        band.addMusikant(esel);

        System.out.println("Ist Quartett vollständig? " + band.istQuartett());
        System.out.println("Gesamt verscheuchte Räuber: " + band.gemeinsameRaeuberVerscheucht());
        System.out.println("Durchschnittliche Lautstärke: " + band.durchschnittlicheLautstaerke());

        System.out.println("\n🎵 Musikanten mit Lautstärke zwischen 5 und 10:");
        for (Musikant m : band.getMusikantenInLautstaerkeBereich(5, 10)) {
            System.out.println(m.getClass().getSimpleName() + ": " + m);
        }

        System.out.println("\n🦵 Verteilung nach Beinanzahl:");
        band.getAnzahlMusikantenMitBeinAnzahl();

        System.out.println("\n🔊 Musikanten sortiert nach Lautstärke (absteigend):");
        band.printLautstaerkeAbsteigend();

        System.out.println("\n🐾 Musikanten nach Beinanzahl absteigend sortiert:");
        band.getQuartett().sort(new BeinComparator());

        for (Musikant m : band.getQuartett()) {
            System.out.println(m.getClass().getSimpleName() + ": " + m.getAnzahlBeine() + " Beine,  " + m);
        }
    }
}
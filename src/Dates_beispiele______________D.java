import java.time.LocalDate;
import java.time.Period;

public class Dates_beispiele______________D {
    public static void main(String[] args) {
        // Aktuelles Datum definieren
        LocalDate heute = LocalDate.of(2025, 5, 25);
        // Ein anderes Datum (z. B. Geburtstag)
        LocalDate geburtstag = LocalDate.of(2025, 12, 10);
        // Ein Tag vor heute
        LocalDate gestern = heute.minusDays(1);

        System.out.println("Vergleichs-Methoden:");
        // Prüft, ob gestern vor heute ist → true
        System.out.println("gestern.isBefore(heute): " + gestern.isBefore(heute));
        // Prüft, ob Geburtstag nach heute ist → true
        System.out.println("geburtstag.isAfter(heute): " + geburtstag.isAfter(heute));
        // Prüft, ob heute gleich 25.05.2025 ist → true
        System.out.println("heute.isEqual(2025-05-25): " + heute.isEqual(LocalDate.of(2025, 5, 25)));

        // Berechnet den Unterschied zwischen zwei Daten (z. B. wie lange bis zum Geburtstag)
        Period diff = heute.until(geburtstag);
        System.out.println("Abstand bis Geburtstag: " + diff.getMonths() + " Monate und " + diff.getDays() + " Tage");

        // Jetzt schauen wir uns Manipulationen am Datum an
        System.out.println("\nManipulations-Methoden:");
        // Einen Tag dazu zählen
        LocalDate morgen = heute.plusDays(1);
        // Ein Jahr weiter in die Zukunft
        LocalDate inEinemJahr = heute.plusYears(1);
        // Zwei Monate zurück
        LocalDate vorher = heute.minusMonths(2);
        // Eine Woche weiter
        LocalDate nächsteWoche = heute.plusWeeks(1);

        System.out.println("Morgen: " + morgen);
        System.out.println("In einem Jahr: " + inEinemJahr);
        System.out.println("Vorher (vor 2 Monaten): " + vorher);
        System.out.println("Nächste Woche: " + nächsteWoche);
    }
}
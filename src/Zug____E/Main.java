package Zug____E;

public class Main {

        public static void main(String[] args) {
            Zug zug1 = new Zug("ICE 1000");

            zug1.fahre(Wochentag.MONTAG);   // Werktag → mit Zwischenhalten
            zug1.fahre(Wochentag.SONNTAG);  // Wochenende → ohne Zwischenhalt
        }
}

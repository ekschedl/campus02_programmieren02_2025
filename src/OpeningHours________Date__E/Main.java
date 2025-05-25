package OpeningHours________Date__E;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {

        // Ich erstelle zwei verschiedene Öffnungszeiten-Objekte
        // Variante 1: Montag bis Freitag offen
        OpeningHours oeffnung1 = new OpeningHours("08:00", "18:00", OpeningVariation.MONTOFRI);

        // Variante 2: Dienstag bis Freitag offen (Montag, Samstag, Sonntag zu)
        OpeningHours oeffnung2 = new OpeningHours("10:00", "17:00", OpeningVariation.TUETOFRI);

        // Jetzt erstelle ich zwei Shops mit den jeweiligen Öffnungszeiten
        Shop supermarkt = new Shop("Billa", oeffnung1);
        Shop friseur = new Shop("Haarschnitt Deluxe", oeffnung2);

        // Ich teste verschiedene Wochentage – was gibt die Methode getOpeningHoursToday() zurück?
        // Das hilft mir zu verstehen, wann die Läden offen haben und wie die Logik funktioniert

        // Beispiel: Montag
        DayOfWeek tag = DayOfWeek.MONDAY;
        System.out.println(supermarkt.getName() + supermarkt.getOpeningHours().getOpeningHoursToday(tag));
        System.out.println(friseur.getName() + friseur.getOpeningHours().getOpeningHoursToday(tag));

        // Beispiel: Dienstag
        tag = DayOfWeek.TUESDAY;
        System.out.println(supermarkt.getName() + supermarkt.getOpeningHours().getOpeningHoursToday(tag));
        System.out.println(friseur.getName() + friseur.getOpeningHours().getOpeningHoursToday(tag));

        // Beispiel: Samstag
        tag = DayOfWeek.SATURDAY;
        System.out.println(supermarkt.getName() + supermarkt.getOpeningHours().getOpeningHoursToday(tag));
        System.out.println(friseur.getName() + friseur.getOpeningHours().getOpeningHoursToday(tag));

        // Beispiel: Sonntag
        tag = DayOfWeek.SUNDAY;
        System.out.println(supermarkt.getName() + supermarkt.getOpeningHours().getOpeningHoursToday(tag));
        System.out.println(friseur.getName() + friseur.getOpeningHours().getOpeningHoursToday(tag));

        // EXTRA: Ich kann mir auch einfach die Zeiten direkt ausgeben lassen
        System.out.println("\nÖffnungszeiten von " + supermarkt.getName() + ": " +
                supermarkt.getOpeningHours().getOpeningTime() + " bis " +
                supermarkt.getOpeningHours().getClosingTime());

        System.out.println("Öffnungszeiten von " + friseur.getName() + ": " +
                friseur.getOpeningHours().getOpeningTime() + " bis " +
                friseur.getOpeningHours().getClosingTime());

        // So verstehe ich, wie sich Öffnungszeiten je nach Variation (Enum) verhalten
    }
}

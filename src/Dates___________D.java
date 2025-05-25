import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Dates___________D {
    public static void main(String[] args) {
        //create
        //Localdate Immutable (= unveränderbar):
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate tomorrow = today.plusDays(1);  // today bleibt gleich
        System.out.println("Morgen: " + tomorrow);
        LocalDate startOfStudies = LocalDate.of(2025, 3, 3);
        System.out.println(startOfStudies);

        //parse String to date
        LocalDate parsedDate = LocalDate.parse("2020-03-16");
        System.out.println(parsedDate);

        //access parts
        System.out.println(startOfStudies.getDayOfMonth());
        System.out.println(startOfStudies.getDayOfWeek());
        System.out.println(startOfStudies.getDayOfYear());
        System.out.println(startOfStudies.getMonth());
        System.out.println(startOfStudies.getYear());

        //manipulate
        System.out.println("75 challenge would be over: " + today.plusDays(75));

        //compare
        System.out.println(today.isBefore(startOfStudies));
        System.out.println(today.isAfter(startOfStudies));
        System.out.println(today.isEqual(startOfStudies));

        //until
        LocalDate startOfTraining = LocalDate.of(2025, 9, 8);
        Period period = startOfStudies.until(startOfTraining);
        System.out.println(period);
        System.out.println("months: " + period.get(ChronoUnit.MONTHS) + " days: " + period.get(ChronoUnit.DAYS));
    }
}
/*	•	Thread-safe:
Weil sich LocalDate nie verändert, können mehrere Threads damit arbeiten, ohne Fehler zu verursachen.
	•	Vergleichs-Methoden:
	•	isBefore(otherDate)
	•	isAfter(otherDate)
	•	isEqual(otherDate)
	•	until(otherDate) → Berechnet Abstand zwischen zwei Daten
	•	Manipulations-Methoden:
	•	plusDays(int), minusMonths(int)
	•	plusWeeks(), plusYears(), usw.*/
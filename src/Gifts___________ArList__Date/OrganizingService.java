package Gifts___________ArList__Date;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrganizingService {
    // Zwei Listen: eine für alle Geschenke, eine für alle Personen
    ArrayList<Gift> gifts;
    ArrayList<Person> persons;

    // Konstruktor – bekommt Geschenke und Personen beim Erstellen
    public OrganizingService(ArrayList<Gift> gifts, ArrayList<Person> persons) {
        this.gifts = gifts;
        this.persons = persons;
    }

    // Gibt alle Geschenkideen für eine bestimmte Person zurück
    public ArrayList<Gift> findGiftsFor(Person person) {
        return person.getGiftIdeas();
    }

    // Sucht alle Personen, deren Geburtstag bald ist (vor einem bestimmten Datum)
    public ArrayList<Person> birthdaysBefore(LocalDate date) {
        ArrayList<Person> hasBirthdaySoon = new ArrayList<>();
        for (Person person : persons) {
            // Wir holen das Geburtsdatum für dieses Jahr
            int currentYear = LocalDate.now().getYear();
            int birthdayMonth = person.getBirthday().getMonthValue();
            int birthdayDay = person.getBirthday().getDayOfMonth();
            LocalDate birthdayThisYear = LocalDate.of(currentYear, birthdayMonth, birthdayDay);

            // Wenn Geburtstag noch kommt, aber vor dem übergebenen Datum ist → hinzufügen
            if (birthdayThisYear.isAfter(LocalDate.now()) && birthdayThisYear.isBefore(date)) {
                hasBirthdaySoon.add(person);
            }
        }
        return hasBirthdaySoon;
    }

    // Sucht in einer Geschenkliste alle Geschenke, die zwischen min und max kosten
    public ArrayList<Gift> findGiftsInPriceRange(ArrayList<Gift> giftList, int min, int max) {
        ArrayList<Gift> giftsInRange = new ArrayList<>();
        for (Gift gift : giftList) {
            if (gift.getPrice() >= min && gift.getPrice() <= max) {
                giftsInRange.add(gift);
            }
        }
        return giftsInRange;
    }

    // Ein Geschenk wird offiziell verschenkt: kommt auf „alreadyGifted“ und wird aus Ideenliste entfernt
    public void giveGift(Person person, Gift gift) {
        person.getAlreadyGifted().add(gift);
        person.getGiftIdeas().remove(gift);
    }

    // Prüft, ob eine Person dieses Geschenk schon bekommen hat
    public boolean hasAlreadyBeenGifted(Person person, Gift gift) {
        return person.getAlreadyGifted().contains(gift);
    }
}
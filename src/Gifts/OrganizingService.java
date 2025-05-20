package Gifts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class OrganizingService {
    ArrayList<Gift> gifts;
    ArrayList<Person> persons;

    public OrganizingService(ArrayList<Gift> gifts, ArrayList<Person> persons) {
        this.gifts = gifts;
        this.persons = persons;
    }

    public ArrayList<Gift> findGiftsFor(Person person) {
        return person.getGiftIdeas();
    }

    public ArrayList<Person> birthdaysBefore(LocalDate date) {
        ArrayList<Person> hasBirthdaySoon = new ArrayList<>();
        for (Person person : persons) {
            int currentYear = LocalDate.now().getYear();
            int birthdayMonth = person.getBirthday().getMonthValue();
            int birthdayDay = person.getBirthday().getDayOfMonth();
            LocalDate birthdayThisYear = LocalDate.of(currentYear, birthdayMonth, birthdayDay);
            if (birthdayThisYear.isAfter(LocalDate.now()) && birthdayThisYear.isBefore(date)) {
                hasBirthdaySoon.add(person);
            }
        }
        return hasBirthdaySoon;
    }

    public ArrayList<Gift> findGiftsInPriceRange(ArrayList<Gift> giftList, int min, int max) {
        ArrayList<Gift> giftsInRange = new ArrayList<>();
        for (Gift gift : giftList) {
            if (gift.getPrice() >= min && gift.getPrice() <= max) {
                giftsInRange.add(gift);
            }
        }
        return giftsInRange;
    }

    public void giveGift(Person person, Gift gift) {
        person.getAlreadyGifted().add(gift);
        person.getGiftIdeas().remove(gift);
    }

    public boolean hasAlreadyBeenGifted(Person person, Gift gift) {
        return person.getAlreadyGifted().contains(gift);
    }
}
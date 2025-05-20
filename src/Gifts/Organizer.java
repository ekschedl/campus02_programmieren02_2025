package Gifts;


import java.time.LocalDate;
import java.util.ArrayList;

public class Organizer {
    public static void main(String[] args) {
        Person me = new Person("Donna", LocalDate.of(1996, 11, 11));
        Person clarissa = new Person("Clarissa", LocalDate.of(2000, 1, 11));
        Person inna = new Person("Inna", LocalDate.of(1987, 4, 1));

        Gift gamingPc = new Gift(1500, "gaming PC", "sehr cool, v.a. für Clarissa");
        Gift flowers = new Gift(35, "flowers");
        Gift ticket = new Gift(2000, "Flugticket", "Villeicht nach Bali");
        Gift book = new Gift(20, "Clean Code");
        Gift voucher = new Gift(50, "Voucher", "Kleidung");
        Gift voucherGraz = new Gift(50, "Voucher Graz", "Graz Gutschein");

        me.getGiftIdeas().add(ticket);
        me.getGiftIdeas().add(flowers);
        me.getGiftIdeas().add(voucherGraz);
        me.getAlreadyGifted().add(book);
        clarissa.getGiftIdeas().add(gamingPc);
        clarissa.getGiftIdeas().add(voucher);
        clarissa.getGiftIdeas().add(voucherGraz);
        clarissa.getAlreadyGifted().add(flowers);
        inna.getGiftIdeas().add(ticket);
        inna.getGiftIdeas().add(book);
        inna.getGiftIdeas().add(voucher);
        inna.getAlreadyGifted().add(voucherGraz);

        ArrayList<Person> people = new ArrayList<>();
        people.add(me);
        people.add(clarissa);
        people.add(inna);

        ArrayList<Gift> gifts = new ArrayList<>();
        gifts.add(gamingPc);
        gifts.add(flowers);
        gifts.add(ticket);
        gifts.add(book);
        gifts.add(voucher);
        gifts.add(voucherGraz);

        OrganizingService service = new OrganizingService(gifts, people);

        ArrayList<Gift> giftsForInna = service.findGiftsFor(inna);

        System.out.println("Gift ideas for Inna: ");
        for (Gift gift : giftsForInna) {
            System.out.println(gift.getLabel());
        }

        ArrayList<Person> birthdaysBefore = service.birthdaysBefore(LocalDate.of(2025, 12, 24));

        System.out.println("These people still have a birthday before Christmas: ");
        for (Person person : birthdaysBefore) {
            System.out.println(person.getName());
        }

        ArrayList<Gift> giftsInPriceRangeForInna = service.findGiftsInPriceRange(inna.getGiftIdeas(), 10, 50);

        System.out.println("Gifts in price range for Inna: ");
        for (Gift gift : giftsInPriceRangeForInna) {
            System.out.println(gift.getLabel());
        }

        System.out.println("Inna has already received a: " + service.hasAlreadyBeenGifted(inna, voucher));

        System.out.println("-----------------------------------");
        for (Gift gift : inna.getGiftIdeas()){
            System.out.println(gift.getLabel());
        }

        service.giveGift(inna, voucher);
        System.out.println("-----------------------------------");

        for (Gift gift : inna.getGiftIdeas()){
            System.out.println(gift.getLabel());
        }
    }

}
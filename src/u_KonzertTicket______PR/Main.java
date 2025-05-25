package u_KonzertTicket______PR;


public class Main {

    public static void main(String[] args) {
        // ABSEITS DER ANGABE KÖNNEN SIE HIER NATÜRLICH AUCH NOCH WEITER TESTEN BZW. ERGEBNISSE AUSGEBEN
        PaperTicket p1 = new PaperTicket("Anna", 35, 25, false);
        PaperTicket p2 = new PaperTicket("Maria", 80, 10, false);
        AppTicket a1 = new AppTicket("Pablo", 120, "ios");
        AppTicket a2 = new AppTicket("Bruno", 80, "android");
        MoonBoot m1 = new MoonBoot("Brunhilda", true);
        MoonBoot m2 = new MoonBoot("Edelbert", false);
        ConcertSystem concert=new ConcertSystem();
        concert.besucher.add(p1);
        concert.besucher.add(p2);
        concert.besucher.add(a1);
        concert.besucher.add(a2);
        concert.besucher.add(m1);
        concert.besucher.add(m2);
        System.out.println(concert.donationPerCategory());
        System.out.println(concert.invitedToStage());
        System.out.println("Profit der Kategorie 1 beträgt: "+concert.profitPerCategory(1));

        concert.sortPrintForAccounting();
        System.out.println("---------------------------");
        concert.dontionKategory();


    }
}

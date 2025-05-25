package Alte_Pruefungen.Moodle_Concert_Loesung____PR;

public class Main {


    public static void main(String[] args) {
        //here you can try out and test your code
        AppTicket app1, app2, app3;
        PaperTicket paper1, paper2, paper3, paper4;
        MoonBoot kitt1, kitt2;
        ConcertSystem concert;

        kitt1 = new MoonBoot("Fan 1", true);
        kitt2 = new MoonBoot("Fan 2", false);
        app1 = new AppTicket("Ms. ios", 120, "ios");
        app2 = new AppTicket("Mr. and", 80, "android");
        app3 = new AppTicket("Ms. Win", 40, "win");
        paper1 = new PaperTicket("Luck Rich", 80, 0, true);
        paper2 = new PaperTicket("Normal Rich", 70, 10, false);
        paper3 = new PaperTicket("Luck Poor", 40, 20, true);
        paper4 = new PaperTicket("Normal Poor", 50, 10,  false);

        concert = new ConcertSystem();
        concert.addTicket(kitt2);
        concert.addTicket(app1);
        concert.addTicket(app2);
        concert.addTicket(app3);
        concert.addTicket(paper1);
        concert.addTicket(paper2);
        concert.addTicket(kitt1);
         concert.addTicket(paper3);
        concert.addTicket(paper4);

        concert.sortAndPrintForAccounting();

    }
}

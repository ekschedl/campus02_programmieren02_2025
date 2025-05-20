package V_Hase;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Hase myHase = new Hase("Normi-normaler-Hase");
        myHase.schlafen();

        Osterhase osterhase = new Osterhase("Bobbi-osterhase");
        osterhase.schlafen();

        Weihnachtshase weihnachtshase = new Weihnachtshase("Ronni-weihnachtshase");
        weihnachtshase.schlafen();

        Hase osterhaseAsHase = (Hase) osterhase;
        osterhaseAsHase.schlafen();
        System.out.println("-----------------");
        System.out.println("Bobbi-osterhase: Klass " + osterhase.getClass().getSimpleName());
        System.out.println("Normi-normaler-Hase: Klass " + myHase.getClass().getSimpleName());
        System.out.println("Ronni-weihnachtshase: Klass " + weihnachtshase.getClass().getSimpleName());

        System.out.println("-----------------");

        ArrayList<Hase> haseList = new ArrayList<>();
        haseList.add(myHase);
        haseList.add(osterhase);
        haseList.add(weihnachtshase);
        haseList.add(osterhaseAsHase);
        for (Hase hase : haseList) {
            hase.schlafen();
        }

        int ersteZahl=3;
        int zweiteZahl=7;
        int c=ersteZahl*zweiteZahl;
        System.out.println(c);
    }
}

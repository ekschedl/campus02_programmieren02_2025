package Sortierung_uebungen___S___C.d_sortiere_Hasen_Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vergleiche Hasen...");
        ArrayList<Hase> meineHasen = new ArrayList<>();
        meineHasen.add(new Hase(2, 8));
        meineHasen.add(new Hase(2, 6));
        meineHasen.add(new Hase(2, 5));
        meineHasen.add(new Hase(44, 4));
        meineHasen.add(new Hase(3, 3));
        meineHasen.add(new Osterhase(7, 3));
        Collections.sort(meineHasen);

        for(Hase h:meineHasen)
        {
            System.out.println(h);
        }

    }
}

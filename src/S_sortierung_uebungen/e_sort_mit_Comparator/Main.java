package e_sort_mit_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vergleiche Hasen...");
        ArrayList<Hase> meineHasen = new ArrayList<>();
        meineHasen.add(new Hase(44, 4, "Hansi1"));
        meineHasen.add(new Hase(2, 8, "HanSi2"));
        meineHasen.add(new Hase(2, 6, "Hansi3"));
        meineHasen.add(new Hase(2, 5, "HanSi4"));
        meineHasen.add(new Hase(3, 3, "Hansi2.5"));
        meineHasen.add(new Osterhase(7, 3, "Hansi2.7"));

        Comparator ascComparator = new AgeComparatorASC();
        Comparator descComparator = new AgeComparatorDESC();
        Comparator firstNameComparator1 = new FirstNameComparator();
        Collections.sort(meineHasen, firstNameComparator1);

        for(Hase h:meineHasen)
        {
            System.out.println(h);
        }

    }
}

package e_sort_mit_Comparator;

import java.util.Comparator;

public class AgeComparatorDESC implements Comparator<Hase> {
    @Override
    public int compare(Hase o1, Hase o2) {
        if(o1.getAge() < o2.getAge()) {return 1;}
        if(o1.getAge() > o2.getAge()) {return -1;}
        return 0;
    }
}

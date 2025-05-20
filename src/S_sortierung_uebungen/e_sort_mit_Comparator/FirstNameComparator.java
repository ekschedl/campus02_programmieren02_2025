package e_sort_mit_Comparator;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Hase> {
    @Override
    public int compare(Hase o1, Hase o2) {

        int cmp = o1.getFirstName().compareTo(o2.getFirstName());
        return cmp;
    }
}

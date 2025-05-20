import java.util.Comparator;

public class ComparatorPriceASC implements Comparator<Eissorte> {
    @Override
    public int compare(Eissorte o1, Eissorte o2) {
        if(o1.Preis > o2.Preis) return -1;
        if(o1.Preis < o2.Preis) return +1;
        return 0;
    }
}

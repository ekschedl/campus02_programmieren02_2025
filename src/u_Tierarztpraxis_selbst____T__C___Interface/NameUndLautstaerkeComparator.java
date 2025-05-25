package u_Tierarztpraxis_selbst____T__C___Interface;

import java.util.Comparator;

public class NameUndLautstaerkeComparator implements Comparator<Tier> {

    @Override
    public int compare(Tier t1, Tier t2) {
        int nameVergleich = t1.getName().compareToIgnoreCase(t2.getName());
        if (nameVergleich != 0) {
            return nameVergleich;
        }
        return Integer.compare(t1.getLautstaerke(), t2.getLautstaerke());
    }
}


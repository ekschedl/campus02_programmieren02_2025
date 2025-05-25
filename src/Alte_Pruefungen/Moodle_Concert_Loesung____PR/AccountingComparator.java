package Alte_Pruefungen.Moodle_Concert_Loesung____PR;

import java.util.Comparator;

public class AccountingComparator implements Comparator<NFCTicket> {
    @Override
    public int compare(NFCTicket o1, NFCTicket o2) {
        int r = Integer.compare(o1.getCategory(), o2.getCategory());
        if (r == 0){
            return o1.getSecret().compareTo(o2.getSecret());
        }
        return r;
    }
}

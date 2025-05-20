package u_KonzertTicket;

import java.util.Comparator;

public class AccountingComparator implements Comparator<NFCTicket> {
    @Override
    public int compare(NFCTicket o1, NFCTicket o2) {
        int keyComparison = Integer.compare(o1.getCategory(), o2.getCategory());
        if (keyComparison != 0) {
            return keyComparison;
        }
        // If first values are the same, sort based on the 2nd value
        return o1.getSecret().compareTo(o2.getSecret());
    }
}

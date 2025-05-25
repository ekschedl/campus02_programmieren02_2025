package u_Tierarztpraxis_selbst____T__C___Interface;


import java.util.Comparator;

public class KostenComparator implements Comparator<Tier> {
    @Override
    public int compare(Tier t1, Tier t2) {
        return Double.compare(t1.behandlungskosten(), t2.behandlungskosten());
    }
}
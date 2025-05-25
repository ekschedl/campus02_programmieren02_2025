package u_Musikanten___selbst____2023___PR;

import java.util.Comparator;

public class BeinComparator implements Comparator<Musikant> {
    @Override
    public int compare(Musikant o1, Musikant o2) {
        return Integer.compare(o2.getAnzahlBeine(), o1.getAnzahlBeine()); // Absteigend!
    }
}
// absteigend: return Integer.compare(o2.getAnzahlBeine(), o1.getAnzahlBeine());
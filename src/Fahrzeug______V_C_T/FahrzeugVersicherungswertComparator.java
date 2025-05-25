package Fahrzeug______V_C_T;

import java.util.Comparator;

public class FahrzeugVersicherungswertComparator implements Comparator<Fahrzeug> {
    @Override
    public int compare(Fahrzeug o1, Fahrzeug o2) {
        return Double.compare(o1.berechneVersicherungswert(), o2.berechneVersicherungswert());
    }
}

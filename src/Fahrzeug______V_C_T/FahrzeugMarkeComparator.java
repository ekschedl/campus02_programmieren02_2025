package Fahrzeug______V_C_T;

import java.util.Comparator;

public class FahrzeugMarkeComparator implements Comparator<Fahrzeug> {
    @Override
    public int compare(Fahrzeug o1, Fahrzeug o2) {
        return o1.getMarke().compareTo(o2.getMarke());
    }
}

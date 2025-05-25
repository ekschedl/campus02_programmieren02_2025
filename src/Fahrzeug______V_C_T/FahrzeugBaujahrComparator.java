package Fahrzeug______V_C_T;

import java.util.Comparator;
// implements Comparator: Vorteil: Du kannst viele verschiedene Vergleichslogiken haben, z. B. nach Marke, PS, Versicherungswert usw.
public class FahrzeugBaujahrComparator  implements Comparator<Fahrzeug> {
    @Override
    public int compare(Fahrzeug o1, Fahrzeug o2) {
       return Integer.compare(o1.getBaujahr(), o2.getBaujahr());
    }
}

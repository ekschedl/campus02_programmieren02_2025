package Eissorten_Junit___C_T;

import java.util.LinkedList;
import java.util.List;

public class Eissalon {
    public List<Eissorte> list;
    public Eissalon() {
        list = new LinkedList<Eissorte>();
        list.add(new Eissorte("Schokolade", 1.5d));
        list.add(new Eissorte("Vanille",    1.0d));
        list.add(new Eissorte("Walnuss",    1.3d));
        list.add(new Eissorte("MatschaTee", 1.4d));
        list.add(new Eissorte("Zitrone",    1.5d));
        list.add(new Eissorte("Schlumpf",   1.8d));
        list.add(new Eissorte("Fernweh",    1.9d));
        list.add(new Eissorte("Ocean",      12.0d));
        list.add(new Eissorte("Eisbär",     6.5d));
        list.add(new Eissorte("ACC",        3.5d));
        list.add(new Eissorte("After8",     6.5));
        list.add(new Eissorte("Joghurt",    5.5));
    }
}

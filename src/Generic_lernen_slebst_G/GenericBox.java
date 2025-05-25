package Generic_lernen_slebst_G;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericBox<T> {
    private T egalWelcherContent; // das gespeicherte Objekt beliebigen Typs

    // Getter
    public T getEgalWelcherContent() {
        return egalWelcherContent;
    }

    // Setter
    public void setEgalWelcherContent(T egalWelcherContent) {
        this.egalWelcherContent = egalWelcherContent;
    }

    // Einzelnes Objekt ausgeben
    public void printeEgalWelcherContent() {
        System.out.println(egalWelcherContent);
    }

    // Liste vom Typ ArrayList drucken
    public void printArrayList(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    // Liste vom Typ List (flexibler als ArrayList!)
    public void printList(List<T> liste) {
        for (T element : liste) {
            System.out.println(element);
        }
    }

    // Variante mit for-Schleife (wenn Index gebraucht wird)
    public void printListWithIndex(List<T> liste) {
        for (int i = 0; i < liste.size(); i++) {
            System.out.println("Element " + i + ": " + liste.get(i));
        }
    }

    // Variante mit Iterator – wichtig für Entfernen während der Iteration
    public void printListWithIterator(List<T> liste) {
        Iterator<T> it = liste.iterator();
        while (it.hasNext()) {
            T element = it.next();
            System.out.println("Iterator: " + element);
        }
    }

    // Elemente zählen
    public int countElements(List<T> liste) {
        return liste.size();
    }

    // Elemente suchen
    public boolean containsElement(List<T> liste, T element) {
        return liste.contains(element);
    }

    // Erstes Element zurückgeben (wenn vorhanden)
    public T getFirst(List<T> liste) {
        if (!liste.isEmpty()) {
            return liste.get(0);
        }
        return null;
    }
}
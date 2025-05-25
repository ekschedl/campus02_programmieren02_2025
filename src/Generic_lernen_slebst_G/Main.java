package Generic_lernen_slebst_G;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setEgalWelcherContent("HEY, ich teste");
        stringBox.printeEgalWelcherContent();


        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setEgalWelcherContent(3);
        intBox.setEgalWelcherContent(4);
        intBox.printeEgalWelcherContent();

        // Test mit String
        GenericBox<String> box = new GenericBox<>();

        // Ein Objekt setzen und ausgeben
        box.setEgalWelcherContent("Hallo Katja!");
        box.printeEgalWelcherContent();

        // Liste mit Strings
        List<String> namen = new ArrayList<>();
        namen.add("Anna");
        namen.add("Ben");
        namen.add("Clara");

        // Teste Methoden mit dieser Liste
        System.out.println("\n--- printList ---");
        box.printList(namen);

        System.out.println("\n--- printListWithIndex ---");
        box.printListWithIndex(namen);

        System.out.println("\n--- printListWithIterator ---");
        box.printListWithIterator(namen);

        System.out.println("\n--- countElements ---");
        System.out.println("Anzahl: " + box.countElements(namen));

        System.out.println("\n--- containsElement ---");
        System.out.println("Enthält 'Ben'? " + box.containsElement(namen, "Ben"));
        System.out.println("Enthält 'Dora'? " + box.containsElement(namen, "Dora"));

        System.out.println("\n--- getFirst ---");
        System.out.println("Erstes Element: " + box.getFirst(namen));
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMap__selbst___HM {

    public static void main(String[] args) {
        HashMap<String, String> peopleAndFood = new HashMap<>();
        // Füge 4 Personen mit ihrem Lieblingsgericht hinzu (put)
        peopleAndFood.put("Anna", "Spaghetti");
        peopleAndFood.put("Alex", "Hamburger");
        peopleAndFood.put("Simon", "Eis");
        peopleAndFood.put("Max", "Suppe");
        peopleAndFood.put("Irina", "Lachs");

        // Gib alle Personen und ihre Gerichte aus (entrySet)
        for (Map.Entry<String, String> e : peopleAndFood.entrySet()) {
            System.out.println("Schlüssel: " +e.getKey()+ " Wert: " + e.getValue());
        }

        //Ändere das Lieblingsgericht von „Irina“ auf „Sushi“
        peopleAndFood.put("Irina", "Sushi"); // überschreibt einfach

        System.out.println("-------Irina's Essen geändert -------- ");
        // Gib alle Personen und ihre Gerichte aus (entrySet)
        for (Map.Entry<String, String> e : peopleAndFood.entrySet()) {
            System.out.println("Schlüssel: " +e.getKey()+ " Wert: " + e.getValue());
        }

        // Entferne die Person „Anna“ aus der Liste
        System.out.println("-------delete Anna -------- ");
        peopleAndFood.remove("Anna");
        for (Map.Entry<String, String> e : peopleAndFood.entrySet()) {
            System.out.println("Schlüssel: " +e.getKey()+ " Wert: " + e.getValue());
        }

        //Prüfe, ob „Anna“ in der Liste ist (containsKey)
        System.out.println("PeopleAndFood containsKey: " + peopleAndFood.containsKey("Anna"));

        // Gib die Liste der Gerichte aus (values)
        System.out.println("Gerichte:");
        for (String valueInList : peopleAndFood.values()) {
            System.out.println( valueInList);
        }


        //Wenn ich NUR über die Schlüssel gehen will (z.b. alle Namen):
        for (String name : peopleAndFood.keySet()) {
            System.out.println("Name: " + name + ", Lieblingsessen: " + peopleAndFood.get(name));
        }

        //Die Ausgabe-Reihenfolge ist nicht garantiert.
        System.out.println(" --  HashSet: Die Ausgabe-Reihenfolge ist nicht garantiert:");
        HashSet<String> namen = new HashSet<>();
        namen.add("Katja");
        namen.add("Alex");
        namen.add("Irina");
        namen.add("Simon");
        namen.add("Max");

        for (String name : namen) {
            System.out.println(name);
        }
    }
}
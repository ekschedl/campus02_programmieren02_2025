import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps________HM {
    public static void main(String[] args) {
        HashMap<String, Integer> tiere = new HashMap<>();
        tiere.put("Katze", 2);
        tiere.put("Hund", 4);
        tiere.put("Fisch", 10);

        // Variante 1
        System.out.println("🔹 Variante 1: Nur Schlüssel + get()");
        for (String key : tiere.keySet()) {
            int value = tiere.get(key);
            System.out.println(key + " → " + value);
        }

        // Variante 2
        System.out.println("\n🔹 Variante 2: Nur Werte");
        for (Integer value : tiere.values()) {
            System.out.println("Anzahl: " + value);
        }

        // Variante 3
        System.out.println("\n🔹 Variante 3: EntrySet (Schlüssel + Wert)");
        for (Map.Entry<String, Integer> entry : tiere.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        ///  noch  Variante /////////////////////////////

        HashMap<String, Integer> map = new HashMap<>();

        // 1. Einträge hinzufügen
        map.put("Graz", 306068);
        map.put("Vienna", 2005500);
        map.put("Linz", 212538);
        map.put("New York", 19007100);
        map.put("London", 8866180);
        map.put("Beijing", 22000000);

        // 2. Zugriff auf Werte per Key
        System.out.println("Einzelner Wert: Population Graz = " + map.get("Graz"));

        // 3. Existiert ein Schlüssel?
        System.out.println("Gibt es Linz? " + map.containsKey("Linz")); // true

        // 4. Existiert ein Wert?
        System.out.println("Gibt es Stadt mit 10000000? " + map.containsValue(10000000)); // false

        // 5. Wert ändern
        map.replace("Graz", 306068, 306075); // nur wenn alter Wert stimmt
        map.put("Vienna", 2005600); // überschreibt einfach

        // 6. Eintrag entfernen
        map.remove("London"); // entfernt London komplett

        // 7. Map-Größe
        System.out.println("Größe der Map (Anzahl der Zeilen): " + map.size());

        // 8. Schleife über alle Keys ausgabe
        for (String key : map.keySet()) {
            System.out.println(key + " hat " + map.get(key) + " Einwohner");
        }

        // 9. Schleife über alle Werte
        for (Integer value : map.values()) {
            System.out.println("Einwohnerzahl: " + value);
        }

        // 10. Schleife über Key–Value-Paare
        for (Map.Entry<String, Integer> eintrag : map.entrySet()) {
            System.out.println(eintrag.getKey() + " → " + eintrag.getValue());
        }

        // 11. Bedingte Ausgabe
        System.out.println("Städte mit mehr als 1 Mio Einwohner:");
        for (Map.Entry<String, Integer> eintrag : map.entrySet()) {
            if (eintrag.getValue() >= 1_000_000) {
                System.out.println("  - " + eintrag.getKey());
            }
        }
        ///  noch  Variante /////////////////////////////

        // 12. Zähler erhöhen
        HashMap<String, Integer> tieren = new HashMap<>();
        tieren.put("Katze", 2);
        tieren.put("Hund", 4);
        tieren.put("Fisch", 10);

        // Zähle 1 Hund dazu
        tiere.put("Hund", tieren.get("Hund") + 1); // jetzt 5

        // 13. Neues Tier beim ersten Auftreten
        tieren.putIfAbsent("Vogel", 1); // wird nur gesetzt, wenn er noch nicht da ist

        // 14. Ganze Map durchgehen
        for (String tier : tieren.keySet()) {
            System.out.println(tier + " → " + tiere.get(tier));
        }

        // 15. Ganze Map löschen
        //tieren.clear();
        System.out.println("Tiere nach clear(): " + tieren.size()); // 0

        // 16. Alternative Map: Noten
        HashMap<String, Integer> noten2 = new HashMap<>();
        noten2.put("Katja", 2);
        noten2.put("Alex", 1);
        noten2.put("Lena", 3);

        for (String name : noten2.keySet()) {
            System.out.println(name + " hat Note " + noten2.get(name));
        }
        ///  noch  Variante /////////////////////////////
        HashMap<String, Integer> noten = new HashMap<>();

        // 🔹 put(): Werte hinzufügen
        noten.put("Katja", 1);
        noten.put("Alex", 2);
        noten.put("Julia", 3);
        noten.put("Alex", 4); // Überschreibt den vorherigen Wert für "Alex"

        // 🔹 get(): Wert auslesen
        System.out.println("Note von Katja: " + noten.get("Katja"));

        // 🔹 containsKey(): Gibt es diesen Schlüssel?
        System.out.println("Enthält 'Julia'? " + noten.containsKey("Julia"));  // true

        // 🔹 containsValue(): Gibt es diesen Wert?
        System.out.println("Gibt es Note 4? " + noten.containsValue(4));       // true

        // 🔹 size(): Anzahl der Einträge
        System.out.println("Anzahl der Schüler: " + noten.size());

        // 🔹 isEmpty(): Ist die Map leer?
        System.out.println("Ist die Map leer? " + noten.isEmpty());

        // 🔹 keySet(): Alle Schlüssel (z.B. Namen)
        System.out.println("\nAlle Namen:");
        Set<String> namen = noten.keySet();
        for (String name : namen) {
            System.out.println(name);
        }

        // 🔹 values(): Alle Werte (z.B. Noten)
        System.out.println("\nAlle Noten:");
        Collection<Integer> notenListe = noten.values();
        for (Integer n : notenListe) {
            System.out.println(n);
        }

        // 🔹 entrySet(): Schlüssel + Wert gemeinsam ausgeben
        System.out.println("\nAlle Einträge (Name + Note):");
        for (Map.Entry<String, Integer> eintrag : noten.entrySet()) {
            System.out.println(eintrag.getKey() + " → " + eintrag.getValue());
        }

        // 🔹 remove(): Einen Eintrag entfernen
        noten.remove("Julia");

        // 🔹 clear(): Alles löschen
        // noten.clear(); // ← auskommentiert, sonst ist Map leer

        // Letzter Stand der Map anzeigen
        System.out.println("\nNach dem Entfernen von 'Julia':");
        for (Map.Entry<String, Integer> e : noten.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        // if (map.containsKey("Apfel")) { ... }
       // if (map.containsValue(5)) { ... }
        //if (map.isEmpty()) { ... }
    }
}
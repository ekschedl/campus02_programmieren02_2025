// 10. Sortieren des Arrays

import java.util.Arrays;

public class Array_vs_Arraylist {
    public static void main(String[] args) {
//        mit VERERBUNG!
//        ArrayList<Tier> tiere = new ArrayList<>();
//        tiere.add(new Katze());
//        tiere.add(new Hund());
//
//        for (Tier t : tiere) {
//            t.machGeräusch(); // Katze → "Miau", Hund → "Wuff"
//        }

        // 1. Array erstellen (mit fester Größe)
        int[] zahlen = new int[5];              // enthält: 0, 0, 0, 0, 0
        String[] farben = new String[3];        // enthält: null, null, null

// 2. Array direkt mit Werten initialisieren
        int[] punkte = {10, 20, 30};
        String[] namen = {"Anna", "Ben", "Clara"};

// 3. Zugriff auf Elemente
        System.out.println(punkte[1]);          // gibt 20 aus
        System.out.println(namen[0]);           // gibt "Anna" aus

// 4. Wert ersetzen
        punkte[1] = 99;
        namen[2] = "Chris";

// 5. Array durchlaufen (klassische for-Schleife)
        for (int i = 0; i < punkte.length; i++) {
            System.out.println(punkte[i]);
        }

        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i]);
        }

// 6. Array durchlaufen (foreach)
        for (int p : punkte) {
            System.out.println(p);
        }

        for (String name : namen) {
            System.out.println(name);
        }

// 7. Vergleichen von Werten im Array
        if (namen[0].equals("Anna")) {
            System.out.println("Erstes Element ist Anna");
        }

// 8. Element „löschen“ (Wert auf 0 oder null setzen)
        punkte[0] = 0;
        namen[1] = null;

// 9. Länge des Arrays
        System.out.println(punkte.length);      // z. B. 3


        Arrays.sort(punkte);                    // sortiert aufsteigend: z. B. [10, 20, 30]
        Arrays.sort(namen);                     // sortiert alphabetisch: [Anna, Ben, Clara]
    }
}
//Vergleichen von Werten: if (array[i] == x) oder .equals()
//ArrayIndexOutOfBoundsException, wenn man auf array[-1] oder array[length] zugreift
	//•	.length ist ohne Klammern – kein Aufruf wie bei Methoden!
/*Mehrdimensionale Arrays:
z. B. int[][] matrix = new int[3][3];
	•	Arrays mit Objekten:
Person[] personen = new Person[5];
	•	Arrays vergleichen mit Arrays.equals(a, b)
	•	Array in String umwandeln: Arrays.toString(array)

	// 1. Array mit Objekten erstellen
Person[] personen = new Person[3]; // enthält: null, null, null

// 2. Objekte im Array initialisieren
personen[0] = new Person("Anna", 25);
personen[1] = new Person("Ben", 30);
personen[2] = new Person("Clara", 20);

// 3. Auf Attribute zugreifen
System.out.println(personen[1].getName());     // Ausgabe: "Ben"
System.out.println(personen[2].getAge());      // Ausgabe: 20

// 4. Array durchlaufen (klassisch)
for (int i = 0; i < personen.length; i++) {
    System.out.println(personen[i].getName() + ", " + personen[i].getAge());
}

// 5. Array durchlaufen (foreach)
for (Person p : personen) {
    System.out.println(p.getName());
}

// 6. Null-Prüfung vor Zugriff (sicher!)
for (Person p : personen) {
    if (p != null) {
        System.out.println(p.getName());
    }
}

// 7. Person-Klasse sortierbar machen
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age; // sortiert aufsteigend nach Alter
    }
}

// 8. Array mit Objekten sortieren
import java.util.Arrays;

Arrays.sort(personen); // sortiert das Array nach Alter (siehe compareTo)



UND NUN MIT ARRAYLIST

        import java.util.ArrayList;
import java.util.Collections;

// 1. ArrayList mit Person-Objekten erstellen
ArrayList<Person> personenListe = new ArrayList<>();

// 2. Objekte hinzufügen
personenListe.add(new Person("Anna", 25));
        personenListe.add(new Person("Ben", 30));
        personenListe.add(new Person("Clara", 20));

// 3. Auf Elemente zugreifen
        System.out.println(personenListe.get(1).getName()); // Ausgabe: "Ben"

// 4. ArrayList durchlaufen (klassisch)
        for (int i = 0; i < personenListe.size(); i++) {
        System.out.println(personenListe.get(i).getName() + ", " + personenListe.get(i).getAge());
        }

// 5. ArrayList durchlaufen (foreach)
        for (Person p : personenListe) {
        System.out.println(p.getName());
        }

// 6. Ein Element ersetzen
        personenListe.set(0, new Person("Alex", 40)); // ersetzt Anna

// 7. Ein Element entfernen
        personenListe.remove(1); // entfernt Ben

// 8. Nach Größe prüfen
System.out.println(personenListe.size()); // Anzahl der Elemente

// 9. Liste sortieren (Person muss Comparable implementieren)
        Collections.sort(personenListe); // sortiert nach Alter, siehe compareTo in Person

// 10. Beispiel Person-Klasse mit Comparable
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age; // sortiert nach Alter (aufsteigend)
    }
}

KURZ ÜBER ARRAYLIST
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 1. ArrayList erstellen (z. B. mit Strings oder eigenen Objekten)
ArrayList<String> namen = new ArrayList<>();
ArrayList<Integer> zahlen = new ArrayList<>();
ArrayList<Person> personen = new ArrayList<>();

// 2. Elemente hinzufügen
namen.add("Anna");
namen.add("Ben");
zahlen.add(10);
zahlen.add(5);
personen.add(new Person("Clara", 22));
personen.add(new Person("David", 30));

// 3. Element an bestimmter Stelle einfügen
namen.add(1, "Eva"); // fügt "Eva" an Index 1 ein

// 4. Element ersetzen (ersetzen ≠ einfügen!)
namen.set(0, "Alex"); // ersetzt "Anna" durch "Alex"

// 5. Element löschen
namen.remove(2); // entfernt das Element an Index 2
personen.remove(0); // entfernt erstes Person-Objekt

// 6. Alle Elemente löschen
zahlen.clear();

// 7. Größe der Liste
int anzahl = namen.size();

// 8. Prüfen, ob Liste leer ist
if (namen.isEmpty()) {
    System.out.println("Liste ist leer");
}

// 9. Element vorhanden?
if (namen.contains("Ben")) {
    System.out.println("Ben ist in der Liste");
}

// 10. Zugriff auf Elemente
String ersterName = namen.get(0);

// 11. Durchlaufen (for-Schleife)
for (int i = 0; i < personen.size(); i++) {
    System.out.println(personen.get(i).getName());
}

// 12. Durchlaufen (foreach)
for (Person p : personen) {
    System.out.println(p.getName());
}

// 13. Liste sortieren (mit Comparable)
Collections.sort(personen); // funktioniert nur, wenn Person Comparable implementiert

// 14. Liste sortieren (mit Comparator)
personen.sort(Comparator.comparing(Person::getName)); // sortiert nach Name
personen.sort(Comparator.comparing(Person::getAge));  // sortiert nach Alter

// 15. Liste kopieren
ArrayList<String> kopie = new ArrayList<>(namen);

// 16. Zwei Listen zusammenfügen
ArrayList<String> mehrNamen = new ArrayList<>();
mehrNamen.add("Lena");
namen.addAll(mehrNamen);

// 17. Umkehren (reverse)
Collections.reverse(namen);

// 18. Index eines Elements finden
int index = namen.indexOf("Ben");

// 19. ArrayList in Array umwandeln
String[] namenArray = namen.toArray(new String[0]);

// 20. Array in ArrayList umwandeln
String[] tiere = {"Hund", "Katze", "Maus"};
ArrayList<String> tierListe = new ArrayList<>(List.of(tiere));





THEORY:
🔹 Array:
	•	Feste Größe (wird beim Erstellen festgelegt)
	•	Kann primitive Typen enthalten (int[], double[], …)
	•	Weniger flexibel (z. B. keine Methoden zum Hinzufügen oder Entfernen)
	•	Beispiel: int[] zahlen = new int[5];


🔹 ArrayList:
	•	Dynamisch: wächst oder schrumpft automatisch
	•	Kann nur Objekte speichern (z. B. Integer, String, Person)
	•	Viele nützliche Methoden: .add(), .remove(), .contains(), .size(), …
	•	Teil des java.util-Pakets → muss importiert werden
	•	Beispiel: ArrayList<String> namen = new ArrayList<>();

⸻

*/
package DogsComparator___C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DogApp {

    public static void main(String[] args) {
        Dog doggi = new Dog("Wuffi", 2);
        doggi.bellen("Wuff");
        Pudel bello = new Pudel("Bello", 5, "Bär");
        bello.bellen("gaff, gaff");
        bello.isstBeilage("Gnu");
        System.out.println(bello.getAge());


        //----COLLECTIONS------
        List<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog("Doggi", 17));
        dogsList.add(new Dog("Snuffels", 4));

        //SORTIEREN MIT COLLECTIONS
        Collections.sort(dogsList);
        System.out.println("---------ARRAYLIST-----------");
        System.out.println(dogsList);
        System.out.println("\n");

        //SOERTIEREN MIT COMPAREMETHODE BEI DOG
        dogsList.add(new Dog("Fluffi", 7));

        System.out.println("--------COMPARATOR NAME AUFSTEIGEND--------");
        Collections.sort(dogsList, new DogNameComparator());
        System.out.println(dogsList);
        System.out.println("\n");

        System.out.println("-------------COMPARATOR AGE AUFSTEIGEND-------");
        dogsList.add(new Dog("Puppy", 1));
        Collections.sort(dogsList, new DogAgeComparator());
        System.out.println(dogsList);
        System.out.println("\n");

        //UMGEKEHRT SORTIEREN
        //REVERSE COMPARATOR
        System.out.println("-------------COMPARATOR AGE ABSTEIGEND-------");
        Collections.sort(dogsList, new DogAgeComparator().reversed());
        System.out.println(dogsList);
        System.out.println("\n");

        //SORTIEREN ZUERST NACH ALTER UND DANN NACH NAMEN
        System.out.println("--------COMPARATOR ZUERST AGE DANN NAME----");
        dogsList.add(new Dog("Bruno", 1));
        Collections.sort(dogsList, new DogAgeNameComparator());
        System.out.println(dogsList);
    }
}

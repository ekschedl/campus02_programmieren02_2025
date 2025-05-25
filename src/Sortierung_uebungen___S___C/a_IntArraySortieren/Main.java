package Sortierung_uebungen___S___C.a_IntArraySortieren;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Int Array sortieren");
        int[] zahlen = {5, 2, 8, 1, 9, 4};
        Arrays.sort(zahlen);
        System.out.println(Arrays.toString(zahlen)); // [1, 2, 4, 5, 8, 9]

        System.out.println("Char Array sortieren");
        char[] zeichen = {'h', 'H', 'l', 'l', '5', 'L'};
        Arrays.sort(zeichen);
        System.out.println(Arrays.toString(zeichen)); // ['5', 'H', 'L', 'h', 'l', 'l']

        System.out.println("String Array sortieren");
        String[] namen = {"Zoe", "Anna", "bernd", "Clara"};
        Arrays.sort(namen);
        System.out.println(Arrays.toString(namen)); // [Anna, Clara, Zoe, bernd] (Groß vor klein)

        System.out.println("Double Array sortieren");
        double[] preise = {19.99, 5.49, 99.99, 1.0};
        Arrays.sort(preise);
        System.out.println(Arrays.toString(preise)); // [1.0, 5.49, 19.99, 99.99]

        System.out.println("Custom Object (Dog) sortieren nach Alter (Comparable)");
        Dog[] dogs = {
                new Dog(7, 15),
                new Dog(3, 20),
                new Dog(10, 5)
        };
        Arrays.sort(dogs); // sortiert über compareTo() nach Alter
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        System.out.println("Custom Object (Dog) sortieren nach Gewicht (Comparator)");
        Arrays.sort(dogs, new DogWeightComparator());
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}

class Dog implements Comparable<Dog> {
    int alter;
    int gewicht;

    public Dog(int alter, int gewicht) {
        this.alter = alter;
        this.gewicht = gewicht;
    }

    @Override
    public int compareTo(Dog other) {
        return Integer.compare(this.alter, other.alter); // aufsteigend nach Alter
    }

    @Override
    public String toString() {
        return "Dog{Alter=" + alter + ", Gewicht=" + gewicht + "}";
    }
}

class DogWeightComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
        return Integer.compare(d1.gewicht, d2.gewicht); // aufsteigend nach Gewicht
    }
}
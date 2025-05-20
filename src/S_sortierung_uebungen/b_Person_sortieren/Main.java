package b_Person_sortieren;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("sorting  Persons....");

        Person[] persons = {
                new Person(7, "Anna", "Huber"),
                new Person(2, "Peter", "Huber"),
                new Person(3, "Hans", "Huber"),
                new Person(4, "Milan", "Huber"),
                new Person(5, "Bernd", "Huber"),
                new Person(6, "Bernd", "Huber"),
                new Person(1, "Bernd", "Huber"),
        };

        Arrays.sort(persons);
        System.out.println("Sortiertes Personen Array:");
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}

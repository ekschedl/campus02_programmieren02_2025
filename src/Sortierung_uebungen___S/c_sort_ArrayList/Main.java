package Sortierung_uebungen___S.c_sort_ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("sorting  ArrayList of Persons....");
        List<Person> people = new ArrayList<>();
        people.add(new Person(7, "Anna", "Huber"));
        people.add(new Person(2, "Peter", "Huber"));
        people.add(new Person(3, "Hans", "Huber"));
        people.add(new Person(4, "Milan", "Huber"));
        people.add(new Person(5, "Bernd", "Huber"));
        people.add(new Person(6, "Bernd", "Huber"));
        people.add(new Person(1, "Bernd", "Huber"));
    Collections.sort(people);
        System.out.println("Sortiertes Personen Array:");
        for(Person p :people)
    {     System.out.println(p);   }
}
}

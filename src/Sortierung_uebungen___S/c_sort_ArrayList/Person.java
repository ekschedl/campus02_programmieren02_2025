package Sortierung_uebungen___S.c_sort_ArrayList;

public class Person implements Comparable<Person> {
    private int id;
    private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        Person person1 = this; //aktuelles Objekt
        Person person2 = p;     // externes Objekt, mit dem ich mich vergleichen soll
        System.out.println("---compareTo() aufgerufen, ich vergleiche mich" +
                "(" + person1 + ") mit der Person2: (" +
                person2 + ")");
        if(person1.id < person2.id) return -1;
        if(person1.id > person2.id) return 1;
        return 0; // ich geben "0" zurück wenn beide IDs gleich sind
    }
}

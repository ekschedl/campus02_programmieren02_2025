package Sortierung_uebungen___S.e_sort_mit_Comparator;

public class Hase {
    private int Age;
    private int Karotten;
    private String firstName;



    public Hase(int age, int karotten, String firstname) {
        Age = age;
        Karotten = karotten;
        firstName = firstname;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Hase{" +
                "Age=" + Age +
                ", Karotten=" + Karotten +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    public int getAge() {
        return Age;
    }

    public int getKarotten() {
        return Karotten;
    }
}

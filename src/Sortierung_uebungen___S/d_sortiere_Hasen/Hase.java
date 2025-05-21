package Sortierung_uebungen___S.d_sortiere_Hasen;

public class Hase implements Comparable<Hase>{
    int Age;
    int Karotten;

    public Hase(int age, int karotten) {
        Age = age;
        Karotten = karotten;
    }

    @Override
    public int compareTo(Hase externerHase) {
        if(this.Age > externerHase.Age) return 1;
        if(this.Age < externerHase.Age) return -1;

        if(this.Karotten > externerHase.Karotten) return 1;
        if(this.Karotten < externerHase.Karotten) return -1;

        return 0;
    }

    @Override
    public String toString() {
        return "Hase{" +
                "Age=" + Age +
                ", Karotten=" + Karotten +
                '}';
    }
}

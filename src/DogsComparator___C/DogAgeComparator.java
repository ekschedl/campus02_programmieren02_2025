package DogsComparator___C;

import java.util.Comparator;

public class DogAgeComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        //AUFSTEIGEND SORTIERT
        return Integer.compare(o1.getAge(),o2.getAge());

    }
}

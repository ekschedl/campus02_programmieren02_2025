package DogsComparator___C;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class DogAgeNameComparator implements Comparator<Dog> {
    //AUF BASIS MEHERER ATTRIBUTE SORTIEREN
    //HIER ZUERST NACH ALTER AUFSTEIGEND UND DANN NACH NAMEN


    @Override
    public int compare(Dog o1, Dog o2) {
        int cmp = Integer.compare(o1.getAge(), o2.getAge());
        if (cmp != 0) {
            //ALTER IST SCHON UNTERSCHIEDLICH
            //MÜSSEN NAMEN NICHT MEHR BERÜCKSICHTIGEN
            return cmp;
        }
        //FALLS ALTER GLEICH IST
        return o1.getName().compareTo(o2.getName());
    }


}

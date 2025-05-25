package Icebreaker_________ArList____E;

import java.util.ArrayList;
import java.util.List;

public class Introduction {
    public static void main(String[] args) {
        List<Favorite> faves = new ArrayList<>();
        faves.add(new Favorite("Victorian Psycho", Medium.BOOK, "Unhinged, but in a good way."));
        faves.add(new Favorite("Severance", Medium.SERIES));
        Person me = new Person("Silke", "Jandl", faves);

        System.out.println(me.introduceMe());
    }
}
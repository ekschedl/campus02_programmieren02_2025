package Fossils;


import java.util.ArrayList;
import java.util.List;

public class Fossils_List {
    public static void main(String[] args) {
        Fossil fossil = new Fossil("name", 12, false);
        Fossil fossil1 = new Fossil("name1", 12, false);
        Fossil fossil2 = new Fossil("name2", 12, false);
        Fossil fossil3 = new Fossil("name3", 12, false);
        Fossil fossil4 = new Fossil("name4", 12, false);
        Fossil fossil5 = new Fossil("name5", 12, false);

        List<Fossil> fossils = new ArrayList<>();
        fossils.add(fossil1);
        fossils.add(fossil2);
        fossils.add(fossil);
        fossils.add(fossil3);
        fossils.add(fossil4);
        fossils.add(fossil5);

        for (Fossil f : fossils) {
            System.out.println(f);
        }

//        System.out.println(fossils.get(3));

        System.out.println(fossils.size());

        fossils.remove(fossil1);
        fossils.remove(4);

        System.out.println("----------------------------------------");
        for (Fossil f : fossils) {
            System.out.println(f);
        }

        System.out.println(fossils.size());


    }
}

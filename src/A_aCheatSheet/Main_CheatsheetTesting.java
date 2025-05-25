package A_aCheatSheet;

import java.util.ArrayList;
import java.util.Collections;

public class Main_CheatsheetTesting {
    public static void main(String[] args) {
        ///------------------------------COMPARATOR-------------------------------------------//
        //This is how you implement COMPARATOR in your MAIN class
        // Create your ArrayList
        ArrayList<Comparable_CheatSheet> myListComparator = new ArrayList<>(); //!!!!The Object in your ArrayList must be the one you want to compare
        //add items/objects to your list

        // Create an instance of your comparator class inside your sort.(parameter)
        Collections.sort(myListComparator, new Comparator_CheatSheet()); //call list then the comparator class
        System.out.println(myListComparator);


        //----------------------------------COMPARABLE-------------------------------------------------//
        //This is how you implement COMPARABLE in your MAIN class
        // Create your ArrayList
        ArrayList<Comparable_CheatSheet> myListComparable = new ArrayList<>();
        //add items/objects to your list

        //Sort the list using below code:
        Collections.sort(myListComparable);
        System.out.println(myListComparable);
    }
}

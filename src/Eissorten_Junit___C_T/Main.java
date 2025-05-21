package Eissorten_Junit___C_T;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Eissalon salon = new Eissalon();


        Collections.sort(salon.list); //sortiert nach Name,Preis
        //printList(list);
        System.out.println("Bitte geben Sie A, B oder C ein:");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        if(input.equals("A"))
        {
            System.out.println("You selected A. Sorted by Name:");
            Collections.sort(salon.list); //sortiert nach Name,Preis
            printList(salon.list);
        }
        else if(input.equals("B"))
        {
            System.out.println("You selected B. Sorting by Price. ASCENDING (aufsteigend)");
            Collections.sort(salon.list, new ComparatorPriceDESC()); //sortiert nach Preis
            //Collections.reverse(list);
            printList(salon.list);
        }
        else if(input.equals("C"))
        {
            System.out.println("You selected C. Sorting by Price. DECENDING (absteigend)");
            Collections.sort(salon.list, new ComparatorPriceASC()); //sortiert nach Preis
            printList(salon.list);
        }
    }

    public static void printList(List<Eissorte> list){
        System.out.println("printList:");
        int i =0;
        for(Eissorte e : list)
        {
            System.out.println(i +"\t" + e.Name + "\t €" + e.Preis );
            i++;
            //System.out.println(e);
        }
    }
}
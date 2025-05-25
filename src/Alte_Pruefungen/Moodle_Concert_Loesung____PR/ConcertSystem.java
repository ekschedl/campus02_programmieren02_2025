package Alte_Pruefungen.Moodle_Concert_Loesung____PR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ConcertSystem {
    private ArrayList<NFCTicket> audience;

    public ConcertSystem(){

        audience = new ArrayList<NFCTicket>();
    }

    public boolean addTicket(NFCTicket t){
        if(TicketFraudSystem.checkTicket(t))
        {
            if(!audience.contains(t))
            {
                audience.add(t);
                return true;
            }
        }
        return false;
    }
    public double profitPerCategory(int category)
    {
        double profit = 0;
        int counter = 0;

        for(NFCTicket t : audience){

            if(t.getCategory() == category){
                profit += t.getProfit();
                ++counter;
            }
        }

        return profit / counter;
    }
    public ArrayList<String> invitedToStage(){
        ArrayList<String> st = new ArrayList<String>();

        for(NFCTicket t : audience){
            if(t.getSecret().startsWith("M")){
                st.add(t.getTicketOwner());
            }
            if(t.getSecret().startsWith("A") && t.getCategory() == 1){
                st.add(t.getTicketOwner());
            }
        }
        return st;

    }
//    public HashMap<Character, Integer> participantsPerName(){
//        HashMap<Character, Integer> p = new HashMap<Character, Integer>();
//
//        for(NFCTicket t : audience){
//            char c = t.getTicketOwner().charAt(0);
//
//            if(p.containsKey(c))
//            {
//                p.put(c, p.get(c) + 1);
//            }
//            else
//            {
//                // does not contain key
//                p.put(c, 1);
//            }
//        }
//
//        return p;
//    }
    public HashMap<Integer, Double> donationPerCategory() {
        HashMap<Integer, Double> d = new HashMap<Integer, Double>();

        double d1 = 0, d2 = 0, d3 = 0;

        for(NFCTicket t : audience){
            if(t.getCategory() == 1)
            {
                d1 += t.getProfit() * 0.3;
            }
            if(t.getCategory() == 2)
            {
                d2 += t.getProfit() * 0.2;
            }
            if(t.getCategory() == 3)
            {
                d3 += t.getProfit() * 0.1;
            }
        }

        d.put(1, d1);
        d.put(2, d2);
        d.put(3, d3);
        return d;
    }

    public void sortAndPrintForAccounting() {
        Collections.sort(audience, new AccountingComparator());
        for(NFCTicket a : audience){
            System.out.println(a.getCategory() + " " + a.getSecret());
        }
    }
}

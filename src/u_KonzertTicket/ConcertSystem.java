package u_KonzertTicket;

import java.util.*;

public class ConcertSystem {

    protected List<NFCTicket> besucher;

    public ConcertSystem() {
        this.besucher = new ArrayList<>();
    }

    public boolean addList(NFCTicket t) {
        if (besucher != null && !(besucher.contains(t)) && TicketFraudSystem.checkTicket(t)) {
            addList(t);
            return true;
        }
        return false;
    }

    public double profitPerCategory(int category) {
        double count = 0.0;
        double sum = 0.0;
        if (besucher != null) {
            for (NFCTicket t : besucher) {
                if (t.getCategory() == category) {
                    count++;
                    sum += t.getProfit();
                }
            }
        }
        return sum / count;
    }

    public ArrayList<String> invitedToStage() {
        ArrayList<String> favorites = new ArrayList<>();
        if (besucher != null) {
            for (NFCTicket t : besucher) {
                if ((t.getSecret().charAt(0)) == 'M') {
                    favorites.add(t.getTicketOwner());
                } else if (t.getSecret().charAt(0) == 'A' && t.getCategory() == 1) {
                    favorites.add(t.getTicketOwner());
                }
            }
        }

        return favorites;
    }

    public HashMap<Integer, Double> donationPerCategory() {
        HashMap<Integer, Double> donations = new HashMap<>();
        double sum = 0.0;
        double sum2 = 0.0;
        double sum3 = 0.0;
        if (besucher != null) {
            for (NFCTicket t : besucher) {
                if (t.getCategory()==1) {
                    sum += t.getProfit() * .3;
                    donations.put(t.getCategory(), sum);
                }if (t.getCategory()==2) {
                    sum2 += t.getProfit() * .2;
                    donations.put(t.getCategory(), sum2);
                }if(t.getCategory()==3) {
                    sum3 += t.getProfit() * .1;
                    donations.put(t.getCategory(), sum3);
                }
            }
        }
        Set<Integer> keyset= donations.keySet();
        for (Integer s:keyset) {
            System.out.println("durch die Kategorie "+s+" wurden "+donations.get(s)+" gespendet.");
        }
        return donations;
    }
    public  HashMap<Integer,Double> dontionKategory(){
        HashMap<Integer,Double> donationsPerCategory=new HashMap<>();

        if (besucher!=null){
            for (NFCTicket t:besucher) {
                double sum=(double)(4-t.getCategory())/10;

                if(donationsPerCategory.containsKey(t.getCategory())){
                    double currentDonation = donationsPerCategory.get(t.getCategory());
                    donationsPerCategory.put(t.getCategory(),currentDonation+(t.getProfit()*sum));
                }else {
                    donationsPerCategory.put(t.getCategory(),(t.getProfit()*sum));
                }
            }
        }
        Set<Integer> keyset= donationsPerCategory.keySet();
        for (Integer s:keyset) {
            System.out.println("durch die Kategorie "+s+" wurden "+donationsPerCategory.get(s)+" gespendet.");
        }


        return donationsPerCategory;
    }

    public void sortPrintForAccounting() {
        Collections.sort(besucher, new AccountingComparator());
        for (NFCTicket t:besucher) {
            System.out.println(t.getCategory()+" : "+t.getTicketOwner()+" : "+t.getSecret());
        }
    }


}

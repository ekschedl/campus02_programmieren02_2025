package u_KonzertTicket______PR;

import java.util.*;

public class ConcertSystem {

    // Liste mit allen Besuchern, die Tickets haben
    protected List<NFCTicket> besucher;

    public ConcertSystem() {
        // beim Erstellen wird eine neue leere Liste angelegt
        this.besucher = new ArrayList<>();
    }

    // Methode zum Hinzufügen eines Tickets in die Besucher-Liste
    public boolean addList(NFCTicket t) {
        // prüfen, ob Liste existiert, Ticket noch nicht enthalten ist und gültig ist
        if (besucher != null && !(besucher.contains(t)) && TicketFraudSystem.checkTicket(t)) {
            besucher.add(t);
            return true;
        }
        return false;
    }

    // Berechnet den durchschnittlichen Gewinn für eine bestimmte Kategorie
    public double profitPerCategory(int category) {
        double count = 0.0;// wie viele Tickets in dieser Kategorie?
        double sum = 0.0; // Gesamtgewinn
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
                // MoonBoot-Tickets beginnen mit 'M'
                if ((t.getSecret().charAt(0)) == 'M') {
                    favorites.add(t.getTicketOwner());
                }  // App-Tickets mit Kategorie 1 und Code mit 'A' dürfen
                else if (t.getSecret().charAt(0) == 'A' && t.getCategory() == 1) {
                    favorites.add(t.getTicketOwner());
                }
            }
        }

        return favorites;
    }

    // Rechnet aus, wie viel pro Kategorie gespendet wird (feste Prozentsätze)
    public HashMap<Integer, Double> donationPerCategory() {

        // HashMap zum Speichern der Ergebnisse:
        // Key = Kategorie, Value = Summe der Spenden
        HashMap<Integer, Double> donations = new HashMap<>();

        // Drei separate Summen-Variablen für jede Kategorie
        double sum = 0.0;
        double sum2 = 0.0;
        double sum3 = 0.0;
        // checken, ob die Besucherliste nicht leer ist
        if (besucher != null) {

            // Für jedes Ticket in der Liste
            for (NFCTicket t : besucher) {
                // Wenn Ticket zur Kategorie 1 gehört → 30% des Profits spenden
                if (t.getCategory() == 1) {
                    sum += t.getProfit() * .3;
                    donations.put(t.getCategory(), sum);// in Map speichern
                }
                // Wenn Kategorie 2 → 20% des Profits spenden
                if (t.getCategory() == 2) {
                    sum2 += t.getProfit() * .2;
                    donations.put(t.getCategory(), sum2);
                }
                // Wenn Kategorie 3 → 10% des Profits spenden
                if (t.getCategory() == 3) {
                    sum3 += t.getProfit() * .1;
                    donations.put(t.getCategory(), sum3);
                }
            }
        }
        // Ausgabe aller gespeicherten Spenden pro Kategorie
        Set<Integer> keyset = donations.keySet();
        for (Integer s : keyset) {
            System.out.println("durch die Kategorie " + s + " wurden " + donations.get(s) + " gespendet.");
        }
        /*oder solche Ausgabe: Jede Kategorie + ihre Gesamtsumme
        for (Map.Entry<Integer, Double> eintrag : donations.entrySet()) {
        System.out.println("Kategorie " + eintrag.getKey() + " hat insgesamt " + eintrag.getValue() + " € gespendet.");
        }*/

        // Rückgabe der vollständigen HashMap mit allen Spendensummen
        return donations;
    }

    public HashMap<Integer, Double> dontionKategory() {
        // Neue HashMap für die Spenden pro Kategorie
        HashMap<Integer, Double> donationsPerCategory = new HashMap<>();

        // Nur weiterrechnen, wenn die Besucherliste nicht leer ist
        if (besucher != null) {
            // Durch alle Tickets iterieren
            for (NFCTicket t : besucher) {
                double sum = (double) (4 - t.getCategory()) / 10;

                if (donationsPerCategory.containsKey(t.getCategory())) {
                    double currentDonation = donationsPerCategory.get(t.getCategory());
                    donationsPerCategory.put(t.getCategory(), currentDonation + (t.getProfit() * sum));
                } else {
                    donationsPerCategory.put(t.getCategory(), (t.getProfit() * sum));
                }
            }
        }
        Set<Integer> keyset = donationsPerCategory.keySet();
        for (Integer s : keyset) {
            System.out.println("durch die Kategorie " + s + " wurden " + donationsPerCategory.get(s) + " gespendet.");
        }


        return donationsPerCategory;
    }

    public void sortPrintForAccounting() {
        Collections.sort(besucher, new AccountingComparator());
        for (NFCTicket t : besucher) {
            System.out.println(t.getCategory() + " : " + t.getTicketOwner() + " : " + t.getSecret());
        }
    }


}

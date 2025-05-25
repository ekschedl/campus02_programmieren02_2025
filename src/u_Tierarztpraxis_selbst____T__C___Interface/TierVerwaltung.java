package u_Tierarztpraxis_selbst____T__C___Interface;
import java.util.ArrayList;
import java.util.HashMap;

public class TierVerwaltung {
    private ArrayList<Tier> tiere = new ArrayList<>();
    public ArrayList<Tier> getTiere() {
        return tiere;
    }
    public void addTier(Tier tier) {
        tiere.add(tier);
    }

    public void alleLauteGeben() {
        for (Tier tier : tiere) {
            System.out.println(tier.getTierart() + " " + tier.getName() + " macht Lautstärke: " + tier.getLautstaerke());
        }
    }

    public double gesamtBehandlungskosten() {
        double summe = 0;
        for (Tier tier : tiere) {
            summe += tier.behandlungskosten();
        }
        return summe;
    }

    public void sortiereNachKosten() {
        tiere.sort(new KostenComparator());
    }

    public void sortiereNachNameUndLautstaerke() {
        tiere.sort(new NameUndLautstaerkeComparator());
    }

    public Tier teuerstesTier() {
        if (tiere.isEmpty()) return null;
        Tier teuerstes = tiere.get(0);
        for (Tier tier : tiere) {
            if (tier.behandlungskosten() > teuerstes.behandlungskosten()) {
                teuerstes = tier;
            }
        }
        return teuerstes;
    }

    public void zeigeLauteTiere(int grenzwert) {
        System.out.println("----Tiere mit Lautstärke über " + grenzwert + ":---------");
        for (Tier tier : tiere) {
            if (tier.getLautstaerke() > grenzwert) {
                System.out.println(tier);
            }
        }
    }

    public void gruppiereNachErstemBuchstaben() {
        HashMap<Character, ArrayList<Tier>> gruppen = new HashMap<>();
        for (Tier tier : tiere) {
            char buchstabe = tier.getName().charAt(0);
            gruppen.putIfAbsent(buchstabe, new ArrayList<>());
            gruppen.get(buchstabe).add(tier);
        }

        for (char key : gruppen.keySet()) {
            System.out.println("---------Tiere mit '" + key + "':");
            for (Tier t : gruppen.get(key)) {
                System.out.println("  " + t);
            }
        }
    }

    public Tier zufaelligesTier() {
        if (tiere.isEmpty()) return null;
        int index = (int)(Math.random() * tiere.size());
        return tiere.get(index);
    }

    public void gruppiereNachTierart() {
        HashMap<String, ArrayList<Tier>> gruppen = new HashMap<>();
        for (Tier tier : tiere) {
            String art = tier.getTierart();
            gruppen.putIfAbsent(art, new ArrayList<>());
            gruppen.get(art).add(tier);
        }

        for (String art : gruppen.keySet()) {
            System.out.println("--Tierart '" + art + "':");
            for (Tier t : gruppen.get(art)) {
                System.out.println("  " + t);
            }
        }
    }
    public void durchschnittskostenProTierart() {
        HashMap<String, ArrayList<Tier>> gruppen = new HashMap<>();
        for (Tier tier : tiere) {
            String art = tier.getTierart();
            gruppen.putIfAbsent(art, new ArrayList<>());
            gruppen.get(art).add(tier);
        }

        for (String art : gruppen.keySet()) {
            double summe = 0;
            for (Tier t : gruppen.get(art)) {
                summe += t.behandlungskosten();
            }
            double durchschnitt = summe / gruppen.get(art).size();
            System.out.println("-----Durchschnittskosten für '" + art + "': " + durchschnitt + " €");
        }
    }

    public void zeigeAlleSortiertNachLautstaerke() {
        tiere.sort((t1, t2) -> Integer.compare(t2.getLautstaerke(), t1.getLautstaerke()));
        System.out.println("---------------Alle Tiere (nach Lautstärke absteigend):");
        for (Tier t : tiere) {
            System.out.println(t);
        }
    }
}
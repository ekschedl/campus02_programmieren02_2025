package u_Tierarztpraxis_selbst____T__C___Interface;

public class Main {
    public static void main(String[] args) {
        TierVerwaltung verwaltung = new TierVerwaltung();

        verwaltung.addTier(new Hund("Bello", 7, "Labrador"));
        verwaltung.addTier(new Katze("Mimi", 4, true));
        verwaltung.addTier(new Katze("Mimi", 14, true));
        verwaltung.addTier(new Esel("Fred", 5, 25));
        verwaltung.addTier(new Esel("Fred", 2, 12));

        verwaltung.alleLauteGeben();
        System.out.println("Gesamte Behandlungskosten: " + verwaltung.gesamtBehandlungskosten() + " €");
        verwaltung.sortiereNachKosten();
        verwaltung.alleLauteGeben();
        System.out.println("Nach Behandlungskosten sortiert:");
        for (Tier tier : verwaltung.getTiere()) {
            System.out.println(tier + " -> " + tier.behandlungskosten() + " €");
        }



        verwaltung.sortiereNachNameUndLautstaerke();
        System.out.println("\nTiere sortiert nach Name und Lautstärke:");
        for (Tier tier : verwaltung.getTiere()) {
            System.out.println(tier.getName() + " (" + tier.getLautstaerke() + ")");
        }

        Tier teuer = verwaltung.teuerstesTier();
        System.out.println("Teuerstes Tier: " + teuer.getName() + " kostet " + teuer.behandlungskosten() + " €");

        verwaltung.zeigeLauteTiere(5);

        verwaltung.gruppiereNachErstemBuchstaben();

        System.out.println("Heute wird behandelt: " + verwaltung.zufaelligesTier().getName());

        verwaltung.gruppiereNachTierart();
        verwaltung.durchschnittskostenProTierart();
        verwaltung.zeigeAlleSortiertNachLautstaerke();
    }



}
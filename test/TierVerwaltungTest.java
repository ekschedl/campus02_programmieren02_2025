import org.junit.Before;
import org.junit.Test;
import u_Tierarztpraxis_selbst____T__C___Interface.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TierVerwaltungTest {
    private TierVerwaltung verwaltung;
    private Tier hund;
    private Tier katze;
    private Tier esel;

    @Before
    public void setUp() {
        verwaltung = new TierVerwaltung();
        hund = new Hund("Bello", 8, "Labrador");     // 110
        katze = new Katze("Mimi", 5, true);          // 60
        esel = new Esel("Fred", 4, 20);              // 40

        verwaltung.addTier(hund);
        verwaltung.addTier(katze);
        verwaltung.addTier(esel);
    }

    @Test
    public void testGesamtBehandlungskosten() {
        assertEquals(210.0, verwaltung.gesamtBehandlungskosten(), 0.01);
    }

    @Test
    public void testTeuerstesTier() {
        assertEquals("Bello", verwaltung.teuerstesTier().getName());
    }

    @Test
    public void testSortiereNachKosten() {
        verwaltung.sortiereNachKosten();
        assertEquals("Fred", verwaltung.getTiere().get(0).getName());   // billigster
        assertEquals("Mimi", verwaltung.getTiere().get(1).getName());
        assertEquals("Bello", verwaltung.getTiere().get(2).getName());  // teuerster
    }

    @Test
    public void testSortiereNachNameUndLautstaerke() {
        verwaltung.sortiereNachNameUndLautstaerke();
        assertEquals("Bello", verwaltung.getTiere().get(0).getName());
        assertEquals("Fred", verwaltung.getTiere().get(1).getName());
        assertEquals("Mimi", verwaltung.getTiere().get(2).getName());
    }

    @Test
    public void testZufaelligesTierNichtNull() {
        assertNotNull(verwaltung.zufaelligesTier());
    }

    @Test
    public void testGruppiereNachErstemBuchstaben() {
        verwaltung.gruppiereNachErstemBuchstaben();
        // kein assert notwendig – wird nur auf Konsole ausgegeben
    }

    @Test
    public void testZeigeLauteTiere() {
        verwaltung.zeigeLauteTiere(6); // Bello hat 8 → wird ausgegeben
    }

    @Test
    public void testGruppiereNachTierart() {
        verwaltung.gruppiereNachTierart(); // nur Sichtprüfung
    }

    @Test
    public void testDurchschnittskostenProTierart() {
        verwaltung.durchschnittskostenProTierart(); // nur Sichtprüfung
    }

    @Test
    public void testZeigeAlleSortiertNachLautstaerke() {
        verwaltung.zeigeAlleSortiertNachLautstaerke(); // nur Sichtprüfung
    }
}
import org.junit.Before;
import org.junit.Test;
import u_Musikanten____leer____2023___PR.musikanten.*;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class MusikantenTest {
	private Quartett quartett;
	private Instrument trommel, geige, triangel, posaune;
	private Musikant hund, katze, hahn, esel;

	@Before
	public void setUp() {
		trommel = new Instrument("Trommel", 10);
		geige = new Instrument("Geige", 8);
		triangel = new Instrument("Triangel", 4);
		posaune = new Instrument("Posaune", 12);

		hund = new Hund(4, trommel, 6);   // (10+6)/2 = 8.0 Musik, verscheucht 10
		katze = new Katze(4, geige, 7);   // Musik 8.0, verscheucht 7
		hahn = new Hahn(2, triangel, 3);  // Musik (4+2)/3=2.0, verscheucht 5
		esel = new Esel(4, posaune, 20);  // Musik 12.0, verscheucht 80

		quartett = new Quartett();
		quartett.addMusikant(hund);
		quartett.addMusikant(katze);
		quartett.addMusikant(hahn);
		quartett.addMusikant(esel);
	}

	@Test
	public void testIstQuartett() {
		assertTrue(quartett.istQuartett());
	}

	@Test
	public void testGemeinsameRaeuberVerscheucht() {
		assertEquals(102, quartett.gemeinsameRaeuberVerscheucht());
	}

	@Test
	public void testDurchschnittlicheLautstaerke() {
		double expected = (8.0 + 8.0 + 2.0 + 12.0) / 4;
		assertEquals(expected, quartett.durchschnittlicheLautstaerke(), 0.01);
	}

	@Test
	public void testGetMusikantenInLautstaerkeBereich() {
		ArrayList<Musikant> result = quartett.getMusikantenInLautstaerkeBereich(5, 11);
		assertEquals(2, result.size());
		assertTrue(result.contains(hund));
		assertTrue(result.contains(katze));
	}

	@Test
	public void testGetAnzahlMusikantenMitBeinAnzahl() {
		HashMap<Integer, Integer> map = quartett.getAnzahlMusikantenMitBeinAnzahl();
		assertEquals(3, map.get(4).intValue());
		assertEquals(1, map.get(2).intValue());
	}

	@Test
	public void testPrintLautstaerkeAbsteigend() {
		quartett.printLautstaerkeAbsteigend(); // Sichtprüfung in Konsole
		// Optional: Liste sortieren und testen
		assertEquals(esel, quartett.getQuartett().get(0));
	}
}

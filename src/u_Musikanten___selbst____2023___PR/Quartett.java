package u_Musikanten___selbst____2023___PR;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.*;

public class Quartett {
	protected List<Musikant> quartett;

	public Quartett() {
		this.quartett = new ArrayList<>();
	}

	public void addMusikant(Musikant m) {
		if (quartett != null) {
			quartett.add(m);
		}
	}

	public List<Musikant> getQuartett() {
		return quartett;
	}

	public void setQuartett(List<Musikant> quartett) {
		this.quartett = quartett;
	}

	public boolean istQuartett() {
		if (quartett.size() == 4) {
			return true;
		}
		return false;
	}

	public int gemeinsameRaeuberVerscheucht() {
		int sum = 0;
		if (quartett != null) {
			for (Musikant m : quartett) {
				sum += m.verscheucheRaeuber();
			}
		}
		return sum;
	}

	public double durchschnittlicheLautstaerke() {
		int sum = 0;
		if (quartett != null) {
			for (Musikant m : quartett) {
				sum += m.spieleMusik();
			}
		}
		return sum / (double) quartett.size();
	}

	public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis) {
		ArrayList<Musikant> lautstaerkeBereich = new ArrayList<>();

		if (quartett != null) {
			for (Musikant m : quartett) {
				if (m.spieleMusik() > von && m.spieleMusik() < bis) {
					lautstaerkeBereich.add(m);
				}
			}
		}
		return lautstaerkeBereich;
	}

	public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl() {
		HashMap<Integer, Integer> anzahlDerMusikantenMitBeinAnzahl = new HashMap<>();

		if (quartett != null) {
			for (Musikant m : quartett) {
				if (anzahlDerMusikantenMitBeinAnzahl.containsKey(m.anzahlBeine)){
					anzahlDerMusikantenMitBeinAnzahl.put(m.anzahlBeine,anzahlDerMusikantenMitBeinAnzahl.get(m.anzahlBeine)+1);
				}else{
					anzahlDerMusikantenMitBeinAnzahl.put(m.getAnzahlBeine(),1);
				}
			}
		}
		Set<Integer> keyset= anzahlDerMusikantenMitBeinAnzahl.keySet();
		for (Integer s:keyset){
			System.out.println(anzahlDerMusikantenMitBeinAnzahl.get(s)+" Tier/e hat/haben "+s+" Bein/e");
		}
		return anzahlDerMusikantenMitBeinAnzahl;
	}

	public void printLautstaerkeAbsteigend() {
		LautstaerkenComparator lautstaerkenComparator = new LautstaerkenComparator();
		Collections.sort(quartett, lautstaerkenComparator);
		for (Musikant m : quartett) {
			System.out.println(m.toString());
		}
	}
}
package Alte_Pruefungen.Moodle_MusikantenLoesung____PR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Quartett {
	private ArrayList<Musikant> musikanten;
	public Quartett() {
		musikanten = new ArrayList<Musikant>();
	}
	public void add(Musikant m) {
		musikanten.add(m);
	}
	public boolean istQuartett()
	{
		if(musikanten.size() == 4)
		{
			return true;
		}
		return false;
	}
	
	public int gemeinsamRaeuberVerscheucht()
	{
		int erg = 0;
		Iterator<Musikant> it = musikanten.iterator();
		
		while(it.hasNext())
		{
			erg += it.next().verscheucheRaeuber();
		}
		return erg;
	}
	public double durchschnittlicheLautstaerke()
	{
		double erg = 0;
		for(Musikant m : musikanten)
		{
			erg += m.spieleMusik();
		}
		return erg / musikanten.size();
	}
	
	public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis)
	{ 
		ArrayList<Musikant> erg = new ArrayList<Musikant>();
		
		for(Musikant m : musikanten)
		{
			double laut = m.spieleMusik();
			if(laut > von && laut < bis)
			{
				erg.add(m);
			}
		}
		
		return erg;
	}
	public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl()
	{
		HashMap<Integer, Integer> erg = new HashMap<Integer, Integer>();
		
		for(Musikant m : musikanten)
		{
			int beine = m.getAnzahlBeine();
			
			if(erg.containsKey(beine))
			{
				erg.put(beine, erg.get(beine) + 1);
			}
			else
			{
				erg.put(beine, 1);
			}
		}

		return erg;
	}
	public void printLautStaerkeAbsteigend()
	{
		Collections.sort(musikanten, new LautstaerkeComparator());
		System.out.println(musikanten);
	}
}

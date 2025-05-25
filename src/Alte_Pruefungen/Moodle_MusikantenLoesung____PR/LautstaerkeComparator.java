package Alte_Pruefungen.Moodle_MusikantenLoesung____PR;

import java.util.Comparator;

public class LautstaerkeComparator implements Comparator<Musikant> {
@Override
public int compare(Musikant o1, Musikant o2) {
	return Double.compare(o2.spieleMusik(), o1.spieleMusik());
}
}

package Alte_Pruefungen.Moodle_MusikantenLoesung____PR;

public class Hund extends Musikant {
	protected double bellLautstaerke;
	public Hund(int aB, Instrument i , double bellLautstaerke) {
		super(aB, i);
		this.bellLautstaerke = bellLautstaerke;
	}
	public double getBellLautstaerke() {
		return bellLautstaerke;
	}
	@Override
	public double spieleMusik() {
		return (instrument.getLautstaerke() + bellLautstaerke) / 2;
	}@Override
	public int verscheucheRaeuber() {
		if(bellLautstaerke > instrument.getLautstaerke())
		{
			return (int)bellLautstaerke;
		}
		return (int)instrument.getLautstaerke();
	}
	@Override
	public String toString() {
		return "Hund " + bellLautstaerke + ":" +  super.toString();
	}
}

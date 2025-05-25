package Alte_Pruefungen.Moodle_MusikantenLoesung____PR;

public class Instrument {
	private String name;
	private double lautstaerke;
	public Instrument(String name, double lautstaerke) {
		this.name = name;
		this.lautstaerke = lautstaerke;
	}
	
	public double getLautstaerke() {
		return lautstaerke;
	}
	public String getName() {
		return name;
	}
	public void setLautstaerke(double lautstaerke) {
		this.lautstaerke = lautstaerke;
	}
	public void setName(String name) {
		this.name = name;
	}
}

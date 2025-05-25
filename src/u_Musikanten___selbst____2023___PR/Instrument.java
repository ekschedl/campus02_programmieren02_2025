package u_Musikanten___selbst____2023___PR;

public class Instrument {
	private String name;
	private double lautstaerke;

	public Instrument(String name, double lautstaerke) {
		this.name = name;
		this.lautstaerke = lautstaerke;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLautstaerke() {
		return lautstaerke;
	}

	public void setLautstaerke(double lautstaerke) {
		this.lautstaerke = lautstaerke;
	}
}

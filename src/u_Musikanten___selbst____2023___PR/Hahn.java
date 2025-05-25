package u_Musikanten___selbst____2023___PR;

public class Hahn extends Musikant {
	protected int flugWeite;

	public Hahn(int anzahlBeine, Instrument instrument, int flugWeite) {
		super(anzahlBeine, instrument);
		this.flugWeite = flugWeite;
	}

	public int getFlugWeite() {
		return flugWeite;
	}

	@Override
	public String toString() {
		return " " + getClass().getSimpleName()+" " + getFlugWeite() + ": " + super.toString();
	}

	@Override
	public int verscheucheRaeuber() {
		if (flugWeite < 2) {
			return (int) Math.floor(instrument.getLautstaerke());
		} else if (flugWeite < 6) {
			return (int) Math.floor(8 - flugWeite);
		} else {
			return 1;
		}
	}

	@Override
	public double spieleMusik() {
		return (instrument.getLautstaerke()+2)/flugWeite;
	}
}

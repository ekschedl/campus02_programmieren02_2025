package u_Musikanten___selbst____2023___PR;

public class Hund extends Musikant{
	protected double bellLautstaerke;

	public Hund(int anzahlBeine, Instrument instrument, double bellLautstaerke) {
		super(anzahlBeine, instrument);
		this.bellLautstaerke = bellLautstaerke;
	}

	public double getBellLautstaerke() {
		return bellLautstaerke;
	}

	@Override
	public String toString() {
		return " " + getClass().getSimpleName()+" " + getBellLautstaerke() + ": " + super.toString();
	}

	@Override
	public int verscheucheRaeuber() {
		if (bellLautstaerke > instrument.getLautstaerke()) {
			return (int) Math.floor(bellLautstaerke);
		}
		return (int) Math.floor(instrument.getLautstaerke());
	}
	@Override
	public double spieleMusik() {
		return (bellLautstaerke+instrument.getLautstaerke())/2;
	}
}

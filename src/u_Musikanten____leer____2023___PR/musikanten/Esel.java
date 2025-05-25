package u_Musikanten____leer____2023___PR.musikanten;

public class Esel extends Musikant {
	protected double trittkraft;

	public Esel(int anzahlBeine, Instrument instrument, double trittkraft) {
		super(anzahlBeine, instrument);
		this.trittkraft = trittkraft;
	}

	public double getTrittkraft() {
		return trittkraft;
	}

	public void setTrittkraft(double trittkraft) {
		this.trittkraft = trittkraft;
	}

	@Override
	public int verscheucheRaeuber() {
		return (int) Math.floor(trittkraft * super.anzahlBeine);
	}

	@Override
	public double spieleMusik() {
		return instrument.getLautstaerke();
	}

	@Override
	public String toString() {
		return " " + getClass().getSimpleName() + " " + getTrittkraft() + ": " + super.toString();

	}

}
package u_Musikanten___selbst____2023___PR;

public class Katze extends Musikant {
	protected double kratzKraft;

	public Katze(int anzahlBeine, Instrument instrument, double kratzKraft) {
		super(anzahlBeine, instrument);
		this.kratzKraft = kratzKraft;
	}

	public double getKratzKraft() {
		return kratzKraft;
	}

	@Override
	public String toString() {
		return " "+getClass().getSimpleName()+" "+ getKratzKraft()+": "+super.toString();
	}

	@Override
	public int verscheucheRaeuber() {
		if (anzahlBeine==3){
			return (int) Math.floor(kratzKraft/2);
		} else if (anzahlBeine<=2) {
			return 1;
		}
		return (int) Math.floor(kratzKraft);
	}

	@Override
	public double spieleMusik() {
		return instrument.getLautstaerke();
	}
}

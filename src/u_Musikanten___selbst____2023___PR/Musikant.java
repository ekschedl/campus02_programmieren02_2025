package u_Musikanten___selbst____2023___PR;

public abstract class Musikant {
    protected int anzahlBeine;
    protected Instrument instrument;


    public Musikant(int anzahlBeine, Instrument instrument) {
        this.anzahlBeine = anzahlBeine;
        this.instrument = instrument;
    }

    public abstract int verscheucheRaeuber();
    public abstract double spieleMusik();


    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public String toString() {
        return "verscheucht: "+verscheucheRaeuber()+
                ", Musiziert: "+spieleMusik();
    }
}









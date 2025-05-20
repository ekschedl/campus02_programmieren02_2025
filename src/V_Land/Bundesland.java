package V_Land;

// Erbt von der Klasse Land
public class Bundesland extends Land{

    // Konstruktor übergibt Wert an Land
    public Bundesland(double bruttoSozialProdukt) {
        super(bruttoSozialProdukt);
    }

    // Gibt das BruttoSozialProdukt zurück (überschriebene Methode)
    @Override
    public double getBruttoSozialProdukt() {
        return super.getBruttoSozialProdukt(); //weil  private  bruttoSozialProdukt
    }
}
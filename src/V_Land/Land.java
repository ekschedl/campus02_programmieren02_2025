package V_Land;

public class Land {
    private double bruttoSozialProdukt;

    public Land(double bruttoSozialProdukt) {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
    }

    public Land() {
        // leerer Konstruktor für Fälle wie Bundesstaat
    }

    public double getBruttoSozialProdukt() {
        return bruttoSozialProdukt;
    }

    public void setBruttoSozialProdukt(double bruttoSozialProdukt) {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
    }
}

package V_Konto;
public class GiroKonto extends Konto {
    protected double limit=1000;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public double einzahlen(double wert) {
        super.einzahlen(wert);
        return wert;
    }

    @Override
    public double auszahlen(double wert) {
        if (wert <= 0) {
            System.out.println("Betrag muss positiv sein.");
            return 0;
        }

        // Prüfen, ob das Konto nach Auszahlung nicht unter -limit rutscht
        if ((kontostand - wert) < -limit) {
            System.out.println("Keine Auszahlung möglich. Dispolimit überschritten.");
            return 0;
        }

        kontostand -= wert;
        System.out.println("Es wurden " + wert + " Euro ausgezahlt.");
        return wert;
    }
}

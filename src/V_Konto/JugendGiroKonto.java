package V_Konto;
public class JugendGiroKonto extends GiroKonto {
    protected double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public double einzahlen(double wert) {
        return super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if (wert <= 0) {
            System.out.println("Betrag muss positiv sein.");
            return 0;
        }
        if (wert > buchungslimit) {
            System.out.println("Buchungslimit überschritten");
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


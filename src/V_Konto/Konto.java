package V_Konto;
public class Konto {
    protected String inhaber;
    protected double kontostand;

    // Konstruktor: Setzt den Kontoinhaber und initialisiert den Kontostand auf 0
    public Konto(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "inhaber='" + inhaber + '\'' +
                ", kontostand=" + kontostand +
                '}';
    }

    // Einzahlung auf das Konto
    public double einzahlen(double wert) {
        if (wert > 0) {
            kontostand += wert;
            System.out.println("Es wurden " + wert + " Euro eingezahlt.");
        } else {
            System.out.println("Einzahlungsbetrag muss positiv sein.");
        }
        return wert;
    }

    public double auszahlen(double wert) {
        if (wert <= 0) {
            System.out.println("Betrag muss positiv sein");
            return 0;
        }
        if (kontostand >= wert) {
            kontostand -= wert;
            System.out.println("Es wurden " + wert + " Euro ausgezahlt.");
            return wert;
        } else {
            System.out.println("Nicht genug Geld.");
            return 0;
        }


    }

}




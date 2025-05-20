package V_Konto;

public class Demoanwendung {
    public static void main(String[] args) {


        GiroKonto giroKonto = new GiroKonto("Schedlberger_giro", 100);
//         JugendGiroKonto jugendGiroKonto= new JugendGiroKonto("Schedlberger Kind_jugendGiroKonto", 1000);
        giroKonto.einzahlen(100);
        System.out.println("Kontostand: "+ giroKonto.kontostand);
        giroKonto.auszahlen(100);
        giroKonto.auszahlen(100);
        System.out.println("Kontostand: "+ giroKonto.kontostand);

        giroKonto.auszahlen(1000);
        System.out.println("Kontostand: "+ giroKonto.kontostand);
        giroKonto.auszahlen(1000);
        giroKonto.auszahlen(1000);
        System.out.println("Kontostand: "+ giroKonto.kontostand);

    }
}

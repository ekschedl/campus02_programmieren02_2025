package V_Land;

public class Main {
    public static void main(String[] args) {
        // Erstelle fünf Bundesländer mit unterschiedlichen Bruttoinlandsprodukten (in Milliarden USD)
        Bundesland austria = new Bundesland(500);     // Österreich: ca. 500 Mrd. USD
        Bundesland italy = new Bundesland(2100);      // Italien: ca. 2.100 Mrd. USD
        Bundesland china = new Bundesland(17700);     // China: ca. 17.700 Mrd. USD
        Bundesland russia = new Bundesland(1500);     // Russland: ca. 1.500 Mrd. USD
        Bundesland brazil = new Bundesland(1800);     // Brasilien: ca. 1.800 Mrd. USD

        // Erstelle ein Objekt vom Typ Bundesstaat, das mehrere Länder enthalten kann
        Bundesstaat myBS = new Bundesstaat();

        // Füge alle oben definierten Länder zur Liste im Bundesstaat hinzu
        myBS.addLand(austria);
        myBS.addLand(italy);
        myBS.addLand(china);
        myBS.addLand(russia);
        myBS.addLand(brazil);

        // Berechne die Summe aller Bruttosozialprodukte der hinzugefügten Länder
        double allBIP = myBS.getBruttoSozialProdukt();

        // in er Konsole gibt das Gesamtergebnis aus
        System.out.println("Summe aller Bruttosozialprodukte der hinzugefügten Länder: " + allBIP);
    }
}

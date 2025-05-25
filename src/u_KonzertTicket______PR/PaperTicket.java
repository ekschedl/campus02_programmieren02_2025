package u_KonzertTicket______PR;

// PaperTicket implementiert das Interface → alle Methoden müssen da sein
public class PaperTicket implements NFCTicket {

    // Attribute für Besitzer, Preis, ob Rabatt, ob Gewinner, Sicherheits
    protected String owner;
    protected double price;
    protected double discount;
    protected boolean winner;
    protected String ticketFraudSystem; // generiert über Hilfsklasse TicketFraudSystem

    // Konstruktor: alle Daten kommen beim Erzeugen rein
    public PaperTicket(String owner, double price, double discount, boolean winner) {
        this.owner = owner;
        this.price = price;
        this.discount = discount;
        this.winner = winner;
        this.ticketFraudSystem = TicketFraudSystem.createNewTicket("paper");
    }

    // Besitzer zurückgeben
    public String getTicketOwner() {
        return owner;
    }

    // Ticketbeschreibung zurückgeben
    @Override
    public String getTicket() {
        return "Papierticket für " + owner + " – Preis: " + price + " €" + " – Rabatt: " + discount + "%" + " – Gewinner: " + (winner ? "Ja" : "Nein") + /*Wenn winner true ist → nimm “Ja”,
sonst (also wenn winner false ist) → nimm “Nein”.*/
                " – Kategorie: " + getCategory();
    }

    // Gewinn  berechnen
    @Override
    public double getProfit() {
        // 20€ Kosten abziehen, dann Rabatt berechnen //20 euro  eine feste Ausgabe, die der Veranstalter pro verkauftem Papier-Ticket hat (z.b. Material, Druck, Versand)????
        return (price - 20) - ((price * discount) / 100);
    }

    // Kategorie berechnen (1 = teuer + Gewinner, 2 = teuer oder Gewinner, 3 = sonst)
    @Override
    public int getCategory() {

        if (price >= 80.00) {
            if (winner) {
                return 1;
            } else {
                return 2;
            }
        } else if (winner) {
            return 2;
        } else {
            return 3;
        }
    }

    // Geheimcode ausgeben (Ticket-Fraud-Prüfung)
    @Override
    public String getSecret() {
        return ticketFraudSystem;
    }
}
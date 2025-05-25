package u_KonzertTicket______PR;

// Die Klasse AppTicket implementiert das Interface NFCTicket → muss also alle Methoden daraus umsetzen
public class AppTicket implements NFCTicket {
    protected String owner; // Eigentümer des Tickets
    protected double price;   // Preis des Tickets
    protected String system; // Betriebssystem des Geräts
    protected String ticketFraudSystem;// Betrugsschutz-Code, der vom TicketFraudSystem generiert wird

    // Konstruktor: initialisiert ein App-Ticket
    public AppTicket(String owner, double price, String system) {
        this.owner = owner;
        this.price = price;
        this.system = system;
        // Erstellt automatisch ein neues "geheimes" Ticket über das TicketFraudSystem
        this.ticketFraudSystem = TicketFraudSystem.createNewTicket("app");

    }

    // Gibt den Eigentümer zurück
    public String getTicketOwner() {
        return owner;
    }

    @Override
    public String getTicket() {
        return "Ticket für " + owner +
                " – " + price + "€" +
                " – System: " + system +
                " – Kategorie: " + getCategory();
    }

    // Berechnet den Gewinn je nach System
    @Override
    public double getProfit() {
        if (system.equalsIgnoreCase("ios")) { //für Apple
            return (price * .70);
        } else if (system.equalsIgnoreCase("android")) { //Android
            return price * .75;
        }
        return price * .8; // Standard-Fall
    }

    // Klassifiziert das Ticket je nach Preis:
    // über 100€ → Kategorie 1, zwischen 51–100€ → Kategorie 2, sonst Kategorie 3
    @Override
    public int getCategory() {
        if (price > 100) {
            return 1;
        } else if (price > 50 && price <= 100) {
            return 2;
        }
        return 3;
    }

    // Geheimcode ausgeben (Ticket-Fraud-Prüfung)
    @Override
    public String getSecret() {
        return ticketFraudSystem;
    }
}

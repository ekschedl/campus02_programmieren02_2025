package u_KonzertTicket______PR;


public class MoonBoot implements NFCTicket{
    protected String owner;
    protected boolean color;
    protected String ticketFraudSystem;

    // Konstruktor
    public MoonBoot(String owner, boolean color) {
        this.owner = owner;
        this.color = color;
        this.ticketFraudSystem= TicketFraudSystem.createNewTicket("moonboot");
    }

    // Gibt den Namen des Ticket-Besitzers zurück
    public String getTicketOwner() {
        return owner;
    }

    @Override
    public String getTicket() {
        return "MoonBoot-Ticket für " + owner + "color: " +color ;
    }

    // Gibt den Gewinn zurück: color = mehr Gewinn (250), sonst 200
    @Override
    public double getProfit() {
        if(color){
            return 250;
        }
        return 200;
    }

    // Gibt die Kategorie zurück: color = Kategorie 1, sonst 2
    @Override
    public int getCategory() {
        if (color){
            return 1;
        }
        return 2;
    }

    // Gibt das geheime Ticket-Sicherheitsmerkmal zurück
    @Override
    public String getSecret() {
        return ticketFraudSystem;
    }
}

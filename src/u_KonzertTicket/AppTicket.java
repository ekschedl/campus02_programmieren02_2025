package u_KonzertTicket;


public class AppTicket implements NFCTicket{
    protected String owner;
    protected double price;
    protected String system;
    protected String ticketFraudSystem;

    public AppTicket(String owner, double price, String system) {
        this.owner = owner;
        this.price = price;
        this.system = system;
        this.ticketFraudSystem=TicketFraudSystem.createNewTicket("app");

    }

    public String getTicketOwner() {
        return owner;
    }

    @Override
    public String getTicket() {
        return null;
    }

    @Override
    public double getProfit() {
        if (system.equalsIgnoreCase("ios")){
            return (price*.70);
        } else if (system.equalsIgnoreCase("android")) {
            return price*.75;
        }
        return price*.8;
    }

    @Override
    public int getCategory() {
        if (price>100){
            return 1;
        } else if (price>50&&price<=100) {
            return 2;
        }
        return 3;
    }

    @Override
    public String getSecret() {
        return ticketFraudSystem;
    }
}

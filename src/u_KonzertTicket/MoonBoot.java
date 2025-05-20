package u_KonzertTicket;


public class MoonBoot implements NFCTicket{
    protected String owner;
    protected boolean color;
    protected String ticketFraudSystem;

    public MoonBoot(String owner, boolean color) {
        this.owner = owner;
        this.color = color;
        this.ticketFraudSystem= TicketFraudSystem.createNewTicket("moonboot");
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
        if(color){
            return 250;
        }
        return 200;
    }

    @Override
    public int getCategory() {
        if (color){
            return 1;
        }
        return 2;
    }

    @Override
    public String getSecret() {
        return ticketFraudSystem;
    }
}

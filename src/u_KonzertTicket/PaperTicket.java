package u_KonzertTicket;

public class PaperTicket implements NFCTicket {

    protected String owner;
    protected double price;
    protected double discount;
    protected boolean winner;
    protected String ticketFraudSystem;


    public PaperTicket(String owner, double price, double discount, boolean winner) {
        this.owner = owner;
        this.price = price;
        this.discount = discount;
        this.winner = winner;
        this.ticketFraudSystem = TicketFraudSystem.createNewTicket("paper");
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
        return (price - 20) - ((price * discount) / 100);
    }

    @Override
    public int getCategory() {

        if (price >= 80.00) {
            if (winner) {
                return 1;
            } else {
                return 2;
            }
        }else
        if (winner) {
            return 2;
        }else {
            return 3;
        }
    }

    @Override
    public String getSecret() {
        return ticketFraudSystem;
    }
}
package Alte_Pruefungen.Moodle_Concert_Loesung____PR;

public class PaperTicket implements NFCTicket {

    protected String owner;
    protected double discount;
    protected String secret;
    protected double price;
    protected boolean winner;
    public PaperTicket(String owner, double price, double discount, boolean winner)
    {
        this.owner = owner;
        secret = TicketFraudSystem.createNewTicket("paper");
        this.price = price;
        this.winner = winner;
        this.discount = discount;
    }

    @Override
    public String getSecret() {
        return secret;
    }

    @Override
    public int getCategory() {
        int cat;
        if(price >= 80){
            cat = 2;
        }else
        {
            cat = 3;
        }
        if(winner)
        {
            --cat;
        }
        return cat;
    }

    @Override
    public String getTicketOwner() {
        return owner;
    }

    @Override
    public double getProfit() {
        return (price - 20) * (100.0 - discount)/100;
    }

}

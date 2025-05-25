package Alte_Pruefungen.Moodle_Concert_Loesung____PR;

public class AppTicket implements NFCTicket {

    protected String owner;
    protected String secret;
    protected double price;
    protected String system;
    public AppTicket(String owner, double price, String system)
    {
        this.owner = owner;
        secret = TicketFraudSystem.createNewTicket("app");
        this.price = price;
        this.system = system;
    }

    @Override
    public String getSecret() {
        return secret;
    }

    @Override
    public int getCategory() {
        if(price >= 100)
        {
            return 1;
        }
        if(price >= 50)
        {
            return 2;
        }
        return 3;
    }

    @Override
    public double getProfit() {
        if(system.equals("ios"))
        {
            return price * 0.7;
        }
        if(system.equals("android"))
        {
            return price * 0.75;
        }
        else
        {
            return price * 0.8;
        }
    }

    @Override
    public String getTicketOwner() {
        return owner;
    }
}

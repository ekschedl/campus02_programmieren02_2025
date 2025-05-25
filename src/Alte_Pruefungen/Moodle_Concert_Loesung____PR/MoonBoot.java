package Alte_Pruefungen.Moodle_Concert_Loesung____PR;

public class MoonBoot implements NFCTicket {

    protected String owner;
    protected String secret;

    private boolean color;
    public MoonBoot(String owner, boolean color)
    {
        this.owner = owner;
        this.color = color;
        secret = TicketFraudSystem.createNewTicket("moonboot");
    }

    @Override
    public String getSecret() {
        return secret;
    }

    @Override
    public int getCategory() {
        if(color)
        {
            return 1;
        }else{
            return 2;
        }
    }

    @Override
    public String getTicketOwner() {
        return owner;
    }

    @Override
    public double getProfit() {

        if(color)
        {
            return 250;
        }else{
            return 200;
        }
    }
}

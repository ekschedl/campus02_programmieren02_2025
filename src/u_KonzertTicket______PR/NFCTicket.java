package u_KonzertTicket______PR;

// Interface ist  Schablone,
// die beschreibt, welche Methoden eine Klasse haben muss,
// wenn sie „ein NFCTicket“ sein möchte -> jede Klasse, die NFCTicket implementiert, muss alle diese Methoden definieren.
public interface NFCTicket {

    public String getTicket();

    public double getProfit();

    public int getCategory();

    public String getSecret();

    public String getTicketOwner();
}
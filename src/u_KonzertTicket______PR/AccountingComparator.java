package u_KonzertTicket______PR;

import java.util.Comparator;

// Comparator zum Vergleichen von zwei NFC-Tickets – zb. für Sortierung in einer Liste
public class AccountingComparator implements Comparator<NFCTicket> {
    @Override
    public int compare(NFCTicket o1, NFCTicket o2) {
        // Zuerst nach Kategorie sortieren
        int keyComparison = Integer.compare(o1.getCategory(), o2.getCategory());

        // Wenn die Kategorien unterschiedlich sind → danach sortieren
        if (keyComparison != 0) {
            return keyComparison;
        }
        // Wenn die Kategorien gleich sind → nach dem geheimen Code (Ticket-ID) sortieren
        return o1.getSecret().compareTo(o2.getSecret());
    }
}

/*noch ein  kann man machen:
public class MehrfachComparator implements Comparator<NFCTicket> {
    @Override
    public int compare(NFCTicket a, NFCTicket b) {
        // 1. Kategorie vergleichen
        int cmp = Integer.compare(a.getCategory(), b.getCategory());
        if (cmp != 0) return cmp;

        // 2. Gewinn vergleichen
        cmp = Double.compare(a.getProfit(), b.getProfit());
        if (cmp != 0) return cmp;

        // 3. Besitzername vergleichen
        return a.getTicketOwner().compareToIgnoreCase(b.getTicketOwner());
    }
}  in main dann:   tickets.sort(new MehrfachComparator());

* Was macht der Comparator genau?
	1.	Vergleicht zuerst getCategory():
	•	z.b. Ticket mit Kategorie 1 kommt vor Ticket mit Kategorie 2.
	2.	Wenn beide die gleiche Kategorie haben, dann schaut er auf getSecret():
	•	Das ist meist eine Zeichenkette – wird alphabetisch verglichen
	* wozu:
	* Wenn du zb. eine List<NFCTicket> hast, kannst du damit bequem sortieren:
	* Collections.sort(ticketListe, new AccountingComparator());
	* .
	* Wenn du einen Comparator hast:

Du brauchst Collections.sort(...) oder List.sort(...), um ihn anzuwenden.
Der Comparator ist nur das Vergleichsregelwerk – du musst ihn extra übergeben, wenn du sortieren willst.
	*List<NFCTicket> tickets = new ArrayList<>();
// ... Liste befüllen

Collections.sort(tickets, new AccountingComparator());  // Comparator wird HIER angewendet
	*Oder alternativ seit Java 8:
	* tickets.sort(new AccountingComparator()); // gleiche Wirkung, modernere Schreibweise
	* */
package Hotel;


import java.util.HashMap;

public class Guestbook {
    private HashMap<Guest, String> guestbookEntries;

    public Guestbook() {
        this.guestbookEntries = new HashMap<>();
    }

    public void addEntry(Guest guest, String content) {
        this.guestbookEntries.put(guest, content);
    }

    public void printGuestbook() {
        for (HashMap.Entry<Guest, String> entry: this.guestbookEntries.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue());
        }
    }
}

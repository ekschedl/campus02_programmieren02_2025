package Zug____E;

public class Zug {
    private String name;

    public Zug(String name) {
        this.name = name;
    }

    public void fahre(Wochentag tag) {
        if (tag.istWerktag()) {
            System.out.println(name + " fährt heute mit allen Zwischenhalten (Werktag).");
        } else {
            System.out.println(name + " fährt heute direkt durch (Wochenende).");
        }
    }
}

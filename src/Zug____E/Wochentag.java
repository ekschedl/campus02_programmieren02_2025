package Zug____E;

public enum Wochentag {
    MONTAG(true),
    DIENSTAG(true),
    MITTWOCH(true),
    DONNERSTAG(true),
    FREITAG(true),
    SAMSTAG(false),
    SONNTAG(false);

    private final boolean werktag;

    // Konstruktor
    Wochentag(boolean werktag) {
        this.werktag = werktag;
    }

    public boolean istWerktag() {
        return werktag;
    }
}
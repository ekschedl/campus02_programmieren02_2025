package Hotel____Array____HashMap;

public class KeyRack {
    // Ein Array, in dem alle Schlüssel gespeichert sind. Jeder Index steht für ein Zimmer.
    private Key[] keys;

    // Die Gesamtanzahl der Zimmer im Hotel
    private int numberOfRooms;

    // Konstruktor: erstellt ein neues KeyRack mit einer bestimmten Anzahl an Zimmern.
    public KeyRack(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        this.keys = new Key[numberOfRooms]; // Erzeugt ein Array mit genau so vielen Plätzen wie Zimmer
    }

    // Gibt das gesamte Schlüssel-Array zurück
    public Key[] getKeys() {
        return keys;
    }

    // Methode um einem Gast den passenden Schlüssel zu geben
    public void giveKeyToGuest(Guest guest) {
        // Holt den Schlüssel aus dem Rack anhand der Zimmernummer des Gastes
        Key key = keys[guest.getRoomNumber()];

        // Wenn ein Schlüssel vorhanden ist, gib ihn dem Gast
        if (key != null) {
            guest.setKey(key);              // Schlüssel dem Gast geben
            key.setWithGuest(true);         // Info: Der Schlüssel ist jetzt beim Gast
            keys[guest.getRoomNumber()] = null; // Im Rack ist der Schlüssel jetzt nicht mehr
        } else {
            // Falls kein Schlüssel da ist → Fehler ausgeben
            System.out.println("Police! Key is missing!");
        }
    }

    // Nimmt den Schlüssel vom Gast zurück und legt ihn ins Rack
    public void takeKeyBackFromGuest(Guest guest) {
        Key key = guest.getKey();           // Schlüssel vom Gast holen
        key.setWithGuest(false);            // Info: Schlüssel ist nicht mehr beim Gast
        keys[guest.getRoomNumber()] = key;  // Zurück ins Rack an die passende Stelle
        guest.setKey(null);                 // Gast hat jetzt keinen Schlüssel mehr
    }

    // Gibt alle Schlüssel im Rack auf der Konsole aus
    public void showKeyRack() {
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i]); // Zeigt auch "null", wenn kein Schlüssel da ist
        }

        // Alternative (kürzer): for-each-Schleife
        // for (Key key : keys) {
        //     System.out.println(key);
        // }
    }
}
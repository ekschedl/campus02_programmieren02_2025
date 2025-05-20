package Hotel;



public class KeyRack {
    private Key[] keys;
    private int numberOfRooms;

    public KeyRack(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        this.keys = new Key[numberOfRooms];
    }

    public Key[] getKeys() {
        return keys;
    }

    public void giveKeyToGuest(Guest guest) {
        Key key = keys[guest.getRoomNumber()];
        if (key != null) {
            guest.setKey(key);
            key.setWithGuest(true);
            keys[guest.getRoomNumber()] = null;
        } else {
            System.out.println("Police! Key is missing!");
        }
    }

    public void takeKeyBackFromGuest(Guest guest) {
        Key key = guest.getKey();
        key.setWithGuest(false);
        keys[guest.getRoomNumber()] = key;
        guest.setKey(null);
    }

    public void showKeyRack() {
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i]);
        }
// other option
//        for (Key key : keys) {
//            System.out.println(key);
//        }
    }
}
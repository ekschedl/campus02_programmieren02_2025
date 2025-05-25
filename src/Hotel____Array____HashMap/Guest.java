package Hotel____Array____HashMap;



public class Guest {
    private Key key;
    private int roomNumber;
    private String name;

    public Guest(Key key, int roomNumber, String name) {
        this.key = key;
        this.roomNumber = roomNumber;
        this.name = name;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

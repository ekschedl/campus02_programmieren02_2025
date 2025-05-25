package Hotel____Array____HashMap;



public class Key {
    private int roomNumber;
    private boolean isWithGuest;

    public Key(int roomNumber, boolean isWithGuest) {
        this.roomNumber = roomNumber;
        this.isWithGuest = isWithGuest;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isWithGuest() {
        return isWithGuest;
    }

    public void setWithGuest(boolean withGuest) {
        isWithGuest = withGuest;
    }

    @Override
    public String toString() {
        return "Key{" +
                "roomNumber=" + roomNumber +
                ", isWithGuest=" + isWithGuest +
                '}';
    }
}

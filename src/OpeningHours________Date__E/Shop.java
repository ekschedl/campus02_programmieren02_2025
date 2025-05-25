package OpeningHours________Date__E;

public class Shop {
    private final String name;
    private final OpeningHours openingHours;

    public String getName() {
        return name;
    }

    public OpeningHours getOpeningHours() {
        return openingHours;
    }

    public Shop(String name, OpeningHours openingHours) {
        this.name = name;
        this.openingHours = openingHours;
    }
}

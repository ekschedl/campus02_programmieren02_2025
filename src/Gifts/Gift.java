package Gifts;


public class Gift {
    private double price;
    private String label;
    private String description;

    public Gift(double price, String label) {
        this.price = price;
        this.label = label;
    }

    public Gift(double price, String label, String description) {
        this.price = price;
        this.label = label;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

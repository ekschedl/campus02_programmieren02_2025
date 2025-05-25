package u_Logistic_selbst__ArrLi____Interface;

public class Shirt implements Moveable {
    private String brand;
    private String color;
    private String size;

    public Shirt(String brand, String color, String size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    @Override
    public void move(String destination) {
        System.out.println("Shirt von " + brand + " (Größe " + size + ", Farbe " + color + ") wird geliefert nach " + destination);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

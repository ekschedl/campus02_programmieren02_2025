package u_Logistic_selbst__ArrLi____Interface;

public class Car implements  Moveable{
    private String type;
    private String color;
    private Double weight;

    public Car(String type, String color, Double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println("Auto vom Typ " + type + " (Farbe " + color + ", Gewicht " + weight + ") wird geliefert nach " + destination);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}

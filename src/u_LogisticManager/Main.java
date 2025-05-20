package u_LogisticManager;


public class Main {
    public static void main(String[] args) {
        LogisticManager hansi = new LogisticManager();
        Shirt s = new Shirt("HansiWear", "L", "snowwhite");
        hansi.add(s);
        hansi.add(new Car("Mercedes Puch G", "military green", 3000));

        hansi.moveAll("Schladming");

//        float radius = 7;
 //       double area = Math.pow(7, 2) * Math.PI;


    }
}

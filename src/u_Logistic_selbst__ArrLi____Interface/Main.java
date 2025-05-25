package u_Logistic_selbst__ArrLi____Interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("schön", "blue", 130.00);
        Car car2 = new Car("mini", "gelb", 50.00);
        Car car3 = new Car("big", "green", 9000.00);

        Shirt shirt = new Shirt("HM", "grau", "S");
        Shirt shirt1 = new Shirt("Marco Polo", "schwarz", "XL");
        Shirt shirt2 = new Shirt("HM", "pink", "L");
        Shirt shirt3 = new Shirt("Zalando Ess", "blau", "M");

        LogisticManager l=new LogisticManager();
        l.addToListe(car);
        l.addToListe(car2);
        l.addToListe(car2);
        l.addToListe(car3);
        l.addToListe(shirt);
        l.addToListe(shirt1);
        l.addToListe(shirt2);
        l.addToListe(shirt3);
        l.moveAll("Moskau");
        System.out.println("-------vor dem delete shirt1:--------");
        l.print();
        System.out.println("-------nach dem delete shirt1:--------");
        l.removeFromListe(shirt1);
        System.out.println("Nach dem delete shirt1");
       l.print(); // ✅ Jetzt wird die Liste ausgegeben!

    }
}

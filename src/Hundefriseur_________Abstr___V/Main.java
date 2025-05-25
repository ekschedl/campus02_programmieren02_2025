package Hundefriseur_________Abstr___V;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Hunderfriseur!");
        Pudel p1 = new Pudel();
        Beagle b1 = new Beagle();
        Hundefriseur h = new Hundefriseur();
        h.haareSchneiden(p1); // Pudel 15 -> 13 mm
        h.haareSchneiden(b1); // Beagle 3 -> 1 mm
        h.haareSchneiden(b1); // Beagle 1 -> 1 mm *beisst*

    }
}
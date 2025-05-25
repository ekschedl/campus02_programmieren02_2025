package Hundefriseur_________Abstr___V;

public class Hundefriseur {
    //Schneidet immer 2 mm weg
    public void haareSchneiden(Dog d){
        //ttest
        System.out.println("Haarlänge vor dem Schneiden: "
        + d.getHaarlaenge());
        d.setHaarlaenge(d.getHaarlaenge() - 2); //schneidet immer 2 mm weg
        System.out.println("Haarlänge nach dem Schneiden: "
                + d.getHaarlaenge());
    }
    public void haareSchneiden(Beagle b){
        //diese Funktion wird aufgerufen nur von Beagle weil sie
        // spezifischer ist als haareSchneidern(Dog d).
        System.out.println("ICH BIN DIE BEAGLE FUNKTION");
    }
}

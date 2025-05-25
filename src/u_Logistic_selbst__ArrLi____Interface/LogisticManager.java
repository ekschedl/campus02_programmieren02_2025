package u_Logistic_selbst__ArrLi____Interface;

import java.util.ArrayList;

public class LogisticManager {
    ArrayList<Moveable> meineListe;

    public LogisticManager() {
        this.meineListe = new ArrayList<>();
    }

    public void addToListe(Moveable m) {
        boolean vorhanden = false;

        for (int i = 0; i < meineListe.size(); i++) {
            if (meineListe.get(i).equals(m)) {
                vorhanden = true;
                System.out.println("------ So ein Objekt gibt es bereits in der Liste: " + m);
                break;
            }
        }

        if (!vorhanden) {
            meineListe.add(m);
            System.out.println("+ Objekt erfolgreich hinzugefügt: " + m);
        }
    }
    public void removeFromListe(Moveable m) {
        boolean entfernt = false;

        for (int i = 0; i < meineListe.size(); i++) {
            if (meineListe.get(i).equals(m)) {
                meineListe.remove(i);
                entfernt = true;
                System.out.println(m + " - Aus der Liste gelöscht");
                break;
            }
        }

        if (!entfernt) {
            System.out.println("-------Nicht in der Liste vorhanden – kann nicht gelöscht werden");
        }
    }
    public void moveAll(String destination){
        for (Moveable m : meineListe) {
            m.move(destination); // das ruft die move-Methode jedes Objekts auf

        }
    }

    public void print() {
        if (meineListe.isEmpty()) {
            System.out.println("Die Liste ist leer.");
        } else {
            System.out.println("Inhalt der Logistikliste:");
            for (Moveable m : meineListe) {
                System.out.println("- " + m);
            }
        }
    }


    @Override
    public String toString() {
        return "LogisticManager{" +
                "meineListe=" + meineListe +
                '}';
    }
}

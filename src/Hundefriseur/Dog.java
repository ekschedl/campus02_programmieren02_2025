package Hundefriseur;

public abstract class Dog extends Animal {
    private int Haarlaenge = 5; // in Millimeter (mm)

    public Dog(int haarlaenge) {
        Haarlaenge = haarlaenge;
    }

    public void setHaarlaenge(int haarlaenge) {
        if (haarlaenge < 0) {
            System.out.println("Hund beißt die Person die die Haarläne < 0 machen will.");
            return;
        }

        //an dieser Stelle im Code ist
        //sichergestellt dass die Haarläne > 0
        Haarlaenge = haarlaenge;

    }

    public int getHaarlaenge() {
        return Haarlaenge;
    }
}

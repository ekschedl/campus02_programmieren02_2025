package Fruestueck___E;

public class Main {
    public static void main(String[] args) {
        Frühstück f1 = new Frühstück(FrühstücksTyp.ENGLISCH);
        Frühstück f2 = new Frühstück(FrühstücksTyp.DEUTSCH);

        f1.beschreibeFrühstück(); // zeigt englisches Frühstück
        f2.beschreibeFrühstück(); // zeigt deutsches Frühstück
    }

}

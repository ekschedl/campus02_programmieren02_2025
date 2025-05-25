package Fruestueck___E;

public class Frühstück {
    private FrühstücksTyp typ;

    public Frühstück(FrühstücksTyp typ) {
        this.typ = typ;
    }

    public void beschreibeFrühstück() {
        switch (typ) {
            case ENGLISCH:
                System.out.println("Toast, Eier, Würstchen, Bohnen");
                break;
            case FRANZÖSISCH:
                System.out.println("Croissant, Marmelade, Café au lait");
                break;
            case DEUTSCH:
                System.out.println("Brötchen, Käse, Wurst, Kaffee");
                break;
        }
    }
}

package V_Zoo_selbstlernen;

public class ZooMain {
    public static void main(String[] args) {
        ZooDog dog = new ZooDog("BobbiDog");
        dog.moved();
        dog.makeSound();

        ZooFrog frog = new ZooFrog("Froxi");
        frog.moved();
        frog.makeSound();

        ZooCat cat = new ZooCat("Majauka");
        cat.moved();
        cat.makeSound();


        ZooManager zooManager = new ZooManager();
        zooManager.addToListe(dog);
        zooManager.addToListe(cat);
        zooManager.addToListe(frog);
        zooManager.deleteFromListe(dog);

        ZooPudel pudel = new ZooPudel("Zudel");
        zooManager.addToListe(pudel);
        zooManager.displayListe();

        zooManager.deleteFromListe(dog);
    }


}

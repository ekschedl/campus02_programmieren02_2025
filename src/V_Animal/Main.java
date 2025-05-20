package V_Animal;

public class Main {
    public static void main(String[] args) {
        // erstelle einen Frosch
        Frog quaxi = new Frog("green", 2);
        Animal quaxiAsAnimal = (Animal) quaxi;
        Frog quaxiAsFrog = (Frog) quaxiAsAnimal;

        // Nature-Instanz und Tiere hinzufügen
        Nature nature = new Nature();
        quaxi.walk();
        quaxiAsFrog.walk();

        nature.addAnimal(quaxi);  // Frosch wird hinzugefügt
        nature.displayAnimalsList();  // Alle Tiere anzeigen
        nature.countColor("green");  // Zählt die grünen Tiere

        //  erstelle Hund und hinzufügen
        Dog myDog = new Dog("white", 2, "Elsi");
        Animal myDogAsAnimal = myDog;
        nature.addAnimal(myDogAsAnimal);  // Hund wird hinzugefügt
        nature.countColor("white");  // Zählt die weißen Tiere
        myDog.walk();
        myDogAsAnimal.walk();


        Dog myDogAsDog = (Dog) myDogAsAnimal;
        myDogAsDog.walk();

        Animal myCat = new Cat("white", 2, "Mjauka");
        nature.addAnimal(myCat);
        nature.displayAnimalsList();

        Cat myCatAsCat=(Cat) myCat;
        nature.addAnimal(myCatAsCat);
        myCat.walk();
        myCatAsCat.walk();


    }
}
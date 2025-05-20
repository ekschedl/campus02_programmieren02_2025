package V_Animal;

import java.util.ArrayList;

public class Nature {


    private ArrayList<Animal> animals = new ArrayList<>();

    // Fügt ein Tier zur Liste hinzu und gibt Info aus
    public void addAnimal(Animal a) {
        animals.add(a);
        System.out.println("Added: " + a.getClass().getSimpleName() + " " + a);
    }

    public void displayAnimalsList() {
        // Tabellenkopf
        System.out.println("Type     | Color   | Eyes");
        // Durchlaufe alle Tiere und gebe ihre Informationen aus
        for (Animal animal : animals) {
            System.out.printf("%-7s   %-7s   %-3d\n",
                    animal.getClass().getSimpleName(),
                    animal.color,
                    animal.countEyes);
        }
    }


    public int countColor(String color) {
        int count = 0;
        for (Animal animal : animals) {
            if (animal.color.equalsIgnoreCase(color)) { // Vergleicht das color-Feld
                count += 1;
            }
        }
        System.out.println("Animals with color " + color + ": " + count);
        return count;
    }


}



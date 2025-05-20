package V_Zoo_selbstlernen;

import java.util.ArrayList;

public class ZooManager {

    private ArrayList<ZooAnimal> zooAnimals; // поле класса для списка животных

    public ZooManager() {
        zooAnimals = new ArrayList<>();
    }

    public void addToListe(ZooAnimal z) {
        for (ZooAnimal zooAnimal : zooAnimals) {
            if (zooAnimal.name.equalsIgnoreCase(z.name)) {
                System.out.println("We have already such animal: " + z.name);
                return; // Прерываем выполнение, если животное уже есть
            }
        }
        zooAnimals.add(z);
        System.out.println("Added: " + z.getClass().getSimpleName() + ", Name: " + z.name);
    }


    public void deleteFromListe(ZooAnimal z) {
        for (ZooAnimal zooAnimal : zooAnimals) {
            // Проверка по имени и типу (учитываем наследование)
            if (zooAnimal.name != null && zooAnimal.name.equalsIgnoreCase(z.name)) {
                System.out.println("Deleted: "
                        + z.getClass().getSimpleName() +
                        ", Name: " + z.name);
                zooAnimals.remove(zooAnimal);  // Удаляем животное из списка
                return;
            }
        }
        System.out.println("We have not such animal: "
                + z.getClass().getSimpleName());
    }




    public void displayListe() {
//     System.out.println("==== ZooAnimalListe: ====");
//         \u001B[34m — für Farbe blau,
//         \u001B[0m zurück zu StandardFarbe.
        System.out.println("\u001B[34m==== ZooAnimalListe: ====\u001B[0m");
        //%-15s — Zeile, links gerichtet,  lange 15 symbolen ; •	%-15.2f für zahl zb 1000.00
        System.out.printf("%-15s%-15s%n", "Class", "Name");
        for (ZooAnimal animal : zooAnimals) {
            if (animal != null) {
                System.out.printf("%-15s%-15s%n",
                        animal.getClass().getSimpleName(),
                        animal.name);
            }
        }

    }
}
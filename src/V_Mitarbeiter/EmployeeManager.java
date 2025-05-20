package V_Mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
    // Liste von Employee-Objekten
    protected ArrayList<Employee> employeers; // Nur als Instanz-Variable deklariert

    // Konstruktor, der die employeers-Liste initialisiert
    public EmployeeManager() {
        employeers = new ArrayList<>();
    }


    public void displayEmployees() {
        for (Employee OneEmpl : employeers) {
            System.out.println(OneEmpl);
        }
    }

    //Diese berechnet das gesamte Gehalt aller
    //MitarbeiterInnen (inklusive derer Provisionen).
//    public double calcTotalSalary(){
//        double sum=0;
//        for (Employee e : employeers) {
//
//        }
//
//    }

    //Diese nimmt einen neuen Employee in die Liste auf
    public void addEmployee(Employee oneEmpl) {
        employeers.add(oneEmpl);
        System.out.println(oneEmpl + "wurde hinzugefügt");
    }

    // konnte nicht allein machen, zu schwer GPT
    // Liefert das gesamte Gehalt
    //aller Mitarbeiter auf die einzelnen Abteilungen abgebildet.
    public HashMap<String, Double> getSalaryByDepartment() {
        HashMap<String, Double> salaryByDepartment = new HashMap<>();

        // Durchlaufe alle Mitarbeiter und addiere ihr Gehalt zur entsprechenden Abteilung
        for (Employee e : employeers) {
            // Wenn die Abteilung bereits existiert, addiere das Gehalt des Mitarbeiters hinzu
            salaryByDepartment.put
                    (e.department,
                            salaryByDepartment.getOrDefault(e.department, 0.0)
                                    + e.getFullSalary());
        }

        return salaryByDepartment;
//    }
//    public HashMap<String, Double> getSalaryByDepartment() {
//        HashMap<String, Double> salaryByDepartment = new HashMap<>();
//        for (Employee e : employeers) {
//          Double salaryFromHash=salaryByDepartment.get(e.department);
//        }
//
//        if(! salaryByDepartment.containsKey(e.department))
//    }


    }
}
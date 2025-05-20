package V_Mitarbeiter;

import java.util.HashMap;

public class App {


    public static void main(String[] args) {
        Employee employee1 = new Employee("schedlberger",
                "ekaterina",
                "first",
                3000);
        Employee employee2 = new Employee("bobiv",
                "max",
                "second",
                30000);

        FixCommissionEmployee fixCommissionEmployee1 = new FixCommissionEmployee(
                "zolov",
                "iron",
                "dritte",
                2000,
                300);
        FixCommissionEmployee fixCommissionEmployee2 = new FixCommissionEmployee(
                "morozob",
                "roman",
                "dritte",
                2000,
                300);

       PercentCommissionEmployee percentCommissionEmployee1 = new PercentCommissionEmployee(
                "warov",
                "michael",
                "vierte",
                2000, 20);


        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(employee1);
        employeeManager.addEmployee(employee2);
        employeeManager.addEmployee(fixCommissionEmployee1);
        employeeManager.addEmployee(fixCommissionEmployee2);

        System.out.println("BaseSalary von employee 1: " + employee1.getFullSalary());
        System.out.println("BaseSalary von employee 2: " + employee2.getFullSalary());
        System.out.println("BaseSalary von fixCommissionEmployee1: " + fixCommissionEmployee1.getFullSalary());

        employeeManager.addEmployee(percentCommissionEmployee1);
        System.out.println("BaseSalary von percentCommissionEmployee 1: " + percentCommissionEmployee1.getFullSalary());

        employeeManager.getSalaryByDepartment();
        System.out.println( employeeManager.getSalaryByDepartment());
        // Berechne das Gesamtgehalt pro Abteilung
        HashMap<String, Double> salaryByDepartment = employeeManager.getSalaryByDepartment();

        // Ausgabe der Gehälter nach Abteilung
        for (String department : salaryByDepartment.keySet()) {
            System.out.println("Abteilung: " + department + " | Gesamtgehalt: " + salaryByDepartment.get(department));
        }


    }
}

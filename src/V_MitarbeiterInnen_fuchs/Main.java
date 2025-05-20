package V_MitarbeiterInnen_fuchs;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e1 = new PercentCommissionEmployee("last1", "first", "IT"
                , 5, 10);
        Employee e2 = new PercentCommissionEmployee("last2", "first", "IT"
                , 3, 10);
        Employee e3 = new FixCommissionEmployee("last3", "first", "Sales"
                , 5, 30);
        EmployeeManager em = new EmployeeManager();
        em.addEmployee(e1);
        em.addEmployee(e2);
        em.addEmployee(e3);
        System.out.println("IT verdient: " + em.calcTotalSalaryByDepartment("IT"));
        System.out.println("Sales verdient: " + em.calcTotalSalaryByDepartment("Sales"));
        System.out.println("--- Salary by department ---");
        HashMap<String, Double> salariesByDept = em.getSalaryByDepartment();

        for (String dept : salariesByDept.keySet()) {
            System.out.println(dept + ": " + salariesByDept.get(dept));
        }
    }
}
package V_Mitarbeiter;

public class Employee {
    protected String lastName;
    protected String firstName;
    protected String department;
    protected double baseSalary;

    public Employee(String lastName, String firstName, String department, double baseSalary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    //berechnet Gehalt /ein Monat
    public double getFullSalary() {

        return baseSalary;
    }

    public String getDepartment() {
        return department;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
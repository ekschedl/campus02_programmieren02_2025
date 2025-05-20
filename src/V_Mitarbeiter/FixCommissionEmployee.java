package V_Mitarbeiter;

public class FixCommissionEmployee extends Employee {
    protected double additionalCommission = 0;

    public FixCommissionEmployee(String lastName,
                                 String firstName,
                                 String department,
                                 double baseSalary,
                                 double additionalCommission) {
        super(lastName, firstName, department, baseSalary);
        this.additionalCommission = additionalCommission;
    }

    @Override
    public double getFullSalary() {
        return baseSalary + additionalCommission;
    }

    @Override
    public String toString() {
        return "FixCommissionEmployee{" +
                "additionalCommission=" + additionalCommission +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", department='" + department + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}

package V_Mitarbeiter;

public class PercentCommissionEmployee extends Employee {

    protected double percentCommission;

    public PercentCommissionEmployee(String lastName,
                                     String firstName,
                                     String department,
                                     double baseSalary, double percentCommission) {
        super(lastName, firstName, department, baseSalary);
        this.percentCommission = percentCommission;  // Prozentsatz der Provision setzen

    }

    @Override
    public double getFullSalary() {
        return super.getFullSalary() + (super.getFullSalary() * percentCommission / 100);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

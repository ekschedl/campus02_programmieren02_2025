package V_MitarbeiterInnen_fuchs;


public class FixCommissionEmployee extends Employee{
    public double additionalCommission;

    public FixCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double additionalCommission) {
        super(lastname, firstname, department, baseSalary);
        this.additionalCommission = additionalCommission;
    }

    @Override
    public double getFullSalary() {
        //return baseSalary + additionalCommission;
        return super.getFullSalary() + additionalCommission;
    }
}


package V_MitarbeiterInnen_fuchs;

public class PercentCommissionEmployee extends Employee{
    public double percentCommission;

    public PercentCommissionEmployee(String lastname, String firstname, String department, double baseSalary, double percentCommission) {
        super(lastname, firstname, department, baseSalary);
        this.percentCommission = percentCommission;
    }
    @Override
    public double getFullSalary() {
        return super.getFullSalary() + super.getFullSalary()*percentCommission/100;
        // 100€ + 100€ * 10 / 100 (10% Commission)
        // = 110€
    }
}

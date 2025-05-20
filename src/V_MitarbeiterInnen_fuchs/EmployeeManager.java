package V_MitarbeiterInnen_fuchs;


import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager{
    protected ArrayList<Employee> empList;//= new ArrayList<>();

    public EmployeeManager() {
        empList = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        empList.add(e);
    }

    public double calcTotalSalary()
    {
        double salary=0;
        for (Employee e:empList)
        {
            salary += e.getFullSalary();
        }
        return salary;
    }
    public HashMap<String, Double> getSalaryByDepartment(){
        HashMap<String, Double> salaryByDepartment = new HashMap<>();
        for (Employee e:empList)
        {
            //Department schon in Hashmap?
            if(! salaryByDepartment.containsKey(e.department)) { // dieses department gibt es noch nicht -> hinzufügen
                salaryByDepartment.put(e.department, e.getFullSalary());
            }
            else // dieses Dep. gibt es schon -> FullSalary hinzufügen
            {
                Double currentValue = salaryByDepartment.get(e.department);
                salaryByDepartment.put(e.department, e.getFullSalary() + currentValue);
            }
        }

        return salaryByDepartment;
    }
    public double calcTotalSalaryByDepartment(String departIAmSearchingFor)
    {
        double salary=0.0d;
        for (Employee e:empList)
        {
            if(e.department.equalsIgnoreCase(departIAmSearchingFor))
                salary += e.getFullSalary();
        }
        return salary;
    }

}

package example1;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private List<String> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    // for cloning object
    /*
    Employees emp1 = new Employees();
    Employees clonedEmp = new Employees(emp1);
     */
    public Employees(Employees employees) {
        List<String> tempEmpleyees = new ArrayList<>(employees.getEmployees());
        this.employees = tempEmpleyees;
    }

    public void loadData(){
        //read all employees from database and put into the list
        employees.add("Pankaj");
        employees.add("Raj");
        employees.add("David");
        employees.add("Lisa");
    }

    public List<String> getEmployees() {
        return employees;
    }

}

package day45_DailyReviews;

import java.util.ArrayList;

public class WorkTeam {

    private ArrayList<Employee> employees= new ArrayList<>();


    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(String firstname, String lastname) {
        employees.removeIf(p->p.getFirstName().equalsIgnoreCase(firstname.toLowerCase())
                && p.getLastName().equalsIgnoreCase(lastname.toLowerCase()));
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


}

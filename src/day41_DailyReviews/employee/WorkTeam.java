package day41_DailyReviews.employee;

import java.util.ArrayList;

public class WorkTeam {

    public ArrayList<Employee> employees;
    public String theNameOfTeamLead;

    public WorkTeam(String theNameOfTeamLead) {
        employees = new ArrayList<>();
        this.theNameOfTeamLead = theNameOfTeamLead;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public String toString() {
        return "WorkTeam{" +
                ", theNameOfTeamLead='" + theNameOfTeamLead + '\'' +
                ", number of employees=" + employees.size() +
                '}';
    }
}


/*

Create a class WorkTeam
  instances:employees (ArrayList of Employee), theNameOfTeamLead
a constructor: sets theNameOfTeamLead

actions: addEmployee,removeEmployee

 */

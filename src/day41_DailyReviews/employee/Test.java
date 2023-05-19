package day41_DailyReviews.employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Employee employee1 = new Employee("fn", "ln1", 'M', 100_000);
        Employee employee2 = new Employee("fn2", "ln2", 'F', 110_000);
        Employee employee3 = new Employee("fn", "ln3", 'M', 90_000);
        Employee employee4 = new Employee("fn4", "ln4", 'F', 120_000);
        Employee employee5 = new Employee("fn5", "ln5", 'M', 80_000);

        WorkTeam workTeam = new WorkTeam("Burak");

        workTeam.addEmployee(employee1);
        workTeam.addEmployee(employee2);
        workTeam.addEmployee(employee3);
        workTeam.addEmployee(employee4);
        workTeam.addEmployee(employee5);


        System.out.println("average salary is = " + workTeam.employees.stream().mapToDouble(p->p.salary).average().getAsDouble());
        workTeam.employees.stream().filter(p -> p.salary < 100_000).forEach(p ->
                System.out.println("The employees whose salary is less than 100.000$ " + p.firstName + " " + p.lastName));

        for (Employee employee : workTeam.employees) {
            if (employee.gender == 'M') System.out.println(employee);
        }

        System.out.println(workTeam);

    }
}

/*

Create a class named Test with a main method
create an object of WorkTeam and add 5 employees in it
Print the average of salaries of the team
Print the employees whose salary is less than 100000
Print Male employees

 */
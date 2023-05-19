package day41_DailyReviews.employee;

public class Employee {

    public  String firstName, lastName;
    public char gender;
    public double salary;

    public Employee(String firstName, String lastName, char gender, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}

/*

Create a class named Employee
instances: firstName,lastName,gender,salary
a constructor: sets all fields
actions: toString

 */

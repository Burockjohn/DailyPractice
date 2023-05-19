package day45_DailyReviews;

public class Employee {

    private String firstName, lastName;
    private int age;
    private double salary;

    //------------Constructor---------------//

    public Employee(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    //---------------Getters----------------//

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    //--------------Setters-------------------//


    public void setFirstName(String firstName) {
        if (!firstName.matches("[a-zA-Z]+")) {
            System.err.println("Invalid firstname");
            System.exit(1);
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (!lastName.matches("[a-zA-Z]+")) {
            System.err.println("Invalid lastname");
            System.exit(1);
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new RuntimeException("Invalid age");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary <= 0) throw new RuntimeException("Invalid salary");
        this.salary = salary;
    }

    //--------------Methods---------------------//

    public void work() {
        System.out.println(firstName + " " + lastName + " is working");
    }


    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

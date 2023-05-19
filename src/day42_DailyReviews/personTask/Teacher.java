package day42_DailyReviews.personTask;

import day42_DailyReviews.personTask.Person;

public class Teacher extends Person {

    private String schoolName;
    private double salary;

    public Teacher(String firstName, String lastName, int age, char gender, String schoolName, double salary) {
        super(firstName, lastName, age, gender);
        this.schoolName = schoolName;
        this.salary = salary;
    }

    //-----------------------------------------------//


    public String getSchoolName() {
        return schoolName;
    }

    public double getSalary() {
        return salary;
    }

    //----------------------------------------------//


    public void setSchoolName(String schoolName) {
        for (char ch : schoolName.toCharArray()) {
            if (!Character.isAlphabetic(ch)) {
                System.err.println("Invalid name3");
                System.exit(1);
            }
            this.schoolName = schoolName;
        }
    }


    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Are you employing a slave instead of a teacher?");
            System.exit(1);
        }
        this.salary = salary;
    }

    //--------------------------------------------//


    public String toString() {
        return "Teacher{" +
                "schoolName='" + schoolName + '\'' +
                ", salary=" + salary +
                '}';
    }
}

/*

Create a subclass of Person named Teacher
private instance variables schoolName,className,salary
Constructor:sets all fields
Actions:getters and setters(check if schoolName or className are alphabetic,salary is bigger than 0),work

 */

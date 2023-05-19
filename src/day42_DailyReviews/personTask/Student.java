package day42_DailyReviews.personTask;

import day42_DailyReviews.personTask.Person;

public class Student extends Person {

    private String schoolName, className;
    private char grade;

    public Student(String firstName, String lastName, int age, char gender, String schoolName, char grade) {
        super(firstName, lastName, age, gender);
        setSchoolName(schoolName);
        setGrade(grade);
    }
//------------------Getters-------------------//


    public String getSchoolName() {
        return schoolName;
    }

    public String getClassName() {
        return className;
    }

    public char getGrade() {
        return grade;
    }

    //---------------Setters--------------------//


    public void setSchoolName(String schoolName) {
        for (char ch : schoolName.toCharArray()) {
            if (!Character.isAlphabetic(ch)) {
                System.err.println("Invalid name1");
                System.exit(1);
            }
            this.schoolName = schoolName;
        }
    }



    public void setGrade(char grade) {
        if (!(grade >= 'A' && grade <= 'F')) {
            System.err.println("Invalid grade");
        }
        this.grade = grade;
    }

    //------------Methods-------------------//

    public void study() {
        System.out.println(getFirstName() + " " + getLastName() + " studies hard");
    }

    public String toString() {
        return "Student{" +
                "schoolName='" + schoolName + '\'' +
                ", className='" + className + '\'' +
                ", grade=" + grade +
                '}';
    }
}

/*

Create a subclass of Person named Student
private instance variables; schoolName,className,gender,grade
Constructor: sets all fields
Actions: getters and setters(check if schoolName or className are alphabetic,gender is M or F,grade is from A,B,C,D,E,F), study

 */
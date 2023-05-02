package day37_DailiyReviews.student;

import java.util.ArrayList;

public class Student {

    public String firstName, lastName;
    public char gender;
    public int id;

    public Student(String firstName, String lastName, char gender, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.id = id;
    }

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }
}

/*

Create a class named Student
instances:firstName,lastName,id,gender
a constructor:sets all fields
actions:toString



 */

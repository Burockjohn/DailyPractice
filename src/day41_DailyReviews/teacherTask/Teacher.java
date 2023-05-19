package day41_DailyReviews.teacherTask;

import java.time.LocalDate;
import java.time.Period;

public class Teacher {

    private String firstName, lastName;
    private LocalDate dateOfBirth;
    private char gender;
    private int age, id;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    //-----------------------------------------------------\\


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge() {
        Period ageDifference = Period.between(dateOfBirth, LocalDate.now());
        this.age = ageDifference.getYears();
    }

    public void setId(int id) {
        this.id = id;
    }


    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

/*

     1. create a class named Teacher that has the followings features:
            Attributes:
                name,lastName, gender, dateOfBirth(use LocalDate), age, id

            Methods:

                sets all the attributes of the teacher object
                toString(): returns the full info of teacher Object

 */

package day42_DailyReviews.personTask;

public class Person {

    private String firstName, lastName;
    private int age;
    private char gender;

    public Person(String firstName, String lastName, int age, char gender) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setGender(gender);
    }

    //--------------------------------------//

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    //--------------------------------------//


    public void setFirstName(String firstName) {
        for (char ch : firstName.toCharArray()) {
            if (!Character.isAlphabetic(ch)) {
                System.err.println("Invalid name4");
                System.exit(1);
            }
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        for (char ch : firstName.toCharArray()) {
            if (!Character.isAlphabetic(ch)) {
                System.err.println("Invalid name5");
                System.exit(1);
            }
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("LGTB");
            System.exit(1);
        }
        this.gender = gender;
    }

    //----------------------------------------------//

    public void eat() {
        System.out.println(firstName + " " + lastName + " is eating");
    }

    public void speak() {
        System.out.println(firstName + " " + lastName + " is speaking");
    }

    public void sleep() {
        System.out.println(firstName + " " + lastName + " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

/*

Create a class named Person
private instance variables:firstName,lastName,age,gender
Constructors:sets all fields
Actions: getters and setters(check if firstName and lastName is alphabetic, gender is M or F),eat,speak,sleep

 */
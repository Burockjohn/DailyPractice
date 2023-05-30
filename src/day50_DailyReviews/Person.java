package day50_DailyReviews;

public class Person {

    private Integer id;

    private String firstName, lastName;

    public Person(Integer id, String firstName, String lastName) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id < 0) throw new RuntimeException("Invalid ID");
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty() || firstName.isBlank()) throw new RuntimeException("Invalid name");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty() || lastName.isBlank()) throw new RuntimeException("Invalid name");
        this.lastName = lastName;
    }

    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

/*

Create a class named Person with instance variables id,firstName,lastName and create a new class with a main method and create a map with Person object's id (key)  and Person objects(value). Add at least 5 person into map.

 */
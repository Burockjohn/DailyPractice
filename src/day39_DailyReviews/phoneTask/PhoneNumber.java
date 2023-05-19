package day39_DailyReviews.phoneTask;

public class PhoneNumber {

    public String firstName, lastName;
    public long PhoneNumber;

    public PhoneNumber(String firstName, String lastName, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        PhoneNumber = phoneNumber;
    }

    public String toString() {
        return "PhoneNumber{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}

/*

Create a class named PhoneNumber
Instance variables : firstName,lastName,phoneNumber
A constructor :sets all fields
Actions:toString


 */

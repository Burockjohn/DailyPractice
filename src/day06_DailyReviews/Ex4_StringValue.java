package day06_DailyReviews;

import java.util.Scanner;

public class Ex4_StringValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next().toUpperCase();

        System.out.println("Enter your lstname");
        String lastName = input.next().toUpperCase();

        String password ="" + firstName.charAt(0) + lastName.charAt(0) + "+1234";

        System.out.println(password);

        System.out.println("-".repeat(60)); // alternative solution

        System.out.println("Input first name :");
        String firstName1=input.next();

        System.out.println("Input last name :");
        String lastName1=input.next();

        String firstLetterOfFirstName=String.valueOf(firstName1.charAt(0)).toUpperCase();
        String firstLetterOfLastName=String.valueOf(lastName1.charAt(0)).toUpperCase();

        String password1=firstLetterOfFirstName+firstLetterOfLastName+"+1234";
        System.out.println("Password = " + password);



    }
}


/*

"Create a password using the first name and last name information obtained from the user as follows:
Concatenate the first letter of the name as a capital letter and the first letter of the last name as a capital letter,
then add the phrase '+1234' to the end.
Example Input: Ahmet Temel, Output: AT+1234"

 */
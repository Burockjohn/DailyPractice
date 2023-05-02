package day05_DailyReviews;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String name = input.nextLine().toLowerCase();

        String firstName = name.substring(0, name.indexOf(" "));
        firstName = ((""+firstName.charAt(0)).toUpperCase() + firstName.substring(1));

        String lastName = name.substring(name.lastIndexOf(" ") + 1);
        lastName = (""+lastName.charAt(0)).toUpperCase() + lastName.substring(1);

        System.out.println(firstName + " " + lastName);


    }
}

/*

//Make the first letter of each two  word in the text input entered by the user uppercase.

 */
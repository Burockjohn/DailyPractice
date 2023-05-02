package day10_DailyReviews;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your phone number without 0");

        String number = input.nextLine();

        String gsm = number.substring(0, 3),
                secondPart = number.substring(3, 6),
                thirdPart = number.substring(6, 8),
                fourthPart = number.substring(8);

        String phoneNumber = "(" + gsm + ") " + secondPart + " " + thirdPart + " " + fourthPart;

        System.out.println("phoneNumber = " + phoneNumber);


    }
}

/*

Take a ten-digit Phone number and print it like this:
(541) 340 54 92

 */
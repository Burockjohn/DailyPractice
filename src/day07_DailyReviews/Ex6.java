package day07_DailyReviews;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        int num = 248;

        if (num / 100 != (num / 10) % 10) {

            if ((num / 10) % 10 != num % 10) {

                System.out.println(" All digits are different");
            }
        } else {

            System.out.println("some of them are same");
        }

        // alternative

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = input.nextInt();

        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = (number / 100) % 10;

        if (digit1 != digit2 && digit1 != digit3 && digit2 != digit3) {
            System.out.println("All digits of " + number + " are different.");
        } else {
            System.out.println("Not all digits of " + number + " are different.");


        }
    }
}

/*

"Write a code that verifies that all digits of a three-digit number are different."

 */
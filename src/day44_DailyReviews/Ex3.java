package day44_DailyReviews;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");

        try {
            int num1 = input.nextInt();
       /* if (num1 <= 0) {
            throw new RuntimeException("The number can not be less than 1");
        }

        */
            System.out.println("Enter your second number");
            int num2 = input.nextInt();

            System.out.println("Division of the numbers is: " + (num1 / num2));
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

/*

Create a Java program that performs division of two numbers provided by the user. Use try-catch blocks to handle any
arithmetic exceptions that may occur.

 */

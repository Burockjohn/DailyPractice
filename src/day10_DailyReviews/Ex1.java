package day10_DailyReviews;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int result = 0;

        while (true) {

            System.out.println("Enter the first number");
            int num1 = input.nextInt();

            System.out.println("Enter the second number");
            int num2 = input.nextInt();

            result = num1 + num2;

            System.out.println("Sum of them is " + result);

            System.out.println("Do you want to continue with new numbers");
            String answer = input.next().toLowerCase();

            if (answer.equals("no")) {

                break;
            }
        }


    }
}

/*

 *Write a program that takes two numbers from the user and returns the sum of them and again asks the user
 for new two numbers to return sum of them  until user enters 112

 */
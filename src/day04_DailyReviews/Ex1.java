package day04_DailyReviews;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("Enter third number");
        int num3 = input.nextInt();

        System.out.println("Enter fourth number");
        int num4 = input.nextInt();

        double average = (num1 + num2 + num3 + num4)/4;

        System.out.println("average = " + average);



    }
}

/*

//Take 4 numbers from user, calculate their average, and print the result to the screen.

 */
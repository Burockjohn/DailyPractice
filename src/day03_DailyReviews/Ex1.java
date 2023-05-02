package day03_DailyReviews;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double n1 = input.nextDouble();

        System.out.println("Enter second number");
        double n2 = input.nextDouble();

        System.out.println("Enter third number");
        double n3 = input.nextDouble();

        input.close();

        double average = (n1+n2+n3)/3;
        System.out.println("average = " + average);

    }
}

/*

Take three numbers from the user and print their average to the screen.

 */
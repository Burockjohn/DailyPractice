package day03_DailyReviews;

import java.util.Scanner;

public class Ex7_Math {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int n1 = input.nextInt();

        System.out.println("Enter second number");
        int n2 = input.nextInt();

        int min = Math.min(n1,n2);

        int max = Math.max(n1,n2);

        for (int i = min; i <= max; i++) {

            if (i % 2 == 0) {

                System.out.println(i);

            }

        }
    }
}


/*

//Get start and end values from the user
//Print all even numbers in the range.

 */
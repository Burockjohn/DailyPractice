package day47_DailyReviews.unit_task;

import day47_DailyReviews.NegativeNumberException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(multi(3, 2));
        //System.out.println(multi(4, -6));

        System.out.println("---------------------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number other than negatives");
        int number = input.nextInt();
        if (number < 0) throw new NegativeNumberException("number can not be negative");

        System.out.println("-----------------------------------------------------");

        int arr [] = {1,2,3,4,-5};
        add(arr);

    }

    public static int multi(int a, int b) {
        if (a < 0 || b < 0) throw new NegativeNumberException("I can not accept other than positive numbers");
        return a*b;
    }

    public static int add(int numbers []) {
        int result = 0;

        for (int number : numbers) {
            if (number <= 0) throw new NegativeNumberException("Array con not have any negative number");
            result+= number;
        }

        return result;
    }
}

/*

Task: Create a custom exception (customized exception class) in Java. The custom exception should be thrown when working with negative numbers in a calculation.

Example Scenarios:

Write a calculation function that multiplies two positive numbers and returns the result. However, if any of the numbers is negative, the custom exception should be thrown.
Prompt the user to enter a number. If the number entered by the user is negative, throw the custom exception.
Write a function that sums all the numbers in an array. If a negative number is found in the array, throw the custom exception.
In each example scenario, the custom exception should be thrown when working with a negative number. This ensures that negative numbers are not included in the calculations or operations.

 */
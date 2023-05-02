package day07_DailyReviews;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number 1~1000");
        int number = input.nextInt();
        int numOfDigit = 0;

        if (number / 10 == 0) {
            numOfDigit = 1;
        } else if (number / 100 == 0) {
            numOfDigit = 2;
        } else if (number / 1000 == 0) {
            numOfDigit = 3;
        } else {
            numOfDigit = 4;
        }

        System.out.println("numOfDigit = " + numOfDigit);

        // alternative solution

        int counter = 0;
        while (number > 0) {
            counter++;
            number /= 10;
        }
        System.out.println("counter2 = " + counter);


    }

}

/*

Using an if statement, find the number of digits in a given number between 1 and 1000.

 */
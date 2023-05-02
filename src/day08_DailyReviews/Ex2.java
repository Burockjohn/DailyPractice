package day08_DailyReviews;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int greatest = -2147483648; // Integer.MIN_VALUE

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > greatest) {
                greatest = num;
            }
        }

        System.out.println("The greatest num is " + greatest);


    }
}

/*

Take 10 numbers from the user and find the largest of them.

 */
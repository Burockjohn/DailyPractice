package day05_DailyReviews;

import java.util.Scanner;

public class Ex4 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a four-digit number");
        int num = input.nextInt();

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;

        }

        System.out.println(sum);


    }
}

/*

//Find the sum of digits of a four-digit number entered.

 */
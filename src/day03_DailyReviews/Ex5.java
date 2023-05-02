package day03_DailyReviews;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt(),
                total = 0;

        for (int i = 0; i <= num; i++) {

            total += i;
        }
        System.out.println(total);

    }


}

/*

//Get a number from the user
//Print the sum of all numbers from 1 to the entered number on the screen

 */
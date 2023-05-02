package day08_DailyReviews;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {

            System.out.println("Enter a number except zero, to sum please enter zero");
            int num = input.nextInt();

            if (num == 0) {
                break;
            }
            sum += num;


        }
        System.out.println(sum);


    }


}

/*

 *Take numbers from the user until zero is entered. Find the sum of the all numbers.

 */
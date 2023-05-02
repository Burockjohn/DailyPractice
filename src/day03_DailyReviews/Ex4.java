package day03_DailyReviews;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1~12");
        int num = input.nextInt();
        int factorial = 1;

        while (num > 0) {
            factorial *= num;
            num--;

        }

        System.out.println("factorial = " + factorial);

    }
}

/*

//1) Get a number between 1 and 12 from the user
//2) Calculate the factorial of the number

 */
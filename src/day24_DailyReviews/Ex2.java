package day24_DailyReviews;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        System.out.println("\t for (int i = " + num1 + "; i <= " + num2 +"; i++) {\n\t\t System.out.println(i);\n\t}");


    }
}


/*

Write a program that demonstrates the use of the for loop with two numbers from the user
Example
input
20
250
output
         for (int i = 20; i <=250; i++) {
             System.out.println(i);
         }

 */

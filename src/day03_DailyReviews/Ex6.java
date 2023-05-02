package day03_DailyReviews;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int n1 = input.nextInt();

        System.out.println("Enter second number");
        int n2 = input.nextInt();

        System.out.println("Enter third number");
        int n3 = input.nextInt();

        input.close();

        String result;

        if (n1 > n2 && n1 > n3) {
            result = n1 + " is the largest";
        } else if (n2 > n1 && n2 > n3) {
            result = n2 + " is the largest";
        } else {
            result = n3 + " is the largest";
        }

        System.out.println(result);


        /*

         int largest=number1;

        if(largest<number2){
            largest=number2;
        }
        if(largest<number3){
            largest=number3;
        }
        System.out.println("largest = " + largest);
         */


    }


}

/*

Find the largest of three taken numbers from user.

 */
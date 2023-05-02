package day06_DailyReviews;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any three numbers");
        String num1 = input.next(),
                num2 = input.next(),
                num3 = input.next();

        if( !num1.equalsIgnoreCase(num2) && !num1.equalsIgnoreCase(num3) && !num2.equalsIgnoreCase(num3) ) {
            System.out.println("Verified");
        } else {
            System.out.println("Invalid");
        }




    }
}

/*

"Take 3 numbers from the user and if the numbers are different from each other, print 'Verified', otherwise print 'Invalid'."

 */
package day03_DailyReviews;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        String result = "";

        switch (age) {
            case 1: case 2: case 3:
                result = "baby";
                break;
            case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13:
                result = "child";
                break;
            case 14: case 15: case 16: case 17:
                result = "teenager";
                break;
            default:
                result= "adult";
        }

        System.out.println(result);

    }

}
/*

//"Get the user's age information.
//If the age is between 1-3, print "baby"
//If the age is between 4-13, print "child"
//If the age is between 14-18, print "teenager"
//If the age is 19 or older, print "adult"

 */
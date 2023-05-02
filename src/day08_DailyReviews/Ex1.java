package day08_DailyReviews;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");

        String str = input.nextLine(),
                upperCase = str.toUpperCase();

        if (str.equals(upperCase)) {

            System.out.println("Uppercase ");
        } else {
            System.out.println("Not uppercase");
        }


    }
}

/*

Check if the all characters of a given text is uppercase or not.

 */
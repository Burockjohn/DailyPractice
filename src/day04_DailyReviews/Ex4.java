package day04_DailyReviews;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter text");
        String text = input.next();

        System.out.println((text + "\n").repeat(text.length()));

    }

}
/*

//Ask the user for a text input. Print the text as many times as the number of characters in the text.

 */
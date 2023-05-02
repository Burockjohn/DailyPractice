package day05_DailyReviews;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        if (word.startsWith("a")) {

            System.out.println(word.substring(0, 2));
        } else {

            System.out.println(word.substring(word.length() - 2));

        }


    }
}

/*

//Take a text input from the user. If the text starts with "a", print the first two letters of the text;
otherwise, print the last two letters.

 */
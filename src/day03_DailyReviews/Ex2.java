package day03_DailyReviews;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your string");

        String text = input.nextLine();

        String text2 = text.replace("a", "o");
        text2 = text2.toLowerCase();

        System.out.println(text2);

    }
}

/*

//"1) Get a text from the user
//2) Replace all "a" characters in the text with "o"

//Convert all characters to lowercase
//Print the final result to the screen"

 */


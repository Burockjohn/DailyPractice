package day06_DailyReviews;

import java.util.Scanner;

public class Ex1_StringBuilder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        int num = word.length();
        String reverse = "";

        for (int i = num - 1; i >= 0; i--) {

            reverse += word.charAt(i);


        }
        System.out.println(reverse);

        System.out.println("-".repeat(60));

        //Second solution
        input.nextLine();
        System.out.println("Input a text");
        String text1=input.nextLine();

        StringBuilder sb=new StringBuilder(text1);
        System.out.println(sb.reverse());


    }
}

/*

Write a code that reverses any text input entered.

 */
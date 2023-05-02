package day06_DailyReviews;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a sentence with the word of gold");
        String sentence = input.nextLine();

        if (sentence.contains("gold")) {

            int n = sentence.indexOf("gold");

            sentence = sentence.substring(0, n) + "*" + sentence.substring(n);

        }

        System.out.println(sentence);

        /*

        //Second solution
        String text2="Hi, this is gold";
        text2=text2.replaceFirst("gold","*gold");
        System.out.println(text2);

         */


    }

}


/*

"Add the * character before the first the word of 'gold' in a given text."

 */
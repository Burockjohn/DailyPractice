package day10_DailyReviews;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String sentences = input.nextLine();

        for (int i = 0; i < sentences.length(); i++) {

            char ch = sentences.charAt(i);

            switch (ch) {
                case 'a':
                    sentences = sentences.replace("a","");
                    break;
                case 'e':
                    sentences = sentences.replace("e","");
                    break;
                case 'i':
                    sentences = sentences.replace("i","");
                    break;
                case 'o':
                    sentences = sentences.replace("o","");
                    break;
                case 'u':
                    sentences = sentences.replace("u","");
            }

        }

        System.out.println(sentences);

        // alternative solution

        String sentence="Hello world";
        sentence=sentence.replaceAll("[aeıioöuü]","");
        System.out.println("sentence = " + sentence);

    }
}

/*

Remove all vowels from a given sentences

 */
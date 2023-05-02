package day15_DailyReviews;

import java.util.Random;

public class Ex4 {

    public static void main(String[] args) {

        Random random = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";


        for (int i = 1; i <= 100; i++) {
            String word = "";
            for (int j = 0; j < 5; j++) {
                word += alphabet.charAt(random.nextInt(alphabet.length()));
            }

            System.out.println(word);
        }

        // alternative alphabet

        String letters = "";

        for (char i = 'a'; i <= 'z'; i++) {
            letters += i;
        }

        for (char i = 'A'; i <= 'Z'; i++) {
            letters += i;
        }


    }
}

/*

Write 100 random five-letter words. They do not need to be meaningful

 */
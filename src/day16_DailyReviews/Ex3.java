package day16_DailyReviews;

import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {

        Random random = new Random();

        String alphabet = "",
                word = "";

        int counter = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            alphabet += i;
        }
     //   for (char i = 'A'; i <= 'Z'; i++) {
      //      alphabet += i;
     //   }
        for (int i = 0; i <= 10000; i++) {

            int index = random.nextInt(alphabet.length());
            word += alphabet.charAt(index);

           // System.out.println(word);


            }

        if (word.contains("you") || word.contains("YOU")) {
            counter++;

        }

        System.out.println(counter);

    }
}

/*

Create a string which contains only random 10_000 lowercase  characters and check if the string contains "you"

 */
package day24_DailyReviews;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        String words[] = "Burak Ankara Adana Asya Cydeo Ali Ayşe Berra ada".split(" ");

        for (String word : words) {
            if (word.length() < 5 && word.toLowerCase().startsWith("a")) System.out.println(word);
        }

        System.out.println("-".repeat(60));

        Arrays.stream(words)
                .filter(word -> word.length() < 5 && word.toLowerCase().startsWith("a"))
                .forEach(System.out::println);


    }
}

/*

Print each word which should have less than 5 letters and starts with "a" or "A" of a sentence

 */
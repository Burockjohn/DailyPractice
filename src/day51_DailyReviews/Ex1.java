package day51_DailyReviews;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex1 {

    public static void main(String[] args) {

        String sentence = "Burak Can Burak Can Berra Can Beren Can Buşra Can";
        String[] words = sentence.split(" ");
        //System.out.println(Arrays.toString(words));

        Map<String, Integer> numOfWords = new HashMap<>();

        for (String word : words) {
            String temp = sentence;
            int counter = 0;
            while (temp.contains(word)) {
                temp = temp.replaceFirst(word,"");
                counter++;
            }
            numOfWords.put(word,counter);
        }

        System.out.println(numOfWords);


    }

}

/*

Write a Java Program to count the number of words in a string using HashMap.

 */
package day44_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex1 {

    public static void main(String[] args) {

        String str = "Cydeo School Upskill Program";

        int mostFrequent = -1;
        char mostFreq = str.charAt(0);

        for (char ch : str.toCharArray()) {
            int counter = 0;
            for (char each : str.toCharArray()) {
                if (ch == each) {
                    counter++;
                }
            }
            if (counter > mostFrequent) {
                mostFrequent = counter;
                mostFreq = ch;
            }
        }

        System.out.println("mostFrequent = " + mostFrequent);
        System.out.println("mostFreq = " + mostFreq);

        System.out.println("------------------------------------");

        ArrayList<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        int mostDuplicate = -1;
        char mostDuplicated = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i)) > mostDuplicate) {
                mostDuplicate = Collections.frequency(list,list.get(i));
                mostDuplicated = list.get(i);
            }
        }

        System.out.println("mostDuplicated = " + mostDuplicated);
        System.out.println("mostDuplicate = " + mostDuplicate);


        System.out.println("------------------------------------");




    }
}

/*

Write a Java program that takes in a string and returns the most frequent character in the string.

 */
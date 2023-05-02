package day25_DailyReviews;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {

        String str = "take care";

        char word1[] = str.substring(0, str.indexOf(" ")).toCharArray();
        char word2[] = str.substring(str.lastIndexOf(" ") + 1).toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        String result = new String(word1) + " " + new String(word2);

        System.out.println(result);


    }
}

/*

write a program which order each letter of each word of a sentence in alphabetic order.
Input
take care
Output
aekt acer
Note1: Don't use Turkish letters.
Note2:All letters should be lowercase.

 */
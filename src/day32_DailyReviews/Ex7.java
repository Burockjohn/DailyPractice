package day32_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex7 {

    public static void main(String[] args) {

        String str = "Burak CAN";
        String arr[] = str.split(" ");

        for (String s : arr) {
            String result = "";
            result = "" + s.charAt(0) + s.charAt(s.length() - 1);
            System.out.println(result);
        }

        // alternative solution
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> list2 = list;

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            String firstChar = element.substring(0, 1);
            String lastChar = element.substring(element.length() - 1);
            list.set(i, firstChar + lastChar);
        }

        System.out.println(list);

        // alternative 2 solution
        for (int i = 0; i < list2.size(); i++) {
            String element = list.get(i);
            element = element.substring(1, element.length() - 1);
            list2.remove(element);
        }

        System.out.println(list2);

        // Dynamic solution

        String sentence = "Hi, How, are you?";

        //First solution

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String each = words[i].replaceAll("[^a-zA-Z]", "");
            System.out.println(each.substring(0, 1) + each.substring(each.length() - 1));
        }

        //Second solution

        String[] words2 = sentence.split(" ");
        words2 = Arrays.stream(words2)
                .map(i -> i.replaceAll("[^a-zA-Z]", ""))
                .map(i -> "" + i.charAt(0) + i.charAt(i.length() - 1)).toArray(String[]::new);
        System.out.println(Arrays.toString(words2));


    }
}

/*

Combine and print the first and last letter of each word in a sentence.

 */
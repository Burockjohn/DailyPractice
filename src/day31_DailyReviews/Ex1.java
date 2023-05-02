package day31_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex1 {

    public static void main(String[] args) {

        String str = "burak can";
        System.out.println(getReverse1(str));
        System.out.println(getReverse2(str));


    }

    private static StringBuilder getReverse2(String str) {
        return new StringBuilder(str).reverse();

    }

    private static String getReverse1(String str) {

        String sentence[] = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(sentence));
        Collections.reverse(list);

        String result = "";
        for (String s : list) {
            result += s;
        }
        return result;
    }
}

/*

Create a method which return the reversed version of given string

 */
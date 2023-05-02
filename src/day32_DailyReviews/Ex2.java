package day32_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {

        String str = "Burak Can";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println(reversed);

        // alternative solution

        StringBuilder str1 = new StringBuilder("Burak Can");
        System.out.println(str1.reverse());

        // alternative 2 solution






    }

}

/*

Create a method which return the reversed version of given string

 */
package day51_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {

        Integer num1 = 4;
        Integer num2 = 8;

        /*

        List<Integer> list = new ArrayList<>(Arrays.asList(num1, num2));
        Collections.swap(list, 0, 1);
        System.out.println(list);

        num1 = list.get(0);
        num2 = list.get(1);

        System.out.println(num1);
        System.out.println(num2);

         */

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1);
        System.out.println(num2);


    }
}

/*

Write a Java Program to swap two numbers without using the third variable.

 */
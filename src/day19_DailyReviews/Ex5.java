package day19_DailyReviews;

import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {

        String words[] = {"Hello", "World", "Cydeo", "Wooden", "Spoon", "Cydeo"};
        String result = "";

        System.out.println(Arrays.toString(words));

        for (String word : words) {
            result += word + ", ";
        }
        System.out.println("[" + result.substring(0,result.length()-2) + "]");

    }


}

/*

Write all the elements of an array without using the Arrays.toString() method,
but the output must have the same result as if you had used the Arrays.toString() method.

 */
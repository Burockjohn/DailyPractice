package day19_DailyReviews;

import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {

        String words[] = {"Hello", "World", "Cydeo", "Wooden", "Spoon", "Cydeo"};
        String result = "";
       // int counter = 0;

        for (int i = 0; i < words.length; i++) {

            if (result.contains(words[i])) {
               // counter++;
                continue;
            } else {
                result += words[i] + " ";
            }
        }

        words = result.split(" ");

        System.out.println(Arrays.toString(words));


    }
}

/*

Set a given array to have unique elements. If the count of an element is more than one, fix it to one.

 */
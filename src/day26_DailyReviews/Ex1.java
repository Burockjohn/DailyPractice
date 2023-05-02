package day26_DailyReviews;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {


        String str = "Here is 1 there is 2 but, forever 8 must 7 only 4 is important.";

        char arr[] = str.toCharArray();

        //System.out.println(Arrays.toString(arr));

        int index[] = new int[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                index[j++] = i;
            }

        }

        index = Arrays.copyOf(index, j);

        System.out.println(Arrays.toString(index)); // [8, 19, 34, 41, 48]

        String result = str.substring(0, index[0] + 1);         // 1. stage

        for (int i = 1; i < index.length; i++) {                // 2. stage
            result += str.substring(index[i], index[i] + 1);
        }

        result += str.substring(index[index.length - 1] + 1); // 3. stage

        System.out.println(result);


    }


}

/*

Remove all letters and spaces between any two numbers in a string
Input
Here is 1 there is 2 but only 4 is important.
Output
Here is 124 is important.

 */
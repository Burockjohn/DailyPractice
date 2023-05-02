package day18_DailyReviews;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40};

        int[] reversed = new int[numbers.length];


        /*for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[j] = numbers[i];
        }*/

        int i = numbers.length-1;
        int j = 0;

        while (j < numbers.length) {
            reversed[j++] = numbers[i--];
        }

        System.out.println(Arrays.toString(reversed));
    }

}





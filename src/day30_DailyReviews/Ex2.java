package day30_DailyReviews;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {

    public static void main(String[] args) {

        Random random = new Random();
        int arr[] = new int[10];
        int x = 0, counter = 0;

        while (x < arr.length) {
            int arrNum = random.nextInt(10) + 1;
            if (!contain(arr, arrNum)) {
                arr[x++] = arrNum;
            }
            counter++;
        }

        System.out.println(counter);
        System.out.println(Arrays.toString(arr));

    }

    public static boolean contain(int arr[], int num) {

        boolean flag = false;
        for (int each : arr) {
            if (each == num) flag = true;
        }
        return flag;

    }
}
/*

Add all numbers from 1 to 10 into an array randomly.
If any element is repeated add 10 random numbers again and again until all elements are non-repeated

 */
package day32_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex5 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 3, 6, 5, 4};

        System.out.println(Arrays.toString(reverseSorted(arr)));

        //Alternative solution

        Integer newArray[] = new Integer[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = arr[i];
        }

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(newArray));
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);

    }

    public static int[] reverseSorted(int arr[]) {

        Arrays.sort(arr);
        int reversed[] = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }

        return reversed;

    }

}

/*

Sort an integer array from largest to smallest.

 */
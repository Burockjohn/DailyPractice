package day31_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {

        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 6);
        }
        // System.out.println(list);

        list.removeIf(each -> each < 20);

        System.out.println(list);
        //System.out.println(Arrays.toString(arr));

        //alternative solution

        int[] arr1 = {4, 6, 2, 12, 4, 18, 65, 16, 7};
        arr1 = Arrays.stream(arr1).map(i -> i + 6).filter(i -> i >= 20).toArray();
        System.out.println(Arrays.toString(arr1));

    }
}

/*

 *Increase by 6 each element of an int array, and remove elements which are less than 20 and print the new array.

 */
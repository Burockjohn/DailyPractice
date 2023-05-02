package day33_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex3 {

    public static void main(String[] args) {

        Integer arr[] = {4, 16, 8, 32, 64, 256, 128, 512, 1024, 2};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("min number is :" + min + ", max number is :" + max);


        //alternative solution

        int min1 = list.get(0);
        int max1 = list.get(0);

        for (Integer each : list) {
            if (each > max1) max1 = each;
            if (each < min1) min1 = each;
        }

        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);

        // alternative 2 solution
        Collections.sort(list);
        int max2 = list.get(list.size()-1);
        int min2 = list.get(0);

        System.out.println("min number is :" + min2 + ", max number is :" + max2);

    }
}

/*

Create an ArrayList and find its smallest and largest elements.

 */
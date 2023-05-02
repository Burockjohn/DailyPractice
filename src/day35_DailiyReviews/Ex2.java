package day35_DailiyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(17, 44, 32, 72, 367, 27, 31, 12, 51));
        ArrayList<Integer> reversed = new ArrayList<>();

        for (Integer each : list) {
            StringBuilder sb = new StringBuilder(String.valueOf(each));
            reversed.add(Integer.parseInt(String.valueOf(sb.reverse())));
        }

        //System.out.println(reversed);

        Collections.sort(reversed);
        System.out.println("The sum of first 3 elements is = " + (reversed.get(0) + reversed.get(1) + reversed.get(2)));

        // alternative solution

        for (int i = 0; i < list.size(); i++) {

            int reversed1 = 0;
            int temp = list.get(i);

            while (temp > 0) {

                reversed1 += temp % 10;

                if (temp > 9) reversed1 *= 10;

                temp /= 10;
            }

            list.set(i, reversed1);
        }
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list.get(0) + list.get(1) + list.get(2));

        // alternative 2 solution

        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(17,44,32,72,367,27,31,12,51));
        int sum2= list2.stream()
                .map(i->Integer.valueOf(new StringBuilder(String.valueOf(i)).reverse().toString()))
                .sorted()
                .limit(3)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum2);


    }

}


/*

Reverse all elements of an Arraylist of Integer and sort new Arraylist and then find the sum of first three elements

 */
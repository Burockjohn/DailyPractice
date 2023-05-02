package day34_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 7, 3, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(7, 2, 9, 90));
        ArrayList<Integer> common = new ArrayList<>();

        for (Integer each : list2) {
            for (Integer element : list1) {
                if (each == element && !common.contains(each)) common.add(each);
            }
        }

        System.out.println(common);

        //alternative solution
        ArrayList<Integer> list3 = list1;
        ArrayList<Integer> common2 = new ArrayList<>();

        for (Integer each : list2) {
            if (list3.remove(each)) common2.add(each);
        }
        System.out.println(common2);

        //alternative 2 solution
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 4, 7, 3, 2, 3));
        list4.retainAll(list2);

        System.out.println(list4);

        /*

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1, 4, 7, 3, 2, 3));
        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(7, 2, 9, 90));
        list5.removeAll(temp);
        System.out.println(list5);
        temp.removeAll(list5);
        System.out.println(temp);

         */


    }
}


/*

Write a program to list the common elements of two ArrayLists.

 */

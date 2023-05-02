package day36_DailiyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 2, 32, 7, 3, 2, 3, 12, 51, 32, 4));
        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list) {
            if (Collections.frequency(list, each) == 1) unique.add(each);
        }

        System.out.println(unique);

        //alternative solution
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 4, 2, 32, 7, 3, 2, 3, 12, 51, 32, 4));
        list2.removeIf(each -> Collections.frequency(list2, each) != 1);
        System.out.println(list2);

        // alternative2 solution

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 2, 32, 7, 3, 2, 3, 12, 51, 32, 4));
        System.out.println(Arrays.toString(list1.stream().distinct().toArray()));

        //alternative3 solution

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer each : list) {

            int count = 0;

            for (Integer elements : list) {

                if (each == elements) count++;
            }
            if (count == 1) newList.add(each);
        }
        System.out.println(newList);

        //alternative4 solution
        list.stream().filter(i -> Collections.frequency(list, i) == 1).forEach(System.out::println);


    }
}

/*

List all unique elements of an ArrayList

 */
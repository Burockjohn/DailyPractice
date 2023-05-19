package day44_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex2 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list1.removeIf(p -> p % 2 != 0);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2 = (ArrayList<Integer>) list1.clone();
        System.out.println(list2);

        System.out.println("---------------------------------------------------------");

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list3.stream().filter(p -> p % 2 == 0).collect(Collectors.toList()));

        System.out.println("---------------------------------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> list5 = new ArrayList<>();

        for (Integer each : list4) {
            if (each % 2 == 0) list5.add(each);
        }

        System.out.println(list5);




    }
}

/*

Create an ArrayList and add all the even numbers in it to another ArrayList.

 */

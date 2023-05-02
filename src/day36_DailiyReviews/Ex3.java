package day36_DailiyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 2, 32, 7, 3, 2, 3, 12, 51, 32, 4));
        Integer min = Collections.min(list);
        Integer max = Collections.max(list);
        list.removeAll(Arrays.asList(min, max));

        System.out.println(list);

        //alternative solution

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 2, 32, 7, 3, 2, 3, 12, 51, 32, 4));
        list1.removeIf(each -> each == Collections.max(list1) || each == Collections.min(list1));
        System.out.println(list1);

    }
}

/*

Print a sublist of an arraylist not included the smallest and the largest elements

 */

package day52_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {

        Integer arr1[] = {1, 2, 3, 4};
        Integer arr2[] = {5, 6, 7, 8};

        MergeArraylists<Integer[], Integer[], ArrayList<Integer>> mergeIntArray = (a1, a2) -> {
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a1));
            list.addAll(Arrays.asList(a2));
            return list;
        };

        System.out.println(mergeIntArray.apply(arr1, arr2));

    }
}

/*

Create a method which merges two arrays (with any type) into an arraylist and returns this arraylist

 */
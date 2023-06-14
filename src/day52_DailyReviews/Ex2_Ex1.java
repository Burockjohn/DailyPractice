package day52_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2_Ex1 {

    public static void main(String[] args) {

        String[] names1 = {"yunus", "burak"};
        String[] names2 = {"nesrin", "kubra", "elif"};
        List<String> names = merge(names1, names2);
        System.out.println(names);


        Integer[] numbers1 = {1, 2, 3, 4};
        Integer[] numbers2 = {5, 6, 7};
        List<Integer> numbers = merge(numbers1, numbers2);
        System.out.println(numbers);

    }

    public static <T> List<T> merge(T[] array1, T[] array2) {
        List<T> list = new ArrayList<>(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));
        return list;
    }
}

package day36_DailiyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (!(i % 5 == 0 && i % 2 == 0 && i % 9 != 0)) list.add(i);
        }

        System.out.println(list);
        System.out.println(list.size());

        //alternative solution

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list1.add(i);
        }
        System.out.println(list1.stream().filter(i -> !(i % 5 == 0 && i % 9 != 0 && i % 2 == 0)).count());


        //alternative 2

        System.out.println("---------------------------------------");

        List<Integer> numbers2 = IntStream.rangeClosed(1, 100)
                .filter(i -> !(i % 5 == 0 && i % 9 != 0 && i % 2 == 0))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(numbers2);
        System.out.println(numbers2.size());

    }

}

/*

Add all numbers from 1 to 100 into an ArrayList and remove if any element is divisible by 5 but not 9, and even

 */
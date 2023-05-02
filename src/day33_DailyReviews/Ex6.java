package day33_DailyReviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class Ex6 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                list.add(i);
            } else {
                sum += i;
            }
        }

        System.out.println(list.size());
        System.out.println(sum);

        //alternative solution

        int sum2 = IntStream.rangeClosed(1, 1000)
                .filter(i -> !(i % 3 == 0 && i % 5 != 0))
                .sum();
        System.out.println(sum2);


    }
}

/*

Add numbers from 1 to 1000 into an arraylist. Remove all numbers which are divisible by 3 not 5 and find the sum of remain elements

 */

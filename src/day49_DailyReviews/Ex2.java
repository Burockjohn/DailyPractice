package day49_DailyReviews;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex2 {

    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> result = new TreeSet<>();

        for (int i = 0; i < 100; i++) {
            result.add(random.nextInt(1000));
        }

        System.out.println(result);

    }
}

/*

Generate 100 random number from 0 to 1000 and add them into a collection uniquely and sorted

 */
package day34_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex3 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 32, 7, 3, 2, 3, 12, 51));
        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(1, 4, 32, 7, 3, 2, 3, 12, 51));

        Collections.sort(temp);

        int sum = 0;
        for (int i = temp.size() - 1; i >= temp.size() - 5; i--) {
            sum += temp.get(i);
        }

        System.out.println(sum);

        //alternative solution

        int sum1 = 0;
        for (int i = 0; i < 5; i++) {
            Integer max = Collections.max(list1);
            sum1 += max;
            list1.remove(max);
        }

        System.out.println(sum1);

        //alternative2 solution
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 4, 32, 7, 3, 2, 3, 12, 51));
        int sum2=list3.stream()
                .sorted(Collections.reverseOrder())
                .limit(5)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum2);

    }
}

/*

Find the sum of the first five largest elements of an arraylist

 */
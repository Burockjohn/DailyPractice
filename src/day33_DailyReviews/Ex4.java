package day33_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex4 {

    public static void main(String[] args) {

        Integer arr[] = {4, 16, 8, 32, 48, 64, 256, 128, 512, 1024, 2, 3, 54};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.removeIf(each -> each % 3 == 0);

        System.out.println(list);

        //alternative solution
        System.out.println(Arrays.toString(Arrays.stream(arr).filter(p -> p % 3 != 0).toArray()));

        //alternative2 solution
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each % 3 == 0) {
                continue;
            }
            result.add(each);
        }

        System.out.println(result);


    }

}

/*

Create an ArrayList and remove all the elements that are divisible by 3.

 */
package day32_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {

        Integer arr [] = {1,2,3,4,5,6,7,8,1,2,3,4,5,3,6,5,4};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list.lastIndexOf(3));

    }
}

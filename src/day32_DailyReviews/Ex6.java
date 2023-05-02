package day32_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex6 {


    public static void main(String[] args) {

        String str[] = {"burak", "can", "Cydeo", "Wooden", "world", "car", "hi"};


        for (String each : str) {
            if (each.length() <= 4) System.out.println(each);
        }

        //alternative solution

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        list.removeIf(each -> each.length() > 4);
        System.out.println(list);

        //alternative 2 solution

        Arrays.stream(str).filter(p -> p.length() <= 4).forEach(i -> System.out.println(i));

    }
}

/*

Print all strings whose length is less than 4 in an array.

 */
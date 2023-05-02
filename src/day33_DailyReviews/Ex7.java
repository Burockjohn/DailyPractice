package day33_DailyReviews;

import java.util.ArrayList;

public class Ex7 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int number = 1;
        while (list.size() < 1000) {
            if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 7 != 0 && number % 11 != 0) {
                list.add(number);
            }
            number++;
        }

        System.out.println(number);
        System.out.println(list);


        System.out.println("---------------------------------------------------------");


    }

}

/*

List first 1000 numbers which are not divisible by 2,3,5,7,11

 */
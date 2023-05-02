package day02_DailyReviews;

import java.util.Arrays;

public class Ex10_Stream {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 7, 9, 24, 36, 48};

        double average,
                sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        average = sum / numbers.length;


        System.out.println("average = " + average);

        System.out.println("-".repeat(60));

        System.out.println(Arrays.stream(numbers).average().getAsDouble());


    }


}

/*

Find the average of an integer array;

 */
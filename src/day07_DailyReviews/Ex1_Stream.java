package day07_DailyReviews;

import java.util.stream.IntStream;

public class Ex1_Stream {

    public static void main(String[] args) {

        double sum = 0,
                counter = 0;

        for (int i = 7; i <= 30 ; i++) {

            counter ++;
            sum +=i;

        }
        System.out.println(sum/counter);

        System.out.println("-".repeat(60)); // alternative solution

        System.out.println(IntStream.rangeClosed(7,30).average().getAsDouble()); // Stream



    }
}
/*

//Write a program to find the average of numbers in the range [7-30].

 */
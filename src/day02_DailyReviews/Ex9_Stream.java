package day02_DailyReviews;


import java.util.Arrays;

public class Ex9_Stream {

    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 7, 9, 24, 36, 48};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 0) {

                System.out.println(numbers[i]);
            }

        }

        System.out.println("-".repeat(60));


        Arrays.stream(numbers).filter(i -> i % 2 != 0).forEach(i -> System.out.println(i));


    }
}

/*

Print the odd numbers from an integer array;

 */
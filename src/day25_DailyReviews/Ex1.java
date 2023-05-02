package day25_DailyReviews;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8,4};

        indexOfElement(numbers, 4);

    }

    private static void indexOfElement(int[] numbers, int i) {

        if (i < 0 || i > numbers.length - 1) {
            System.err.println(i + " is not included by " + Arrays.toString(numbers));
            System.exit(0);
        }

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == i) {
                System.out.println(j);
                break;
            }

        }

    }
}

/*

Create a method which returns the index of an element in an array

 */
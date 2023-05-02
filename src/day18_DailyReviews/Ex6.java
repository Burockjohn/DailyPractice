package day18_DailyReviews;

import java.util.Arrays;

public class Ex6 {

    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(numbers));
    }
}

/*

Reverse an array without using a new array

 */
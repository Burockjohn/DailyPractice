package day21_DailyReviews;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {

        int difference[] = new int[1000];


        for (int i = 100; i < 1000; i++) {
            int num = i;

            difference[i] = Math.abs(i - reverse(i)); // for absolute value;
        }

        int result[] = new int[difference.length];
        int i = 0;

        for (int j = 0; j < difference.length; j++) {
            int counter = 0;
            for (int k = j; k < difference.length; k++) {
                if (difference[k] == difference[j]) {
                    counter++;
                }
            }

            if (counter == 1) result[i++] = difference[j];
        }

        result = Arrays.copyOf(result, i);

        System.out.println(Arrays.toString(result));

        System.out.println(result.length);


    }

    public static int reverse(int num1) {

        int result = 0;

        int digit1 = num1 / 100,
                digit2 = (num1 / 10) % 10,
                digit3 = num1 % 10;

        result = digit3 * 100 + digit2 * 10 + digit1;

        return result;

    }
}

/*

 *If you take any three digit number and find the difference of it and reversed of it. How many possible answer you can take

 */
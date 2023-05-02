package day28_DailyReviews;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        // long start = 0;
        // long end = 0;

        // start = System.currentTimeMillis();

        int counter = 0;

        for (int i = 1; i <= 10_000; i++) {
            if (isPalindrome(i)) {
                counter++;
                System.out.println(i);
            }
        }

        System.out.println(counter);

        // end = System.currentTimeMillis();
        // long result = end - start;
        // System.out.println(result);

    }

    public static boolean isPalindrome(int num) {

        boolean isPalindrome = true;

        String numbers[] = String.valueOf(num).split("");
        int result[] = new int[numbers.length];
        int x = 0;

        while (num > 0) {
            result[x++] = num % 10;
            num /= 10;
        }

        //result = Arrays.copyOf(result, x);

        for (int i = 0; i < numbers.length; i++) {
            if (Integer.parseInt(numbers[i]) != result[i]) isPalindrome = false;
        }

        return isPalindrome;


    }
}


/*

Find how many palindrome numbers are there from 1 to 10_000

 */
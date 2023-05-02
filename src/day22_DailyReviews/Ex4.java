package day22_DailyReviews;

import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {

        int primes[] = new int[100];
        int j = 0;

        for (int i = 2; i < 10000; i++) {
            boolean isPrime = true;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes[j++] = i;
            // if (isPrime) System.out.println(i);
            if (j == 100) break;

        }

        System.out.println(Arrays.toString(primes));

        String primeArray = "";

        for (int prime : primes) {
            primeArray += prime;
        }

        System.out.println(primeArray);

        int sum = 0;
        for (int i = 0; i < primeArray.length(); i++) {
            char ch = primeArray.charAt(i);
            sum += Integer.parseInt(ch + "");
        }

        System.out.println(sum);

    }
}

/*

Find the first 100 prime numbers  and concat them from first to last as a string and find the sum of each digits of the  result

 */
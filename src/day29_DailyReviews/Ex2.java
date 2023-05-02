package day29_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        int counter = 0;

        for (int i = 1; i <= 100_000; i++) { //6
            int temp = i;
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (temp % j == 0) sum += j;
            }

            if (sum == i) {
                System.out.println(i);
                counter++;
            }
        }

        System.out.println("counter = " + counter);

    }
}

/*

Perfect number, a positive integer that is equal to the sum of its divisors. The smallest perfect number is 6,
which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
List all perfect numbers form 1000 to 100_000

 */
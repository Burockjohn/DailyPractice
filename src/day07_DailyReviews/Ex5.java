package day07_DailyReviews;

public class Ex5 {

    public static void main(String[] args) {

        int num = 24,
                sum = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {

                sum += i;
            }

        }

        System.out.println("sum = " + sum);

    }
}


/*

"Find the sum of positive divisors of a given number."

 */
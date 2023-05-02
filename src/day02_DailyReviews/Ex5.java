package day02_DailyReviews;

public class Ex5 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 50; i <= 304; i++) {

            if (i % 2 != 0) {

                sum += i;
            }

        }

        System.out.println("sum = " + sum);


    }
}

/*

sum of the odd numbers 20 - 304 and print the result

 */
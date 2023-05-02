package day13_DailyReviews;

public class Ex4 {

    public static void main(String[] args) {

        int number = 5,
                factorial = 1,
                sum = 0;

        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        //  System.out.println("factorial = " + factorial);

        for (int i = 1; i <= factorial; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);

    }
}

/*

write a program that finds the sum of numbers from 1 to the factorial of a given number

 */

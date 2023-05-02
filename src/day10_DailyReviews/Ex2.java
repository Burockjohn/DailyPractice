package day10_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        int counter = 0;

        for (int i = 100; i < 1000; i++) {

            int digit1 = i / 100,
                    digit2 = (i / 10) % 10,
                    digit3 = i % 10;


            if ((digit1 < digit2) && (digit2 < digit3)) {

                System.out.println(i);

                counter++;
            }



        }

        System.out.println("counter = " + counter);

    }
}

/*

 *Write a program to list all three-digit numbers where the digits are sorted from smallest to largest.

 */
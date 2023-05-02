package day12_DailyReviews;

public class Ex6 {

    public static void main(String[] args) {

        int counter = 0;
        double sum = 0;

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 != 0) {

                sum += i;
                counter++;
            }

        }

        System.out.println(sum / counter);


    }
}

/*

Find the average of even numbers from 1 to 100 that are divisible by 3 but not by 5

 */
package day05_DailyReviews;

public class Ex3 {


    public static void main(String[] args) {

        int counter = 0;

        for (int i = 100; i < 1000; i++) {

            if (i % 7 == 0 && i % 2 == 0 && i % 3 != 0) {

                counter++;
            }


        }
        System.out.println("counter = " + counter);
    }
}

/*

//How many three-digit numbers are divisible by 7 and 2 but not by 3?

 */
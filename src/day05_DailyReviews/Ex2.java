package day05_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        double sum = 0;
        int counter = 0;

        for (int i = 50; i <= 500; i++) {

            if (i % 10 == 6) {
                sum += i;
                counter++;
            }

        }
        System.out.println(sum / counter);


    }
}

/*

//Find the average of all numbers between 50 and 500 whose ones digit is 6.

 */
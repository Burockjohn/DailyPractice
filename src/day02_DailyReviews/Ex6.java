package day02_DailyReviews;

public class Ex6 {

    public static void main(String[] args) {

        double average = 0;
        int sum = 0,
                count = 0;

        for (int i = 56; i <= 203; i++) {
            sum += i;
            count++;
        }

        average = sum / count;
        System.out.println("average = " + average);


    }
}

/*

Find the average of numbers 56 ~ 203

 */
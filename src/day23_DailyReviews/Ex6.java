package day23_DailyReviews;

public class Ex6 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i < Integer.MAX_VALUE; i++) {

            if (i < Integer.MAX_VALUE - sum)
                sum += i;

        }

        System.out.println(sum);

    }
}

/*

Find the sum of all numbers starting from 1 up to the point where the sum reaches the largest possible integer value

 */
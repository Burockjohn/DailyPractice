package day02_DailyReviews;

public class Ex8_Array {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 8, 16, 32, 64};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];


        }

        System.out.println("sum = " + sum);


    }


}

/*

Find the sum of the all integers of an array

 */
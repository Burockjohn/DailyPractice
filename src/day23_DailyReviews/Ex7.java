package day23_DailyReviews;

import java.util.Arrays;
import java.util.Random;

public class Ex7 {

    public static void main(String[] args) {

        Random random = new Random();

        int numbers[] = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100)+1;
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println("-".repeat(60));

        boolean isUnique = true;

        for (int i = 0; i < numbers.length; i++) { // 0, 42, 33, 81, 84, 43, 81, 61, 49, 14
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    isUnique = false;
                    break;
                }
            }
        }

        System.out.println(isUnique);

        System.out.println("-".repeat(60));

        //alternative solution

        System.out.println(Arrays.stream(numbers).distinct().count()==numbers.length);

        System.out.println("-".repeat(60));

        //alternative 2 solution

        int length=0;

        for (int i = 0; i < numbers.length; i++) {
            int counter=0;
            for (int j = i; j <numbers.length ; j++) {
                if(numbers[i]==numbers[j]) counter++;
            }
            if(counter==1) length++;
        }



        System.out.println(length==numbers.length);

    }
}

/*

 Generate 10 random numbers from 1 to 100 and check if all of them is unique or not.

 */
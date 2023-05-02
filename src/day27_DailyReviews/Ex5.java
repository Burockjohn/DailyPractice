package day27_DailyReviews;

import java.util.Arrays;
import java.util.Random;

public class Ex5 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = {2, 5, 7, 1, 8, 4};
        int result[] = new int[arr.length];
        int x = 0;

        int randomNumber = random.nextInt(10);
        while (contain(arr, randomNumber)) {
            result[x++] = randomNumber;
            randomNumber = random.nextInt(10);

        }

        result = Arrays.copyOf(result, x);

        System.out.println(Arrays.toString(result));


    }

    public static boolean contain(int arr[], int num) {
        boolean flag = false;

        for (int i : arr) {
            if (i == num) flag = true;
        }

        return flag;
    }


}

/*

int[] arr={2,5,7,1,8,4};
Generate a random number and check if the number is different  from the elements of the array.
If it is equals one of them generate a new one until the number is different. And finally print the number and array

 */
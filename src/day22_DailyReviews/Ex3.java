package day22_DailyReviews;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {

        int arr[] = new int[100];

        int x = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                arr[x++] = i * j;
            }
        }

        int result[] = new int[arr.length];
        int i = 0;

        for (int j = 0; j < arr.length; j++) {
            int counter = 0;
            for (int k = j; k < arr.length; k++) {
                if (arr[k] == arr[j]) {
                    counter++;
                }
            }

            if (counter == 1) result[i++] = arr[j];
        }

        result = Arrays.copyOf(result, i);
        Arrays.sort(result);

        System.out.println(Arrays.toString(result));
        System.out.println(result.length);

    }

}

/*

write a code which prints the non-repeated results of multiply table (from 1 to 10)

 */

package day23_DailyReviews;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number #" + (i + 1));
            arr[i] = input.nextInt();
        }

        //System.out.println(Arrays.toString(arr));

        int x = 0;
        int result[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) counter++;
            }

            if (counter == 1) result[x++] = arr[i];
        }

        result = Arrays.copyOf(result, x);
        Arrays.sort(result);

        System.out.println(Arrays.toString(result));


    }
}

/*

Take 10 numbers from the user and print them without repetition

 */
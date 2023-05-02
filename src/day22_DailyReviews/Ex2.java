package day22_DailyReviews;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int odd[] = new int[arr.length];
        int even[] = new int[arr.length];

        int x = 0, y = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                even[x++] = i;
            } else {
                odd[y++] = i;
            }
        }

        even = Arrays.copyOf(even, x);
        odd = Arrays.copyOf(odd, y);

        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));


    }
}

/*

Add even and odd numbers different arrays from an array

 */

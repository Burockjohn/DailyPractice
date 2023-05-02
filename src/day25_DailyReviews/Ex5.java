package day25_DailyReviews;

import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {

        String identity = "11111111111";
        int arr[] = new int[11];

        boolean isValid = false;

        for (int i = 0, j = 0; i < identity.length(); i++, j++) {
            String each = "" + identity.charAt(i);
            arr[j] = Integer.parseInt(each);
        }

        //System.out.println(Arrays.toString(arr));

        int sumOfEven = 0,
                sumOfOdd = 0;

        for (int i = 0; i < 10; i += 2) {
            sumOfOdd += arr[i];
        }

        for (int i = 1; i < 8; i += 2) {
            sumOfEven += arr[i];
        }


        int sumOf10 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sumOf10 += arr[i];
        }

        if ((sumOfOdd * 7 - sumOfEven) % 10 == arr[9] && (sumOf10 % 10) == arr[10]) isValid = true;

        System.out.println(isValid);

    }


}



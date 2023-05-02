package day20_DailyReviews;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {

        String str[] = {"Hello", "World", "Wooden", "Cydeo"};

        Arrays.sort(str);

        String reversed[] = new String[str.length];

        for (int i = str.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = str[i];
        }

        System.out.println(Arrays.toString(reversed));

    }
}

/*

Reverse sort a given String array and print it

 */

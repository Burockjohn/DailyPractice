package day20_DailyReviews;

import java.util.Arrays;

public class Ex5_distinct {

    public static void main(String[] args) {

        int num1[] = {1, 2, 3, 4};
        int num2[] = {1, 3, 4, 5, 6, 7, 8};

        int merge[] = new int[num1.length + num2.length];

        int j = 0;

        for (int i : num1) {
            merge[j++] = i;
        }

        for (int i : num2) {
            merge[j++] = i;
        }

        /*
        int counter = 0;
        for (int eachNum : merge) {
            int count = 0;
            for (int eachElement : merge) {
                if (eachNum == eachElement) count++;
            }

            if (count == 1) counter++;
        }

         */

        int finalArr[] = new int[merge.length];

        System.out.println(Arrays.toString(finalArr));

        int x = 0;
        for (int i = 0; i < merge.length; i++) {
            int counter = 0;

            for (int k = i; k < merge.length; k++) {
                if (merge[k] == merge[i]) {
                    counter++;
                }

            }

            if (counter == 1) finalArr[x++] = merge[i];
        }

        // System.out.println(Arrays.toString(finalArr));
        finalArr = Arrays.copyOf(finalArr, x);

        System.out.println(Arrays.toString(finalArr));

        //distinct

        int[] arr = {1, 2, 3, 3, 4, 4, 5};
        int[] distinctArr = Arrays.stream(arr).distinct().toArray();


    }
}

/*

 *Merge two int arrays as result array has unique elements. Note: If an element is repeated, add only one of them.

 */
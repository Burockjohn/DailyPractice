package day30_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 7, 9, 8, 1};
        arr = Arrays.stream(arr).distinct().toArray();

        for (int i = 0; i < arr.length; i++) {
            String result = "";
            int each = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int element = arr[j];

                if (each + element == 10 && each != element) {
                    result = each + ", " + element;
                    System.out.println(result);
                }
            }
        }
        
        //alternative solution

        int[] arr1 = {1,2,3,5,7,9,8,1};
        String result="";
        int sum=10;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j <arr1.length ; j++) {
                if(arr1[i]+arr1[j]==sum  && arr1[i]!=arr1[j] ){
                    if(!result.contains(arr1[i]+","+arr1[j]) && !result.contains(arr1[j]+","+arr1[i])){
                        result+=arr1[i]+","+arr1[j]+" ";

                        System.out.println(arr1[i]+","+arr1[j]);
                    }
                }
            }

        }


    }

}

/*

Find all two different elements whose sum is 10 in an array
int[] arr = {1,2,3,5,7,9,8,1};
Output
1,9
2,8
3,7
5,5 -> not included (must be different(
7,3 -> not included(same numbers found)
9,1 -> not included ...
8,2 -> not included ...
1,9 -> not included ...

 */

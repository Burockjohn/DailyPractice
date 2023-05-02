package day32_DailyReviews;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {


        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] newArray = new int[array.length][];

        for (int i = array.length - 1, s = 0; i >= 0; i--, s++) {
            newArray[s] = new int[array[i].length];
            for (int j = array[i].length - 1, k = 0; j >= 0; j--, k++) {
                newArray[s][k] = array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(newArray));

    }

}

package day27_DailyReviews;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex6_Ex5_Yunus {

    public static void main(String[] args) {

        int[] arr = {2, 5, 7, 1, 8, 4};
        Random random = new Random();


        int number = 0;
        while (true) {


            number = random.nextInt(10);

            boolean isContained = false;
            for (int each : arr) {
                if (each == number) {
                    isContained = true;
                    break;
                }

            }

            if(!isContained){
                System.out.println(number);
                System.out.println(Arrays.toString(arr));
                break;
            }


        }


    }

}

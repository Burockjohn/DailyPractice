package day15_DailyReviews;

import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {

        String str = "kahramankukulikelebek";

        String word[] = str.split("k");

        System.out.println(Arrays.toString(word));


        int count = word.length;

        if (str.charAt(str.length() - 1) == 'k') System.out.println(count);

        else System.out.println(count - 1);
    }
}

/*

write a program which counts "k" letters in a string with using .split()

 */
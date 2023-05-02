package day13_DailyReviews;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {

        String name1 = "Java",
                name2 = "Programming",
                name3 = "Language";

        String names[] = {name1, name2, name3};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        //alternative

        String metin1 = "selam";
        String metin2 = "selefon";

        System.out.println(metin1.compareTo(metin2)); // -4 it compares till the different char and is gives the difference as a integer between them.


    }
}

/*

 *write a program that sorts three given words in alphabetic order

 */
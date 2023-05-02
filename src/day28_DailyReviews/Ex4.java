package day28_DailyReviews;

import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {


        String names[] = {"Ali", "Ayşe", "Mehmet", "bOra", "MURat"};

        int counter = 0;

        for (String name : names) {
                if (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
                    if (name.substring(1).equals(name.substring(1).toLowerCase())) {
                        counter++;
                        System.out.println(name);

                }
            }
        }

        System.out.println(counter);

        System.out.println("--------------------------------------------------------------");

        String[] words = {"Harun", "Yesim", "Ahmet", "Bugra", "KEMAL", "ayten", "GuLAY", "AHSEN", "Enes"};

        //First solution
        int count = 0;
        for (String each : words) {
            if (each.matches("[A-Z][a-z]+")) count++;
        }
        System.out.println(count);


        //Second solution
        System.out.println(Arrays.stream(words).filter(i -> i.matches("[A-Z][a-z]+")).count());

    }
}

/*

Find how many elements in an array begin with a capital letter and continue with  lower case letters.

 */

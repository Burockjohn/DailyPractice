package day21_DailyReviews;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        String str1 = "kasap";
        String str2 = "sapak";

        String arr1[] = str1.split("");
        String arr2[] = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("They are anagram");
        } else {
            System.out.println("They are not anagram");
        }

        //alternative solution - wrong output for duplicated characters

        System.out.println("-".repeat(60));

        boolean isAnagram = true;

        for (int i = 0; i < str1.length(); i++) {
            char each = str1.charAt(i);
            int counter = 0;
            for (int j = 0; j < str2.length(); j++) {
                char ch = str2.charAt(j);
                if (ch == each) counter++;
            }

            if (!(counter == 1)) isAnagram = false;
        }

        System.out.println("isAnagram = " + isAnagram);

        // second solution

        String text1 = "kasap";
        String text2 = "sapak";

        String sorted1 = "";
        String sorted2 = "";

        if (text1.length() == text2.length()) {

            for (char j = 'a'; j <= 'z'; j++) {

                for (int i = 0; i < text1.length(); i++) {

                    if (j == text1.charAt(i)) sorted1 += j;
                }

                for (int i = 0; i < text2.length(); i++) {

                    if (j == text2.charAt(i)) sorted2 += j;
                }
            }


        } else {
            System.out.println("The length of words is not equal");
            return;
        }


        if (sorted1.equals(sorted2)) {
            System.out.println(text1 + " and " + text2 + " are anagram");
        } else {
            System.out.println(text1 + " and " + text2 + " are not anagram");
        }


    }
}

/*

Check if given words are anagram or not

 */
package day53_DailyReviews;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Ex2 {

    public static void main(String[] args) {

        BiPredicate<String, String> isAnagram = (str1, str2) -> {
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        System.out.println(isAnagram.test("burak", "kubra"));

    }
}


/*

write a method to check if two Strings (words) are Anagrams or not.

 */
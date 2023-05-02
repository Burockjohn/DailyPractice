package day29_DailyReviews;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {

        String word = "burak";

        boolean isUnique = true;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (word.indexOf(ch) != word.lastIndexOf(ch)) {
                isUnique = false;
                break;
            }
        }

        System.out.println(isUnique);

        // second solution

        String arr[] = word.split("");
        System.out.println(Arrays.stream(arr).distinct().toArray().length == arr.length);

        // third solution

        String result2 = "";
        boolean flag = false;

        for (int i = 0; i < word.length(); i++) {
            String each = word.substring(i, i + 1);
            if (!result2.contains(each)) {
                result2 += each;
            }
            if (result2.equals(word)) {
                flag = true;
            }
        }

        System.out.println(flag);


    }
}

/*

Check if a word has unique characters or not

 */
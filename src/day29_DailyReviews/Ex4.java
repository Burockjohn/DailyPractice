package day29_DailyReviews;

import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {

        String words[] = {"Burak", "Yunus", "Çağlar", "Tuğba", "Efe", "Çağrı", "Nesrin", "burak"};

        for (String word : words) {
            char newWord[] = word.toCharArray();
            Arrays.sort(newWord);

            //newWord.forr
            String sorted = new String(newWord); // to assign the newWord char array to a String variable

            String result = "";

            for (int i = sorted.length() - 1; i >= 0; i--) {
                result += sorted.charAt(i);
            }

            System.out.println(result.substring(0, 1).toUpperCase() + result.substring(1).toLowerCase());
        }

    }
}

/*

Reverse order each letter of each element of an array and edit each new words that they start with uppercase and continues with lowercases

 */
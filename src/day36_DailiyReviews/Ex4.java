package day36_DailiyReviews;

public class Ex4 {

    public static void main(String[] args) {

        String text = "abcabbakelmlekokuomlbayufeobekfeokllafebabokullu";

        int maxLength = 0;
        String longestPalindrome = "";

        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                String word = text.substring(i, j);
                if (isPalindrome(word) && word.length() > maxLength) {
                    longestPalindrome = word;
                    maxLength = word.length();
                }
            }
        }

        System.out.println(longestPalindrome);

    }

    public static String reverse(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String word) {
        return (word.equalsIgnoreCase(reverse(word)));
    }
}

/*

    Write a Java program that takes in a string and returns the longest palindrome substring in the string.

 */

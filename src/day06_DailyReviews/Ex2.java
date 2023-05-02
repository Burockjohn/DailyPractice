package day06_DailyReviews;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.nextLine();

        int num = word.length();
        String reverse = "";

        for (int i = num - 1; i >= 0; i--) {

            reverse += word.charAt(i);

        }

        if (word.equals(reverse)) {

            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

        System.out.println("-".repeat(60));

        System.out.println("Input a word :");
        String word1=input.nextLine();

        StringBuilder sb=new StringBuilder(word1);

        if(word1.equals(sb.reverse().toString())){ // String builder is not a string actually, we have to convert it to a String before compare
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}

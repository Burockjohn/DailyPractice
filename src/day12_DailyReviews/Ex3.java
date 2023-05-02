package day12_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        String str = "Hello world";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(i + 1 + " " + ch);

        }

    }
}

/*

Write all letters with their order numbers. Example:
1 a
2 b
3 c
.
.
.

 */
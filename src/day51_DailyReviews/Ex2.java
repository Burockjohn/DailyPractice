package day51_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        String str = "civic";
        int num = 121;

        boolean r1 = isPalindrome(str);
        boolean r2 = isPalindrome(num);

        System.out.println(r1);
        System.out.println(r2);

    }

    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse += ch;
        }
        return str.equalsIgnoreCase(reverse);
    }

    public static boolean isPalindrome(int num) {
        String reverse = "";
        for (int i = String.valueOf(num).length()-1; i >= 0; i--) {
            char ch = String.valueOf(num).charAt(i);
            reverse += ch;
        }

        return String.valueOf(num).equalsIgnoreCase(reverse);
    }
}

/*

Write a method to find whether a string or number is palindrome or not (do not use built in method to reverse)

 */
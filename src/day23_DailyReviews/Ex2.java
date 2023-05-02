package day23_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        String str = "leveL";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse += ch;
        }

        System.out.println(reverse);

        System.out.println("Is the word palindrome: " + (str.equalsIgnoreCase(reverse)));

        // Second solution

        String str2 = "civic";
        StringBuilder str1 = new StringBuilder("civic");

        System.out.println(str1.reverse().equals(str1));

    }
}

/*

Q2: Palindrome:
Palindrome check;
level -> true
palindrome -> false

 */

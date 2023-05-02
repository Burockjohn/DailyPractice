package day11_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {


        for (int i = 10; i < 10_001; i++) {

            String number = String.valueOf(i);
            String reverse = "";

            for (int j = number.length() - 1; j >= 0; j--) {

                char ch = number.charAt(j);

                reverse += "" + ch;

            }

            if (number.equals(reverse)) {
                System.out.println(number);
            }

        }

    }
}
/*

List all palindrome numbers from 10 to 10000

 */
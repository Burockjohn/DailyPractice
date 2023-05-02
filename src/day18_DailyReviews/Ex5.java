package day18_DailyReviews;


public class Ex5 {


    public static void main(String[] args) {


        String str = "Hello World, 12345 Wooden Spoon.",
                result = "";
        int secondDigit = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                secondDigit = (Integer.parseInt("" + ch) * 7) % 10;
                result += secondDigit;

            } else result += ch;

        }

        System.out.println(result);
    }
}

/*

Replace each digit in a string with the last digit of its result when multiplied by 7

 */
package day11_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        int num = 244868654;

        String number = String.valueOf(num);

        for (int i = number.length() - 1; i >= 0; i--) {

            char ch = number.charAt(i);

            System.out.print("" + ch);


        }

        System.out.println();

        int num1 = 2361,
                reversedNum = 0;

        while (num1 > 0) {
            int digit = num1 % 10;
            reversedNum += digit;
            if (num1 > 9) reversedNum *= 10;
            num1 /= 10;

        }

        System.out.println(reversedNum);


    }

}

/*

 *Write a code which reverse a given number

 */

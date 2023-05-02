package day29_DailyReviews;

import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {

        int counter = 0;
        int number = 129;

        if (differentDigits(number)) {
            while (number != 495) {
                number = Math.abs(sorted(number) - reversed(sorted(number)));
                counter++;
            }

        } else {
            System.err.println("The digits of the number are not different");
        }

        System.out.println(counter);
    }

    public static int sorted (int num) {

        String sorted [] = String.valueOf(num).split("");
        Arrays.sort(sorted);

        String result = "";
        for (String s : sorted) {
            result+= s;
        }

        return Integer.parseInt(result);

    }

    public static int reversed(int num) {

        int reversed = 0;

        while (num > 0) { //379
            reversed += num % 10;//970+3=973
            if (num > 9) reversed *= 10;//970
            num /= 10;//3
        }

        return reversed;

    }

    public static boolean differentDigits(int num) {

        String result = "";

        String number = String.valueOf(num);
        for (int i = 0; i < number.length(); i++) {
            String ch = number.substring(i, i + 1);
            if (!result.contains(ch)) result += ch;
        }

        /*
        return String.valueOf(number).length()== Arrays.stream(String.valueOf(number).split("")).distinct().count();
         */

        return (result.length() == number.length());
    }
}

/*

Take a three-digit number (which has different digits) from user and sort its numbers from smallest to largest and reverse sort this result.
Finally, find the differences of sorted values. And your new number is result you get. Repeat same steps for this number too.
After a few repeating you Will reach 495. The question is to find the number of repeations.

 */
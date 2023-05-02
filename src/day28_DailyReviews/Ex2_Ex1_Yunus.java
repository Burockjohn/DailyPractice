package day28_DailyReviews;

import java.util.stream.IntStream;

public class Ex2_Ex1_Yunus {

    public static void main(String[] args) {

        //First solution
        int counter1 = 0;
        for (int i = 1; i <= 10000; i++) {
            int temp = i;
            int reversed = 0;

            while (temp > 0) { //379
                reversed += temp % 10;//970+3=973
                if (temp > 9) reversed *= 10;//970
                temp /= 10;//3
            }

            if (i == reversed) {
                counter1++;
            }
        }
        System.out.println(counter1);


        //Second solution
        int counter2 = 0;
        for (int i = 1; i <= 10000; i++) {
            String number = "" + i;
            String reversed = new StringBuilder(number).reverse().toString();
            if (number.equals(reversed)) counter2++;
        }
        System.out.println(counter2);


        //Third solution
        System.out.println(IntStream.rangeClosed(1, 9999)
                .filter(i -> ("" + i).equals((new StringBuilder("" + i)).reverse().toString()))
                .count());

    }
}

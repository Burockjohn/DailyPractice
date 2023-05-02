package day21_DailyReviews;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {

        String alphabet = "";

        for (char i = 'a', j = 'A'; i <= 'z' && j <= 'Z'; i++, j++) {
            alphabet += "" + i + j;
        }

        System.out.println(alphabet);

        char ch[] = new char[100];

        for (int i = 0; i < 100; i++) {
            ch[i] = (char) i;
        }

        char result[] = new char[ch.length];
        int i = 0;

        for (char c : ch) {
            if (alphabet.contains("" + c)) {
                continue;
            }
            result[i++] = c;
        }

        System.out.println(Arrays.toString(result));

        //alternative

        //First solution
        for (char k = 1; k < 100; k++) {

            if (!((k >= 'a' && k <= 'z') || (k >= 'A' && k <= 'Z'))) {
                System.out.print(k);
            }
        }


        //Second solution
        for (char l = 1; l < 100; l++) {

            if (!Character.isAlphabetic(l)) {
                System.out.print(l);
            }
        }


    }
}

/*

Print all chars except letters whose ascii codes is less then 100

 */

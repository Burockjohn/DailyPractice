package day24_DailyReviews;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {

        int counter = 0;

        for (int x = 10_000; x < 100_000; x++) {
            int index = 0;
            int arr[] = new int[5];

            while (x > 0) {
                arr[index] = x % 10;
                x /= 10;
                index++;
            }

            int reverse[] = new int[arr.length];

            for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
                reverse[j] = arr[i];
            }

            boolean flag = false;

            for (int i = 0; i < reverse.length - 2; i++) {
                if (reverse[i] == 1 && reverse[i + 1] == 1 && reverse[i + 2] == 2) {
                    flag = true;
                    counter++;
                    break;
                }
            }

           /* if (flag) {
                String result = "";
                for (int i : reverse) {
                    result += i;
                }
                System.out.println(result);
            }
        }

        System.out.println("Toplam " + counter + " adet sayıda 112 var.");
            */
        }

        System.out.println(counter);

        //alternetive solution

        String number = "";
        int count = 0;

        for (int i = 10000; i < 100000; i++) {

            number = "" + i;
            if (number.contains("112")) {
                System.out.println(number);
                count++;
            }
        }
        System.out.println(counter);

        // alternative 2

        int counter2 = 0;

        for (int i = 10000; i < 100000; i++) {

            if ((i / 100 == 112) || (i % 1000 == 112) || (i / 1000 % 10 == 1 && i / 100 % 10 == 1 && i / 10 % 10 == 2)) {
                counter2++;
                System.out.print(i + " ");
            }
        }
        System.out.println(counter2);

    }
}

/*

Print all five digit numbers which includes 112
Examples:
38112
91120
11209

 */
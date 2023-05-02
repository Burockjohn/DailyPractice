package day11_DailyReviews;

import static java.lang.Integer.parseInt;

public class Ex4 {

    public static void main(String[] args) {

        int num = 153;
        String number = String.valueOf(num);
        int toplam = 0;

        for (int i = 0; i < number.length(); i++) {

            char ch = number.charAt(i);

            int n = parseInt(String.valueOf(ch));

            toplam += n * n * n;

        }

        System.out.println(toplam == num);

        //alternative solution

        int number1 = 153;


        int sumOfCubeOfDigits = 0;
        int temp = number1;


        while (temp > 0) {
            int digit = temp % 10;
            sumOfCubeOfDigits += digit * digit * digit;
            temp /= 10;
        }


        if (number1 == sumOfCubeOfDigits) {
            System.out.println(number1 + " is an armstrong number");
        } else {
            System.out.println(number1 + " is not an armstrong number");
        }

    }


}



/*

A number is called an Armstrong number if it is equal to the cube of its every digit. For example,
153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3.
You need to write a program to check if the given number is Armstrong number or not.

 */
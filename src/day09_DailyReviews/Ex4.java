package day09_DailyReviews;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text.");
        String text = input.nextLine();
        String temp = "";


        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                temp += text.substring(i, i + 1).toUpperCase();
            } else {
                temp += text.substring(i, i + 1).toLowerCase();
            }
        }

        System.out.println(temp);

        //alternative solution

        String metin1 = "SELAM"; // her iki de aynı uzunlukta olduğunda, farklı olursa if kullanılabilir.
        String metin2 = "merha";
        String yeniMetin = "";

        for (int i = 0; i < metin1.length(); i++) {

            yeniMetin += "" + metin1.charAt(i) + metin2.charAt(i);

        }
        System.out.println(yeniMetin);

        // alternative


        String text1 = "merhaba dünya",
                result = "",
                temp1 = "";


        for (int i = 0; i < text1.length() - 1; i++) {

            if (text1.length() % 2 == 0) {

                result += text1.substring(i, i + 1).toUpperCase() + text1.substring(i+1, i + 2).toLowerCase();

                i++;
            } else {
                result += text1.substring(i, i + 1).toUpperCase() + text1.substring(i+1, i + 2).toLowerCase() + text1.charAt(text1.length()-1);

                i++;

            }
        }

        System.out.println("result = " + result);


    }
}

/*

"Print the letters of an entered text in alternating uppercase and lowercase format."
Input "hello"
Output "HeLlO";

 */
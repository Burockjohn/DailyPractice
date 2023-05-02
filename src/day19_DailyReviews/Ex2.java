package day19_DailyReviews;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String password = "1894";

        System.out.println("Guess the 4-digit password");

        while (true) {

            String result = "";

            String entry = input.next();

            if (entry.equals(password)) {
                System.out.println("Congrats, you found it!");
                System.exit(0); }

                for (int i = 0; i < password.length(); i++) {

                    if (entry.charAt(i) == password.charAt(i)) {
                        result += entry.charAt(i);
                    } else {
                        result += "?";
                    }

                }

                System.out.println(result);



        }
    }
}

/*

write a program which helps user to find a given four digit password.
String password ="1894";
Input :1690
Output : 1?9?
Input :1494
Output : 1?94
Input :1894
Output: Password is correct

 */
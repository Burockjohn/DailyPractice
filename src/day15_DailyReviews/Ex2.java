package day15_DailyReviews;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name[] = new String[5];
        int age[] = new int[5];
        int bigger = age[0];
        String older = "";

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a name");
            name[i] = input.next();

            System.out.println("Enter his/her age");
            age[i] = input.nextInt();


            if (age[i] > bigger) {
                bigger = age[i];
                older = name[i];

            }
        }

        for (int j = 0; j < 5; j++) {

            System.out.println(name[j] + " is " + age[j] + " years old.");

        }

        System.out.println("The older is one " + older);

    }
}





/*

*Take from the user five names and five ages and print them like example
Input
Yunus
34

Ferhat
28
.
.
.
Output
Yunus is 34 years old.
Ferhat is 28 years old.
.
.
.
The older one is Yunus.

 */
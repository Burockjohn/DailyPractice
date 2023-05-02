package day01_DailyReviews;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {

        Scanner bc = new Scanner (System.in);

        System.out.println("Please, enter your name");
        String name = bc.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("Please enter your age");
        int age = bc.nextInt();

        if (age >= 20) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }


    }
}

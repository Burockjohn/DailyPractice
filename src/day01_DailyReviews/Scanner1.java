package day01_DailyReviews;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {

        Scanner anything = new Scanner(System.in);

        System.out.println("enter your name");
        String name = anything.nextLine();

        System.out.println("your name is " + name );

    }
}

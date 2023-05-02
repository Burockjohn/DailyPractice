package day03_DailyReviews;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.next();

        input.close();

        for (int i = 1; i <= 100; i++) {

            System.out.print(i + "." + name + "\n");

        }


    }
}
/*
//1) Get the name of the user
//2) Print the name of the user in order 100 times on the screen
//Example:

//1.ahmet
//2.ahmet
//...
//100.ahmet

 */
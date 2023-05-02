package day02_DailyReviews;

import java.util.Scanner;

public class While3Array {

    public static void main(String[] args) {

        String[] names = new String[10];
        Scanner classmates = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {

            System.out.println("Enter " + (i + 1) + "name");
            names[i] = classmates.nextLine();

        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }


    }


}

/*

Take ten name from the user

 */
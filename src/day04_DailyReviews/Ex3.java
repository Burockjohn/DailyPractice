package day04_DailyReviews;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your ID number");
        String id = input.next();

        if(id.length() == 11) {

            System.out.println("ID verified");
        } else  {

            System.out.println("Invalid ID");
        }
    }

}

/*

//Ask for an ID from the user, if the input is 11 characters, print "ID verified", otherwise print "Invalid ID".

 */

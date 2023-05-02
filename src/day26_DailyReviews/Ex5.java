package day26_DailyReviews;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        while (true){
            System.out.println("Enter your password :");
            String password=input.nextLine();
            if(password.matches("[0-9]{8}")){
                System.out.println("Password is matched");
                break;
            } else {
                System.out.println("Try again");
            }
        }


    }
}

/*

//*Take a password from user and Check if it contains only numbers and has 8 digits. If input is valid print
"Password is matched" otherwise ask for new input until it is valid.

 */


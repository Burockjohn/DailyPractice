package day09_DailyReviews;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your user name");
        String user = input.next();

        System.out.println("Enter your password");
        String pass = input.next();

        if (user.equals("BurakCan") && pass.equals("TT123")) { // if credentials are valid
            System.out.println("Logged in");
        } else {
            int attempt = 2;

            while (!(user.equals("BurakCan") && pass.equals("TT123")) && attempt > 0) {  //while the credentials are invalid, and user has attempts to reenter

                System.out.println("Incorrect username or password, please re-enter");

                if (attempt == 1) {
                    System.out.println("This is your last chance"); };

                System.out.println("Enter your username");
                user = input.next();
                System.out.println("Enter your password");
                pass = input.next();
                attempt--;
            }
            if (user.equals("BurakCan") && pass.equals("TT123")) {
                System.out.println("Logged in");
            } else {
                System.out.println("Your account is locked");
            }
        }

        input.close();




    }
}

/*

"Set a password. The user has 3 attempts to guess the password. If the user finds the password within 3 attempts,
print "login successful". If the password is not found after 3 attempts, print "your account has been suspended"."

 */

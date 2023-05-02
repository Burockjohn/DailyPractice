package day07_DailyReviews;

public class Ex3_CreatingMethod {

    public static void main(String[] args) {


        for (int i = 1; i <= 12; i++) {

            int fakt = 1;

            for (int j = i; j >= 1; j--) {

                fakt *= j;

            }

            System.out.println(fakt);
        }


        System.out.println("-".repeat(60));

        for (int i = 1; i <= 12; i++) {

            factorial(i);

        }

    }

    private static void factorial(int i) {

        int factorial = 1;
        for (int j = 1; j <= i; j++) {

            factorial *= j;

        }
        System.out.println("The factorial of " + i + " is : " + factorial);
    }


}


/*

Print the factorial of all numbers from 1 to 12.

 */

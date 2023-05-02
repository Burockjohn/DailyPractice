package day03_DailyReviews;

import java.util.Scanner;

public class Ex10 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int n1 = input.nextInt();
        System.out.println("Enter second number");
        int n2 = input.nextInt();
        System.out.println("Enter the operator");
        String operator = input.next();

        int math = 0;

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")  || operator.equals("/")) {

            switch (operator) {
                case "+":
                    math = n1 + n2;
                    break;
                case "-":
                   math = Math.abs(n1-n2);
                    break;
                case "*":
                    math = n1 * n2;
                    break;
                default:
                    if (n1 > n2) {
                        math = n1 / n2;
                    } else {
                        math = n2 / n1;

                    }
            }

            System.out.println("math = " + math);


        } else {
            System.out.println("Invalid operator");
        }
    }
}




/*

//Create a basic calculator program
//that takes operation and numbers from the user and
performs the four basic arithmetic operations.

 */
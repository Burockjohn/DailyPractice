package day19_DailyReviews;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numbers[] = new int[10];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter your " + (i + 1) + ". number");
            String entry = input.next();
            boolean isNumeric = true;

            for (int j = 0; j < entry.length(); j++) {
                if (entry.charAt(j) < '0' || entry.charAt(j) > '9') {
                    System.out.println("Invalid, please re-enter");
                    isNumeric = false;
                    break;
                }

            }

            if (!isNumeric) {
                i--;
                continue;
            }

            numbers[i] = Integer.parseInt(entry);
        }

        System.out.println(Arrays.toString(numbers));

        // alternative solution

        System.out.println("---------------------------------------------------------");

        int count = 10; //the count of numbers

        String[] nums = new String[count];

        for (int i = 0; i < count; i++) {

            System.out.print("Enter " + (i + 1) + ". number :");
            String number = input.nextLine();

            if (number.matches("[0-9]+")) {

                nums[i] = number; //Integer.parsInt(number)

            } else {

                System.out.println("You must enter numeric values:");
                i--;

            }


        }

        String result = Arrays.toString(numbers);
        System.out.println(result.substring(1, result.length() - 1));


        // alternative 2 solution

        System.out.println("---------------------------------------------------------");

        String[] num = new String[10];

        int i = 0;

        while (true) {
            if (i == 10) break;

            System.out.println("Enter number " + (i + 1) + ":");
            num[i] = input.nextLine();

            if (num[i].matches("[0-9]+")) {
                i++;

            } else {
                System.out.println("ınvalid entry, please re-entry");
            }
        }
        System.out.println(Arrays.toString(num));

    }
}

/*

Take from the user 10 numbers and add them into an array. Then print each element of the array sparated by ","
Note: if any input is not numeric ask again and again until the input is numeric.

 */
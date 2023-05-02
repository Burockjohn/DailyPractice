package day35_DailiyReviews;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your " + (i + 1) + ". number");
            list.add(input.nextInt());
        }

        list.removeIf(each -> each > 9 && each <100);

        double sum = 0;
        for (Integer each : list) {
            sum += each;
        }

        System.out.println("The average of elements of the ArrayList = " + (sum / list.size()));

        // alternative solution

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your " + (i + 1) + ". number");
            int num = input.nextInt();
            if (num < 10 && num >= 100) list1.add(num);
        }

        System.out.println( (list1.stream().mapToInt(Integer::intValue).average().getAsDouble()));

    }
}

/*

 Take 10 numbers from the user and add them into an ArrayList then remove the numbers which has two digits.
        //And find the average of remain elements

 */
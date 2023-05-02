package day33_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 45, 6, 1, 65, 321, 60, 12, 1, 25, 34));
        ArrayList<Integer> numbers1 = numbers;
        numbers.removeIf(each -> each % 3 != 0 && each % 5 != 0);

        int sum = 0;
        for (int each : numbers) {
            sum += each;
        }
        System.out.println(sum);

        //alternative solution

        int sum1 = 0;
        for (int element : numbers1) {
            if (element % 3 == 0 || element % 5 == 0) {
                sum1 += element;
            }
        }

        System.out.println(sum1);

        //alternative2 solution
        System.out.println(numbers1.stream().filter(each -> each % 3 == 0 || each % 5 == 0).mapToInt(Integer::intValue).sum());

    }

}

/*

Create an ArrayList of integers and find the sum of all the elements that are divisible by 3 or 5.
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 45, 6, 1, 65, 321,60,12,1,25,34));

 */

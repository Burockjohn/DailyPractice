package day30_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {

        int numbers[] = {2, 4, 8, 16, 32, 64};
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int addition = random.nextInt(100) + 1;
            numbers[i] += addition;
        }

        //System.out.println(Arrays.toString(numbers));

        int result[] = new int[numbers.length];

        int x = 0;
        for (int number : numbers) {
            if (number < 100) result[x++] = number;
        }

        result = Arrays.copyOf(result, x);
        System.out.println(Arrays.toString(result));

        //alternative solution

        int[] numbers1 = {3, 35, 62, 12, 43, 65};

        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] += random.nextInt(100) + 1;
        }

        numbers1 = Arrays.stream(numbers1).filter(i -> i <= 100).toArray();
        System.out.println(Arrays.toString(numbers1));

        //alternative solution 2
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100) + 1);
        }
        list.removeIf(each -> each >= 100);

        System.out.println(list);

        //alternative solution 3

        int[] numbers2 = {3, 35, 62, 12, 43, 65};

        numbers2 = Arrays.stream(numbers2)
                .map(i -> i + random.nextInt(100) + 1)
                .filter(i -> i <= 100)
                .toArray();

        System.out.println(Arrays.toString(numbers2));

    }
}

/*

Add random numbers (1-100) to each element of a given array. If any element is  bigger than 100 (in new array) remove them and print result array

 */

package day35_DailiyReviews;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex4 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        int i = 1;
        while (list.size() < 100) {
            int num = i;
            int total = 0;
            while (num > 0) {
                total += num % 10;
                num /= 10;
            }
            if (total == 20) {
                list.add(i);
            }

            i++;
        }

        System.out.println(list);

        System.out.println("-------------------------------------------------------");

        List<Integer> numbers2 = IntStream.rangeClosed(1, Integer.MAX_VALUE)
                .filter(p -> sumOfDigits(p) == 20)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(numbers2);


    }

    public static int sumOfDigits ( int number){ // ********** perfect method ***********
        int sum = 0;
        for (int i = number; i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }
}

/*

List  first 100 numbers whose sum of digits are 20

 */
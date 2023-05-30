package day49_DailyReviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {

        List<Integer> numbers = new LinkedList<>();

        for (int i = 1; i <= 1_000_000; i++) {
            numbers.add(i);
        }

        List<Integer> newNumbers = new ArrayList<>(numbers);
        for (int i = 1; i < 1_000_000; i += 2) {
            System.out.println(newNumbers.get(i));
        }


    }
}

/*

Add a collection first 1_000_000 numbers and print elements which has odd index number in most performance way

 */
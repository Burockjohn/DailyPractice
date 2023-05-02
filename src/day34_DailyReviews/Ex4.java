package day34_DailyReviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex4 {

    public static void main(String[] args) {

        Random random = new Random();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt(100) + 1;
            list.add(randomNumber);
        }

        //System.out.println(list);

        int biggestFrequency = Collections.frequency(list, list.get(0));
        int mostDuplicated = list.get(0);

        for (Integer each : list) {
            if (Collections.frequency(list, each) > biggestFrequency) {
                biggestFrequency = Collections.frequency(list, each);
                mostDuplicated = each;
            }
        }

        System.out.println("mostDuplicated = " + mostDuplicated);
        System.out.println("biggestFrequency = " + biggestFrequency);


    }

}

/*

Add random 1000 numbers between 1 and 100 into an ArrayList and find which number has the biggest frequency

 */
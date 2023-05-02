package day34_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 8, 0, 6, 0, 4, 0));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.remove(i);
                list.add(0);
            }
        }

        System.out.println(list);

    }
}

/*

2. Write a program that can move all the zeros to the last indexes of ArrayList
                    Ex:
                        list: {1,0,2,0,3,0,4,0}
                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]

 */
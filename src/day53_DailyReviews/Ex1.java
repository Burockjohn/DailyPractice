package day53_DailyReviews;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {

    public static void main(String[] args) {
        String test = "hifriekleendsyorilhowareyouzifr";
        Set<String> result = new HashSet<>();

        for (int i = 0; i < test.length(); i++) {
            for (int j = i; j < test.length(); j++) {
                String temp = test;
                int counter = 0;
                String instance = test.substring(i, j + 1);
                while (temp.contains(instance)) {
                    counter++;
                    temp = temp.replaceFirst(instance, "");
                }

                if (counter > 1) {
                    result.add(instance);
                }

            }
        }

        System.out.println(result);
    }
}

/*

Find all the repeating substrings in a given String

 */
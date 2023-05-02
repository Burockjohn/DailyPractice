package day34_DailyReviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {

        String str[] = {"Burak", "CAN", "HellO", "World", "Wooden", "Spoon"};

        ArrayList<String> sentence = new ArrayList<>(Arrays.asList(str));
        System.out.println(sentence);

        int counter = 0;
        for (String word : sentence) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) counter++;
            }
        }

        System.out.println(counter);

        //Second solution
        long total = sentence.stream()
                .map(i -> i.chars().filter(Character::isUpperCase).count())
                .mapToLong(Long::longValue)
                .sum();
        System.out.println(total);


        //Third solution
        String myText = Arrays.toString(sentence.toArray());
        System.out.println(myText.replaceAll("[^A-Z]", "").length());

    }
}

/*

Find the number of all uppercase letters of all elements of an arraylist

 */
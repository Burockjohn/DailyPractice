package day35_DailiyReviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Burak", "Can", "HellO", "wooden", "Spoon", "World"));

        for (String word : words) {
            boolean flag = true;
            for (int i = 1; i < word.length(); i++) {
                if (!Character.isLowerCase(word.charAt(i))) {
                    flag = false;
                    break;
                }
            }
            if (Character.isUpperCase(word.charAt(0)) && flag) {
                System.out.println(word);
            }

        }

        System.out.println("---------------------------------------------------------------------");

        // alternative solution

        ArrayList<String> texts2 = new ArrayList<>(Arrays.asList("Yunus", "ayse", "Tugba", "Burak", "çaglar", "BURAK"));
        texts2.stream()
                .filter(i -> i.matches("[A-Z][a-z]+"))
                .forEach(System.out::println);

        System.out.println("------------------------------------------------------------------------");

        // alternative2 solution

        for (String each : words) {
            if (Character.isUpperCase(each.charAt(0)) && each.substring(1).equals(each.substring(1).toLowerCase()))
                System.out.println(each);
        }


    }
}

/*

Print all strings of an ArrayList which start a capital letter and continue lowercase letters

 */
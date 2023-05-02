package day17_DailyReviews;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {

        String str = "Burak can Berra Beren cydeo Wooden sPoon";

        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];


            if (word.length() > 1 && word.charAt(0) == word.toUpperCase().charAt(0)) {
                String newWord = "" + word.charAt(0);

                for (int j = 1; j < word.length(); j++) {
                    char ch = word.charAt(j);

                    if (word.charAt(j) == word.toLowerCase().charAt(j)) {
                        newWord += ch;
                    } else {
                        break;
                    }
                }

                System.out.println(newWord);
            }

        }

        //alternative solution

        //First solution
        String sentence = "Hi friends my          name is Yunus and my best friend is X";

        sentence = sentence.replaceAll(" +", " ");

        String[] words2 = sentence.split(" ");


        for (int i = 0; i < words2.length; i++) {
            String each = words2[i];

            if (each.matches("[A-Z][a-z]+")) { //First letter must be upper case
                //Second and other letters must be lowercase

                System.out.println(each);

            }

        }


        //Second solution
        String sentence1 = "Hi friends my          name is Yunus and my best friend is X";

        sentence1 = sentence1.replaceAll(" +", " ");

        String[] words1 = sentence1.split(" ");

        for (int i = 0; i < words1.length; i++) {

            String each = words1[i];
            boolean condition1 = each.substring(0, 1).toUpperCase()
                    .equals(each.substring(0, 1));

            boolean condition2 = each.substring(1)
                    .toLowerCase().equals(each.substring(1));

            if (condition1 && condition2) System.out.println(each);


        }

        // another alternative

        Arrays.stream(words).filter(i -> (i.toUpperCase().charAt(0) == i.charAt(0))&&(i.substring(1).toLowerCase().
                equals(i.substring(1)))).forEach(System.out::println);


    }
}


/*

Print each word that starts with an uppercase letter and continues with lowercase letters in a given sentence

 */
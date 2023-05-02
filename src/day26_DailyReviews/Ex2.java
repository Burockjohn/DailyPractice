package day26_DailyReviews;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {

        String str = "Hi,      my   name     is yunus";

        String arr [] = str.split(" ");

        String result = "";

        System.out.println(Arrays.toString(arr));

        for (String each : arr) {
            if (each.isEmpty()) {
                continue;
            }
            result += each + " ";
        }

        System.out.println(result.trim());

        //alternative 1

        String text="Hi,      my   name     is yunus.";

        String newText= text.replace(" ","-");

        String lastText=newText.replaceAll("[-]+"," ");

        System.out.println(lastText);

        //alternative 2

        String text2="Hi,      my   name     is yunus.";
        System.out.println(text2.replaceAll(" +", " "));


    }
}

/*

Remove extra  spaces between words of a sentence
Input
Hi,      my   name     is yunus.
Output
Hi, my name is yunus.

 */
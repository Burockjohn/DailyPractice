package day08_DailyReviews;

public class Ex6_Regex {

    public static void main(String[] args) {

        String text = "a45ge89tu";
        String numbers = "";
        String letters = "";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                numbers += text.charAt(i);
            } else if ((text.charAt(i) >= 'a' && text.charAt(i) <= 'z') || (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z')) {
                letters += text.charAt(i);
            }

        }

        System.out.println(numbers + letters);

        System.out.println("------------------------------------------------------");

        String text1 = "fjg9875dsfh857gknf";

        String textAlpha = text1.replaceAll("[0-9]", "");
        String textNum = text1.replaceAll("[^0-9]", "");

        System.out.println(textNum + textAlpha);


    }
}

/*

Change a given string like this:
Concat all numeric characters at the beginning and all other characters at the ending and print new string
Example
Input.     a45ge89tu
Output   4589agetu

 */
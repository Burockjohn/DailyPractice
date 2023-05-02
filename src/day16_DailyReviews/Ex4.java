package day16_DailyReviews;

public class Ex4 {

    public static void main(String[] args) {

        String str = "         Wooden    Spoon      Hello      World       ";
        String result = str,
                str2 = str.trim(),
                result2 = "";

        result = result.trim();
        System.out.println(result.substring(0, result.indexOf(" ")) + result.substring(result.lastIndexOf(" ")));

        // more dynamic

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            if (ch == ' ' && str2.charAt(i + 1) == ' ') {
                continue;
            }

            result2 += ch;
        }

        System.out.println(result2);

    }

}

/*

Remove all spaces at the beginning and at the ending of a given string.
If there are more than one space between words, decrease them to one space

 */
package day11_DailyReviews;

public class Ex5 {

    public static void main(String[] args) {

        String str = "adfmsidkg DİKLFNgnisn SDKNg";
        String repeating = "",
                nonRepeating = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = String.valueOf(str.charAt(i));

            if (str.replaceFirst(ch, "").contains(ch)) {

                if (!(repeating.contains(ch))) { // to make the repeating char unique
                    repeating += ch;
                }

            } else {
                nonRepeating += ch;
            }

        }

        System.out.println(nonRepeating + "," + repeating);


    }
}

/*

Edit a given text so that the repeating characters in the text are at the end,
the non-repeating characters are at the beginning and the comma is between the two.

 */
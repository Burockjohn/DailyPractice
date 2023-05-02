package day12_DailyReviews;

public class Ex5 {

    public static void main(String[] args) {

        String str = "help",
                vowels = "aeiou",
                last = "a";

        for (int i = 0; i < vowels.length(); i++) {
            String ch = String.valueOf(vowels.charAt(i));

            if (str.contains(ch)) {
                if (str.lastIndexOf(ch) > str.lastIndexOf(last)) {
                    last = ch;
                }

            }

        }

        // System.out.println(last);

        System.out.println(str.substring(0, str.lastIndexOf(last)) + str.substring(str.lastIndexOf(last), str.lastIndexOf(last) + 1).repeat(3)
                + str.substring(str.lastIndexOf(last) + 1));

        // practical solution

        String word = "teacher";
        String newWord = "";
        String vowels1 = "aeiouAEIOU";

        for (int i = word.length() - 1; i >= 0; i--) {
            String activeLetter = word.substring(i, i + 1);
            if (vowels1.contains(activeLetter)) {
                newWord = word.substring(0, i) + activeLetter.repeat(3) + word.substring(i + 1);
                break;
            }
        }

        System.out.println("newWord = " + newWord);


    }
}

/*

Write a program which changes the given word by writing the last vowel of the word three times.
Input : "teacher"
Output : "teacheeer"

 */

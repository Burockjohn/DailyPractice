package day15_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        String str = "safsağfaknfnşkansfnşaaeibcouasii";
        String result = "";
        String vowels = "AAEIOUaeiou";

        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);

            result += ch;

            if (vowels.contains("" + ch) && vowels.contains("" + str.charAt(i + 1))) {
                result += "-";
            }

        }

        System.out.println(result + str.charAt(str.length() - 1));

    }
}

/*

Put "-" after each vowel which is before another vowel in a string

 */
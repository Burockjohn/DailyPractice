package day13_DailyReviews;

public class Ex1 {

    public static void main(String[] args) {

        String str = "BuRaK CaN AE";
        String vowels = "AEIOU";
        String result = "";
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            for (int j = 0; j < vowels.length(); j++) {
                char each = vowels.charAt(j);

                if (ch == each) {
                    result += ch;

                    counter++;
                }

            }


        }

        System.out.println("counter = " + counter);
        System.out.println("result = " + result);

        // alternative solution

        String sentence = "DSkdvnnaeioUvjfnkjanveea vnOijvnE";

        String upperVowels = "AEUIO";

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if (upperVowels.contains(sentence.substring(i,i+1))) {

                count++;

            }
        }
        System.out.println(count);

        // alternative 2

        int counter2 = sentence.replaceAll("[^AEIİOÖUÜ]", "").length();
        System.out.println(counter2);

    }


}


/*

write a program that counts the uppercase vowels of a given sentences

 */
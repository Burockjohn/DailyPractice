package day21_DailyReviews;

public class Ex4 {

    public static void main(String[] args) {

        String str1 = "Kaya bin kere güldü";
        String str2 = "Recep yeni gitti";
        String str3 = "Yemek yememek  için uyudu.";

        System.out.println(sameVowels(str1));
        System.out.println(sameVowels(str2));
        System.out.println(sameVowels(str3));


    }

    public static boolean sameVowels(String sentence) {

        String vowels = "aeıioöuü";
        String[] words = sentence.toLowerCase().split(" ");

        boolean same = true;

        for (String word : words) {
            int[] counter = new int[vowels.length()];
            for (int i = 0; i < word.length(); i++) {
                int vowelIndex = vowels.indexOf(word.charAt(i));
                if (vowelIndex >= 0) {
                    counter[vowelIndex]++;
                }
            }
            int count = 0;
            for (int letter : counter) {
                if (letter > 0) count++;
            }
            if (count > 1) {
                same = false;
            }
        }

        return same;

    }
}

/*

Check if each word of a given sentence's vowels are same or not.
Examples:
Kaya bin kere güldü. Output: true
Recep yeni gitti Output: false
Yemek yememek  için uyudu. Output: true

 */

package day28_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        String str1 = "Burak";
        String vowels = "aeıioöuüAEIİOÖUÜ";
        String result = "";

        for (int i = 0; i < str1.length(); i++) { //adana
            char ch = str1.charAt(i);

            if (vowels.contains("" + ch)) {
                if (!result.contains("" + ch)) result += ch;

            }
        }

        System.out.println(result.length() == 1);

    }

}

/*

Check if all vowels of a given word is different or not.

 */
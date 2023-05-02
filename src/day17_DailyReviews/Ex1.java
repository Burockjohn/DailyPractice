package day17_DailyReviews;

public class Ex1 {

    public static void main(String[] args) {

        String str = "abcdefghijklmnopqrstuvwxyz+-?%*",
                result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'O' || ch == 'u') {
                result += 'v';
            } else result += 'c';
        }

        result = result.replaceAll("[^a-zA-Z]", "");

        System.out.println(result);


    }
}

/*

change all consonant letters to c and
all vowel letters to v in a string which contains only letters.

 */
package day09_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        String str = "AbCdEfGS?",
                strUpper = str.toUpperCase();
        String result = ""; // ABCDEFGSH

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == strUpper.charAt(i)) {
                result += ch;

            }
        }

        System.out.println(result);

        // alternative solution

        String upperCaseLetters = "";

        for (int i = 0; i < str.length(); i++) {

            if(Character.isUpperCase(str.charAt(i))){
                upperCaseLetters+=str.charAt(i);
            }
        }

        System.out.println("upperCaseLetters = " + upperCaseLetters);


    }
}

/*

 *Get all uppercase letters from a given string and print  each uppercase letters in new line.

 */

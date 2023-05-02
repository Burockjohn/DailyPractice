package day12_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        String str = "sljdnfsljdn aşlfkakpnf $f%34ğ@";

        str = str.replaceAll("[^a-zA-Z]", "");

        System.out.println("str = " + str);

        System.out.println(str.length());

        // alternative solution

        String text3 = "Hi, my name is Yunus.";
        int count2 = 0;
        for (int i = 0; i < text3.length(); i++) {
            char activeChar = text3.charAt(i);
            if (Character.isAlphabetic(activeChar)) count2++;
        }
        System.out.println("count = " + count2);


    }
}

/*

Write a program that counts  the number of the letters of a given sentences. (Not including special characters, numbers and spaces)

 */
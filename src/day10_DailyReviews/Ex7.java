package day10_DailyReviews;

public class Ex7 {

    public static void main(String[] args) {

        String str = "Hello world";
        str = str.replaceAll(" ","");
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            str1 += ch + "*";

        }

        str1 = str1.substring(0,str1.length()-1);
        System.out.println("str1 = " + str1);

    }
}

/*

add '*' character between each character of a given string

 */
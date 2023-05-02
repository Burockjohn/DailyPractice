package day11_DailyReviews;

public class Ex1 {

    public static void main(String[] args) {

        String str = "Hello world 3Hi 34";
        str = str.replaceAll(" ", "");
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {

                str1 += "\"" + ch + "\"";

            } else {
                str1 += ch;

            }


        }

        System.out.print(str1);

        // alternative solution

        String text2 = "Hello3Hi34";
        text2 = text2.replaceAll("[0-9]", "\"$0\"");
        System.out.println("text2 = " + text2);

    }
}

/*

//*Write a program that puts each digit in a string in double quotes
//Input Hello3Hi34
//Output Hello"3"Hi"3""4"

 */
package day16_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        String str = "Hello, World",
                temp = str,
                result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result += (int) ch + ",";
        }

        System.out.println(result.substring(0,result.length()-1));


        // to convert to string again

        String origin [] = result.split(",");

        for (int i = 0; i < origin.length; i++) {
            System.out.print((char) Integer.parseInt(origin[i]));
        }


    }
}

/*

write a program that takes a string as input, takes the ASCII code of each character in the string,
concatenates them with a comma between each code, and then converts the resulting string back to the original string with letters?"
Input
 Hello, World!
Output
72,101,108,108,111,44,32,87,111,114,108,100,33
Hello, World!

 */
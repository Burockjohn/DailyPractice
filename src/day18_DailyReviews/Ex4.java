package day18_DailyReviews;

public class Ex4 {

    public static void main(String[] args) {

        String str = "Hello World, 12345 Wooden Spoon.";
        int count = 0,
                counter = 0;

        System.out.println(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((int) ch % 2 == 0) count++;
        }

        System.out.println(count);

        // true solution

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {

                if (Integer.parseInt("" + ch) % 2 == 0) {
                    counter++;
                }
            }

        }

        System.out.println(counter);

        //shortcut

        System.out.println(str.replaceAll("[^02468]", "").length());


    }
}

/*

write a program which counts the even digits of a string

 */
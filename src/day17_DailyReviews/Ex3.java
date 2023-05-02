package day17_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        String text1 = "yunus2365kulcu831105";

        System.out.println(text1);
        System.out.println(text1.replaceAll("[0-5]", "*"));

        // alternative solution
        String text = "Burak24816Can3264128";
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= '0' && ch <= '5') {
                result += '*';
            } else {
                result += ch;
            }
        }
        System.out.println(result);

    }
}

/*

change all numbers which are less than 6 in a given string

 */
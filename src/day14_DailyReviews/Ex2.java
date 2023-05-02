package day14_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        String str = "abcdeAfBgKhabLcdxqgfklmsTnZoABKLMNO";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'm') System.out.print(ch);
        }

        System.out.println();

        //enhanced solution

        for (int i = 0; i < str.length(); i++) {

            char ch1 = str.charAt(i);

            if (ch1 == str.toLowerCase().charAt(i)) {
                if (ch1 >= 'm') {
                    result += ch1;
                }
            } else if (ch1 == str.toUpperCase().charAt(i)) {
                if (ch1 >= 'M')
                    result += ch1;
            }
        }

        System.out.println("result = " + result);

        System.out.println("-------------------------------------------------");

        // alternative solution

        System.out.println(str.replaceAll("[^M-Zm-z]", ""));

    }


}


/*

 Remove all letters which is before 'm' in alphabetic order from a given word

 */
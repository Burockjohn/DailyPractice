package day14_DailyReviews;

public class Ex1 {

    public static void main(String[] args) {

        String str = "abcdefghabcdxqgfklms";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int counter = 0;

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);

                if (ch == each) counter++;
            }

            if (counter == 1) result += ch;

        }

        System.out.println(result);

        // alternative solution

        System.out.println("----------------------------------------------------------");


        for (int i = 0; i < str.length(); i++) {

            char ch1 = str.charAt(i);

            if (str.indexOf(ch1) == str.lastIndexOf(ch1)) System.out.print(ch1);
        }

    }
}


/*

 *Set a given sentence with writing only unique letters

 */
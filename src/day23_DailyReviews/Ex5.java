package day23_DailyReviews;

public class Ex5 {

    public static void main(String[] args) {

        String sentence = "Burak CAN, Hello World, Cydeo, Wooden Spoon";
        String alphabet = "";
        String result = sentence;

        for (char i = 'a', j = 'A'; i <= 'z' && j <= 'Z'; i++, j++) {
            alphabet += i;
            alphabet += j;
        }

        for (int i = 0; i < alphabet.length(); i++) {
            String ch = alphabet.substring(i, i + 1);
            if (!result.contains(ch)) System.out.print(ch + " ");
        }

        //alternative solution

        /*
        letters=letters.replaceAll("[Hi, my name is Yunus]","");
        System.out.println(letters.replace(""," ").trim());

         */


    }
}

/*

List all upper case and lower case letters which is not included in a given sentence.

 */
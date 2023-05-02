package day08_DailyReviews;

public class Ex4 {

    public static void main(String[] args) {

        String str = "Ey edip adanada pide ye";

        int counter = 1;

        while (str.contains(" ")) {

            str = str.replaceFirst(" ", "");
            counter++;

        }

        System.out.println(counter);

        // alternative solution
        //System.out.println(str.split(" ").length);


    }
}

/*

 *Find the number of the words of a given sentences

 */
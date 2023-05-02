package day01_DailyReviews;

public class Combination1 {

    public static void main(String[] args) {


        String text = " ";

        for (char i = 'a'; i <= 'z'; i++) {


            System.out.print(text.concat(String.valueOf(i)));

        }

        System.out.println("\n" + "-".repeat(60));

        String text1 = " ";

        for (char c ='a'; c <= 'z' ; c++) {

            text1 += c;

            System.out.print(c);
        }

    }
}
/*
task is to concatenate all letters from a-z with using for loop
a good tip : you can use for loop for chars to like this for(char c='a';c<='z';c++)
 */
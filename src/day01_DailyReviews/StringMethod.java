package day01_DailyReviews;

public class StringMethod {

    public static void main(String[] args) {


        String text1 = "Burak Can";

        System.out.println( text1.startsWith("a") );

        System.out.println(text1.endsWith("n"));

        System.out.println("-".repeat(60));

        System.out.println(text1.replace(" ","/"));

        System.out.println("text1 = " + text1);

        System.out.println(text1.length());

        System.out.println(text1.charAt(1));
    }
}

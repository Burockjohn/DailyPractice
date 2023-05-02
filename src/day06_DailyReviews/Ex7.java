package day06_DailyReviews;

public class Ex7 {

    public static void main(String[] args) {


        String text = "Burak";

        if (text.charAt(0) == text.toLowerCase().charAt(0)) {

            text = "" + text.toUpperCase().charAt(0) + text.substring(1);
        } else {
            text = "" + text.toLowerCase().charAt(0) + text.substring(1);
        }

        System.out.println(text);

    }
}

/*

//"Convert the first letter of a given text to lowercase if it is uppercase, and to uppercase if it is lowercase."

 */

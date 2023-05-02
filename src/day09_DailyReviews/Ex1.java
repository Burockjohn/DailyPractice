package day09_DailyReviews;

public class Ex1 {

    public static void main(String[] args) {

        String str = "I love Java";
        str = str.toLowerCase();

        if (str.contains("java")) {
            str = str.replaceAll("java", "");
            System.out.println("word deleted");

        } else {

            System.out.println("word not found");
        }

        System.out.println("str = " + str);


    }
}


/*

//"If a text contains the word "java", delete this word and print "word deleted". If it does not contain it, print "word not found"."

 */
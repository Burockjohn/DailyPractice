package day06_DailyReviews;

public class Ex6_Regex {

    public static void main(String[] args) {

        String text1 = "abcd2efgh3 qwery4";

        text1 = text1.replace("1", "")
                .replace("2", "")
                .replace("3", "")
                .replace("4", "")
                .replace("5", "")
                .replace("6", "")
                .replace("7", "")
                .replace("8", "")
                .replace("9", "")
                .replace("0", "");

        //Second solution
        String text="fefe334345sfe";
        text1=text.replaceAll("[0-9]","");
        System.out.println(text1);




    }
}

/*

//"Write a code that removes all digits in a given text."

 */
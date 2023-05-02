package day09_DailyReviews;

public class Ex5 {

    public static void main(String[] args) {

        String text1 = "merhaba dünya",
                result = "",
                temp1 = "";

        for (int i = 0; i < text1.length()-1; i++) {

            if (text1.length() % 2 == 0) {

                result += text1.substring(i, i + 1).toUpperCase() + text1.substring(i+1, i + 2).toLowerCase();

                i++;
            } else {
                result += text1.substring(i, i + 1).toUpperCase() + text1.substring(i+1, i + 2).toLowerCase();

                i++;

            }

        }

        System.out.println("result = " + result);

    }
}

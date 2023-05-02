package day12_DailyReviews;


public class Ex7 {

    public static void main(String[] args) {

        String scores = "1. score :34, 2. score :561, 3. score :81, 4. score :49";

        double sum = 0;
        int counter = 0;

        while (scores.contains(":") && scores.contains(",")) {

            int indeksFirst = scores.indexOf(':'),
                    indeksSecond = scores.indexOf(',');

            sum += Integer.parseInt(scores.substring(indeksFirst +1, indeksSecond));
            counter++;

            scores = scores.substring(indeksSecond + 1).trim();
        }

        System.out.println(sum / counter);

    }
}

/*

String scores = "1. score :34, 2. score :56, 3. score :81, 4. score :49"
Write a program to calculate the average of scores. Your program must be flexible enough to calculate the average of any number of scores

 */
package day12_DailyReviews;

public class Ex1_Fibonacci {

    public static void main(String[] args) {


        int firstNum = 0,
                secondNum = 1,
                total = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print(firstNum + ", "); // "0,1,1,2,3,5,8,13
            total = firstNum + secondNum; // 1,2,3,5,8,13,21,34
            firstNum = secondNum; // 1,1,2,3,5,8,13,21
            secondNum = total; // 1,2,3,5,8,13,21,34
        }

        // alternative solution

        System.out.println("-".repeat(60));


        int counter = 1, number1 = 0, number2 = 1, number3 = 0;

        String result = "0,1";

        while (counter <= 10) {

            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            //System.out.println("Counter:" + counter+"\t" +number1+"\t"+number2);

            result += "," + number3;
            counter++;
        }
        System.out.println(result);

    }
}

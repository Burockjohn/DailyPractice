package day08_DailyReviews;

public class Ex5_Regex {

    public static void main(String[] args) {

        int counter1 = 0;

        for (int i = 100; i < 1000; i++) {

            String num = String.valueOf(i);

            if (num.matches("[135690]+")) { // "+" koymamızın nedeni "num" içindeki her bir elemanı kıyaslaması.

                counter1++;
            }

        }

        System.out.println(counter1);


//alternative solution

        int[] numbers = {1, 3, 5, 6, 9, 0};

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {

                    if (numbers[k] != 0) {

                        int num = numbers[k] * 100 + numbers[j] * 10 + numbers[i];

                        System.out.println(num);
                        counter++;
                    }


                }

            }

        }
        System.out.println(counter);

    }

}


/*

 *Print all three-digit numbers with 1,3,5,6,9,0 and print how many numbers you printed

 */
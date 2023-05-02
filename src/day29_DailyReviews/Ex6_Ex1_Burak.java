package day29_DailyReviews;

public class Ex6_Ex1_Burak {

    public static void main(String[] args) {

        int num = 0;
        int digit = 0;
        double cubeOfDig = 0;

        for (int i = 1; i <= 100000; i++) {

            num = i;

            int sumOfCubes = 0;

            while (num > 0) {

                digit = num % 10;
                sumOfCubes += Math.pow(digit,3);
                num /= 10;

            }

            if (i == sumOfCubes) System.out.println(i);
        }

    }
}

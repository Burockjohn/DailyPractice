package day24_DailyReviews;

public class Ex4 {

    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1000; i <= 2000; i += 2) { // 1785
            int temp = i;
            int sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;

            }

            if (sum == 15) {
                System.out.println(i);
                counter++;
            }
        }

        System.out.println(counter);


    }
}

/*

Print all even numbers in the range [1000-2000] whose sum of digits is 15.

 */
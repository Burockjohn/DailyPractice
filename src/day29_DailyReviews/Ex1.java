package day29_DailyReviews;

public class Ex1 {

    public static void main(String[] args) {

        int counter = 0;

        for (int i = 1; i < 100_000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
                counter++;
            }
        }

        System.out.println(counter);


    }

    public static boolean isArmstrong(int num) {

        boolean isArmstrong = false;
        int x = 0;
        int temp = num;

        int sum = 0;

        while (temp > 0) {
            sum += cube(temp % 10);
            temp /= 10;
        }

        if (sum == num) isArmstrong = true;

        return isArmstrong;

    }

    public static int cube(int n) {
        return n * n * n;
    }
}


/*

Armstrong number is a number that is equal to the sum of cubes of its digits.
List all armstrong numbers from 1 to 100_000

 */
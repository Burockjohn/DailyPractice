package day26_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        int counter = 0;

        for (int i = 1000; i < 10_000; i++) {
            boolean allIsPrime = true;
            int temp = i;

            for (int j = 2; j < i; j++) {
                if (temp % j == 0) {
                    allIsPrime = false;
                    break;
                }
            }

            if (allIsPrime) {
                while (temp > 0) {
                    int digit = temp % 10;
                    boolean isPrime = true;

                    if (digit < 2) {
                        isPrime = false;
                        allIsPrime = false;
                        break;
                    }

                    for (int k = 2; k < digit; k++) {
                        if (digit % k == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if (!isPrime) {
                        allIsPrime = false;
                        break;
                    }

                    temp /= 10;
                }

                if (allIsPrime) {
                    System.out.println(i);
                    counter++;
                }
            }
        }

        System.out.println(counter);

    }
}


/*

Find all prime numbers whose digits are also prime in the range [1000-10000]

 */
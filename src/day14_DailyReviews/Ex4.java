package day14_DailyReviews;

public class Ex4 {

    public static void main(String[] args) {

        int biggestInteger = 100;
        int biggestPrime = 2;

        for (int i = 2; i < biggestInteger; i++) {

            int counter = 0;

            for (int j = 2; j < biggestInteger; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 1) biggestPrime = i;

        }

        System.out.println(biggestPrime);

        // alternative solution

        System.out.println("----------------------------------------------");


        for (int i = biggestInteger; i > 0; i--) {

            boolean isPrime = true;


            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
                break;


            }
        }
    }
}

/*

write the biggest prime number in integer range

 */

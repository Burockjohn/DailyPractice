package day04_DailyReviews;

public class Ex9 {

    public static void main(String[] args) {

        int number = 23;
        boolean isPrime = true;

        for (int i = 2; i < 23; i++) {

            if ((number % i) == 0) {
                isPrime = false;
                break;
            }

        }
        String result = (isPrime) ? "it is a prime number" : "it is not a prime number";
        System.out.println(result);


    }
}

/*

//Find if the given number is prime or not.

 */
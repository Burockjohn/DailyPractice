package day25_DailyReviews;

public class Ex4 {

    public static void main(String[] args) {

        long counter = 0;

        for (long i = 10_000_000_000L; i < 100_000_000_000L; i++) {
            String[] arr1 = String.valueOf(i).split("");
            int arr2[] = new int[11];
            int j = 0;
            for (String s : arr1) {
                arr2[j++] = Integer.parseInt(s);
            }

            int sumOfEven = 0,
                    sumOfOdd = 0;

            for (int x = 0; x < 10; x+=2) {
                sumOfOdd += arr2[x];
            }

            for (int x = 1; x < 8; x+=2) {
                sumOfEven += arr2[x];
            }

            int sumOf10 = 0;
            for (int i1 = 0; i1 < arr2.length - 1; i1++) {
                sumOf10 += arr2[i1];
            }

            if ((sumOfOdd * 7 - sumOfEven) % 10 == arr2[9] && (sumOf10 % 10) == arr2[10]) counter++;

        }

        System.out.println(counter);


    }
}

/*

1 – TR Identity Numbers must be 11 characters.

2 – Each character must be a digit.

3 – The first digit cannot be 0 (zero)

4 – When we subtract the sum of the digits 2, 4, 6, 8 from 7 times the sum of the digits 1, 3, 5, 7, 9,
the remainder of the division by 10 (MOD10) should give the number in the 10th digit.

5 – The remainder of the division by 10 of the result obtained from the sum of the first 10 digits (MOD10) should give the number
in the 11th digit./

Find how many valid ID will be generated

 */

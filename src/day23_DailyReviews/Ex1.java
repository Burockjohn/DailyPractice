package day23_DailyReviews;

public class Ex1 {

    public static void main(String[] args) {

        int arr[] = {10, 4, 3, 50, 23, 90};

        int largest = Integer.MIN_VALUE; // or int largest = arr[0];

        for (int eachNumber : arr) { // for(int i = 0; i < arr.length; i++) { int eachNumber = arr[i]
            if (eachNumber > largest) largest = eachNumber;
        }

        System.out.println("largest number is= " + largest);


    }
}

/*

Q1: Largest Number:
Input: arr[] = {10, 4, 3, 50, 23, 90}
Output: 90

 */

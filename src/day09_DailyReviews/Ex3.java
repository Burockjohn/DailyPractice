package day09_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        int num = 248;

        String result = String.valueOf(num);

        System.out.println(num);

        if ((result.charAt(0) != result.charAt(1)) && (result.charAt(0) != result.charAt(2)) &&
                (result.charAt(1) != result.charAt(2))) {

            System.out.println("All numbers are different");
        } else {
            System.out.println("Some of them are same");
        }


    }
}

/*

"Write a code that verifies if all the digits of a three-digit number are different."

 */
package day27_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        String number = "fifty-six";
        System.out.println(letterToNumber(number));

    }

    public static int letterToNumber(String number) {

        int result = 0;
        int num1 = 0,
                num2 = 0;

        String arr[] = number.split("-");

        number = number.toLowerCase();
        String first19[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String tensDigit[] = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety","hundred"};


        for (int i = 0; i < arr.length; i++) { //eighty eight
            for (int j = 0; j < first19.length; j++) {
                if (arr[i].equals(first19[j])) {
                    num1 = j;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < tensDigit.length; j++) {
                if (arr[i].equals(tensDigit[j])) {
                    num2 = (j + 2) * 10;
                    break;
                }
            }
        }

        result = num1 + num2;

        return result;


    }

}

/*

write a program which takes a number (written with letters) up to 100 as a parameter and return the value of given number
Input sixty-four
Output 64

 */

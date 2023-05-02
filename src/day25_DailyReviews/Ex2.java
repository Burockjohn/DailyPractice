package day25_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        String str1 = "three",
                str2 = "take";

        String result1 = "",
                result2 = "";

        for (int i = 0; i < str1.length(); i++) {
            if (!result1.contains("" + str1.charAt(i))) {
                result1 += str1.charAt(i);
            }
        }

        System.out.println(result1);

        for (int i = 0; i < str2.length(); i++) {
            if (!result2.contains("" + str2.charAt(i))) {
                result2 += str2.charAt(i);
            }
        }

        System.out.println(result2);

        char arr1[] = result1.toCharArray();
        char arr2[] = result2.toCharArray();


        int counter = 0;
        for (char each : arr1) { //t,h,r,e,
            for (char element : arr2) { // t,a,k,e
                if (element == each) counter++;
            }
        }

        System.out.println(counter);

        // alternative solution

        String word1 = "three",
                word2 = "take";

        String result = "";

        for (int i = 0; i < word1.length(); i++) {

            for (int j = 0; j < word2.length(); j++) {

                if (word1.charAt(i) == word2.charAt(j) && !result.contains("" + word1.charAt(i))) {

                    result += word1.charAt(i);
                }
            }
        }
        System.out.println(result.length());
    }


}

/*

write a program to count the number of same letters from two different string (take from the user).
Input
three
take
Output
2

 */

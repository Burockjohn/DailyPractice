package day14_DailyReviews;

public class Ex5 {

    public static void main(String[] args) {

        String str = "edxzabccddggefhT454jfkll";  // c is the first duplicated character.

        // Take the character (outer loop) and compare with the character that standing next to it (inner loop)

        for (int i = 0; i < str.length(); i++) {

            for (int j = i; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(i + 1)) {
                    System.out.println("\nThe first dublicated character is " + "\"" + (str.charAt(i)) + "\".");
                    System.exit(0);
                }
            }

        }


    }
}

/*

FirstDuplicated

 */

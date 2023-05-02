package day23_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        String str = "çekoslovakyalılaştıramadıklarımızdan mısınız?";

        String vowels = "aeıioöuü";

        for (int i = 0; i < str.length(); i++) {
            char each = str.toLowerCase().charAt(i);

            if (vowels.contains(each + "")) {
                System.out.print("\n" + each);
            } else {
                System.out.print(each);
            }

        }

    }
}

/*

 *Print a sentence by adding new line before each vowels.

 */

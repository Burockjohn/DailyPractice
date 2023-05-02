package day18_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        String alphabetLower = "",
                alphabetUpper = "";

        for (char i = 'a', j = 'A'; i <= 'z' && j <= 'Z'; i++, j++) {
            alphabetLower += i;
            alphabetUpper += j;

        }

        // System.out.println("alphabetLower = " + alphabetLower);
        // System.out.println("alphabetUpper = " + alphabetUpper);

        String str = "Hi class, Hello World!  ";
        String result = "";
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            if (ch > 'h' && ch <= 'z') {
                counter++;
                result += ch;
            }
        }

        System.out.println(counter);
        System.out.println(result);


    }
}


/*

write a program which counts uppercase letters after h in alphabetic order

 */
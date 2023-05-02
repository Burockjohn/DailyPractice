package day07_DailyReviews;

public class Ex4 {

    public static void main(String[] args) {

        String text1 = "askdhaljsfhbalsfblabsf     ",
                text2 = "sdpfıjspadjflsnfdlnsdlgnflsdgn",
                text3 = "alksfjosajdfoğasgasfgadfdfhdghdghdgh";

        String longest = "text1";

        if (text2.length() > text1.length() && text2.length() > text3.length()) {
            longest = "text2";
        } else if (text3.length() > text1.length() && text3.length() > text2.length()) {
            longest = "text3";
        }
        System.out.println("longest = " + longest);


    }
}

/*

"Print the longest of three given texts."

 */
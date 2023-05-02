package day15_DailyReviews;

public class Ex1_StarFigure {

    public static void main(String[] args) {

        int numRows = 5;
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= (numRows-i)*4; j++) {
                System.out.print("/");
            }
            for (int j = 1; j <= (i-1)*8; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (numRows-i)*4; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }

    }
}

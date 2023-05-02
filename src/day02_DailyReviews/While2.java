package day02_DailyReviews;

public class While2 {

    public static void main(String[] args) {

        int number = 25664,
                temp = number,
                sumOf = 0;



        while ( temp > 0) {
           sumOf += temp % 10;
           temp /= 10;
        }

        System.out.println("sumOf = " + sumOf);

    }

}

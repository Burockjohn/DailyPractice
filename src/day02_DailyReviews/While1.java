package day02_DailyReviews;

public class While1 {

    public static void main(String[] args) {

        int number = 25664;
        int temp = number;
        int counter = 0;

        while (temp>0) {
            counter ++; //1,2,3,4,5
            temp/=10;
        }

        System.out.println(number + " has " + counter + " digits");
    }


}

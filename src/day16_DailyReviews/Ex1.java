package day16_DailyReviews;

public class Ex1 {

    public static void main(String[] args) {


        for (int hour = 0; hour < 24; hour++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                if (hour < 10) {
                    System.out.print("0");
                }
                System.out.print(hour + ":");

                if (minutes < 10) {
                    System.out.print("0");
                }
                System.out.println(minutes);
            }

        }

    }
}

/*

Display all the possible times in a 24-hour clock system on the screen? For example:

00:00
00:01
00:02
...
23:58
23:59

 */

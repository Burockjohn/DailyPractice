package day10_DailyReviews;

public class Ex8 {

    public static void main(String[] args) {

        int count2 = 0;


        for (int i = 10000; i <= 99999; i++) {
            int temp = i;
            int count1 = 0;

            while (temp > 0) {
                if (temp % 10 == 9) {
                    count1++;
                }
                temp /= 10;
            }
            if (count1 == 0) {

                count2++;
                System.out.println(i);
            }


        }

        System.out.println("count2 = " + count2);

        // alternative solution

        int count=0;
        for (int i = 10000; i <=99999 ; i++) {
            String number=Integer.toString(i);

            if(!number.contains("9")){
                count++;
                System.out.println(i);
            }
        }

        System.out.println("count = " + count);


    }
}

/*

print all five-digit numbers which do not contain the number of 9

 */
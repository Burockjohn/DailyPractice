package day10_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        int counter = 0;

        for (int i = 1000; i < 10000; i++) { //8421

            int digit1 = i / 1000,
                    digit2 = (i / 100) % 10,
                    digit3 = (i % 100) / 10,
                    digit4 = i % 10;

            if ((digit1 + digit2 + digit3 + digit4) == 10) {

                System.out.println(i);
                counter++;
            }
        }

        System.out.println("counter = " + counter);

        //answer solution

        int count1=0;

        for (int i = 1000; i <=9999 ; i++) {

            int theSumOfDigits=0;
            int temp=i;

            while(temp>0){
                theSumOfDigits+=temp % 10;
                temp/=10;
            }

            if(theSumOfDigits==10){
                System.out.println(i);
                count1++;
            }

        }
        System.out.println("count = " + count1);

    }
}


/*

 *List all four-digit numbers where the sum of digits equal to 10

 */
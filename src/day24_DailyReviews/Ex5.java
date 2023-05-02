package day24_DailyReviews;

public class Ex5 {

    public static void main(String[] args) {

        int counter = 0;


        for (int i = 1000; i < 10000; i++) { //1238
            int temp = i,
                    index = 0;

            boolean flag = true;

            int numbers[] = new int[4];

            while (temp > 0) {
                numbers[index++] = temp % 10;
                temp /= 10;
            }

            for (int j = 0; j < numbers.length - 1; j++) {

                if (numbers[j] <= numbers[j + 1]) {
                    flag = false;
                    break;
                }

            }

            if (flag) {
                System.out.println(i);
                counter++;
            }

        }

        System.out.println(counter);

        // dynamic solution

        int count=0;

        for (int i = 1000; i <10000 ; i++) {

            int temp=i;

            boolean isOrdered=true;

            while(temp>0){

                int digit=temp % 10;
                temp/=10;
                int digit2=temp % 10;

                if(digit2>=digit){
                    isOrdered=false;
                    break;
                }

            }

            if(isOrdered) {
                count++;
                System.out.println(i);
            }

        }

        System.out.println(counter);

    }
}

/*

Print all four digit numbers whose digits are ordered from smallest to largest

 */
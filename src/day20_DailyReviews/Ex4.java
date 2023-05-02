package day20_DailyReviews;

import java.util.Arrays;
import java.util.Comparator;

public class Ex4 {

    public static void main(String[] args) {

        String arrivals = "1.    8.56 " + "2.    8.58 " + "3.    8.59 " + "4.    9.00 " + "5.    8.52 " + "6.    8.59 " + "7.    8.42 " + "8.    8.41 " + "10.    8.58 ";
        String str = arrivals.replace("    ", "_");
        String arr1[] = str.split(" ");

        String busNum[] = new String[arr1.length];
        String times[] = new String[arr1.length];

        int i = 0, j = 0;
        for (String s : arr1) {
            busNum[i++] = s.substring(0, s.indexOf("_")).trim();
            times[j++] = s.substring(s.indexOf("_") + 1);
        }

        String arrivalOrder[][] = new String[arr1.length][2];

        for (int x = 0; x < arrivalOrder.length; x++) {
            arrivalOrder[x][0] = busNum[x];
            arrivalOrder[x][1] = times[x];
        }

        //System.out.println(Arrays.deepToString(arrivalOrder));

        for (int i1 = 0; i1 < arrivalOrder.length - 1; i1++) {
            for (int i2 = i1 + 1; i2 < arrivalOrder.length; i2++) {
                if (Double.parseDouble(arrivalOrder[i1][1]) > Double.parseDouble(arrivalOrder[i2][1])) {
                    String temp[] = arrivalOrder[i1];
                    arrivalOrder[i1] = arrivalOrder[i2];
                    arrivalOrder[i2] = temp;
                }
            }
        }

        for (String[] strings : arrivalOrder) {
            System.out.println(Arrays.toString(strings));
        }

        System.out.println("----------------------------------------------------------------");

        String arr2[][] = Arrays.copyOf(arrivalOrder, arrivalOrder.length);

        // alternative ******** ??
        Arrays.sort(arr2, Comparator.comparingDouble(a -> Double.parseDouble(a[1])));

        for (String[] strings1 : arr2) {
            System.out.println(Arrays.toString(strings1));
        }


    }
}


/*

String arrivals=
                "1.    8.56  " +
                "2.    8.58   " +
                "3.    8.59   " +
                "4.    9.00 " +
                "5.    8.52 " +
                "6.    8.59 " +
                "7.    8.42 " +
                "8.    8.41 " +
                "10.   8.58";
                //*Given text shows 9 bus numbers and their arrival time.
        // Sort the buses with their arrival times and
        // print  the number of each bus and its coming time.

 */
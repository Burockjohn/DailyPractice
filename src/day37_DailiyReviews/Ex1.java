package day37_DailiyReviews;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.gc();
        long freeMemory1 = runtime.freeMemory();
        long start = System.nanoTime();
        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numbers[i] = i + 1;
        }
        for (int each : numbers) {
            System.out.println(each);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + 10;
        }
        System.out.println(Arrays.toString(numbers));
        long end = System.nanoTime();
        long speed1 = end - start;
        long freeMemory2 = runtime.freeMemory();
        long memoryUsage1 = freeMemory1 - freeMemory2;


        System.gc();
        freeMemory1 = runtime.freeMemory();
        start = System.nanoTime();
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numberList.add(i + 1);
        }
        for (int each : numberList) {
            System.out.println(each);
        }
        for (int i = 0; i < numberList.size(); i++) {
            numberList.set(i, numberList.get(i) + 10);
        }
        end = System.nanoTime();
        long speed2 = end - start;
        freeMemory2 = runtime.freeMemory();
        long memoryUsage2 = freeMemory1 - freeMemory2;


        System.out.println("speed1 = " + speed1);
        System.out.println("memoryUsage1 = " + memoryUsage1);

        System.out.println("speed2 = " + speed2);
        System.out.println("memoryUsage2 = " + memoryUsage2);


    }
}


/*



 */
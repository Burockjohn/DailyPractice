package day33_DailyReviews;

public class Ex1 {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        String str = "";

        for (int i = 0; i < 1000; i++) {
            str += "a"; //aaa
        }

        long first= runtime.totalMemory()-runtime.freeMemory();
        System.out.println(first);


    }
}

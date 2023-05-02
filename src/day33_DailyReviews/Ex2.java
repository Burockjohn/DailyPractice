package day33_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 1000; i++) {
            sb.append("a");
        }

        long second= runtime.totalMemory()-runtime.freeMemory();
        System.out.println(second);


    }
}

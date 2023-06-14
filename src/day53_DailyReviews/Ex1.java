package day53_DailyReviews;

public class Ex1 {

    public static void main(String[] args) {
        String test = "hifriekleendsyorilhowareyouzifr";

        for (int i = 0; i < test.length(); i++) {
            String instance = "";
            for (int j = i; j < test.length(); j++) {
                String temp = test;
                int counter = 0;
                instance = test.substring(i, j + 1);
                while (temp.contains(instance)) {
                    counter++;
                    temp = temp.replaceFirst(instance, "");
                }

                if (counter > 1) {
                    System.out.print(instance + "\t");
                }

            }
        }

        //TODO remove duplicates
    }
}

/*

Find all the repeating substrings in a given String

 */
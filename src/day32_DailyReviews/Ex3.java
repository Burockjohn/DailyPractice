package day32_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        String str[] = {"Burak", "Can"};

        lastIndexthElement(str, 1);

    }

    private static char lastIndexthElement(String str[], int i) {
        return str[i].charAt(str[i].length() - 1);
    }

    public static int lastIndexOf(int[] array, int element) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (element == array[i]) {
                return i;
            }
        }
        return -1;

    }


}

/*

Create a method which returns the last index of an element in an array

 */
package day27_DailyReviews;

import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {

        String str = "WHAt is YOur naME?";
        String result = "";

        char sentence[] = str.toCharArray();

        //System.out.println(Arrays.toString(sentence));

        for (int i = 0; i < sentence.length; i++) {
            if (i > 0 && Character.isUpperCase(sentence[i]) && Character.isUpperCase(sentence[i - 1])) {
                continue;
            }
            result += sentence[i];
        }

        System.out.println(result);

    }
}

/*

Remove each uppercase letter which is next to another uppercase.
Input: WHAt is YOur naME?
Output:Wt is Yur naM?

 */
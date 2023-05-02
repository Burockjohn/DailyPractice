package day27_DailyReviews;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        String date = "12/12/19";

        String arr[] = date.split("/");

        boolean isValid = false;

        for (String s : arr) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (!Character.isDigit(ch)) {
                    System.err.println("Invalid Entry");
                    System.exit(0);
                }
            }

        }

        //System.out.println(Arrays.toString(arr));

        int days = Integer.parseInt(arr[0]),
                months = Integer.parseInt(arr[1]),
                years = Integer.parseInt(arr[2]);

        if ((days >= 1 && days <= 31) && (months >= 1 && months <= 12)) {
            if ((years >= 0) && (String.valueOf(years).length() == 2 || String.valueOf(years).length() == 4)) {
                isValid = true;
            }
        }


        System.out.println("isValid = " + isValid);

    }


}

/*

*Check if a given date is valid or not. You must use this format = dd/mm/yyyy to verify (days and months can also be one digit. And year can be two or four digits)
12/12/1990 True
34/9/2000 false
7/08/1987 True
09/15/2023 false
12/12/12 true

 */
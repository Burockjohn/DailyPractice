package day20_DailyReviews;

public class Ex1 {

    public static void main(String[] args) {

        String str = "Burak_8*Can";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                result += ch;
            } else {
                result += " ";
            }
        }

        System.out.println(result);

        //alternative solution

        System.out.println(str.replaceAll("[^a-zA-Z0-9]", " "));


    }

}

/*

//Convert all characters  except letters and numbers from a string to spaces

 */
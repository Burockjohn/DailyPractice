package day12_DailyReviews;

public class Ex4 {

    public static void main(String[] args) {

        String text = "Burak Can";
        text = text.toLowerCase().replace(" ", "");

        String newText = "";

        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < text.length(); j++) {
                if (("" + i).equalsIgnoreCase(text.substring(j, j + 1))) {
                    newText += text.charAt(j);
                }
            }
        }

        System.out.println("newText = " + newText);

    }
}

/*

Re-write a given word by sorting the letters of the word. (Don't use special Turkish letters)
input : car
output : acr

 */

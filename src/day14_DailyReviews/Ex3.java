package day14_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        String sentence = "Hi, my name is Burak";
        String newSentence = "";
        String words[] = sentence.split(" ");

        //First solution
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversed = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reversed += word.charAt(j);
            }
            newSentence += reversed + " ";
        }

        System.out.println(newSentence.trim());

    }
}

/*

 *Reverse each word of a given sentences

 */

package day22_DailyReviews;

public class Ex1 {

    public static void main(String[] args) { // day21 last task Burak's solution

        String text = "Recep yeni gitti";

        String[] words = text.toLowerCase().split(" ");

        String[] vowelsWords = new String[words.length];

        boolean same = true;

        int index = 0;

        for (String each : words) {
            vowelsWords[index++] = each.replaceAll("[^aeuioAEUIO]", "");
        }
        //System.out.println(Arrays.toString(vowelsWords));

        for (String vowelsWord : vowelsWords) {
            for (int i = 0; i < vowelsWord.length(); i++) {
                for (int j = 0; j < vowelsWord.length(); j++) {
                    if (vowelsWord.charAt(i) != vowelsWord.charAt(j)) {
                        same = false;
                    }
                }
            }
        }

        System.out.println(same);

    }
}

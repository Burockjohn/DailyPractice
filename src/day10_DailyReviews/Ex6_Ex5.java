package day10_DailyReviews;

public class Ex6_Ex5 {

    public static void main(String[] args) {

        String text="Hello world";

        text= text.toLowerCase().replace("a","")
                .replace("e","")
                .replace("ı","")
                .replace("i","")
                .replace("o","")
                .replace("ö","")
                .replace("u","")
                .replace("ü","");

        System.out.println("New text = " + text);



//Second solution
        String sentence="Hello world";
        sentence=sentence.replaceAll("[aeıioöuü]","");
        System.out.println("sentence = " + sentence);


        //third solution
        String sentence2="Hello world";
        String newSentences=sentence2;
        String dizi="aeıioöuü";

        for (int i = 0; i <sentence2.length() ; i++) {
            for (int j = 0; j <dizi.length(); j++) {
                if(sentence2.charAt(i)==dizi.charAt(j)) {

                    newSentences= newSentences.replaceFirst((""+sentence2.charAt(i)),"");


                }
            }
        }
        System.out.println("newSentences = " + newSentences);

    }
}

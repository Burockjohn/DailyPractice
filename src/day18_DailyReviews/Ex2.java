package day18_DailyReviews;

public class Ex2 {

    public static void main(String[] args) {

        String str = "Hello Cydeo!How are you today?I hope you all are fine.Let's Start!";

        String str2 = str.replaceAll("[!?\\.]", "@");

        String str3[] = str2.split("@");

        for (String s : str3) {
            System.out.println(s);
        }

        //alternative solution

        String sentences="Hi! My name is Yunus. What is your name?";
        String specialCharacters=".!?";

        String eachSentence="";
        for (int i = 0; i < sentences.length(); i++) {
            if(specialCharacters.contains(sentences.substring(i,i+1))){
                eachSentence+=sentences.charAt(i);
                System.out.println(eachSentence.trim());
                eachSentence="";
            }else{
                eachSentence+=sentences.charAt(i);
            }
        }



        //Second solution
        System.out.println("-".repeat(100));
        String[] sentencesArray=sentences.split("[\\.!\\?]");
        for (String s : sentencesArray) {
            System.out.println(s.trim());
        }


    }
}


/*

Write each sentence of a given text in new line

 */
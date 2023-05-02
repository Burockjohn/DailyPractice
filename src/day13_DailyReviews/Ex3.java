package day13_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        String ages = "Yunus38,Aysel19,Mahmud32,Elif23";

        String newAges[] = ages.split(",");

        // System.out.println(Arrays.toString(newAges));

        for (int i = 0; i < newAges.length; i++) {
            String name = newAges[i].replaceAll("[^a-zA-Z]", "");
            String age = newAges[i].replaceAll("[^0-9]", "");
            System.out.println(name + " is " + age + " years old.");
        }

        // alternative solution;

        String person = "";

        String name = "";
        String age = "";

        for (int i = 0; i < ages.length(); i++) {//(activeChar>='a' && activeChar<='z') || (activeChar>='A' && activeChar<='Z')

            char ch = ages.charAt(i);

            if (Character.isAlphabetic(ch))//(activeChar>='0' && activeChar<='9')
                name += ch;

            else if (Character.isDigit(ch)) {
                age += ch;

            }
            if (ch == ',' || i == ages.length() - 1) {
                System.out.println(name + " is " + age + " years old.");
                name = "";
                age = "";


            }
        }
    }
}

/*

String ages="Yunus38,Aysel19,Mahmud32,Elif23";
write a program that outputs above string like example:
"Yunus is 38 years old."
"Aysel is 19 years old."
.
.
.

 */
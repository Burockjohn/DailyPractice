package day19_DailyReviews;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex6_service_regex {

    public static void main(String[] args) {


        String text = "31. Hafta 02 Mayıs 2022 - 06 Mayıs 2022  M.2.3.2.1. Kuruş ve lira arasındaki ilişkiyi fark eder.(2s) " +
                " M.2.3.2.2. Değeri 100 lirayı geçmeyecek biçimde farklı miktarlardaki paraları karşılaştırır(2s)  " +
                "M.2.3.2.3. Paralarımızla ilgili problemleri çözer.(1s)";

        String result = "";

        for (int i = 0; i <= text.length() - 14; i++) {
            String word = text.substring(i, i + 14); // assume that every number can be 2-digit

            if (numberOfDots(word) == 5) {
                int start = word.indexOf('.'),
                        end = word.lastIndexOf('.');

                if (start > 0 && end != start && end <= 13) { // fixed by chat gpt, if this is not used it returns error due to not having any dot.
                    result += word.substring(start - 1, end + 1) + " ";
                }
            }
        }

        String words[] = result.split(" "); // if any number is less than 10, it prints special codes more than 1
        String output = "";

        for (String word : words) {
            if (!output.contains(word)) { // so, we clear the duplicated ones
                output += word + "\n";
            }
        }

        System.out.println(output);

        //alternative solution

        String str2 = "31. Hafta 02 Mayıs 2022 - 06 Mayıs 2022 M.2.3.2.1. " +
                "Kuruş ve lira arasındaki ilişkiyi fark eder.(2s) M.2.3.2.2. " +
                "Değeri 100 lirayı geçmeyecek biçimde farklı miktarlardaki paraları karşılaştırır(2s) " +
                "M.2.3.2.3. Paralarımızla ilgili problemleri çözer.(1s)";


        String regex1 = "[A-Z]\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.";

        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(str2);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        //practical solution

        String text3 = "31. Hafta 02 Mayıs 2022 - 06 Mayıs 2022 M.2.3.2.1. " +
                "Kuruş ve lira arasındaki ilişkiyi fark eder.(2s) M.2.3.2.2. " +
                "Değeri 100 lirayı geçmeyecek biçimde farklı miktarlardaki paraları karşılaştırır(2s) " +
                "M.2.3.2.3. Paralarımızla ilgili problemleri çözer.(1s)";


        String regex = "[A-Z]\\.[0-9]+\\.[0-9]\\.[0-9]+\\.[0-9]\\.";
        String[] others = text3.split(regex);  //everything separated by regex
        for (String other : others) {
            text3 = text3.replace(other, "-");

        }

        String[] codes = text3.split("-");
        for (String code : codes) {
            if (code.length() > 0) System.out.println(code);
        }


    }

    public static int numberOfDots(String word) {

        int counter = 0;

        while (word.contains(".")) {
            word = word.replaceFirst("\\.", "");
            counter++;
        }

        return counter;

    }

    //alternative solution


}

/*

String text="31. Hafta 02 Mayıs 2022 - 06 Mayıs 2022
M.2.3.2.1. Kuruş ve lira arasındaki ilişkiyi fark eder.(2s)
M.2.3.2.2. Değeri 100 lirayı geçmeyecek biçimde farklı miktarlardaki paraları karşılaştırır(2s)
M.2.3.2.3. Paralarımızla ilgili problemleri çözer.(1s)"

write a program which lists the special codes from the text like example output
M.2.3.2.1.
M.2.3.2.2.
M.2.3.2.3.

 */
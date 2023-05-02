package day31_DailyReviews;

public class Ex3 {

    public static void main(String[] args) {

        String mail = "burak_can@telekom.com";
        char arr[] = mail.toCharArray();

        String firs = "";
        String second = "";
        String password = "";

        boolean isValid = false;
        exit:
        while (true) {

            for (int i = 0; i < mail.indexOf('@'); i++) {
                if (Character.isLetter(arr[i]) || mail.substring(i, i + 1).equals("_")) {
                    for (int j = mail.indexOf('@') + 1; j < mail.indexOf("."); j++) {
                        if (Character.isLetter(arr[i])) {
                            isValid = true;
                            break exit;
                        }
                    }
                }
            }
        }

        if (isValid) {
            for (int i = mail.indexOf('@') - 1; i >= 0; i--) {
                char ch = mail.charAt(i);
                password += (int) ch;
            }
        }

        System.out.println(password);

        //alternative solution

        //email.matches("[A-Za-z0-9_\\.]+@[A-Za-z0-9_\\.]+\\.[A-Za-z0-9_\\.]+")

    }
}

/*

Check if a given email address is valid or not. If it's valid, generate a password by concatenating the reversed username (before the '@' symbol)
with the ASCII codes of each character of the email. If the email is not valid, ask for it to be inputted correctly again and again

 */
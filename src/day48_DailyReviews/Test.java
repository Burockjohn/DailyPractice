package day48_DailyReviews;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Scanner input = new Scanner(System.in);

        boolean flag = true;

        while (flag) {

            System.out.println("Input selection number: \n" +
                    "1) Create_S_ID_balance \n" +
                    "2) Create_L_ID_balance \n" +
                    "3) Create_O_ID_balance \n" +
                    "4) Create_C_ID_balance \n" +
                    "5) Increase_ID_cash \n" +
                    "6) Decrease_ID_cash \n" +
                    "7) Set_dd_mm_yy \n" +
                    "8) ShowAccount \n" +
                    "9) ShowIDs \n" +
                    "10) Sortition \n" +
                    "11) Exit");

            String choice = input.nextLine();
            int ID;
            double balance;

            switch (choice) {
                case "1":
                    System.out.println("Please enter ID");
                    ID = input.nextInt();
                    System.out.println("Please enter balance");
                    balance = input.nextDouble();
                    bank.crate_S_ID_balance(balance, ID);
                    input.nextLine();
                    break;
                case "2":
                    System.out.println("Please enter ID");
                    ID = input.nextInt();
                    System.out.println("Please enter balance");
                    balance = input.nextDouble();
                    bank.crate_L_ID_balance(balance, ID);
                    input.nextLine();
                    break;
                case "3":
                    System.out.println("Please enter ID");
                    ID = input.nextInt();
                    System.out.println("Please enter balance");
                    balance = input.nextDouble();
                    bank.crate_O_ID_balance(balance, ID);
                    input.nextLine();
                    break;
                case "4":
                    System.out.println("Please enter ID");
                    ID = input.nextInt();
                    System.out.println("Please enter balance");
                    balance = input.nextDouble();
                    bank.crate_C_ID_balance(balance, ID);
                    input.nextLine();
                    break;
                case "5":
                    System.out.println("Please enter ID");
                    ID = input.nextInt();
                    System.out.println("Please enter balance");
                    balance = input.nextDouble();
                    bank.deposit(ID, balance);
                    input.nextLine();
                    break;
                case "6":
                    System.out.println("Please enter ID");
                    ID = input.nextInt();
                    System.out.println("Please enter balance");
                    balance = input.nextDouble();
                    bank.withdraw(ID, balance);
                    input.nextLine();
                    break;
                case "7":
                    System.out.println("Please enter day");
                    int day = input.nextInt();
                    System.out.println("Please enter month");
                    int month = input.nextInt();
                    System.out.println("Please enter year");
                    int year = input.nextInt();
                    bank.set_dd_mm_yy(day, month, year);
                    input.nextLine();
                    break;
                case "8":
                    bank.showAccount();
                    break;
                case "9":
                    bank.showIDs();
                    break;
                case "10":
                    bank.sortition();
                    break;
                case "11":
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice");


            }
        }


    }
}

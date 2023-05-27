package day48_DailyReviews;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void getAccount() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public void getDate() {
        System.out.println(LocalDate.now());
    }

    public void deposit(Integer ID, double cash) {
        for (Account account : accounts) {
            if (account.getID() == ID) {
                account.deposit(cash);
                account.getTransaction().add(cash + " is deposited successfully at " + LocalDate.now());
                return;
            }
        }
    }

    public void withdraw(Integer ID, double cash) {
        for (Account account : accounts) {
            if (account.getID() == ID) {
                account.withdraw(cash);
                account.getTransaction().add(cash + " is withdrawed successfully at " + LocalDate.now());
                return;
            }
        }
    }

    public void showAccount() {
        for (Account account : getAccounts()) {
            System.out.println(account.getID() + " : ");
            if (account.getTransaction().size() > 5) {
                for (int i = account.getTransaction().size() - 5; i < account.getTransaction().size(); i++) {
                    System.out.println(account.getTransaction().get(i));
                }
            } else {
                System.out.println(account.getTransaction());
            }

        }
    }

    public void showIDs() {
        accounts.forEach(i -> System.out.println(i.getID()));
    }


    public void crate_S_ID_balance(double balance, int ID) {
        accounts.add(new ShortTerm(balance, ID));
    }

    public void crate_L_ID_balance(double balance, int ID) {
        accounts.add(new LongTerm(balance, ID));
    }

    public void crate_O_ID_balance(double balance, int ID) {
        accounts.add(new Special(balance, ID));
    }

    public void crate_C_ID_balance(double balance, int ID) {
        accounts.add(new Current(balance, ID));
    }

    public void set_dd_mm_yy(int day, int month, int year) {
        Account.currentDate = LocalDate.of(year, month, day);
    }

    public void sortition() {
        List<Account> sortitionList = new ArrayList<>();
        for (Account account : accounts) {
            if (account instanceof Special) {
                for (int i = 0; i < account.getBalance() / 2000; i++) {
                    sortitionList.add(account);
                }
            }
        }

        if (sortitionList.isEmpty()) return;

        if (sortitionList.stream().distinct().count() == 1) {
            sortitionList.get(0).deposit(10000);
            return;
        }

        Random random = new Random();
        int number = random.nextInt(sortitionList.size());
        Account luckyAccount = sortitionList.get(number);
        luckyAccount.deposit(10000);
        System.out.println("the ID of winner account is " + luckyAccount.getID() + " : congrats");
    }


}

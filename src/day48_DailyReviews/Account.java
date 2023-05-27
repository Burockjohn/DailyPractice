package day48_DailyReviews;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Account {

    private double balance;
    private int ID;

    private double interestRate;
    private static final LocalDate startDate = LocalDate.of(2020, 1, 1);
    public static LocalDate currentDate = LocalDate.now();

    private ArrayList<String> transaction = new ArrayList<>();

    public Account(double balance, int ID, int interestRate) {
        setBalance(balance);
        setID(ID);
        setInterestRate(interestRate);
    }

    public ArrayList<String> getTransaction() {
        return transaction;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate < 0) {
            System.err.println("Interest rate can not be less than 0");
            return;
        }
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new RuntimeException("Insufficient balance");
            }
            balance -= amount;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public double benefit() {
        Period period = Period.between(startDate, currentDate);
        int days = period.getDays();

        return balance * interestRate * days / 365;
    }

    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", ID=" + ID +
                ", interestRate=" + interestRate +
                ", starting date=" + startDate +
                '}';
    }
}

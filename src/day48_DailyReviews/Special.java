package day48_DailyReviews;

public class Special extends Account{

    private double startingBalance;

    public Special(double balance, int ID) {
        super(balance, ID, 12);
        startingBalance = balance;
    }

    public double getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    @Override
    public void setBalance(double balance) {
        if (balance < startingBalance) {
            throw new RuntimeException("Your current balance can not be less than starting balance: $" + startingBalance);
        }
        super.setBalance(balance);
    }

}

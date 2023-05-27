package day48_DailyReviews;

public class LongTerm extends Account {
    public LongTerm(double balance, int ID) {
        super(balance, ID, 24);
    }

    @Override
    public void setBalance(double balance) {
        if (balance < 1500) {
            throw new RuntimeException("Insufficient Balance : can not be less than $1500");
        }
        super.setBalance(balance);
    }

}

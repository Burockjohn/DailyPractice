package day48_DailyReviews;

import java.time.LocalDate;
import java.time.Period;

public class ShortTerm extends Account {


    public ShortTerm(double balance, int ID) {
        super(balance, ID, 17);

    }

    @Override
    public void setBalance(double balance) {
        if (balance < 1000) {
            throw new RuntimeException("Insufficient Balance: can not be less than $1000");
        }
        super.setBalance(balance);
    }


}
